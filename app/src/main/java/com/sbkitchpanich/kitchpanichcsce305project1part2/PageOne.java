package com.sbkitchpanich.kitchpanichcsce305project1part2;

import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class PageOne extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_one);
        MediaPlayer mp = new MediaPlayer();
        mp = MediaPlayer.create(this, R.raw.rest);
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp.setLooping(false);
        mp.start();
    }

    public void onToPageTwo(View view) {
        Intent getPageTwoIntent = new Intent(this, PageTwo.class);

        //final int result = 1;

        startActivity(getPageTwoIntent);
        finish();
    }

    public void onToPageTen(View view) {
        Intent getPageTenIntent = new Intent(this, PageTen.class);

        //final int result = 1;

        startActivity(getPageTenIntent);
        finish();
    }
}
