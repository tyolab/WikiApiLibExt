package au.com.tyo.wiki.wiki;

import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;

import au.com.tyo.io.IO;
import au.com.tyo.lang.Unicode;
import au.com.tyo.parser.XML;
import au.com.tyo.web.PageBuilder;
import au.com.tyo.wiki.Constants;
import au.com.tyo.wiki.wiki.WikiPage;

public class WikiAbstract extends WikiPageBase {
	
	public static final String FROM_SOURCE = "<div class=\"font_smaller\">%s from <span style=\"font-style: italic;\">%s</span></div><br>"; 

	private static String[] STYLES_N_SCRIPTS = {"jquery-1.3.2.min.js", "styles.css", "common.js"};
	
	private static String[] THEME_DEPENDANT_CSS = {"abstract.css" };
	
	private static String template = "<article id=\"abstract\"><!-- <div id=\"title\">%s</div>--><div style=\"clear: both;\">%s</div></article>";
	
	private static String templateImage = "<a href=\"%s\"><img src=\"%s\" style=\"float:right; height: auto; width: %dpx; margin-left: 5px; padding-left: 5px;\" /></a>";
	
	private static String templateWidthStyle = "width: %dpx;";
	
	private static String templateInfoBlock = "<div style=\"float: %s; padding-left: 10px; padding-right: 10px; padding-bottom: 8px; %s\">"
									    + "<p>%s</p>" // the div body - text bit
										+ "%s" // image bit
										+ "<p>%s</p>" // the div body - text bit
									    + "</div>";
	
	private static int imageWidth = 100;

	private String abstractText;
	
	private WikiPage page; // the associated page
	
	private String infoBlockText; // before image
	
	private String infoBlockTextAfterImage;
	
	private boolean withHeaderInfo;
	
	public WikiAbstract(WikiPage page) {
		this("", "", page);
	}
	
	public WikiAbstract(String title, String abs, WikiPage page) {
		super();
		this.page = page;
		
		infoBlockText = null;
		
		stylesAndScripts = STYLES_N_SCRIPTS;
		themeCss = THEME_DEPENDANT_CSS;
		setWithHeaderInfo(true);
		update(title, abs);
	}
	
	public WikiAbstract() {	
		this("", "");
	}

	public WikiAbstract(String title, String abs) {
		this(title, abs, new WikiPage());
	}
	
	public String getAbstract() {
		return abstractText;
	}
	
//	public String getAbstractHtml() {
//		return buildPage();
//	}
	
	public WikiPage getPage() {
		return page;
	}

	public void setPage(WikiPage page) {
		this.page = page;
	}

	public boolean isWithHeaderInfo() {
		return withHeaderInfo;
	}

	public void setWithHeaderInfo(boolean withHeaderInfo) {
		this.withHeaderInfo = withHeaderInfo;
	}

	public void update(WikiPage page) {
		if (title == null || !(title.equalsIgnoreCase(page.getTitle()) && abstractText.length() > page.getAbstract().length())) {
			setPage(page);
			update(page.isDidYouMean() ? page.getTitle() + " (?)" : page.getTitle(), XML.XMLify(page.getAbstract()));
		}
	}
	
	public void update(String title, String abs) {
		this.title = title;
		this.abstractText = abs;
	}

	public static void loadTemplate(InputStream is) throws IOException {
		if (template == null)
		    template = new String(IO.readFileIntoBytes(is));
	}
	
	public static void loadImageTemplate(InputStream is) throws IOException {
		if (templateImage == null)
		     templateImage = new String(IO.readFileIntoBytes(is));
	}
	
	public static void setImageWidth(int w) {
		WikiAbstract.imageWidth = w;
	}

	public String buildPage() {
		String page = new PageBuilder().toHtml(this);
		return page;
	}

	@Override
	public String createHtmlContent() {
		return createHtmlContent(this.getAbstract(), Constants.POSITION_STRINGS[Constants.POSITION_RIGHT]);
	}
	
	public String createHtmlContent(String content, String position) {
		return createHtmlContent(content, position, 100);
	}
	
	public String createHtmlContent(String content, String position, int width) {
		String extraBeforeMainBody = null;
		if (withHeaderInfo && (page.getRedirectFrom() != null && page.getRedirectFrom().length() > 0) ||
				(page.getXPage() != null)) {
			
			String what = "";
			String from = "";
			if (page.getRedirectFrom() != null) {
				what = "redirected";
				from = page.getRedirectFrom();
			}
			else {
				what = "crossed";
				from = page.getXPage().getTitle();
			}
			extraBeforeMainBody = String.format(FROM_SOURCE, what, from);
		}
		
		String img = createHtmlImageLink();
		
		String abstractHtml = Unicode.replaceFullStopWith(content, "", "<br><br>", true);
		
		String html = "";
		String body = null;
		if (null == infoBlockText && null == infoBlockTextAfterImage && null == page.getNotes())
			body = img + (extraBeforeMainBody != null ? extraBeforeMainBody : "") + abstractHtml;
		else {
			String afterImageText = null;
			String before = null;
			String after = null;
			
			/*
			 * width will be override, if we have notes for the page
			 * 
			 * and this happens when we have the abstract but don't have the full article
			 */
			if (null == page.getNotes()) {
				afterImageText = infoBlockTextAfterImage;
			}
			else {
				if (null != infoBlockTextAfterImage)
					afterImageText = infoBlockTextAfterImage + "<br>" + page.getNotes() + "";
				else
					afterImageText = page.getNotes();
				
				width = -1;
				position = Constants.POSITION_CENTER_STRING;
			}
				
			String infoBlock = createInfoBlock(null == infoBlockText ? "" : infoBlockText, 
								img, 
								null == afterImageText ? "" : afterImageText, 
								position,
								width);
			
			if (null == page.getNotes()) {
				before = infoBlock;
				after = abstractHtml;
			}
			else {
				before = abstractHtml;
				after = "<hr>" + infoBlock;
			}
				
			body = (extraBeforeMainBody != null ? extraBeforeMainBody : "") + before + after;
		}
		
		try {
			html = String.format(template, title, body);
		}
		catch (Exception ex) {
			html = body;
		}
		return html;
	}
	
	public String createHtmlImageLink() {
		String img = "";
		if (page.hasImage() && page.getFirstImageUrl() != null) {
			img = String.format(Locale.US, templateImage, page.getOnImageClickLink() != null ? page.getOnImageClickLink() : "#",
					page.getFirstImageUrl(), page.getPrefImageWidth() > 0 ? page.getPrefImageWidth() : imageWidth);
		}
		return img;
	}
	
	public static String createInfoBlock(String beforeImagePara, String imagePart, String afterImagePara, String position, int width) {
		String extraStyle = "";
		if (width > -1) {
			extraStyle = String.format(templateWidthStyle, width);
		}
		String infoBlock = String.format(templateInfoBlock, position, extraStyle, beforeImagePara, imagePart, afterImagePara);
		return infoBlock;
	}
	
	/**
	 * we show title using the TextView
	 * 
	 * why empty string?
	 */
	@Override
	public String createTitle() {
		return "";
	}

	public String getInfoBlockText() {
		return infoBlockText;
	}

	public void setInfoBlockText(String infoBlockText) {
		this.infoBlockText = infoBlockText;
	}

	public String getInfoBlockTextAfterImage() {
		return infoBlockTextAfterImage;
	}

	public void setInfoBlockTextAfterImage(String infoBlockTextAfterImage) {
		this.infoBlockTextAfterImage = infoBlockTextAfterImage;
	}

}
