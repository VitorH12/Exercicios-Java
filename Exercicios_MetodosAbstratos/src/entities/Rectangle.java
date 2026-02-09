package entities;

public class Rectangle extends Shape{

    private Double height;
    private Double width;

    public Rectangle() {
    }

    public Rectangle(Color color, Double height, Double width) {
        super(color);
        this.height = height;
        this.width = width;
    }

    @Override
    public double area() {
        return width * height;
    }


}
