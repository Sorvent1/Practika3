package ru.mirea.simakov.practika3;

public class Circle extends Shape {
    protected double radius;

    public Circle(String colour, boolean filled, double radius) {
        super(colour, filled);
        this.radius = radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(){
    }

    @Override
    double getArea() {
        return (2 * Math.PI * Math.pow(radius, 2));
    }

    @Override
    double getPerimeter() {
        return (2 * Math.PI * radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", colour='" + colour + '\'' +
                ", filled=" + filled +
                '}';
    }
}
