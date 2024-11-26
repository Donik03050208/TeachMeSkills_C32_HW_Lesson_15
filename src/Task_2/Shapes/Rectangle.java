package Task_2.Shapes;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }
}
