package shapes;

//public class Square extends Rectangle {
//
//    public Square(double side) {
//        super(side, side); // Calling the Rectangle constructor with the side length
//    }
//}
public class Square extends Rectangle {

    public Square(double side) {
        super(side, side); // Calling the Rectangle constructor with the side length
    }

    @Override
    public double getArea() {
        return length * length;
    }

    @Override
    public double getPerimeter() {
        return 4 * length;
    }
}