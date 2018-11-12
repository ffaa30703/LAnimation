package com.keep.propertyanimation;

import android.animation.TypeEvaluator;

/**
 * @author Jiyf
 * @package:com.keep.propertyanimation
 * @date on 2018/11/9   11:22 AM
 * @email ffaa30703@icloud.com
 */
public class CustomTypeEvaluator implements TypeEvaluator<Rectangle> {
    @Override
    public Rectangle evaluate(float fraction, Rectangle startValue, Rectangle endValue) {
        int x = (int) ((endValue.getX() - startValue.getX()) * fraction + startValue.getX());
        int y = (int) ((endValue.getY() - startValue.getY()) * fraction + startValue.getY());
        return new Rectangle(x, y);
    }
}
