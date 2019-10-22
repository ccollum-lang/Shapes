package lab5c;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    
    public static final int ADD_CIRCLE = 1;
    public static final int ADD_RECTANGLE = 2;
    public static final int ADD_TRIANGLE = 3;
    public static final int VIEW_SHAPES = 4;
    public static final int QUIT = 5;
    
    public static void main(String[] args) {
    
        ArrayList<Shape> shapes = new ArrayList<>();
        Scanner keyboard = new Scanner(System.in);

        boolean done = false;

        int x, y, z;
        double radius, length, width, base, height;

        /* Main Menu */

        while ( !done ) {

            int choice = 0;
            boolean valid_input = false;

            /* Display Menu */

            while (!valid_input) {

                System.out.println("\n1) Add Circle");
                System.out.println("2) Add Rectangle");
                System.out.println("3) Add Triangle");
                System.out.println("4) View List of Shapes");
                System.out.println("5) Quit");

                System.out.print("\nYour Choice? ");

                choice = getInt(keyboard);

                if (choice < ADD_CIRCLE || choice > QUIT) {
                    System.out.println("ERROR: Invalid Input!  Try again.\n");
                }

                else {
                    valid_input = true;
                }

            }

            switch (choice) {

                case ADD_CIRCLE:

                    System.out.print("Enter the X coordinate: ");
                    x = getInt(keyboard);

                    System.out.print("Enter the Y coordinate: ");
                    y = getInt(keyboard);

                    System.out.print("Enter the Z coordinate: ");
                    z = getInt(keyboard);

                    System.out.print("Enter the radius of the circle: ");
                    radius = getDouble(keyboard);

                    Circle c = new Circle(x, y, z, radius);
                    shapes.add(c);

                    break;

                case ADD_RECTANGLE:

                    System.out.print("Enter the X coordinate: ");
                    x = getInt(keyboard);

                    System.out.print("Enter the Y coordinate: ");
                    y = getInt(keyboard);

                    System.out.print("Enter the Z coordinate: ");
                    z = getInt(keyboard);

                    System.out.print("Enter the length of the rectangle: ");
                    length = getDouble(keyboard);

                    System.out.print("Enter the width of the rectangle: ");
                    width = getDouble(keyboard);

                    Rectangle r = new Rectangle(x, y, z, length, width);
                    shapes.add(r);

                    break;

                case ADD_TRIANGLE:

                    System.out.print("Enter the X coordinate: ");
                    x = getInt(keyboard);

                    System.out.print("Enter the Y coordinate: ");
                    y = getInt(keyboard);

                    System.out.print("Enter the Z coordinate: ");
                    z = getInt(keyboard);

                    System.out.print("Enter the height of the triangle: ");
                    height = getDouble(keyboard);

                    System.out.print("Enter the width of the base of the triangle: ");
                    base = getDouble(keyboard);

                    Triangle t = new Triangle(x, y, z, height, base);
                    shapes.add(t);

                    break;

                case VIEW_SHAPES:

                    for (Shape shape : shapes)
                        System.out.println(shape.toString());

                    break;

                case QUIT:

                    done = true;
                    break;

            }

        }

        System.out.print("\nThank you for using the Shape Generator!\n\n");

    }
    
    /* Reads a floating-point number from standard input */
    
    private static double getDouble(Scanner keyboard) {
        
        while (!keyboard.hasNextDouble()) {
            keyboard.next();
        }

        return keyboard.nextDouble();
        
    }
    
    /* Reads an integer from standard input */
    
    private static int getInt(Scanner keyboard) {
        
        while (!keyboard.hasNextInt()) {
            keyboard.next();
        }

        return keyboard.nextInt();
        
    }
    
}
