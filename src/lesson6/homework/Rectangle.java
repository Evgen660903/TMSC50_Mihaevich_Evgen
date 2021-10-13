package lesson6.homework;

public class Rectangle {

    public Point pointLeftTop;
    public Point pointRightBottom;

    public Rectangle(Point pointLeftTop, Point pointRightBottom) {
        this.pointLeftTop = pointLeftTop;
        this.pointRightBottom = pointRightBottom;
    }

    public Rectangle(Point pointLeftTop, double len, double hei) {
        this.pointLeftTop = pointLeftTop;
        Point pointRightBottom = new Point(pointLeftTop.x + len, pointLeftTop.y - hei);
        this.pointRightBottom = pointRightBottom;
    }

    public double getArea() {
        return Math.abs(pointRightBottom.x - pointLeftTop.x) * (pointLeftTop.y - pointRightBottom.y);
    }

    public double getPerimeter() {
        return (Math.abs(pointRightBottom.x - pointLeftTop.x) + Math.abs(pointLeftTop.y - pointRightBottom.y)) * 2;
    }

    public double getDiagonalLenght() {
        return Math.sqrt(Math.pow(pointRightBottom.x - pointLeftTop.x, 2) + Math.pow(pointLeftTop.y - pointRightBottom.y, 2));
    }
}

