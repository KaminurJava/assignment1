import java.util.ArrayList;
public class Shape {
    private ArrayList<Point> points;
    public Shape() {        this.points = new ArrayList<>();
    }
    public void addPoint(Point point) {        points.add(point);
    }
    public double calculatePerimeter() {        double perimeter = 0;
        int size = points.size();
        for (int i = 0; i < size; i++) {            Point currentPoint = points.get(i);
            Point nextPoint = points.get((i + 1) % size);            perimeter += currentPoint.distance(nextPoint);
        }
        return perimeter;    }
    public double getAverageSide() {
        double totalDistance = calculatePerimeter();        int size = points.size();
        return totalDistance / size;    }
    public double getLongestSide() {
        double longestSide = 0;
        for (int i = 0; i < points.size(); i++) {            Point currentPoint = points.get(i);
            Point nextPoint = points.get((i + 1) % points.size());            double distance = currentPoint.distance(nextPoint);
            if (distance > longestSide) {                longestSide = distance;
            }        }
        return longestSide;
    }}
