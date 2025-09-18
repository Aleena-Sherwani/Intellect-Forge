package TurtleGraphics;
public class Main {
    public static void main(String[] args) {
        App app = new App();

        // Run Square Command
        app.setCommand(new SquareCommand(50));
        System.out.println("Executing Square Command:");
        app.run();

        // Run ZigZag Command
        app.setCommand(new ZigZagCommand(30));
        System.out.println("\nExecuting ZigZag Command:");
        app.run();
    }
}