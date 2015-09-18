package com.example.bkzhou.hellomoon;

import android.content.Context;
import android.media.MediaPlayer;

/**
 * Created by bkzhou on 15-9-16.
 */
public class AudioPlayer {
    private MediaPlayer mediaPlayer;
    public void stop(){
        if(mediaPlayer != null){
            mediaPlayer.release();
            mediaPlayer = null;
        }
    }
    public void play(Context context){
        stop();
        mediaPlayer = mediaPlayer.create(context,R.raw.one_small_step);
        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                stop();
            }
        });
        mediaPlayer.start();


    }
}
