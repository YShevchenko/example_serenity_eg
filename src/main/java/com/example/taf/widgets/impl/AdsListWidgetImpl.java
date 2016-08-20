package com.example.taf.widgets.impl;

import com.example.taf.widgets.AdsListWidget;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.support.pagefactory.ElementLocator;

public class AdsListWidgetImpl extends AbstractWidgetImpl implements AdsListWidget {

    final private static String CONCRETE_AD_SECTION = ".//a[text()='%s']";

    public AdsListWidgetImpl(final PageObject page, final ElementLocator locator, final long timeoutInMilliseconds) {
        super(page, locator, timeoutInMilliseconds);
    }

    @Override
    public void navigateToAdSection(final String sectionName) {
        getElement(String.format(CONCRETE_AD_SECTION, sectionName)).click();
    }

}
