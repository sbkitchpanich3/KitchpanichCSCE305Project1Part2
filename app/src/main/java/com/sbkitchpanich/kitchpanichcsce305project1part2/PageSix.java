package com.sbkitchpanich.kitchpanichcsce305project1part2;

import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;


public class PageSix extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.pagesix);
        MediaPlayer mp = new MediaPlayer();
        mp = MediaPlayer.create(this, R.raw.building);
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp.setLooping(false);
        mp.start();
    }


    public void onToPageSeven(View view) {
        Intent getPageSevenIntent = new Intent(this, PageSeven.class);

        //final int result = 1;

        startActivity(getPageSevenIntent);
        finish();
    }

    public void onToPageFive(View view) {
        Intent getPageFiveIntent = new Intent(this, PageFive.class);

        //final int result = 1;

        startActivity(getPageFiveIntent);
        finish();
    }
}
