package com.example.user.prokrutka;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by user on 07.02.2017.
 */

public class SuperAdapter extends ArrayAdapter<String> {
    SuperAdapter(Context context, String[] array) {
        super(context, R.layout.my_item, array);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).
                    inflate(R.layout.my_item, null);
        }
            TextView textView = (TextView) convertView.findViewById(R.id.myitem);
            textView.setText(getItem(position));
            textView.setBackgroundColor(Color.rgb(position, position, position));
            final int pos = position;
            textView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(getContext(), getItem(pos), Toast.LENGTH_SHORT);
                }
            });
        return convertView;
    }
}
