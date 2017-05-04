package au.com.tyo.wiki.wiki;

import org.json.JSONException;

import java.util.ArrayList;

import au.com.tyo.utils.TextUtils;

public class ArticleParsingThread extends Thread implements Runnable {
	
	public static final String LOG_TAG = "ArticleParsingThread";
	
	private ArticleParsingInterface caller;
	private String query;
	private WikiPage page;
	private String text;
	private String domain;

	private String areaCode;

	public ArticleParsingThread(ArticleParsingInterface caller, String query, WikiPage page, String domain, String areaCode, String text) {
		this.caller = caller;
		this.query = query;
		this.page = page;
		this.domain = domain;
		this.areaCode = areaCode;
		this.text = text;
		
		this.setName(LOG_TAG);
	}
	
	public static void retrieveArticle(String query, WikiPage page, String domain, String areaCode) throws Exception {
		if (page.getText() == null || page.getText().length() == 0)
			page.setText(WikiApi.getInstance().getArticleWithMobileView(query, page, domain, areaCode));
		
		retrieveArticle(page);
	}
	
	public static void retrieveArticle(WikiPage page) throws Exception {
		WikiParser.parseJsonArticleText(page.getText(), page);
	}

	public static void retrieve(String query, WikiPage page, String domain, String areaCode) throws Exception {
		retrieveArticle(query, page, domain, areaCode);
		
		// may not be able to get the page, so we search the key words
		if (page.countParsedSections() == 0) {
			WikiParser parser = WikiApi.getInstance().getParser();
			WikiSearch search = parser.getFirstSearchResult(WikiApi.getInstance().getSearchJson(query), domain);
			if (search != null && search.getTitle().length() > 0) {
				page.setTitle(search.toString());
				page.setText("");
				retrieveArticle(search.toString(), page, domain, areaCode);
			}
			else {
				ArrayList<String> queries = TextUtils.buildQueries(query);
				for (String newSearch : queries) {
					search = parser.getFirstSearchResult(WikiApi.getInstance().getSearchJson(newSearch), domain);
					if (search != null && search.getTitle().length() > 0) {
						page.setTitle(search.toString());
						page.setText("");
						retrieveArticle(search.toString(), page, domain, areaCode);
						break;
					}
				} // for 
			} // if the first search for the entire keywords
		} // we have sections
	}

	@Override
	public void run() {
		try {
			/*
			 * finish loading the full text
			 */
			if (!page.hasFullText())
				page.setText(text);
			
			retrieve(query, page, domain, areaCode);
			
			/* we are not gonna do the html building here
			 * I cannot rememeber why
			 */
//			page.setHtml(WikiHtml.toHtml(page));
			
			if (caller != null)
				caller.onFinishParsing(page);
		} catch (JSONException e) {
			if (caller != null)
				caller.onParsingError(e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

}
