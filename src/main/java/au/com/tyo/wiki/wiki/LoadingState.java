package au.com.tyo.wiki.wiki;

public class LoadingState {

	protected boolean loading;
	
	public LoadingState() {
		loading = false;
	}
	
	public synchronized boolean isLoading() {
		return loading;
	}

	public synchronized void setLoading(boolean loadingArticleInWebView) {
		this.loading = loadingArticleInWebView;
	}
	
}
