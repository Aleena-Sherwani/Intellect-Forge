package TurtleGraphics;

interface Command {
    void execute(Turtle turtle);
    String getName();
}