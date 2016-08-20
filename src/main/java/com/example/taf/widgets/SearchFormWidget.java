package com.example.taf.widgets;

import com.example.taf.widgets.impl.SearchFormWidgetImpl;
import net.serenitybdd.core.annotations.ImplementedBy;
import net.serenitybdd.core.pages.WidgetObject;

@ImplementedBy(SearchFormWidgetImpl.class)
public interface SearchFormWidget extends WidgetObject {

    void setSearchQuery(String searchQuery);

    void setMinPrice(String minPrice);

    void setMaxPrice(String maxPrice);

    void setSubDivision(String subDivision);

    void setRegion(String region);

    void setSearchPeriod(String searchPeriod);

    void setSortBy(String sortBy);

    void clickSearchButton();
}
