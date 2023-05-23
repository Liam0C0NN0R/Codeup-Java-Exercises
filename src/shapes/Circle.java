package shapes;

public class Circle {

    private double radius;
    private static int count = 0;

    public Circle(double radius) {
        this.radius = radius;
        count++;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }
    public static int getCount() {
        return count;
    }
}
