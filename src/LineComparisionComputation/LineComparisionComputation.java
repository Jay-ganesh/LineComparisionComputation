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

        Double length1 = calculateLength(x1,x2,y1,y2);

        System.out.println("Length of the line is : "+length1);

        System.out.println("Enter x3 co-ordinate : ");
        double x3 = sc.nextDouble();
        System.out.println("Enter x4 co-ordinate : ");
        double x4 = sc.nextDouble();
        System.out.println("Enter y3 co-ordinate : ");
        double y3 = sc.nextDouble();
        System.out.println("Enter y4 co-ordinate : ");
        double y4 = sc.nextDouble();

        Double length2 = calculateLength(x3,x4,y3,y4);

        if(length1.equals(length2)){
            System.out.printf("Two lines are in equal length : %.2f",length1);
        }
        else {
            System.out.printf("Length of the line between points is : %.2f,%2f", x1, x2, y1, y2, length1,length2);
        }

        int compareResult = length1.compareTo(length2);

        if(compareResult == 0){
            System.out.println("Two lines ane in equal length : "+length2);
        }
        else if (compareResult > 0) {
            System.out.println("Length 1 is greatest : "+length1);
        }
        else{
            System.out.println("Length 2 is greatest : "+length2);
        }
    }
    public static double calculateLength(double x1, double x2, double y1, double y2){
        return Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
    }
}
