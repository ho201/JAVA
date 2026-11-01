package Question1;

public class Main {
    public static void main(String[] args) {

        GeometricObject[] objects = {
                new Circle("Red", true, 3),
                new Circle("Blue", false, 2),
                new Rectangle("Green", true, 5, 6),
                new Rectangle("Yellow", false, 2, 3),
                new Square("Black", true, 5),
                new Square("White", false, 3)
        };

        for (int i = 0; i < objects.length; i++) {

            if (objects[i].getArea() > 20) {
                System.out.println(objects[i]);
            }
        }
    }
}