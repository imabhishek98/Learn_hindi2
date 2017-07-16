package com.example.temp.learn_hindi2;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by temp on 7/16/2017.
 */

public class customAdapter extends ArrayAdapter<dataTypeListItem> {


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView= convertView;
        if(listItemView == null)
        {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.known_list_item_layout, parent, false);
        }

        dataTypeListItem tempp = getItem(position);
        TextView hText = (TextView) listItemView.findViewById(R.id.hindi_text_view);
        hText.setText(tempp.getHindiWord());


        TextView eText = (TextView) listItemView.findViewById(R.id.english_text_view);
        eText.setText(tempp.getEnglishWord());

        return listItemView;
    }

    public customAdapter(Activity context, ArrayList<dataTypeListItem> words)
    {
        super(context, 0, words);
    }
}
