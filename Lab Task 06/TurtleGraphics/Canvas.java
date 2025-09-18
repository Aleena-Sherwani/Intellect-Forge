package TurtleGraphics;

import java.util.ArrayList;
import java.util.List;

public class Canvas {
    private List<Line> lines = new ArrayList<>();
    private List<Point> points = new ArrayList<>();

    public void addLine(Line line) {
        lines.add(line);
    }

    public void addPoint(Point point) {
        points.add(point);
    }

    public void canvasPrint() {
        System.out.println("\n--- Canvas ---");
        for (Line line : lines) {
            System.out.println("Line from (" + line.getStartPoint().getX() + "," + line.getStartPoint().getY() +
                    ") to (" + line.getEndPoint().getX() + "," + line.getEndPoint().getY() + ")");
        }
        for (Point point : points) {
            System.out.println("Point at (" + point.getX() + "," + point.getY() + ")");
        }
    }

    public void setCanvas(Canvas canvas) {
        this.lines = canvas.lines;
        this.points = canvas.points;
    }
}