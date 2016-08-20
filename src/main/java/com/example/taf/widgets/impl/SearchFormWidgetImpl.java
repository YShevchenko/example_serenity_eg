package com.example.taf.widgets.impl;

import com.example.taf.widgets.SearchFormWidget;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.pagefactory.ElementLocator;

public class SearchFormWidgetImpl extends AbstractWidgetImpl implements SearchFormWidget {

    private static final String PREDICTIVE_SEARCH = "#preload_txt";

    @FindBy(name = "txt")
    private WebElementFacade searchQueryInput;

    @FindBy(name = "topt[8][min]")
    private WebElementFacade minPriceInput;

    @FindBy(name = "topt[8][max]")
    private WebElementFacade maxPriceInput;

    @FindBy(name = "sid")
    private WebElementFacade subDivisionDropdown;

    @FindBy(name = "search_region")
    private WebElementFacade regionDropdown;

    @FindBy(name = "pr")
    private WebElementFacade searchPeriodDropdown;

    @FindBy(name = "sort")
    private WebElementFacade sortByDropdown;

    @FindBy(name = "btn")
    private WebElementFacade searchButton;

    public SearchFormWidgetImpl(final PageObject page, final ElementLocator locator, final long timeoutInMilliseconds) {
        super(page, locator, timeoutInMilliseconds);
    }

    @Override
    public void setSearchQuery(final String searchQuery) {
        hideElement(PREDICTIVE_SEARCH);
        searchQueryInput.type(searchQuery);
    }

    @Override
    public void setMinPrice(final String minPrice) {
        minPriceInput.type(minPrice);
    }

    @Override
    public void setMaxPrice(final String maxPrice) {
        maxPriceInput.type(maxPrice);
    }

    @Override
    public void setSubDivision(final String subDivision) {
        subDivisionDropdown.selectByVisibleText(subDivision);
    }

    @Override
    public void setRegion(final String region) {
        regionDropdown.selectByVisibleText(region);
    }

    @Override
    public void setSearchPeriod(final String searchPeriod) {
        searchPeriodDropdown.selectByVisibleText(searchPeriod);
    }

    @Override
    public void setSortBy(final String sortBy) {
        sortByDropdown.selectByVisibleText(sortBy);
    }

    @Override
    public void clickSearchButton() {
        searchButton.click();
    }
}
