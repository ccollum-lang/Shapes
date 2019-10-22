package lab5c;

public abstract class Shape {
    // instance field(s)
    private Point center;
    
    
    // constructor
    public Shape(int x, int y, int z) { 
        center = new Point (x, y, z);
    }
    
    // accessor method(s)
    public int getX(){
        return center.getX();
    }
    
    public int getY(){
        return center.getY();
    }
    
    public int getZ(){
        return center.getZ();
    }
    
    public abstract double Area();
}


