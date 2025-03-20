public class Main {
    public static void main(String[] args) {

        Point p1 = new Point();
        String s1 = new String("Mustafa");;
        System.out.println(p1.xCoord);
        System.out.println(p1.yCoord);
        Point p2 = new Point(3,4);
        System.out.println(p2.xCoord);
        System.out.println(p2.yCoord);

        Point p3 = new Point(5);
        System.out.println(p3.xCoord);
        System.out.println(p3.yCoord);

        Circle c1 = new Circle(
                new Point(3,4),
                radius:5
        );
        System.out.println(c1.getRadius());
        c1.setRadius(-21);
        System.out.println(c1.getRadius());
    }
}