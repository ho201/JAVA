package Question3;

public class Circle extends GeometricObject {
    private float radius;

    public Circle(String color, boolean filled, float radius) {
        super(color, filled);
        this.radius = radius;
    }

    public float getRadius() {
        return radius;
    }
    public void setRadius(float radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle: " + super.toString() +
                ", Radius: " + radius +
                ", Area: " + getArea();
    }
}