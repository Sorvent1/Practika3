package ru.mirea.simakov.practika3;

public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.setColour("Red");
        c1.setFilled(true);
        c1.setRadius(5.0);
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getArea());
        System.out.println(c1);
    }
}
