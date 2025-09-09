public class Triangle {

    private double sideA;
    private double sideB;
    private double sideC;
    private static int objectCount = 0;

    // Default constructor: Equilateral triangle with sides 1.0
    public Triangle() {
        this(1.0, 1.0, 1.0);
    }

    // One-parameter constructor: Equilateral triangle
    public Triangle(double side) {
        this(side, side, side);
    }

    // Two-parameter constructor: Isosceles triangle
    public Triangle(double x, double y) {
        this(x, x, y);
    }

    // Three-parameter constructor
    public Triangle(double x, double y, double z) {
        this.sideA = x;
        this.sideB = y;
        this.sideC = z;
        objectCount++;
    }

    // Copy constructor 
    public Triangle(Triangle other) {
        if (other != null) {
            this.sideA = other.sideA;
            this.sideB = other.sideB;
            this.sideC = other.sideC;
            objectCount++;
        }
    }

    public Triangle clone() {
    return new Triangle(this);
    }



    // Setters
    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    // Getters
    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double getSideC() {
        return sideC;
    }


    // Static method to return number of Triangle objects
    public static int objectCount() {
        return objectCount;
    }

    // Instance method: perimeter
    public double perimeter() {
        return sideA + sideB + sideC;
    }

   
    public boolean isRightAngled() {
        double a = sideA, b = sideB, c = sideC;
        // Sort sides so that c is the largest
        double[] sides = {a, b, c};
        java.util.Arrays.sort(sides);
        a = sides[0];
        b = sides[1];
        c = sides[2];
        return Math.abs((a*a + b*b) - (c*c)) < 1e-6;
    }

    // toString method
    @Override
    public String toString() {
        return String.format("Triangle [sideA=%.2f, sideB=%.2f, sideC=%.2f, Perimeter=%.2f, RightAngled=%s]",
                sideA, sideB, sideC, perimeter(), isRightAngled());
    }
}


