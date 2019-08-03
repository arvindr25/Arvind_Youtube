package com.example.arvind_youtube;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toolbar;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button btnSingle;
    private  Button btnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        btnSingle = (Button) findViewById(R.id.btnPlayVideo);
        btnNext= (Button) findViewById(R.id.next);
        btnSingle.setOnClickListener(this);
        btnNext.setOnClickListener(this);
    }

    private void setSupportActionBar(Toolbar toolbar) {

    }

    @Override
    public void onClick(View v) {
        Intent intent= null;

        switch (v.getId()){
            case R.id.btnPlayVideo:
                intent = new Intent((MainActivity.this), YoutubeActivity.class);
                break;
            case R.id.next:
                intent = new Intent((MainActivity.this),StandaloneActivity.class);
                break;
            default:
        }

        if(intent!= null){
            startActivity(intent);
        }

    }
}