package com.hyuna.bustest;

/**
 * Created by Iurii on 3/30/2015.
 */
public class PageInfo {
    private String totalResults;

    public String getResultsPerPage() {
        return resultsPerPage;
    }

    public void setResultsPerPage(String resultsPerPage) {
        this.resultsPerPage = resultsPerPage;
    }

    public String getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(String totalResults) {
        this.totalResults = totalResults;
    }

    private String resultsPerPage;
}
