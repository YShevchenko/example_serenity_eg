package com.example.taf.widgets;

import com.example.taf.widgets.impl.AdsListWidgetImpl;
import net.serenitybdd.core.annotations.ImplementedBy;
import net.serenitybdd.core.pages.WidgetObject;

@ImplementedBy(AdsListWidgetImpl.class)
public interface AdsListWidget extends WidgetObject {

    void navigateToAdSection(final String sectionName);

}

