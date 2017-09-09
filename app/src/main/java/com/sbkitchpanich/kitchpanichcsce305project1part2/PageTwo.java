package com.sbkitchpanich.kitchpanichcsce305project1part2;

import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;


public class PageTwo extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.pagetwo);
        MediaPlayer mp = new MediaPlayer();
        mp = MediaPlayer.create(this, R.raw.stay);
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp.setLooping(false);
        mp.start();
    }

    public void onToPageThree(View view) {
        Intent getPageThreeIntent = new Intent(this, PageThree.class);

        //final int result = 1;

        startActivity(getPageThreeIntent);
        finish();
    }

    public void onToPageOne(View view) {
        Intent getPageOneIntent = new Intent(this, PageOne.class);

        //final int result = 1;

        startActivity(getPageOneIntent);
        finish();
    }
}
