package shapes;

public class ShapesTest {

    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(4, 5);
        System.out.println("Rectangle box1 perimeter: " + box1.getPerimeter());
        System.out.println("Rectangle box1 area: " + box1.getArea());

        Rectangle box2 = new Square(5);
        System.out.println("Square box2 perimeter: " + box2.getPerimeter());
        System.out.println("Square box2 area: " + box2.getArea());
    }
}