package com.example.no0ne.newsapp;

/**
 * Created by no0ne on 9/10/17.
 */
public class News {

    private String mTitle;
    private String mSection;
    private String mWebUrl;

    public News(String title, String section, String webUrl) {
        mTitle = title;
        mSection = section;
        mWebUrl = webUrl;
    }

    public String getTitle() {
        return mTitle;
    }

    public String getSection() {
        return mSection;
    }

    public String getWebUrl() {
        return mWebUrl;
    }
}
