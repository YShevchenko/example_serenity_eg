package com.example.taf.pages;

import com.example.taf.utils.TestSessionUtils;
import com.example.taf.widgets.SearchResultWidget;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class PageWithAds extends GeneralPage {

    @FindBy(xpath = ".//table[@id='page_main']//tr[contains(@id,'tr_')]")
    private List<SearchResultWidget> searchResultWidgets;

    public List<String> getAdIds() {
        return searchResultWidgets.stream().map(p -> p.getAttribute("id")).collect(Collectors.toList());
    }

    public void selectRandomAds(int adCount) {
        List<Integer> randomAdNumbers = getRandomAdNumbers(adCount);
        randomAdNumbers.forEach(item -> searchResultWidgets.get(item).selectAd());
        storeSelectedAdsInSession(randomAdNumbers);
    }

    public int getSearchResultsCount() {
        return searchResultWidgets.size();
    }

    private void storeSelectedAdsInSession(final List<Integer> adsNumbers) {
        List<String> selectedAdsIds = adsNumbers.stream()
                .map(p -> searchResultWidgets.get(p).getAttribute("id"))
                .collect(Collectors.toList());
        TestSessionUtils.store(TestSessionUtils.SELECTED_AD_IDS, selectedAdsIds);
    }

    private List<Integer> getRandomAdNumbers(int adCount) {
        List<Integer> adNumbers = new ArrayList<>();
        while (adNumbers.size() < adCount) {
            Random random = new Random();
            Integer index = random.nextInt(getSearchResultsCount());
            if (!adNumbers.contains(index)) {
                adNumbers.add(index);
            }
        }
        return adNumbers;
    }
}
