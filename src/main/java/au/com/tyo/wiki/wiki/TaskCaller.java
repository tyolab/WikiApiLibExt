package au.com.tyo.wiki.wiki;

public interface TaskCaller {

	void onPreStarting();
	
	void onProgressChanged(int progress);
	
	void onResourceAvailable();
	
	void onFinished();

	void onError();
	
}
