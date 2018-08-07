package com.pmz.deepseaadventures.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.pmz.deepseaadventures.R;

import org.androidannotations.annotations.EActivity;

@EActivity
public class PlayActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);

        hideNavigationBar();
        setupButtons();
    }

    @Override
    protected void onResume() {
        super.onResume();
        hideNavigationBar();
    }

    private void hideNavigationBar() {
        this.getWindow().getDecorView().setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);
    }

    private void setupButtons() {
//        playBtn.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View arg0) {
//
////                Intent myIntent = new Intent(MainActivity.this,
////                        PlayActivity_.class);
////                startActivity(myIntent);
//            }
//        });
    }
}
