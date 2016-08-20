package com.example.taf.steps;

import com.example.taf.dto.ExtendedSearchParametersDto;
import com.example.taf.pages.search.ExtendedSearchPage;
import com.example.taf.pages.search.SearchResultsPage;
import net.thucydides.core.annotations.Step;
import org.apache.commons.beanutils.BeanUtils;

import java.lang.reflect.InvocationTargetException;

public class SearchSteps {

    private ExtendedSearchPage searchPage;
    private SearchResultsPage searchResultsPage;

    @Step
    public void navigateToSearchPage() {
        searchPage.getHeaderWidget().clickSearchLink();
    }

    @Step
    public void performSearch(final ExtendedSearchParametersDto searchParams) {
        try {
            BeanUtils.copyProperties(searchPage.getSearchFormWidget(), searchParams);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new IllegalArgumentException("Failed to copy bean properties to panel", e);
        }
        searchPage.getSearchFormWidget().clickSearchButton();
    }

    @Step
    public void sortByPrice() {
        searchResultsPage.sortByPrice();
    }

    @Step
    public void applyDealType(final String dealType) {
        searchResultsPage.setDealType(dealType);
    }

    @Step
    public void selectRandomAds(final int adCount) {
        if (searchResultsPage.getSearchResultsCount() < adCount) {
            throw new IllegalArgumentException("Count of ads to choose should be > search results count!");
        }
        searchResultsPage.selectRandomAds(adCount);
    }

    @Step
    public void clickSelectedAdsPageLink() {
        searchResultsPage.clickSelectedAdsPageLink();
    }
}
