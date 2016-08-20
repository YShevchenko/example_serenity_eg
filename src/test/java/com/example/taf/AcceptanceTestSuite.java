package com.example.taf;

import com.example.taf.utils.WebDriverUtils;
import net.serenitybdd.jbehave.SerenityStories;
import org.jbehave.core.annotations.BeforeScenario;

import static org.jbehave.core.annotations.ScenarioType.ANY;

public class AcceptanceTestSuite extends SerenityStories {

    @BeforeScenario(uponType = ANY)
    public void beforeStories() {
        WebDriverUtils.maximizeWindow();
    }
}
