package TurtleGraphics;

class ZigZagCommand implements Command {
    private float length;

    public ZigZagCommand(float length) {
        this.length = length;
    }

    @Override
    public void execute(Turtle turtle) {
        for (int i = 0; i < 5; i++) {
            turtle.forward(length);
            turtle.turnLeft(45);
            turtle.forward(length);
            turtle.turnRight(90);
        }
    }

    @Override
    public String getName() {
        return "ZigZag Command";
    }
}