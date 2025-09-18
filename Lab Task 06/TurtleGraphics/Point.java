package TurtleGraphics;
public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void setX(double x) { 
        this.x = x; 
    }
    public void setY(double y) { 
        this.y = y; 
    }

    public double getX() { 
        return x; 
    }
    public double getY() { 
        return y; 
    }

    public void movePoint(double dx, double dy) {
        this.x += dx;
        this.y += dy;
    }

    public double distanceTo(Point other) {
        return Math.sqrt(Math.pow(x - other.x, 2) + Math.pow(y - other.y, 2));
    }

    public void show() {
        System.out.println("(" + x + ", " + y + ")");
    }
}