package com.keep.propertyanimation;

/**
 * @author Jiyf
 * @package:com.keep.propertyanimation
 * @date on 2018/11/9   11:24 AM
 * @email ffaa30703@icloud.com
 */
public class Rectangle {
    private int x;
    private int y;

    public Rectangle(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
