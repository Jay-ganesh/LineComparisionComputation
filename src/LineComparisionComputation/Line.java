package LineComparisionComputation;

public class Line implements Comparable<Line> {
    private Point point1;
    private Point point2;

    public Line(Point point1, Point point2){
        this.point1 = point1;
        this.point2 = point2;
    }
    public double calculateLength() {
        double xDiff = point2.getX() - point1.getX();
        double yDiff = point2.getY() - point1.getY();
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }
    @Override
    public int compareTo(Line other) {
        double thisLength = this.calculateLength();
        double otherLength = other.calculateLength();
        return Double.compare(thisLength, otherLength);
    }
}
