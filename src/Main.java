public class Main {
    public static void main(String[] args) {
        Point p1 = new Point();
        System.out.println(p1);

        Point p2 = new Point(5,3);
        System.out.println(p2);

        MovablePoint a = new MovablePoint(1,1,4,5);
        a.move();
        a.move();
        a.move();
        a.move();
        a.move();
        System.out.println(a);
    }
}
