package com.bridgelabz;
import java.util.Scanner;
public class LineComparision {

    public static void main(String args[]) {

            System.out.println("Welcome to Line Comparision Computation program");
            Scanner s = new Scanner(System.in);
            //taking inputs for line1
            System.out.println("Enter x co-ordinate of first point: ");
            int x1 = s.nextInt();
            System.out.println("Enter y co-ordinate of first point: ");
            int y1 = s.nextInt();
            System.out.println("Enter x co-ordinate of second point: ");
            int x2 = s.nextInt();
            System.out.println("Enter y co-ordinate of second point: ");
            int y2 = s.nextInt();
            //taking inputs for line2
            System.out.println("Enter x co-ordinate of third point: ");
            int p1 = s.nextInt();
            System.out.println("Enter y co-ordinate of third point: ");
            int q1 = s.nextInt();
            System.out.println("Enter x co-ordinate of forth point: ");
            int p2 = s.nextInt();
            System.out.println("Enter y co-ordinate of forth point: ");
            int q2 = s.nextInt();
            LineComparision linecomparison = new LineComparision();
            linecomparison.lengthOfLines(x1, y1, x2, y2, p1, p2, q1, q2);
        }

    // finding length of the line
    private void lengthOfLines(int x1, int y1, int x2, int y2, int p1, int q1, int p2, int q2) {
        Double length_of_line1 = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
        Double length_of_line2 = Math.sqrt((p2-p1)*(p2-p1)+(q2-q1)*(q2-q1));
        System.out.printf("length of 1st line : %.2f %n", length_of_line1);
        System.out.printf("length of 2nd line : %.2f %n", length_of_line2);
        equal(length_of_line1, length_of_line2);
        compare(length_of_line1, length_of_line2);
    }

    // Checking whether Two lines are equal or not
    private void equal(Double length_of_line1, Double length_of_line2) {
        boolean ans = length_of_line1.equals(length_of_line2);
        if(ans)
            System.out.println("Both lines are equal.");
        else
            System.out.println("Both lines are not equal.");
    }

    // finding which line is greater
    private void compare(Double length_of_line1, Double length_of_line2) {
        int res = length_of_line1.compareTo(length_of_line2);
        if(res > 0)
            System.out.println("Length of first line is greater than length of second line");
        else if(res < 0)
            System.out.println("Length of first line is less than length of second line");
        else
            System.out.println("Both lines are equal.");
    }
}



