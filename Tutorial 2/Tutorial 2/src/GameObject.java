/* Game object class file

Created by: Jonathan Pasco-Arnone
Created on: November 2023

*/
public abstract class GameObject {
    protected Point2D location;

    protected GameObject(Point2D coordinates) {
        location = coordinates;
    }

    // The get and set methods
    public Point2D getLocation() { return location; }
    public void setLocation(Point2D newLocation) { location = newLocation; }
    public abstract void update();
}
