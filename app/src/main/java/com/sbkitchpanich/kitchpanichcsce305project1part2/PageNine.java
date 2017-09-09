package com.sbkitchpanich.kitchpanichcsce305project1part2;

import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;


public class PageNine extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.pagenine);
        MediaPlayer mp = new MediaPlayer();
        mp = MediaPlayer.create(this, R.raw.cooked);
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp.setLooping(false);
        mp.start();
    }


    public void onToPageTen(View view) {
        Intent getPageTenIntent = new Intent(this, PageTen.class);

        //final int result = 1;

        startActivity(getPageTenIntent);
        finish();
    }

    public void onToPageEight(View view) {
        Intent getPageEightIntent = new Intent(this, PageEight.class);

        //final int result = 1;

        startActivity(getPageEightIntent);
        finish();
    }
}
