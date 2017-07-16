package com.example.temp.learn_hindi2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class numbersActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers2);



        ArrayList<dataTypeListItem> x = new ArrayList<dataTypeListItem>();
        x.add(new dataTypeListItem("one", "ek"));
        x.add(new dataTypeListItem("two", "do"));
        x.add(new dataTypeListItem("three", "teen"));
        x.add(new dataTypeListItem("four", "chaar"));
        x.add(new dataTypeListItem("five", "panch"));
        x.add(new dataTypeListItem("six", "cheh"));
        x.add(new dataTypeListItem("seven", "saat"));






        ListView rootView = (ListView) findViewById(R.id.numbers_linear_layout);

        customAdapter c_adapter_object = new customAdapter(this, x);
        rootView.setAdapter(c_adapter_object);
    }



}
