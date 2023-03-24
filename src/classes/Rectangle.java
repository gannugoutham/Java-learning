package classes;

public class Rectangle {
    private double length;
    private double breadth;

    //constructor is used to initialize the properties of a class.
    public Rectangle() { //constructor with default values. if we won't pass any values to the object.
        setLength(1);
        setBreadth(1);
    }
    public Rectangle(double l, double b) { //parameterized constructor with values.when we pass any values to the object.
        setLength(l);
        setBreadth(b);
    }

    //private variables won't get accessed from outside the class. use setter and setter methods.
    public double getLength(){
        return length;
    } //getter method returns variable value. name -> get + variable name (camelcase). have return type.
    public double getBreadth(){
        return breadth;
    }

    public void setLength(double length) {
        if(length > 0){
            this.length = length;
        } else
            this.length = 0;
    }
    //setter method modifies the variable name & don't have a return type.

    public void setBreadth(double breadth) {
        if(breadth > 0){
            this.breadth = breadth;
        } else
            this.breadth = 0;
    }

    public double area() {
        return getLength()*getBreadth();
    }
    public double perimeter() {
        return 2*(getLength()+getBreadth());
    }
    public boolean isSquare(){
        return getLength()==getBreadth();
    }
}

