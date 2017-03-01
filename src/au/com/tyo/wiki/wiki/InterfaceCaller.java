package au.com.tyo.wiki.wiki;

public interface InterfaceCaller {
	
	public void onProgressChanged(int progress);
	
	public void onResourceAvailable();
	
	public void onFinished();
//	public void setProgress(int progress);

	public void onError();
	
}
