package com.sch.igor;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getDistance(Point second) {
        return Math.sqrt(Math.pow((second.x - x), 2) + Math.pow((second.y - y), 2));
    }

    @Override
    public String toString() {
        return "[x=" + x + ", y=" + y + "]";
    }
}
