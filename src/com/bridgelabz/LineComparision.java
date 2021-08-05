package com.bridgelabz;

public class LineComparision {
    public static void main(String[] args) {
        System.out.println("Welcome To Line Comparison Computation");

        // For Line1
        int x1 = 24;
        int x2 = 35;
        int y1 = 44;
        int y2 = 72;
        //For Line2
        int p1 = 12;
        int p2 = 85;
        int q1 = 5;
        int q2 = 66;

        double lengthOfLine1 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        double lengthOfLine2 = Math.sqrt((p2 - p1) * (p2 - p1) + (q2 - q1) * (q2 - q1));
        System.out.println("The Length of Line1 is = " + lengthOfLine1);
        System.out.println("The Length of Line2 is = " + lengthOfLine2);

        if (lengthOfLine1 == lengthOfLine2)
            System.out.println("Two Lines are equal");
        else
            System.out.println("Lines are not equal");
    }
}
