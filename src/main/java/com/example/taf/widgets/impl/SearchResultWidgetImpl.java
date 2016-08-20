package com.example.taf.widgets.impl;

import com.example.taf.widgets.SearchResultWidget;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.pagefactory.ElementLocator;

public class SearchResultWidgetImpl extends AbstractWidgetImpl implements SearchResultWidget {

    @FindBy(xpath = ".//input[@type='checkbox']")
    private WebElementFacade selectAdCheckbox;

    public SearchResultWidgetImpl(final PageObject page, final ElementLocator locator,
                                  final long timeoutInMilliseconds) {
        super(page, locator, timeoutInMilliseconds);
    }

    public SearchResultWidgetImpl(final PageObject page, final ElementLocator locator,
                                  final WebElement webElement, final long timeoutInMilliseconds) {
        super(page, locator, webElement, timeoutInMilliseconds);
    }

    @Override
    public void selectAd() {
        selectAdCheckbox.click();
    }

}
