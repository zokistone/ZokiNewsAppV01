package com.zokistone.zokinewsapp;

public class News {
    private String mWebTitle;
    private String mPillarName;
    private String mUrl;

    public News(String WebTitle, String PillarName, String url) {
        mWebTitle = WebTitle;
        mPillarName = PillarName;
        mUrl = url;
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

