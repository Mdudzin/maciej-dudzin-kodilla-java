package com.kodilla.testing.shape;

public class Square implements Shape {

    double sideLenght;

    public Square(double sideLenght) {
        this.sideLenght = sideLenght;
    }

    public double getSideLenght() {
        return sideLenght;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Square square = (Square) o;

        return Double.compare(square.sideLenght, sideLenght) == 0;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(sideLenght);
        return (int) (temp ^ (temp >>> 32));
    }

    @Override
    public String toString() {
        return "Square{" +
                "sideLenght=" + sideLenght +
                '}';
    }

    public String getShapeName() {

        return "Square";

    }

    public double getField() {

        return sideLenght * sideLenght;

    }
}
