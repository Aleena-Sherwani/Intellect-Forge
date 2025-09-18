package TurtleGraphics;

class SquareCommand implements Command {
    private float length;

    public SquareCommand(float length) {
        this.length = length;
    }

    @Override
    public void execute(Turtle turtle) {
        for (int i = 0; i < 4; i++) {
            turtle.forward(length);
            turtle.turnLeft(90);
        }
    }

    @Override
    public String getName() {
        return "Square Command";
    }
}