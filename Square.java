package com.sch.igor;

/*
Рисуем квадрат, используя 2 точки.
Одна точка - центр, вторая точка - указывает на угол квардата.
Расстояние между точками - полудиагональ.
 */
public class Square extends Shape {
    private Point center;
    private Point b;

    public Square(Point center, Point b) {
        this.center = center;
        this.b = b;
    }

    public Square() {

    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public Point getB() {
        return b;
    }

    public void setB(Point b) {
        this.b = b;
    }


    @Override
    double calculatePerimetr() {
        return center.getDistance(b) * 4 * Math.sqrt(2);
    }

    @Override
    double calculateArea() {
        return Math.pow(center.getDistance((b)) * 2, 2) / 16;
    }

    @Override
    public String toString() {
        return "\n" + "Квадрат. Периметр = " + calculatePerimetr() + ", Площадь= " + calculateArea();
    }
}

