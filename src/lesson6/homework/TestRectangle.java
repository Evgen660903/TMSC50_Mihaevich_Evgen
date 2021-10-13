package lesson6.homework;

public class TestRectangle {

    public static void main(String[] args) {
        Point point = new Point(1, 2);
        Point pointA = new Point(3, 1);
        System.out.println(point.distance(pointA));
        Rectangle rectangle = new Rectangle(point, 1, 1);
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());
        System.out.println(rectangle.getDiagonalLenght());

    }
}
