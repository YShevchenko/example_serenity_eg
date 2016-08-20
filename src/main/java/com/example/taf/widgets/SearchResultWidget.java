package com.example.taf.widgets;

import com.example.taf.widgets.impl.SearchResultWidgetImpl;
import net.serenitybdd.core.annotations.ImplementedBy;
import net.serenitybdd.core.pages.WidgetObject;

@ImplementedBy(SearchResultWidgetImpl.class)
public interface SearchResultWidget extends WidgetObject {

    void selectAd();

}
