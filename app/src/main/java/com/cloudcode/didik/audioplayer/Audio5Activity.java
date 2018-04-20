package com.cloudcode.didik.audioplayer;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

public class Audio5Activity extends AppCompatActivity {

    ImageButton btnPlay, btnPause, btnStop;
    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_audio5);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        btnPlay = (ImageButton)findViewById(R.id.btnPlay);
        btnPause = (ImageButton)findViewById(R.id.btnPause);
        btnStop = (ImageButton)findViewById(R.id.btnStop);

        mediaPlayer = MediaPlayer.create(Audio5Activity.this,R.raw.ubahtakdirdengandoa);

        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.start();
                btnPlay.setVisibility(View.GONE);
                btnPause.setVisibility(View.VISIBLE);
            }
        });

        btnPause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.pause();
                btnPlay.setVisibility(View.VISIBLE);
                btnPause.setVisibility(View.GONE);
            }
        });

        btnStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                managerOfSound(stop);
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(Audio5Activity.this,R.raw.ubahtakdirdengandoa);
                btnPlay.setVisibility(View.VISIBLE);
                btnPause.setVisibility(View.GONE);
            }
        });

    }

    public boolean onOptionsItemSelected(MenuItem item){
        mediaPlayer.stop();
        finish();
        return true;
    }

    public void onBackPressed(){
        mediaPlayer.stop();
        finish();
    }
}
