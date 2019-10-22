package lab5c;

public class Rectangle extends Shape{
    // instance field(s)
    private double height;
    private double width;
    private double area;
    //private Point center;
    
    // Constructor
    public Rectangle(int x, int y, int z, double width, double height) {
        super(x,y,z);
        this.height = height;
        this.width = width;
        area = height * width;
        
    }
    
    // accessor method(s)
    public double getLength() {return height;}
    public double getWidth() {return width;}
    //public Point getCenter() {return center;}
    
    // method(s)
    @Override
    public double Area() {
        return area;
    }
    
    @Override
    public String toString() {
        return "(" + super.getX() + ", " + super.getY() + ", " + super.getZ() + ")" + " [ " + area + " ]";
    }
}