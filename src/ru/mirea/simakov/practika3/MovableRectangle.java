package ru.mirea.simakov.practika3;

public class MovableRectangle implements Movable{
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(MovablePoint topLeft, MovablePoint bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    @Override
    public String toString() {
        return "MovableRectangle{" +
                "topLeft=" + topLeft +
                ", bottomRight=" + bottomRight +
                '}';
    }

    @Override
    public void moveUp() {
        this.topLeft.y = this.topLeft.y + this.topLeft.ySpeed;
        this.bottomRight.y = this.bottomRight.y + this.bottomRight.ySpeed;
    }

    @Override
    public void moveDown() {
        this.topLeft.y = this.topLeft.y - this.topLeft.ySpeed;
        this.bottomRight.y = this.bottomRight.y - this.bottomRight.ySpeed;
    }

    @Override
    public void moveLeft() {
        this.topLeft.x = this.topLeft.x - this.topLeft.xSpeed;
        this.bottomRight.x = this.bottomRight.x - this.bottomRight.xSpeed;
    }

    @Override
    public void moveRight() {
        this.topLeft.x = this.topLeft.x + this.topLeft.xSpeed;
        this.bottomRight.x = this.bottomRight.x + this.bottomRight.xSpeed;
    }
}
