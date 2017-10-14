package com.example.shenron.assignment1;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity
{
    boolean heartValue = false;
    TextView heartClick;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        heartClick = findViewById(R.id.heart);
        Typeface typeface = Typeface.createFromAsset(getAssets(), getString(R.string.font_awesome));
        heartClick.setTypeface(typeface);
        heartClick.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                if (!heartValue)
                {
                    heartValue = true;
                    heartClick.setText(R.string.fa_heart);
                }
                else
                    {
                    heartValue = false;
                    heartClick.setText(R.string.fa_heart_o);
                }
            }
        });
    }
}
