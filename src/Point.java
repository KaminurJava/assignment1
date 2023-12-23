
import static java.lang.Math.*;
public class Point {    private double x;
    private double y;
    public Point(double x, double y) {        this.x = x;
        this.y = y;    }
    public double distance(Point dest) {        double x1 = this.x;
        double x2 = dest.x;        return sqrt((x1 * x1 + x2 * x2));
    }    public String toString() {
        return "(" + x + ", " + y + ")";    }
}
