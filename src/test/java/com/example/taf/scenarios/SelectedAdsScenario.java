package com.example.taf.scenarios;

import com.example.taf.steps.SelectedAdsSteps;
import com.example.taf.utils.TestSessionUtils;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Then;
import org.unitils.reflectionassert.ReflectionAssert;
import org.unitils.reflectionassert.ReflectionComparatorMode;

import java.util.List;

public class SelectedAdsScenario {

    @Steps
    SelectedAdsSteps selectedAdsSteps;

    @Then("same ads are displayed as were selected on Search Results page")
    public void verifyAdsOnSelectedAdsPage() {
        List<String> expectedAdIds = TestSessionUtils.get(TestSessionUtils.SELECTED_AD_IDS, List.class);
        List<String> actualAdIds = selectedAdsSteps.getDisplayedAdIds();
        ReflectionAssert.assertReflectionEquals(expectedAdIds, actualAdIds, ReflectionComparatorMode.LENIENT_ORDER);
    }
}
