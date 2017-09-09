package com.sbkitchpanich.kitchpanichcsce305project1part2;

import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;


public class PageTen extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.pageten);
        MediaPlayer mp = new MediaPlayer();
        mp = MediaPlayer.create(this, R.raw.child);
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp.setLooping(false);
        mp.start();
    }


    public void onToPageOne(View view) {
        Intent getPageOneIntent = new Intent(this, PageOne.class);

        //final int result = 1;

        startActivity(getPageOneIntent);
        finish();
    }

    public void onToPageNine(View view) {
        Intent getPageNineIntent = new Intent(this, PageNine.class);

        //final int result = 1;

        startActivity(getPageNineIntent);
        finish();
    }
}
