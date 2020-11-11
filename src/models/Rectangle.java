package models;

public class Rectangle extends Shape {
    private double width;
    private double length;

    public Rectangle(double v, double v1, String orange, boolean b) {
        this.width = v;
        this.length = v1;
    }

    public Rectangle() {
    }

    public double getArea() {
        double val = this.getLength() * this.getWidth();

        return val;
    }

    public double getPerimeter() {
        double val = (this.getLength() + this.getWidth()) * 2;

        return val;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public String toString() {
        String str = "A Rectangle with width = " + this.getWidth()
                + " and length = " + this.getLength()
                + ", which is a subclass of " + super.toString();

        return str;
    }
}
