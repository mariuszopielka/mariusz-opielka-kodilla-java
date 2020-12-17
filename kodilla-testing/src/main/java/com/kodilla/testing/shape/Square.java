package com.kodilla.testing.shape;

public class Square implements Shape{

    String shapeName;
    double field;

    public Square(double sidelength){
        this.shapeName = "square";
        this.field = sidelength * sidelength;
    }

    public String getShapeName() {

        return this.shapeName;
    }

    public double getField() {

        return this.field;
    }

    @Override
    public String toString() {

            return "Square{" +
                    "shapeName='" + shapeName + '\'' +
                    ", field=" + field +
                    '}';
    }
}
