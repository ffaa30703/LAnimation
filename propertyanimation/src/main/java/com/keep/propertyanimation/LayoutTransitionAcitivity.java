package com.keep.propertyanimation;

import android.animation.Animator;
import android.animation.LayoutTransition;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

public class LayoutTransitionAcitivity extends AppCompatActivity {

    private static final String TAG = "LayoutTransitionAcitivi";
    LinearLayout ll;
    private LayoutTransition mTransitioner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout_transition);
        ll = findViewById(R.id.ll);
        mTransitioner = new LayoutTransition();

        ll.setLayoutTransition(mTransitioner);
        setTransition();
    }

    public void add(View view) {
        TextView textView = new TextView(this);

        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        textView.setLayoutParams(layoutParams);


        int childCount = ll.getChildCount();
        textView.setText("number  " + (++childCount));
        textView.setBackgroundColor(Color.BLUE);

        ll.addView(textView,0);

//


    }

    private void setTransition() {
        /**
         * 添加View时过渡动画效果
         */
        ObjectAnimator addAnimator = ObjectAnimator.ofFloat(null, "rotationY", 0, 50,0).
                setDuration(mTransitioner.getDuration(LayoutTransition.APPEARING)+1000);
        mTransitioner.setAnimator(LayoutTransition.APPEARING, addAnimator);

        /**
         * 移除View时过渡动画效果
         */
        ObjectAnimator removeAnimator = ObjectAnimator.ofFloat(null, "rotationX", 0, -180, 0).
                setDuration(mTransitioner.getDuration(LayoutTransition.DISAPPEARING));
        mTransitioner.setAnimator(LayoutTransition.DISAPPEARING, removeAnimator);

        /**
         * view 动画改变时，布局中的每个子view动画的时间间隔
         */
        mTransitioner.setStagger(LayoutTransition.CHANGE_APPEARING, 3000);
        mTransitioner.setStagger(LayoutTransition.CHANGE_DISAPPEARING, 3000);


        /**
         *LayoutTransition.CHANGE_APPEARING和LayoutTransition.CHANGE_DISAPPEARING的过渡动画效果
         * 必须使用PropertyValuesHolder所构造的动画才会有效果，不然无效！使用ObjectAnimator是行不通的,
         * 发现这点时真特么恶心,但没想到更恶心的在后面,在测试效果时发现在构造动画时，”left”、”top”、”bottom”、”right”属性的
         * 变动是必须设置的,至少设置两个,不然动画无效,问题是我们即使这些属性不想变动!!!也得设置!!!
         * 我就问您恶不恶心!,因为这里不想变动,所以设置为(0,0)
         *
         */
        PropertyValuesHolder pvhLeft =
                PropertyValuesHolder.ofInt("left", 0, 0);
        PropertyValuesHolder pvhTop =
                PropertyValuesHolder.ofInt("top", 0, 0);
        PropertyValuesHolder pvhRight =
                PropertyValuesHolder.ofInt("right", 0, 0);
        PropertyValuesHolder pvhBottom =
                PropertyValuesHolder.ofInt("bottom", 0, 0);


        /**
         * view被添加时,其他子View的过渡动画效果
         */
        PropertyValuesHolder animator = PropertyValuesHolder.ofFloat("scaleX", 1, 1.5f, 1);
        final ObjectAnimator changeIn = ObjectAnimator.ofPropertyValuesHolder(
                this, pvhLeft,  pvhBottom, animator).
                setDuration(mTransitioner.getDuration(LayoutTransition.CHANGE_APPEARING));

//        mTransitioner.setAnimator(LayoutTransition.CHANGE_APPEARING, changeIn);


        /**
         * view移除时，其他子View的过渡动画
         */
        PropertyValuesHolder pvhRotation =
                PropertyValuesHolder.ofFloat("scaleX", 1, 1.5f, 1);
        final ObjectAnimator changeOut = ObjectAnimator.ofPropertyValuesHolder(
                this, pvhLeft, pvhBottom, pvhRotation).
                setDuration(mTransitioner.getDuration(LayoutTransition.CHANGE_DISAPPEARING));

//        mTransitioner.setAnimator(LayoutTransition.CHANGE_DISAPPEARING, changeOut);
    }


    public void del(View view) {

        int childCount = ll.getChildCount();
        if (childCount == 0) return;

        ll.removeViewAt(0);

    }
}
