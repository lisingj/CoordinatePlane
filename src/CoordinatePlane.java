public class CoordinatePlane {
    public static void main(String[] args) {
        // Execution starts here
        LineSegment line = new LineSegment(new Point(3, 4), new Point(12, 6));
        System.out.println("Midpoint: " + line.midPoint());
    }
}

class Point {
    double x;
    double y;
    String label;

    // Constructor
    Point(double x, double y) {
        System.out.println("Anonymous point constructed");
        this.x = x;
        this.y = y;
    }

    // Constructor
    Point(double x, double y, String label) {
        System.out.println("Labelled point constructed");
        this.x = x;
        this.y = y;
        this.label = label;
    }

    // Method
    double distanceFromOrigin() {
        return Math.sqrt(x * x + y * y);
    }

    // Method
    public String toString() {
        return "x: " + x + ", y: " + y;
    }

    // Method
    double distanceFrom(double x, double y) {
        // My x is this.x
        // My y is this.y
        // The other point's x is x
        // The other point's y is y
        // So the horizontal distance is
        double dx = this.x - x;
        double dy = this.y - y;
        return Math.sqrt(dx * dx + dy * dy);

    }

}

class LineSegment {
    Point a ;
    Point b;

    // Constructor
    LineSegment(Point a, Point b) {
        this.a = a;
        this.b = b;
    }

    Point midPoint() {
        double x = (a.x + b.x)/2;
        double y = (a.y + b.y)/2;
        return new Point(x, y);
    }
}

// No code can go here because it's not within a class
