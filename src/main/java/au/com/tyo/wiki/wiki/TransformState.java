package au.com.tyo.wiki.wiki;

public class TransformState {
	private boolean removedSearchBox;
	private boolean removedTitle;
	private byte[] searchBoxBlock;
	private byte[] titleBlock;

	public TransformState() {
	}

	public boolean isRemovedSearchBox() {
		return removedSearchBox;
	}

	public void setRemovedSearchBox(boolean removedSearchBox) {
		this.removedSearchBox = removedSearchBox;
	}

	public boolean isRemovedTitle() {
		return removedTitle;
	}

	public void setRemovedTitle(boolean removedTitle) {
		this.removedTitle = removedTitle;
	}

	public byte[] getSearchBoxBlock() {
		return searchBoxBlock;
	}

	public void setSearchBoxBlock(byte[] searchBoxBlock) {
		this.searchBoxBlock = searchBoxBlock;
	}

	public byte[] getTitleBlock() {
		return titleBlock;
	}

	public void setTitleBlock(byte[] titleBlock) {
		this.titleBlock = titleBlock;
	}
}