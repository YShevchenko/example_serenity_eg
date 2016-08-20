package com.example.taf.widgets;

import com.example.taf.widgets.impl.HeaderWidgetImpl;
import net.serenitybdd.core.annotations.ImplementedBy;
import net.serenitybdd.core.pages.WidgetObject;

@ImplementedBy(HeaderWidgetImpl.class)
public interface HeaderWidget extends WidgetObject {

    void switchLanguage();

    void clickSearchLink();
}
