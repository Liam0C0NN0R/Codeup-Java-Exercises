package shapes;

public class ShapesTest {

    public static void main(String[] args) {
        Measurable myShape;

        myShape = new Rectangle(4, 5);
        System.out.println("Rectangle box1 perimeter: " + myShape.getPerimeter());
        System.out.println("Rectangle box1 area: " + myShape.getArea());

        myShape = new Square(5);
        System.out.println("Square box2 perimeter: " + myShape.getPerimeter());
        System.out.println("Square box2 area: " + myShape.getArea());
    }
}
//TODO:
// Why does the code fail to compile if you leave off the getPerimeter method in Rectangle?
//The getPerimeter method is part of the Measurable interface. When you have a class implementing an interface, that class must provide an implementation for all methods declared in the interface. If you leave off the getPerimeter method in Rectangle, the Java compiler will give an error because Rectangle hasn't fully implemented all methods of the Measurable interface.
//TODO:
// What happens if you try to call the getLength or getWidth methods of the myShape variable? Why?
//The getLength and getWidth methods are specific to the Quadrilateral class (and its subclasses). If you have a reference of type Measurable, you can only call methods declared in the Measurable interface. The getLength and getWidth methods aren't part of the Measurable interface, so you can't call them on a Measurable reference. If you try, the compiler will throw an error.