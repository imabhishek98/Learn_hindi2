package com.example.temp.learn_hindi2;

/**
 * Created by temp on 7/16/2017.
 */

public class dataTypeListItem {




    private String hindiWord, englishWord;
    public dataTypeListItem(String eWord, String hWord)
    {
        hindiWord = hWord;
        englishWord=eWord;
    }

    public String getHindiWord( )
    {
        return hindiWord;
    }

    public String getEnglishWord()
    {
        return englishWord;
    }
}



