package com.example.android.practicelesson10;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView seeText = new TextView(this);
        seeText.setAllCaps(true);
        seeText.setText("I'm calling methods on this object!");
        seeText.setTextColor(Color.CYAN);
        seeText.setTextSize(60);
        seeText.setPadding(16,16,16,16);
        seeText.setShadowLayer(5,3,3,Color.DKGRAY);

        setContentView(seeText);
    }
}
