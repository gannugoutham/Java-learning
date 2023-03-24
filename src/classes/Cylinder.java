package classes;

public class Cylinder {
    //Declaring private properties
    private double radius;
    private double height;

    //getter methods
    public double getRadius() {
        return radius;
    }
    public double getHeight() {
        return height;
    }
    //setter methods
    public void setRadius(double radius) {
        if(radius>0){
            this.radius = radius;
        } else {
            this.radius = 1;
        }
    }
    public void setHeight(double height) {
        if(height>0){
            this.height = height;
        } else {
            this.height = 1;
        }
    }

    //constructor with no arguments
    public Cylinder(){
        setRadius(1);
        setHeight(1);
    }
    //constructor with only radius argument
    public Cylinder(double r){
        setRadius(r);
        setHeight(1);
    }
    //constructor with both radius and height arguments
    public Cylinder(double r, double h){
        setRadius(r);
        setHeight(h);
    }

    //Implementation
    public double bottomSurfaceArea(){
        return Math.PI*getRadius()*getRadius();
    }
    public double surfaceArea(){
        return bottomSurfaceArea()*getHeight();
    }
    public double totalSurfaceArea(){
        return surfaceArea()+2*bottomSurfaceArea();
    }
}
