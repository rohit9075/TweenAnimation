package com.rohit.com.tweenanimation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.imageView_ball);
    }

    public void rotateAnimation(View view) {
    }

    public void scaleAnimation(View view) {
    }

    public void translateAnimation(View view) {
    }

    public void alphaAnimation(View view) {
    }
}
