package au.com.tyo.wiki.wiki;

public abstract interface ArticleParsingInterface {
	public void onFinishParsing(WikiPage page);

	public void onParsingError(String string);
}
