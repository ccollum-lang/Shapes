package lab5c;

public class Circle extends Shape{
    // instance field(s)
    private double radius;
    private double area;
    
    // constructor
    public Circle(int x, int y, int z,double radius) {
        super(x, y, z);
        this.radius = radius;
        area = Math.PI * (radius * radius);
        //this.center = new Point(x,y,z);
    }
    
    // accessor(s)
    public double getRadius() {return radius;}
    //public Point getCenter() {return center;}
    
    // method(s)
    @Override
    public double Area() {
        return area;
    }
    
    //@Override
    public String toString() {
        return "(" + super.getX() + ", " + super.getY() + ", " + super.getZ() + ") " + "( " + area + " )";
    }
}
