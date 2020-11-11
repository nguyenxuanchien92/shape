package models;

public class Circle extends Shape {
    private double radius;

    public Circle() {
        this.radius = 1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        double val = Math.PI * Math.pow(this.getRadius(), 2);

        return val;
    }

    public double getPerimeter() {
        double val = Math.PI * 2 * this.getRadius();

        return val;
    }

    @Override
    public String toString() {
        String str = "A Circle with radius = " + this.getRadius()
                + ", which is a subclass of " + super.toString();

        return str;
    }
}
