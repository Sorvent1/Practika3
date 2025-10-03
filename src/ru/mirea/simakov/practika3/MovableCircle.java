package ru.mirea.simakov.practika3;

public class MovableCircle implements Movable{
    private int radius;
    private MovablePoint center;

    public MovableCircle(int radius, MovablePoint center) {
        this.radius = radius;
        this.center = center;
    }

    @Override
    public String toString() {
        return "MovableCircle{" +
                "radius=" + radius +
                ", center=" + center +
                '}';
    }

    @Override
    public void moveUp() {
        this.center.y = this.center.y + this.center.ySpeed;
    }

    @Override
    public void moveDown() {
        this.center.y = this.center.y - this.center.ySpeed;
    }

    @Override
    public void moveLeft() {
        this.center.x = this.center.x - this.center.xSpeed;
    }

    @Override
    public void moveRight() {
        this.center.x = this.center.x + this.center.xSpeed;
    }
}