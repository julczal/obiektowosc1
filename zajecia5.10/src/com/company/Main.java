package com.company;

public class Main {

    public static void main(String[] args) {
        Circle circl1 = new Circle();
        circl1.setRadius(34);
        circl1.color = "Red";
        circl1.filled = true;
        System.out.println(circl1.toString());

        Circle circl2 = new Circle();
        circl2.setRadius(3.9);
        circl2.color = "Black";
        circl2.filled = false;
        System.out.println(circl2.toString());

        Recatnagle recatnagle = new Recatnagle();
        recatnagle.setHeight(3.4);
        recatnagle.setWidth(5.2);
        recatnagle.color = "Green";
        circl1.filled = false;
        System.out.println(recatnagle.toString());
        System.out.println("rectangle area " + recatnagle.getArea());
        System.out.println("rectangle paramiter " + recatnagle.getParamiter());
        System.out.println("circle1 area " + circl1.getArea());
        System.out.println("circle2 area " + circl2.getParamiter());

        Square square = new Square();
        square.setSide(2.3);
        square.color = "Orange";
        square.filled = true;
        System.out.println(square.toString());

        System.out.println("square area " + square.getArea());
        System.out.println("square paramiter " + square.getParamiter());

    }
}
abstract class Shape {
    protected String color;
    protected boolean filled;
    public Shape() {
        this.color = color;
        this.filled = filled;
    }
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public abstract double getArea();
    public abstract double getParamiter();

    public abstract String toString();
}
class Recatnagle extends Shape {
    protected double width, height;
    public Recatnagle() {
        this.height = height;
        this.width = width;
    }
    public Recatnagle(double width, double height) {
        this.height = height;
        this.width = width;
    }
    public Recatnagle(String color, boolean filled, double width, double height) {
        super(color, filled);
        this.height = height;
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return width*height;
    }

    @Override
    public double getParamiter() {
        return 2*width+2*height;
    }

    @Override
    public String toString() {
        return "Recatnagle{" +
                "width=" + width +
                ", height=" + height +
                ", color='" + color +
                ", filled=" + filled +
                '}';
    }
}
class Circle extends Shape{
    protected double radius;
    public Circle() {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
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

    @Override
    public double getArea() {
        return Math.PI*radius*radius;
    }

    @Override
    public double getParamiter() {
        return Math.PI*2*radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", colour=" + color +
                ", filled=" + filled +
                '}';
    }
}
class Square extends Recatnagle {
    protected double side;
    public Square() {

    }
    public Square(double side) {
        this.side = side;
    }
    public Square(String color, boolean filled, double side) {
        this.color = color;
        this.filled = filled;
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side*side;
    }

    @Override
    public double getParamiter() {
        return 4*side;
    }

    @Override
    public String toString() {
        return "Square{width=" + side +
                ", height=" + side +
                ", color='" + color +
                ", filled=" + filled +
                "}";
    }
}