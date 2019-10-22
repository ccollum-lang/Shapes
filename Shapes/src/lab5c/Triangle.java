package lab5c;

public class Triangle extends Shape{
    // instance field(s)
    private double height;
    private double base;
    private double area;
    //private Point center;
    
    // constructor
public Triangle(int x, int y, int z, double base, double height) {
        super(x,y,z);
        this.height = height;
        this.base = base;
        area = (height * base) / 2;
        //this.center = new Point(x,y,z);
    }
    
    // accessor method(s)
    public double getLength() {return height;}
    public double getWidth() {return base;}
    //public Point getCenter() {return center;}
    
    // method(s)
    @Override
    public double Area() {
        return area;
    }
    
    
    @Override
    public String toString() {
        return "(" + super.getX() + ", " + super.getY() + ", " + super.getZ() + ")" + " / " + area + " \\";
    } 
}
