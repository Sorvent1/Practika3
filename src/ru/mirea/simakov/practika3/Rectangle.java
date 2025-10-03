package ru.mirea.simakov.practika3;

public class Rectangle extends Shape{
    protected double width;
    protected double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(String colour, boolean filled, double width, double length) {
        super(colour, filled);
        this.width = width;
        this.length = length;
    }

    public Rectangle(){
    }

    @Override
    double getArea() {
        return 0;
    }

    @Override
    double getPerimeter() {
        return 0;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                ", filled=" + filled +
                ", colour='" + colour + '\'' +
                '}';
    }
}
