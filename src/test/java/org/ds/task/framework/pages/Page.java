package org.ds.task.framework.pages;

import org.ds.task.framework.Browser;

public class Page {
//    TODO: links Emun, in the future may be it is possible to implement link managing by Factory Pattern
    Browser browser;

    public Page() {
        browser = new Browser();
    }
}
