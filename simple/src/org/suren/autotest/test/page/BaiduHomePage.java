/**
* Copyright © 1998-2016, Glodon Inc. All Rights Reserved.
*/
package org.suren.autotest.test.page;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.suren.autotest.web.framework.core.ui.Button;
import org.suren.autotest.web.framework.core.ui.Text;
import org.suren.autotest.web.framework.page.Page;

@Component
public class BaiduHomePage extends Page {
	@Autowired
	private Text keyword;
	@Autowired
	private Button searchBut;
	public Text getKeyword() {
		return keyword;
	}
	public void setKeyword(Text keyword) {
		this.keyword = keyword;
	}
	public Button getSearchBut() {
		return searchBut;
	}
	public void setSearchBut(Button searchBut) {
		this.searchBut = searchBut;
	}
}
