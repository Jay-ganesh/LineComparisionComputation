package LineComparisionComputation;

import java.util.Scanner;

public class LineComparisionComputation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Line Comparison Computation Program");

        System.out.println("Enter x1 co-ordinate : ");
        double x1 = sc.nextDouble();
        System.out.println("Enter x2 co-ordinate : ");
        double x2 = sc.nextDouble();
        System.out.println("Enter y1 co-ordinate : ");
        double y1 = sc.nextDouble();
        System.out.println("Enter y2 co-ordinate : ");
        double y2 = sc.nextDouble();

        double length = calculateLength(x1,x2,y1,y2);

        System.out.printf("Length of the line between points (%.2f,%.2f) and (%.2f,%.2f) is : %.2f",x1,x2,y1,y2,length);

    }
    public static double calculateLength(double x1, double x2, double y1, double y2){
        return Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
    }
}
