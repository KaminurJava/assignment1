
public class Main{    public static void main(String[] args) {
    Point point1 = new Point(1.0, 2.0);        Point point2 = new Point(4.0, 6.0);
    Point point3 = new Point(1.2, 4.5);        Point point4 = new Point(6.7, 8.9);
    Point point5 = new Point(2.3, 5.5);        Point point6 = new Point(4.6, 2.3);
    Point point7 = new Point(2.1, 1.4);        Point point8 = new Point(7.5, 9.0);
    Point point9 = new Point(3.0, 8.0);        Point point10 = new Point(5.0, 3.8);
    System.out.println("Point 1: " + point1);
    System.out.println("Point 2: " + point2);        System.out.println("Distance between Point 1 and Point 2: " + point1.distance(point2));
    System.out.println("Point 2: " + point2);        System.out.println("Point 3: " + point3);
    System.out.println("Distance between Point 2 and Point 3: " + point2.distance(point3));        System.out.println("Point 3: " + point3);
    System.out.println("Point 4: " + point4);        System.out.println("Distance between Point 3 and Point 4: " + point3.distance(point4));
    System.out.println("Point 4: " + point4);        System.out.println("Point 5: " + point5);
    System.out.println("Distance between Point 4 and Point 5: " + point4.distance(point5));        System.out.println("Point 5: " + point5);
    System.out.println("Point 6: " + point6);        System.out.println("Distance between Point 5 and Point 6: " + point5.distance(point6));
    System.out.println("Point 6: " + point6);        System.out.println("Point 7: " + point7);
    System.out.println("Distance between Point 6 and Point 7: " + point6.distance(point7));        System.out.println("Point 7: " + point7);
    System.out.println("Point 8: " + point8);        System.out.println("Distance between Point 7 and Point 8: " + point7.distance(point8));
    System.out.println("Point 8: " + point8);        System.out.println("Point 9: " + point9);
    System.out.println("Distance between Point 8 and Point 9: " + point8.distance(point9));        System.out.println("Point 9: " + point9);
    System.out.println("Point 10: " + point10);        System.out.println("Distance between Point 9 and Point 10: " + point9.distance(point10));
    Shape shape = new Shape();
    shape.addPoint(point1);            shape.addPoint(point2);
    shape.addPoint(point3);            shape.addPoint(point4);
    shape.addPoint(point5);            shape.addPoint(point6);
    shape.addPoint(point7);            shape.addPoint(point8);
    shape.addPoint(point9);            shape.addPoint(point10);
    double perimeter = shape.calculatePerimeter();
    System.out.println("Perimeter of the shape: " + perimeter);
    double averageSide = shape.getAverageSide();            System.out.println("Average side length of the shape: " + averageSide);
    double longestSide = shape.getLongestSide();
    System.out.println("Length of the longest side of the shape: " + longestSide);}

}
