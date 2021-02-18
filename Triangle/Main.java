package com.app;

public class Main {

    public static void main(String[] args) {

        Triangle triangle = new Triangle(5f,8f,6f);
        TriangleEqualSides triangleEqualSides = new TriangleEqualSides(5f,8f);
        TriangleWith90 triangleWith90 = new TriangleWith90(2f,3f,4f);
        TriangleAllEqualSides triangleAllEqualSides = new TriangleAllEqualSides(5.5f);

        System.out.println(String.format("Perimeter of triangle %.2f", triangle.getHekef()));
        System.out.println(String.format("Area of triangle %.2f", triangle.getArea()));

        System.out.println(String.format("Perimeter of triangle Equal Sides %.2f", triangleEqualSides.getHekef()));
        System.out.println(String.format("Area of triangle Equal Sides %.2f", triangleEqualSides.getArea()));

        System.out.println(String.format("Perimeter of triangle With 90 %.2f", triangleWith90.getHekef()));
        System.out.println(String.format("Area of triangle With 90 %.2f", triangleWith90.getArea()));

        System.out.println(String.format("Perimeter of triangle All Equal Sides %.2f", triangleAllEqualSides.getHekef()));
        System.out.println(String.format("Area of triangle All Equal Sides %.2f", triangleAllEqualSides.getArea()));
    }
}

