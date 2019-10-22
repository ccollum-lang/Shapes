package lab5c;

public class Point {
    // instance field(s)
    private int xCoordinate;
    private int yCoordinate;
    private int zCoordinate;
    
    // constructor
    Point (int x, int y, int z){
        xCoordinate = x;
        yCoordinate = y;
        zCoordinate = z;
        
        if(xCoordinate < 0 || yCoordinate < 0){
            xCoordinate = 0;
            yCoordinate = 0;
        }
        if(xCoordinate > 500 || yCoordinate > 500){
            xCoordinate = 500;
            yCoordinate = 500;
        }
    }
    
    public int getX() { return xCoordinate;}
    public int getY() { return yCoordinate;}
    public int getZ() { return zCoordinate;}
    
    @Override
    public String toString(){
        return "(" + xCoordinate + "," + yCoordinate + ")";
    }
}
