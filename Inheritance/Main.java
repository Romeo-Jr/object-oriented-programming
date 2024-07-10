package Inheritance;

import Inheritance.packages.Box;
import Inheritance.packages.Circle;
import Inheritance.packages.Cube;
import Inheritance.packages.Cylinder;
import Inheritance.packages.Pyramid;
import Inheritance.packages.Rectangle;
import Inheritance.packages.Square;
import Inheritance.packages.Triangle;

public class Main{
    public static void main(String[] args) {
        // CIRCLE
        Circle circle_1 = new Circle("Red", "Smooth", 5);

        System.out.println("----------------------------");
        System.out.println("OUTPUT IN CIRCLE");

        System.out.print("Circle getColor Method : ");
        System.out.println(circle_1.getColor());

        System.out.print("Circle getTexture Method : ");
        System.out.println(circle_1.getTextture());

        System.out.print("Circle getArea Method : ");
        System.out.println(circle_1.getArea());

        // CYLINDER
        Cylinder cylinder_1 = new Cylinder("Pink", "Rough", 5, 10);

        System.out.println("----------------------------");
        System.out.println("OUTPUT IN CYLINDER");

        System.out.print("Cylinder getColor Method : ");
        System.out.println(cylinder_1.getColor());

        System.out.print("Cylinder getTexture Method : ");
        System.out.println(cylinder_1.getTextture());

        System.out.print("Cylinder getArea Method : ");
        System.out.println(cylinder_1.getArea());

        System.out.print("Cylinder getVolume Method : ");
        System.out.println(cylinder_1.getVolume());

        // RECTANGLE
        Rectangle rectangle_1 = new Rectangle("Green", "Rigid", 10, 3);

        System.out.println("----------------------------");
        System.out.println("OUTPUT IN RECTANGLE");

        System.out.print("Rectangle getColor Method : ");
        System.out.println(rectangle_1.getColor());

        System.out.print("Rectangle getTexture Method : ");
        System.out.println(rectangle_1.getTextture());

        System.out.print("Rectangle getArea Method : ");
        System.out.println(rectangle_1.getArea());

        // BOX
        Box box_1 = new Box("Blue Green", "Soft", 7, 4, 10);

        System.out.println("----------------------------");
        System.out.println("OUTPUT IN BOX");

        System.out.print("Box getColor Method : ");
        System.out.println(box_1.getColor());

        System.out.print("Box getTexture Method : ");
        System.out.println(box_1.getTextture());

        System.out.print("Box getArea Method : ");
        System.out.println(box_1.getArea());

        System.out.print("Box getVolume Method : ");
        System.out.println(box_1.getVolume());  
        
        // TRIANGLE
        Triangle triangle_1 = new Triangle("Blue", "Hard", 10, 30);

        System.out.println("----------------------------");
        System.out.println("OUTPUT IN TRIANGLE");

        System.out.print("Triangle getColor Method : ");
        System.out.println(triangle_1.getColor());

        System.out.print("Triangle getTexture Method : ");
        System.out.println(triangle_1.getTextture());

        System.out.print("Triangle getArea Method : ");
        System.out.println(triangle_1.getArea());

        // PYRAMID
        Pyramid pyramid_1 = new Pyramid("White", "Round", 6, 12, 10);

        System.out.println("----------------------------");
        System.out.println("OUTPUT IN PYRAMID");

        System.out.print("Pyramid getColor Method : ");
        System.out.println(pyramid_1.getColor());

        System.out.print("Pyramid getTexture Method : ");
        System.out.println(pyramid_1.getTextture());

        System.out.print("Pyramid getArea Method : ");
        System.out.println(pyramid_1.getArea());

        System.out.print("Pyramid getVolume Method : ");
        System.out.println(pyramid_1.getVolume());  

        // SQUARE
        Square square_1 = new Square("Black", "Smooth", 12);
        
        System.out.println("----------------------------");
        System.out.println("OUTPUT IN SQUARE");

        System.out.print("Square getColor Method : ");
        System.out.println(square_1.getColor());

        System.out.print("Square getTexture Method : ");
        System.out.println(square_1.getTextture());

        System.out.print("Square getArea Method : ");
        System.out.println(square_1.getArea());

        // CUBE
        Cube cube_1 = new Cube("Yello", "Rigid", 13);

        System.out.println("----------------------------");
        System.out.println("OUTPUT IN CUBE");

        System.out.print("Cube getColor Method : ");
        System.out.println(cube_1.getColor());

        System.out.print("Cube getTexture Method : ");
        System.out.println(cube_1.getTextture());

        System.out.print("Cube getArea Method : ");
        System.out.println(cube_1.getArea());

        System.out.print("Cube getVolume Method : ");
        System.out.println(cube_1.getVolume());
    }
}