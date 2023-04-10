package com.course.syntax;

public class StepSecond_1 {
    public static void main(String[] args) {
        double p;
        double triangleArea;
        double a = 5;
        double b = 7;
        double c = 9;
        p = (a + b + c) / 2;
        triangleArea = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        System.out.println("TriangleArea = " + triangleArea);
    }
}
