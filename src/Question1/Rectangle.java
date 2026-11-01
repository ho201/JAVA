package Question1;

public class Rectangle extends GeometricObject {
    private float length;
    private float width;

    public Rectangle(String color, boolean filled, float length, float width) {
        super(color, filled);
        this.length = length;
        this.width = width;
    }

    public float getLength() {
        return length;
    }
    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }
    public void setWidth(float width) {
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }

    @Override
    public String toString() {
        return "Rectangle: " + super.toString() +
                ", Length: " + length +
                ", Width: " + width +
                ", Area: " + getArea();
    }
}