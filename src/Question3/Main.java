package Question3;

public class Main {
    public static void main(String[] args) {

        GeometricObject[] objects = {

                new Circle("Red", true, 3),
                new Circle("Green", true, 2),
                new Rectangle("Blue", false, 2, 3),
                new Square("Black", true, 5),
        };

        ComparableSorting.sort(objects);

        for (int i = 0; i < objects.length; i++) {
            System.out.println(objects[i]);
        }
    }
}