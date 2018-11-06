package com.rohit.com.tweenanimation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements Animation.AnimationListener {

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
        mRotateAnimation.setAnimationListener(this);
        imageView.startAnimation(mRotateAnimation);


    }

    public void scaleAnimation(View view) {

        mScaleAnimation = AnimationUtils.loadAnimation(this, R.anim.scale_animation);
        mScaleAnimation.setAnimationListener(this);
        imageView.startAnimation(mScaleAnimation);
    }

    public void translateAnimation(View view) {

        mTranslateAnimation = AnimationUtils.loadAnimation(this, R.anim.translate_amination);
        mTranslateAnimation.setAnimationListener(this);
        imageView.startAnimation(mTranslateAnimation);
    }

    public void alphaAnimation(View view) {

        // load animation from xml files
        mAlphaAnimation = AnimationUtils.loadAnimation(this, R.anim.alpha_anim);
        mAlphaAnimation.setAnimationListener(this);
        imageView.startAnimation(mAlphaAnimation);
    }

    @Override
    public void onAnimationStart(Animation animation) {
        Toast.makeText(this, "Animation Started", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onAnimationEnd(Animation animation) {
        Toast.makeText(this, "Animation ended", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onAnimationRepeat(Animation animation) {
        Toast.makeText(this, "Animation repeated", Toast.LENGTH_SHORT).show();
    }
}
