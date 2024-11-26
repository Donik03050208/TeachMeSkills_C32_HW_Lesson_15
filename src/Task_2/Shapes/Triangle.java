package Task_2.Shapes;

public class Triangle extends Shape{

    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side3, double side2) {
        this.side1 = side1;
        this.side3 = side3;
        this.side2 = side2;
    }

    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }
}
