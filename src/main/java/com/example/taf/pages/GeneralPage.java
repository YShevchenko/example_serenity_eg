package com.example.taf.pages;

import com.example.taf.widgets.HeaderWidget;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

public abstract class GeneralPage extends PageObject {

    @FindBy(id = "main_table")
    private HeaderWidget headerWidget;

    public HeaderWidget getHeaderWidget() {
        return headerWidget;
    }
}
