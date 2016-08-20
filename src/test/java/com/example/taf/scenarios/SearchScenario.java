package com.example.taf.scenarios;

import com.example.taf.dto.ExtendedSearchParametersDto;
import com.example.taf.steps.SearchSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;

public class SearchScenario {

    @Steps
    SearchSteps searchSteps;

    @When("user performs {extended |}search with next details:$table")
    public void performSearch(final ExamplesTable table) {
        final ExtendedSearchParametersDto searchParameters = table.getRowsAs(ExtendedSearchParametersDto.class).get(0);
        searchSteps.navigateToSearchPage();
        searchSteps.performSearch(searchParameters);
    }

    @When("user sorts results by price")
    public void sortByPrice() {
        searchSteps.sortByPrice();
    }

    @When("user selects deal type <$dealType> filters on search results page")
    public void applyHeadLineSearchFilters(final String dealType) {
        searchSteps.applyDealType(dealType);
    }

    @When("user selects $adCount random ads")
    public void selectRandomAds(final int adCount) {
        searchSteps.selectRandomAds(adCount);
    }

    @When("user navigates to Selected Ads page")
    public void navigateToSelectedAdsPage() {
        searchSteps.clickSelectedAdsPageLink();
    }

}
