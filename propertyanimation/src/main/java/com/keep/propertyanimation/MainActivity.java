package com.keep.propertyanimation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.FloatEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";


    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        textView = findViewById(R.id.tv);
//        textView.setScrollY();

//        usingValueAnimator();
//        usingValueAnmatorVithCustomEvaluator();
//        usingObjectAnimator();
//        usingAnimatorSet();
    }

    public void startPropertyActivity(View v) {
        PropertyActivity.startActivity(this);
    }

//
//    private void usingAnimatorSet() {
//        ObjectAnimator translationx = ObjectAnimator.ofFloat(textView, "translationX", 300);
//
//        ObjectAnimator translationY = ObjectAnimator.ofFloat(textView, "translationY", -100f);
//
//        ObjectAnimator scrollX = ObjectAnimator.ofInt(textView, "scrollX", 50);
//
//        ObjectAnimator alpha = ObjectAnimator.ofFloat(textView, "alpha", 0.5f);
//
//        AnimatorSet animatorSet = new AnimatorSet();
//        animatorSet.play(translationx).before(translationY);
//        animatorSet.play(translationY).with(scrollX);
//        animatorSet.play(alpha).after(scrollX);
//
//        animatorSet.setDuration(3000);
//
//        animatorSet.addListener(new Animator.AnimatorListener() {
//            @Override
//            public void onAnimationStart(Animator animation) {
//                Log.d(TAG, "onAnimationStart: ");
//            }
//
//            @Override
//            public void onAnimationEnd(Animator animation) {
//                Log.d(TAG, "onAnimationEnd: ");
//            }
//
//            @Override
//            public void onAnimationCancel(Animator animation) {
//                Log.d(TAG, "onAnimationCancel: ");
//            }
//
//            @Override
//            public void onAnimationRepeat(Animator animation) {
//                Log.d(TAG, "onAnimationRepeat: ");
//            }
//        });
//
//
//        animatorSet.start();
//
//
//    }
//
//
//    private void usingObjectAnimator() {
////        ObjectAnimator objectAnimator=ObjectAnimator.ofObject(textView,"translationX",new FloatEvaluator(),300f);
////        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(textView, "alpha", 0);
//        ObjectAnimator objectAnimator = ObjectAnimator.ofInt(textView, "scrollX", 50);
//        objectAnimator.setDuration(2000);
//        objectAnimator.addListener(new AnimatorListenerAdapter() {
//            @Override
//            public void onAnimationEnd(Animator animation) {
//                super.onAnimationEnd(animation);
//            }
//        });
//        objectAnimator.start();
//
//    }
//
//    private void usingValueAnimator() {
//        ValueAnimator animator = ValueAnimator.ofFloat(0f, 100f);
//        animator.setDuration(2000);
//        animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
//            @Override
//            public void onAnimationUpdate(ValueAnimator animation) {
//                float value = (float) animation.getAnimatedValue();
//                Log.d(TAG, "onAnimationUpdate: " + value);
//            }
//        });
//        animator.start();
//    }
//
//    private void usingValueAnmatorVithCustomEvaluator() {
//        Rectangle startRectangle = new Rectangle(0, 0);
//        Rectangle endRectangle = new Rectangle(100, 100);
//        ValueAnimator animator = ValueAnimator.ofObject(new CustomTypeEvaluator(), startRectangle, endRectangle);
//        animator.setDuration(2000);
//        animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
//            @Override
//            public void onAnimationUpdate(ValueAnimator animation) {
//                Rectangle curRectangle = (Rectangle) animation.getAnimatedValue();
//                Log.d(TAG, "onAnimationUpdate: curRectangle:" + curRectangle);
//            }
//        });
//        animator.start();
//
//    }


}
