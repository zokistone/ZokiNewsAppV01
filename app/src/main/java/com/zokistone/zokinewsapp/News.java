package com.zokistone.zokinewsapp;

public class News {
    private String mWebTitle;
    private String mPillarName;
    private String mUrl;

    public News(String webTitle, String pillarName, String webUrl) {
        mWebTitle = webTitle;
        mPillarName = pillarName;
        mUrl = webUrl;
    }

    public String getWebTitle() {
        return mWebTitle;
    }
    public String getPillarName() {
        return mPillarName;
    }
    public String getUrl() {
        return mUrl;
    }
}

