package com.example.temp.learn_hindi2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openBWord(View view)

    {
        Intent i = new Intent(MainActivity.this, bWord.class);
        startActivity(i);

    }


}
