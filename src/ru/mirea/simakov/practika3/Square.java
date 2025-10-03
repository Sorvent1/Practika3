package ru.mirea.simakov.practika3;

public class Square extends Rectangle{
    private double side;

    public Square(){
    }

    public Square(double width, double length, double side) {
        super(width, length);
        this.side = side;
    }

    public Square(String colour, boolean filled, double width, double length, double side) {
        super(colour, filled, width, length);
        this.side = side;
    }

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                ", colour='" + colour + '\'' +
                ", filled=" + filled +
                '}';
    }

    @Override
    public void setWidth(double side) {
        setSide(side);
    }

    @Override
    public void setLength(double side) {
        setSide(side);
    }

}
