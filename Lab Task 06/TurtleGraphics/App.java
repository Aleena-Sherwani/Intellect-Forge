package TurtleGraphics;
class App {
    private Turtle turtle;
    private Canvas canvas;
    private Command command;

    public App() {
        canvas = new Canvas();
        turtle = new Turtle(canvas);
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void run() {
        if (command != null) {
            command.execute(turtle);
        }
        canvas.canvasPrint();
    }
}