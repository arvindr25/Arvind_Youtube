package com.example.arvind_youtube;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toolbar;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.youtube.player.YouTubeStandalonePlayer;

public class StandaloneActivity extends AppCompatActivity implements View.OnClickListener
{

    private  String GOOGLE_API_KEY = "AIzaSyBzxeXPMG0glbURqww92Eg6wx5DZsJvRxo";
    private  String YOUTUBE_VIDEO_ID = "7TavVZMewpY";
    private  String YOUTUBE_PLAYLIST_ID= "myQYcLnJ6v0";
    private  Button btnPlayVideo;
    private  Button btnPlayplaylist;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_standalone);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar();

        btnPlayplaylist= findViewById(R.id.btnPlayList);
        btnPlayVideo= findViewById(R.id.btnVideo);
        btnPlayVideo.setOnClickListener(this);
        btnPlayplaylist.setOnClickListener(this);
    }

    private void setSupportActionBar() {
    }


    @Override
    public void onClick(View v) {
        Intent intent= null;
        switch (v.getId()){
            case R.id.btnVideo:
                intent = YouTubeStandalonePlayer.createVideoIntent(this,GOOGLE_API_KEY,YOUTUBE_VIDEO_ID);
                break;
            case R.id.btnPlayList:
                intent = YouTubeStandalonePlayer.createPlaylistIntent(this,GOOGLE_API_KEY,YOUTUBE_PLAYLIST_ID);

                break;
            default:
        }
        if(intent!= null){
            startActivity(intent);
        }
    }
}
