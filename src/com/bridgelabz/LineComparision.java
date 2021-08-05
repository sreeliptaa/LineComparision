package com.bridgelabz;

public class LineComparision {
    public static void main(String[] args) {
        System.out.println("Welcome To Line Comparison Computation");

        // For Line1
        int x1 = 1;
        int x2 = 6;
        int y1 = 5;
        int y2 = 9;
        //For Line2
        int p1 = 3;
        int p2 = 4;
        int q1 = 5;
        int q2 = 6;

        double lengthOfLine1 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        double lengthOfLine2 = Math.sqrt((p2 - p1) * (p2 - p1) + (q2 - q1) * (q2 - q1));
        System.out.println("The Length of Line1 is = " + lengthOfLine1);
        System.out.println("The Length of Line2 is = " + lengthOfLine2);

        if (lengthOfLine1>lengthOfLine2)
            System.out.println("Length of Line1 is greater than Length of Line2");
        else if (lengthOfLine1<lengthOfLine2)
            System.out.println("Length of Line1 is lesser than Length of Line2");
        else
            System.out.println("Both lines are Equal");
    }
}
