package com.example.no0ne.newsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by no0ne on 9/10/17.
 */
public class NewsAdapter extends ArrayAdapter<News> {

    public NewsAdapter(Context context, List<News> newses) {
        super(context, 0, newses);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        News currentNews = getItem(position);

        TextView titleTextView = (TextView) listItemView.findViewById(R.id.news_title);
        TextView sectionTextView = (TextView) listItemView.findViewById(R.id.news_section);

        titleTextView.setText(currentNews.getTitle());
        sectionTextView.setText(currentNews.getSection());

        return listItemView;
    }
}
