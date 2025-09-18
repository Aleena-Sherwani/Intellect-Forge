package TurtleGraphics;

public class PenEngine {
     private Canvas canvas;

    public PenEngine(Canvas canvas) {
        this.canvas = canvas;
    }

    public void drawLine(Point start, Point end) {
        Line line = new Line(start, end);
        canvas.addLine(line);
    }

    public void drawPoint(double x, double y) {
        canvas.addPoint(new Point(x, y));
    }
}