package com.example.qtp2t.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class IntentSecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_second);
    }

    public void onClick(View v)
    {
        Intent I= new Intent(this, IntentActivity.class);
        startActivity(I);
    }

}

