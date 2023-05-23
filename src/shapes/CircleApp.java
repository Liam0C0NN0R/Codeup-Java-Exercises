package shapes;
import util.Input;

public class CircleApp {

    public static void main(String[] args) {
        Input input = new Input();
        boolean shouldContinue;

        do {
            double radius = input.getDouble("Enter the radius of the circle: ");
            Circle circle = new Circle(radius);
            System.out.println("The circumference of the circle is: " + circle.getCircumference());
            System.out.println("The area of the circle is: " + circle.getArea());
            shouldContinue = input.yesNo("Would you like to make another circle? (yes/no): ");
        } while (shouldContinue);

        System.out.println("Total circles created: " + Circle.getCount());
    }
}
