package com.example.taf.pages.search;

import com.example.taf.pages.GeneralPage;
import com.example.taf.widgets.SearchFormWidget;
import org.openqa.selenium.support.FindBy;

public class ExtendedSearchPage extends GeneralPage {

    @FindBy(name = "ffrm")
    private SearchFormWidget searchFormWidget;

    public SearchFormWidget getSearchFormWidget() {
        return searchFormWidget;
    }
}
