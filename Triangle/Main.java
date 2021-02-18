package com.app;

public class Main {

    public static void main(String[] args) {

        Triangle triangle = new Triangle(5f,8f,6f, 5.99f);
        TriangleEqualSides triangleEqualSides = new TriangleEqualSides(5f,8f,3f);
        TriangleWith90 triangleWith90 = new TriangleWith90(2f,3f,4f);

        System.out.println(String.format("Perimeter of triangle %.2f", triangle.getHekef()));
        System.out.println(String.format("Area of triangle %.2f", triangle.getArea()));

        System.out.println(String.format("Perimeter of triangle Equal Sides %.2f", triangleEqualSides.getHekef()));
        System.out.println(String.format("Area of triangle Equal Sides %f", triangleEqualSides.getArea()));

        System.out.println(String.format("Perimeter of triangle With 90 %.2f", triangleWith90.getHekef()));
        System.out.println(String.format("Area of triangle With 90 %.2f", triangleWith90.getArea()));
    }
}
