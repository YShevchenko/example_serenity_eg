package com.example.taf.scenarios;

import com.example.taf.steps.NavigateSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.When;

public class NavigateScenario {

    @Steps
    NavigateSteps homepageSteps;

    @Given("user is on homepage")
    public void openHomepage() {
        homepageSteps.openHomepage();
    }

    @Given("user switches language")
    public void switchLanguage() {
        homepageSteps.switchLanguage();
    }

    @When("user navigates to <$sectionName> section")
    public void navigateToSection(final String sectionName) {
        homepageSteps.navigateToSection(sectionName);
    }
}
