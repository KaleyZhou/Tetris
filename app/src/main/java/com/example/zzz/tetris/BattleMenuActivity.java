package com.example.zzz.tetris;

import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class BattleMenuActivity extends AppCompatActivity {
    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_battle_menu);

        Button campaign=(Button)findViewById(R.id.campaign);
        Button marathon=(Button)findViewById(R.id.marathon);
        Button quits=(Button)findViewById(R.id.quits);

        mp= MediaPlayer.create(this,R.raw.audio_click);
        mp.start();
        Typeface tp=Typeface.createFromAsset(this.getAssets(),"KBAStitchInTime.ttf");
        campaign.setTypeface(tp);
        campaign.setTextSize(26);
        marathon.setTypeface(tp);
        marathon.setTextSize(26);
        quits.setTypeface(tp);
        quits.setTextSize(26);

    }

    public void onCampaign(View view) {
        mp.start();
    }

    public void onMarathon(View view) {
        mp.start();
    }

    public void onQuit(View view) {
        mp.start();
        this.finish();
    }
}
