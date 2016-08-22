package com.example.taf.dto;

public class ExtendedSearchDto {

    private String searchQuery;
    private String minPrice;
    private String maxPrice;
    private String subDivision;
    private String region;
    private String searchPeriod;
    private String sortBy;

    public String getSearchQuery() {
        return searchQuery;
    }

    public void setSearchQuery(final String searchQuery) {
        this.searchQuery = searchQuery;
    }

    public String getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(final String minPrice) {
        this.minPrice = minPrice;
    }

    public String getMaxPrice() {
        return maxPrice;
    }

    public void setMaxPrice(final String maxPrice) {
        this.maxPrice = maxPrice;
    }

    public String getSubDivision() {
        return subDivision;
    }

    public void setSubDivision(final String subDivision) {
        this.subDivision = subDivision;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(final String region) {
        this.region = region;
    }

    public String getSearchPeriod() {
        return searchPeriod;
    }

    public void setSearchPeriod(final String searchPeriod) {
        this.searchPeriod = searchPeriod;
    }

    public String getSortBy() {
        return sortBy;
    }

    public void setSortBy(final String sortBy) {
        this.sortBy = sortBy;
    }
}
