package com.example.taf.widgets.impl;

import com.example.taf.widgets.HeaderWidget;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.pagefactory.ElementLocator;

public class HeaderWidgetImpl extends AbstractWidgetImpl implements HeaderWidget {

    @FindBy(xpath = ".//span[@class='menu_lang']/a")
    private WebElementFacade languageSwitchLink;

    @FindBy(xpath = "//a[contains(@href,'search')]")
    private WebElementFacade searchLink;

    public HeaderWidgetImpl(final PageObject page, final ElementLocator locator, final long timeoutInMilliseconds) {
        super(page, locator, timeoutInMilliseconds);
    }

    @Override
    public void switchLanguage() {
        languageSwitchLink.click();
    }

    @Override
    public void clickSearchLink() {
        searchLink.click();
    }
}
