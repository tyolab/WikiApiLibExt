package au.com.tyo.wiki.wiki;

public interface ArticleParsingInterface {

	void onFinishParsing(WikiPage page);

	void onParsingError(String string);

}
