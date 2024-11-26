package Task_2;

import Task_2.Shapes.Circle;
import Task_2.Shapes.Rectangle;
import Task_2.Shapes.Shape;
import Task_2.Shapes.Triangle;

import java.util.ArrayList;
import java.util.List;

public class ApplicationRunner {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(5));
        shapes.add(new Triangle(2,3,4));
        shapes.add(new Rectangle(5,3));
        for (Shape shape : shapes){
            System.out.println("Figure perimeter: " + shape.getPerimeter());
        }
    }
}
