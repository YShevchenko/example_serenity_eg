package com.example.taf.steps;

import com.example.taf.pages.PageWithAds;
import net.thucydides.core.annotations.Step;

import java.util.List;

public class SelectedAdsSteps {

    private PageWithAds selectedAdsPage;

    @Step
    public List<String> getDisplayedAdIds() {
        return selectedAdsPage.getAdIds();
    }
}
