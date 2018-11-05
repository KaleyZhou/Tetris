package com.example.zzz.tetris;

import android.content.Intent;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class SplashActivity extends AppCompatActivity {

    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.splashactivity);

        Button start=(Button)findViewById(R.id.start);
        Button battle=(Button)findViewById(R.id.battle);
        Button stars =(Button) findViewById(R.id.stars) ;
        Button options =(Button) findViewById(R.id.options) ;
        Button quit=(Button)findViewById(R.id.quit);
        mp= MediaPlayer.create(getApplicationContext(),R.raw.audio_click);

        Typeface tp=Typeface.createFromAsset(this.getAssets(),"KBAStitchInTime.ttf");
        start.setTypeface(tp);
        start.setTextSize(26);
        battle.setTypeface(tp);
        battle.setTextSize(26);
        stars.setTypeface(tp);
        stars.setTextSize(26);
        options.setTypeface(tp);
        options.setTextSize(26);
        quit.setTypeface(tp);
        quit.setTextSize(26);
    }
    public void onStart(View view) {
        mp.start();
    }
    public void onBattle(View view) {
        mp.start();
        Intent intent = new Intent(SplashActivity.this,BattleMenuActivity.class);
        startActivity(intent);
    }

    public void onStarts(View view) {
        mp.start();
    }

    public void onOptions(View view) {
        mp.start();
    }

    public void onQuit(View view) {
        mp.start();
        this.finish();
    }
}
