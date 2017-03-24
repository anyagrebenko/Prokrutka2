package com.example.user.prokrutka;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

public class MainActivity extends ListActivity {

    String[] dayArr = {"пн", "вт", "ср", "чт", "пт", "сб", "вс"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ArrayAdapter<String> dayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, dayArr);
        setListAdapter (dayAdapter);
//        setContentView(R.layout.activity_main);
//        String[] numbers = new String[100];
//        for (int i = 0; i <100; i++){
//            numbers[i] = i + " ";
//        }
//        ArrayAdapter arrayAdapter =
//                new ArrayAdapter(this, android.R.layout.simple_list_item_1, dayArr);
//        ListView listView = (ListView)findViewById(R.id.listView);
//        listView.setAdapter(new SuperAdapter(this, dayArr));
    }

}
