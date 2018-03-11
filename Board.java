package com.sch.igor;

import java.util.Arrays;

public class Board {
    private Shape[] arr = new Shape[4];

    public Board(Shape[] arr) {
        this.arr = arr;
    }

    public Board() {

    }

    public Shape[] getArr() {
        return arr;
    }

    public void setArr(Shape[] arr) {
        this.arr = arr;
    }

    public void putShape(Shape share, int k) {

        if (k >= 0 && k < arr.length && arr[k] == null) {
            arr[k] = share;
        }
    }

    public void delShape(int k) {
        if (k >= 0 && k < arr.length) {
            arr[k] = null;
        }
    }

    public double sumArea() {
        double sum = 0;
        for (Shape k : arr) {
            if (k != null) {
                sum += k.calculateArea();
            }
        }
        return sum;
    }

    @Override
    public String toString() {
        return "Фигуры - " + Arrays.toString(arr) + "\n\n" + "Сумма площадей = " + sumArea();
    }
}
