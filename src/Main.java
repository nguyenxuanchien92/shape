import models.Circle;
import models.Rectangle;
import models.Shape;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3.5);
        System.out.println(circle);

        circle = new Circle("indigo", false, 3.5);
        System.out.println(circle);

//        ------------------------
        System.out.println("------------------------");
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(2.3, 5.8, "orange", true);
        System.out.println(rectangle);

        rectangle = new Rectangle(2.5, 3.8, "orange", true);
        System.out.println(rectangle);

//        Shape shape = new Circle();
//
//        System.out.println(((Circle)shape).getRadius());;
    }
}
