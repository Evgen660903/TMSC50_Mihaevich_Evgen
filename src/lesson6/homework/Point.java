package lesson6.homework;

public class Point {
    public double x;
    public double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point pointA) {
        return Math.sqrt(Math.pow(pointA.x - this.x, 2) + Math.pow(pointA.y - this.y, 2));
    }

}
