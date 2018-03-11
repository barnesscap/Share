package com.sch.igor;

/*
Рисуем круг, используя 2 точки.
Первая точка - центр, вторая точка - указывает на край круга.
Расстояние между точками - радиус круга
 */
public class Circle extends Shape {

    private Point center;
    private Point b;

    public Circle(Point center, Point b) {
        this.center = center;
        this.b = b;
    }

    public Circle() {

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
        return 2 * Math.PI * center.getDistance(b);
    }

    @Override
    double calculateArea() {
        return Math.PI * Math.pow(center.getDistance(b), 2);
    }

    @Override
    public String toString() {
        return "\n" + "Круг. Периметр = " + calculatePerimetr() + ", Площадь = " + calculateArea();
    }

}

