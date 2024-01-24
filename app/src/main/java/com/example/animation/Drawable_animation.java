package com.example.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;

public class Drawable_animation extends AppCompatActivity {

    AnimationDrawable animation;
    ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawable_animation);
        img = (ImageView) findViewById(R.id.tri);
        img.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    AnimationDrawable animation = (AnimationDrawable) img.getDrawable();
                    animation.stop();
                    animation.selectDrawable(0);
                    animation.start();
                    return true;
                }
                return false;
            }
        });
    }
}