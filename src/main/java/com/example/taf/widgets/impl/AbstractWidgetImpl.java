package com.example.taf.widgets.impl;

import com.example.taf.utils.WebDriverUtils;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WidgetObject;
import net.serenitybdd.core.pages.WidgetObjectImpl;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.pagefactory.ElementLocator;

public abstract class AbstractWidgetImpl extends WidgetObjectImpl implements WidgetObject {

    public AbstractWidgetImpl(final PageObject page, final ElementLocator locator,
                              final long timeoutInMilliseconds) {
        super(page, locator, timeoutInMilliseconds);
    }

    public AbstractWidgetImpl(final PageObject page, final ElementLocator locator, final WebElement webElement,
                              final long timeoutInMilliseconds) {
        super(page, locator, webElement, timeoutInMilliseconds);
    }

    protected WebElement getElement(final String xpath) {
        return WebDriverUtils.getWebDriver().findElement(By.xpath(xpath));
    }

    protected void hideElement(final String cssSelector) {
        getJavascriptExecutorFacade().executeScript(
                String.format("document.querySelector('%s').style.visibility = 'hidden'", cssSelector)
        );

    }

}
