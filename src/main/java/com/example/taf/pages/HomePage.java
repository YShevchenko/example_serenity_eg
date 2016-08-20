package com.example.taf.pages;

import com.example.taf.widgets.AdsListWidget;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://www.ss.lv/")
public class HomePage extends GeneralPage {

    @FindBy(id = "page_main_full")
    private AdsListWidget adSectionsWidget;

    public AdsListWidget getAdSectionsWidget() {
        return adSectionsWidget;
    }
}
