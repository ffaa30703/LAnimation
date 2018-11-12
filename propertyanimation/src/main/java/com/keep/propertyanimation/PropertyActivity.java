package com.keep.propertyanimation;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class PropertyActivity extends AppCompatActivity {


    TextView tv;

    public static void startActivity(Activity activity) {
        Intent intent = new Intent(activity, PropertyActivity.class);
        activity.startActivity(intent);
//        tv.setBackgroundColor();


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_property);
        tv = findViewById(R.id.tv);
    }

    public void translateX(View view) {
        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(tv, "translationX", 0, 100, -100, 0);
        objectAnimator.setDuration(2000);
        objectAnimator.start();


    }

    public void translateY(View view) {
        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(tv, "translationY", 0, 100, 0, -100, 0);
        objectAnimator.setDuration(2000);
        objectAnimator.start();
    }

    public void rotationX(View view) {
        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(tv, "rotationX", 0, 100, 0, -100, 0);
        objectAnimator.setDuration(2000);
        objectAnimator.start();
    }

    public void rotation(View view) {
        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(tv, "rotation", 0, 100, 0, -100, 0);
        objectAnimator.setDuration(2000);
        objectAnimator.start();
    }

    public void rotationY(View view) {
        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(tv, "rotationY", 0, 180, -180, 0);
        objectAnimator.setDuration(2000);
        objectAnimator.start();
    }

    public void scaleX(View view) {
        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(tv, "scaleX", 0.5f, 1f, 2f, 1f);
        objectAnimator.setDuration(2000);
        objectAnimator.start();
    }


    public void scaleY(View view) {
        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(tv, "scaleY", 0.5f, 1f, 2f, 1f);
        objectAnimator.setDuration(2000);
        objectAnimator.start();
    }

    public void pivotX(View view) {
        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(tv, "pivotX", 0, 180, -180, 0);
        objectAnimator.setDuration(2000);
        objectAnimator.start();
    }

    public void pivotY(View view) {
        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(tv, "pivotY", 0, 180, -180, 0);
        objectAnimator.setDuration(2000);
        objectAnimator.start();
    }

    public void X(View view) {
        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(tv, "x", 0, 180, -180, 0);
        objectAnimator.setDuration(2000);
        objectAnimator.start();
    }

    public void Y(View view) {
        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(tv, "y", 0, 180, -180, 0);
        objectAnimator.setDuration(2000);
        objectAnimator.start();
    }

    public void alpha(View view) {
        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(tv, "alpha", 1, 0.1f, 1);
        objectAnimator.setDuration(2000);
        objectAnimator.start();

    }

    public void color(View view) {
        ObjectAnimator objectAnimator = null;
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
            objectAnimator = ObjectAnimator.ofArgb(tv, "backgroundColor", Color.parseColor("#ffffff"), Color.parseColor("#0000ff"));
            objectAnimator.setDuration(2000);
            objectAnimator.start();
        }

    }

}
