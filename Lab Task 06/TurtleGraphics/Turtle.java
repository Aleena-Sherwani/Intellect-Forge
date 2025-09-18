package TurtleGraphics;

public class Turtle {
    private Point position;
    private float angle; // degrees
    private PenEngine pen;

    public Turtle(Canvas canvas) {
        this.position = new Point(0, 0);
        this.angle = 0;
        this.pen = new PenEngine(canvas);
    }

    public void moveTo(Point p) {
        pen.drawLine(position, p);
        position = p;
    }

    public void forward(float distance) {
        double rad = Math.toRadians(angle);
        Point newPos = new Point(
                position.getX() + distance * Math.cos(rad),
                position.getY() + distance * Math.sin(rad)
        );
        pen.drawLine(position, newPos);
        position = newPos;
    }

    public void turnLeft(float degrees) {
        angle += degrees;
    }

    public void turnRight(float degrees) {
        angle -= degrees;
    }
}