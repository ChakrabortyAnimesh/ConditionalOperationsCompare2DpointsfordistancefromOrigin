package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int x1;
        int y1;
        int x2;
        int y2;
        int x3;
        int y3;
        Scanner sc = new Scanner(System.in);
        x1 = sc.nextInt();
        y1 = sc.nextInt();
        x2 = sc.nextInt();
        y2 = sc.nextInt();
        x3 = sc.nextInt();
        y3 = sc.nextInt();
        Point p1 = new Point(x1, y1);
        Point p2 = new Point(x2, y2);
        Point p3 = new Point(x3, y3);
        Point fp = pointWithHighestDistance(p1, p2, p3);
        System.out.println(fp.x);
        System.out.println(fp.y);

    }
   public static Point pointWithHighestDistance(Point p1, Point p2, Point p3) {

       double point1 = Math.sqrt(Math.pow(p1.x, 2) + Math.pow(p1.y, 2));
       double point2 = Math.sqrt(Math.pow(p2.x, 2) + Math.pow(p2.y, 2));
       double point3 = Math.sqrt(Math.pow(p3.x, 2) + Math.pow(p3.y, 2));

       if (point1 > point2 && point1 > point3) {
           return p1;
       } else if (point2 > point1 && point2 > point3) {
           return p2;
       } else {
           return p3;
       }
   }
}
