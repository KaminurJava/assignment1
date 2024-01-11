public class Main{
    public static void main(String[] args) {
        Point[] points = {
                new Point(1.0, 2.0),
                new Point(4.0, 6.0),
                new Point(1.2, 4.5),
                new Point(6.7, 8.9),
                new Point(2.3, 5.5),
                new Point(4.6, 2.3),
                new Point(2.1, 1.4),
                new Point(7.5, 9.0),
                new Point(3.0, 8.0),
                new Point(5.0, 3.8)
        };

        for (int i = 0; i < points.length - 1; i++) {
            Point currentPoint = points[i];
            Point nextPoint = points[i + 1];

            System.out.println("Point " + (i + 1) + ": " + currentPoint);
            System.out.println("Point " + (i + 2) + ": " + nextPoint);
            System.out.println("Distance between Point " + (i + 1) + " and Point " + (i + 2) + ": " + currentPoint.distance(nextPoint));
        }

        Shape shape = new Shape();

        for (Point point : points) {
            shape.addPoint(point);
        }
        double perimeter = shape.calculatePerimeter();
        System.out.println("Perimeter of the shape: " + perimeter);

        double averageSide = shape.getAverageSide();
        System.out.println("Average side length of the shape: " + averageSide);

        double longestSide = shape.getLongestSide();
        System.out.println("Length of the longest side of the shape: " + longestSide);
    }
}
