package com.example.animation;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //set app title
        setTitle("B6301095");
        TextView fadeInT = findViewById(R.id.txt_fade_in);
        TextView fadeOutT = findViewById(R.id.txt_fade_out);
        TextView zoomInT = findViewById(R.id.txt_zoom_in);
        TextView zoomOutT = findViewById(R.id.txt_zoom_out);
        TextView crossFadeT = findViewById(R.id.txt_cross_fade);
        TextView blinkT = findViewById(R.id.txt_blink);
        TextView rotateT = findViewById(R.id.txt_rotate);
        TextView moveT = findViewById(R.id.txt_move);
        TextView slideUpT = findViewById(R.id.txt_slide_up);
        TextView slideDownT = findViewById(R.id.txt_slide_down);
        TextView bounceT = findViewById(R.id.txt_bounce);
        TextView sequentialT = findViewById(R.id.txt_sequential);
        TextView togetherT = findViewById(R.id.txt_together);

        Button btnFadeIn = findViewById(R.id.btnFadeIn);
        Button btnFadeOut = findViewById(R.id.btnFadeOut);
        Button btnZoomIn = findViewById(R.id.btnZoomIn);
        Button btnZoomOut = findViewById(R.id.btnZoomOut);
        Button btnCrossFade = findViewById(R.id.btnCrossFade);
        Button btnBlink = findViewById(R.id.btnBlink);
        Button btnRotate = findViewById(R.id.btnRotate);
        Button btnMove = findViewById(R.id.btnMove);
        Button btnSlideUp = findViewById(R.id.btnSlideUp);
        Button btnSlideDown = findViewById(R.id.btnSlideDown);
        Button btnBounce = findViewById(R.id.btnBounce);
        Button btnSequential = findViewById(R.id.btnSequential);
        Button btnTogether = findViewById(R.id.btnTogether);

        btnFadeIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation fadeIn = AnimationUtils.loadAnimation(MainActivity.this, R.anim.fade_in);
                fadeInT.startAnimation(fadeIn);
            }
        });

        btnFadeOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation fadeOut = AnimationUtils.loadAnimation(MainActivity.this, R.anim.fade_out);
                fadeOutT.startAnimation(fadeOut);
            }
        });

        btnZoomIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation zoomIn = AnimationUtils.loadAnimation(MainActivity.this, R.anim.zoom_in);
                zoomInT.startAnimation(zoomIn);
            }
        });

        btnZoomOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation zoomOut = AnimationUtils.loadAnimation(MainActivity.this, R.anim.zoom_out);
                zoomOutT.startAnimation(zoomOut);
            }
        });

        btnCrossFade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation crossFade = AnimationUtils.loadAnimation(MainActivity.this, R.anim.cross_fade);
                crossFadeT.startAnimation(crossFade);
            }
        });

        btnBlink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation blink = AnimationUtils.loadAnimation(MainActivity.this, R.anim.blink);
                blinkT.startAnimation(blink);
            }
        });

        btnRotate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation rotate = AnimationUtils.loadAnimation(MainActivity.this, R.anim.rotate);
                rotateT.startAnimation(rotate);
            }
        });

        btnMove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation move = AnimationUtils.loadAnimation(MainActivity.this, R.anim.move);
                moveT.startAnimation(move);
            }
        });

        btnSlideUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation slideUp = AnimationUtils.loadAnimation(MainActivity.this, R.anim.slide_up);
                slideUpT.startAnimation(slideUp);
            }
        });

        btnSlideDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation slideDown = AnimationUtils.loadAnimation(MainActivity.this, R.anim.silde_down);
                slideDownT.startAnimation(slideDown);
            }
        });

        btnBounce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation bounce = AnimationUtils.loadAnimation(MainActivity.this, R.anim.bounce);
                bounceT.startAnimation(bounce);
            }
        });

        btnSequential.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation sequential = AnimationUtils.loadAnimation(MainActivity.this, R.anim.sequential);
                sequentialT.startAnimation(sequential);
            }
        });

        btnTogether.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation together = AnimationUtils.loadAnimation(MainActivity.this, R.anim.together);
                togetherT.startAnimation(together);
            }
        });
    }
}