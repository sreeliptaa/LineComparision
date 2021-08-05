package com.bridgelabz;

public class LineComparision {
    public static void main(String[] args) {
        System.out.println("Welcome To Line Comparison Computation");

        // constant
        int x1 = 21;
        int x2 = 35;
        int y1 = 56;
        int y2 = 72;

        // computation

        double lengthOfLine = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        System.out.println("The Length of Line is = " + lengthOfLine);
    }
}
