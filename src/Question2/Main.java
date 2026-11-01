package Question2;

public class Main {
    public static void main(String[] args) {

        Movable m = new MovablePoint(5, 10, 2, 3);

        System.out.println(m);

        m.moveRight();
        System.out.println(m);

        m.moveDown();
        System.out.println(m);

        m.moveLeft();
        System.out.println(m);

        m.moveUp();
        System.out.println(m);
    }
}