/* Stationary object class file

Created by: Jonathan Pasco-Arnone
Created on: November 2023

*/
public abstract class StationaryObject extends GameObject {
    protected StationaryObject(Point2D loc) {
        super(loc);
    }
    public void update() {}
}
