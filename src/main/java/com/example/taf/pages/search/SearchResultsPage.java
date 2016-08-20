package com.example.taf.pages.search;

import com.example.taf.pages.PageWithAds;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class SearchResultsPage extends PageWithAds {

    @FindBy(xpath = ".//tr[@id='head_line']//td[@class='msg_column_td']//a")
    private WebElementFacade sortByPriceLink;

    @FindBy(xpath = ".//div[@class='filter_second_line_dv']//span[3]/select")
    private WebElementFacade dealType;

    @FindBy(id = "show_selected_a")
    private WebElementFacade selectedAdsPageLink;

    public void sortByPrice() {
        sortByPriceLink.click();
    }

    public void setDealType(final String dealName) {
        dealType.selectByVisibleText(dealName);
    }


    public void clickSelectedAdsPageLink() {
        selectedAdsPageLink.click();
    }
}
