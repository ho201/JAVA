package Question1;

public class Square extends Rectangle {

    public Square(String color, boolean filled, float side) {
        super(color, filled, side, side);
    }

    public void setSide(float side) {
        setLength(side);
        setWidth(side);
    }

    public float getSide() {
        return getLength();
    }

    @Override
    public String toString() {
        return "Square: " + super.toString() +
                ", Side: " + getSide();
    }
}