package com.zokistone.zokinewsapp;

import android.content.Context;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.List;

public class NewsAdapter extends ArrayAdapter<News> {

    public NewsAdapter(Context context, List<News> news) {
        super(context, 0, news);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.news_list_item, parent, false);
        }

        News currentNews = getItem(position);

        String pillarName = currentNews.getPillarName();
        String webTitle = currentNews.getWebTitle();
        String webUrl = currentNews.getUrl();

        TextView pillarNameView = (TextView) listItemView.findViewById(R.id.pillarNameView);
        pillarNameView.setText(pillarName);

        TextView webTitleView = (TextView) listItemView.findViewById(R.id.webTitleView);
        webTitleView.setText(webTitle);

        return listItemView;
    }
}



