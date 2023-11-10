/* Movable object class file

Created by: Jonathan Pasco-Arnone
Created on: November 2023

*/
public abstract class MovableObject extends GameObject {
    protected int direction;
    protected int speed;
    protected MovableObject(int d, int s, Point2D loc) {
        super(loc);
        direction = d;
        speed = s;
    }

    // The get/set methods
    public int getDirection() { return direction; }
    public int getSpeed() { return speed; }
    public void setDirection(int newDirection) { direction = newDirection; }
    public void setSpeed(int newSpeed) { speed = newSpeed; }

    public void update() {
        moveForward();
        draw();
    }

    public void moveForward() {
        if (speed > 0){
            location = location.add((int)
                    (Math.cos(Math.toRadians(direction)) * speed), (int)
                    (Math.sin(Math.toRadians(direction)) * speed));
        }
    }

    public abstract void draw();
}
