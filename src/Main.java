public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        System.out.println(circle1);

        Circle circle2 = new Circle(2, "yellow");
        System.out.println(circle2);

        Cylinder cylinder1 = new Cylinder();
        System.out.println(cylinder1);

        Cylinder cylinder2 = new Cylinder(3);
        System.out.println(cylinder2);

        Cylinder cylinder3 = new Cylinder(3,"red", 4);
        System.out.println(cylinder3);
    }
}
