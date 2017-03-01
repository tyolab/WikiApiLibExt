package au.com.tyo.wiki.wiki;

public interface WikiJs {
	public static final String JS_LOAD_CSS_FUNCTION_NAME = "loadCss(%s)";
	
	public static final String JS_LOAD_CSS_FUNCTION = "function loadCss(cssFile) {" +
					"		var $ = document;" +
					"		var cssId = cssFile;" +
					"		if (!$.getElementById(cssId))" +
					"		{" +
					"		    var head  = $.getElementsByTagName('head')[0];" +
					"		    var link  = $.createElement('link');" +
					"		    link.id   = cssId;" +
					"		    link.rel  = 'stylesheet';" +
					"		    link.type = 'text/css';" +
					"		    link.href = cssFile;" +
					"		    link.media = 'all';" +
					"		    head.appendChild(link);" +
					"		}" +
					"	}";
	
}
