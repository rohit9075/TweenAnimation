package com.rohit.com.tweenanimation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    Animation mAlphaAnimation , mRotateAnimation , mScaleAnimation , mTranslateAnimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      imageView =   findViewById(R.id.imageView_ball);
    }

    public void rotateAnimation(View view) {

        mRotateAnimation = AnimationUtils.loadAnimation(this, R.anim.rotate_animation);
        imageView.startAnimation(mRotateAnimation);


    }

    public void scaleAnimation(View view) {

        mScaleAnimation = AnimationUtils.loadAnimation(this, R.anim.scale_animation);
        imageView.startAnimation(mScaleAnimation);
    }

    public void translateAnimation(View view) {

        mTranslateAnimation = AnimationUtils.loadAnimation(this, R.anim.translate_amination);
        imageView.startAnimation(mTranslateAnimation);
    }

    public void alphaAnimation(View view) {

        // load animation from xml files
        mAlphaAnimation = AnimationUtils.loadAnimation(this, R.anim.alpha_anim);
        imageView.startAnimation(mAlphaAnimation);
    }
}
