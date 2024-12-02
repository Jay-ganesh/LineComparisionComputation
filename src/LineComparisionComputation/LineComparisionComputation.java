package LineComparisionComputation;

public class LineComparisionComputation {
    public static void main(String[] args) {
        Point p1 = new Point(1, 2);
        Point p2 = new Point(4, 6);
        Line l1 = new Line(p1, p2);

        Point p3 = new Point(2, 3);
        Point p4 = new Point(5, 7);
        Line l2 = new Line(p3, p4);

        if (l1.compareTo(l2) == 0){
            System.out.println("Line1 is highest..!");
        }
        else {
            System.out.println("Line2 is highest..!");
        }
    }
}
