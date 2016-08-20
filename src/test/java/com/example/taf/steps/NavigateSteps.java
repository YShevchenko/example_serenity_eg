package com.example.taf.steps;

import com.example.taf.pages.HomePage;
import net.thucydides.core.annotations.Step;

public class NavigateSteps {

    private HomePage homePage;

    @Step
    public void openHomepage() {
        homePage.open();
    }

    @Step
    public void switchLanguage() {
        homePage.getHeaderWidget().switchLanguage();
    }

    @Step
    public void navigateToSection(final String sectionName) {
        homePage.getAdSectionsWidget().navigateToAdSection(sectionName);
    }
}
