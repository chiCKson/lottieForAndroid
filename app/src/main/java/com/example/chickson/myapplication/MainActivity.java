package com.example.chickson.myapplication;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.airbnb.lottie.LottieAnimationView;

import cn.pedant.SweetAlert.SweetAlertDialog;

public class MainActivity extends AppCompatActivity {
    LottieAnimationView lt_loading_view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showProgressBar();
        showAnimation();
    }

    private void showProgressBar() {
        final Dialog dialog = new Dialog(this); // Context, this, etc.
        dialog.setContentView(R.layout.dialog_layout);
        dialog.setCancelable(false);
        dialog.show();
    }

    public void showAnimation(){
        lt_loading_view = (LottieAnimationView) findViewById(R.id.lt_loading_view);
        lt_loading_view.setAnimation(R.raw.tick_tick);
        lt_loading_view.loop(true);
        lt_loading_view.playAnimation();
        lt_loading_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Your code
                lt_loading_view.pauseAnimation();
            }
        });
    }
}
