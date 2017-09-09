package com.sbkitchpanich.kitchpanichcsce305project1part2;

import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;


public class PageFive extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.pagefive);
        MediaPlayer mp = new MediaPlayer();
        mp = MediaPlayer.create(this, R.raw.wig);
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp.setLooping(false);
        mp.start();
    }


    public void onToPageSix(View view) {
        Intent getPageSixIntent = new Intent(this, PageSix.class);

        //final int result = 1;

        startActivity(getPageSixIntent);
        finish();
    }

    public void onToPageFour(View view) {
        Intent getPageFourIntent = new Intent(this, PageFour.class);

        //final int result = 1;

        startActivity(getPageFourIntent);
        finish();
    }
}
