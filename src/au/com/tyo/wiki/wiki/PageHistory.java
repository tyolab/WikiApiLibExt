package au.com.tyo.wiki.wiki;

import au.com.tyo.utils.FixedSizeLinkedList;

public class PageHistory extends FixedSizeLinkedList<WikiPage> {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4284926361610063624L;
	
	public static final int PAGES_HISTORY_LIMIT_DEFAULT = 10;
	
	public PageHistory() {
		super(PAGES_HISTORY_LIMIT_DEFAULT);
	}

	public PageHistory(int size) {
		super(size);
	}
}
