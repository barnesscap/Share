package com.sch.igor;

public class Main {
    public static void main(String[] args) {
        Point pointOne = new Point(1, 3);
        Point pointTwo = new Point(4, 6);
        Point pointThree = new Point(8, 3);

        Circle cOne = new Circle(pointOne, pointTwo);
        Triangle tOne = new Triangle(pointOne, pointTwo, pointThree);
        Square sOne = new Square(pointOne, pointTwo);
        Circle cTwo = new Circle(pointTwo, pointThree);
        Board bOne = new Board();

        bOne.putShape(cOne, 0);
        bOne.putShape(tOne, 1);
        bOne.putShape(sOne, 2);
        bOne.putShape(cTwo, 3);

        System.out.println(bOne);
    }
}
