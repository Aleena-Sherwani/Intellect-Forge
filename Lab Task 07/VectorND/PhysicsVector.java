public class PhysicsVector {
    // ---------------- Attributes ----------------
    private int id;                     
    private double[] components;        
    private int dimension;              
    private String type;                
    private String unit;                
    private static int counter = 0;     
    
    // ---------------- Constructor ----------------
    public PhysicsVector(double[] values, String type, String unit) {
        this.dimension = values.length;
        this.components = values.clone();
        this.type = type;
        this.unit = unit;
        this.id = ++counter; // assign unique ID
    }

    // ---------------- Getters & Setters ----------------
    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String u) {
        this.unit = u;
    }

    public int getDimension() {
        return dimension;
    }

    public double get(int i) {
        return components[i];
    }

    public void set(int i, double val) {
        components[i] = val;
    }

    // ---------------- Vector Operations ----------------
    public PhysicsVector add(PhysicsVector v) {
        if (this.dimension != v.dimension) {
            throw new IllegalArgumentException("Dimensions must match");
        }
        double[] result = new double[dimension];
        for (int i = 0; i < dimension; i++) {
            result[i] = this.components[i] + v.components[i];
        }
        return new PhysicsVector(result, this.type, this.unit);
    }

    public PhysicsVector subtract(PhysicsVector v) {
        if (this.dimension != v.dimension) {
            throw new IllegalArgumentException("Dimensions must match");
        }
        double[] result = new double[dimension];
        for (int i = 0; i < dimension; i++) {
            result[i] = this.components[i] - v.components[i];
        }
        return new PhysicsVector(result, this.type, this.unit);
    }

    public PhysicsVector scale(double factor) {
        double[] result = new double[dimension];
        for (int i = 0; i < dimension; i++) {
            result[i] = this.components[i] * factor;
        }
        return new PhysicsVector(result, this.type, this.unit);
    }

    public double magnitude() {
        double sum = 0;
        for (double c : components) {
            sum += c * c;
        }
        return Math.sqrt(sum);
    }

    public double direction() {
        if (dimension != 2) {
            throw new UnsupportedOperationException("Direction is defined only for 2D vectors");
        }
        return Math.atan2(components[1], components[0]); // angle in radians
    }

    public double angleWith(PhysicsVector v) {
        if (this.dimension != v.dimension) {
            throw new IllegalArgumentException("Dimensions must match");
        }
        double dot = 0;
        double mag1 = this.magnitude();
        double mag2 = v.magnitude();
        for (int i = 0; i < dimension; i++) {
            dot += this.components[i] * v.components[i];
        }
        return Math.acos(dot / (mag1 * mag2)); // angle in radians
    }

    public PhysicsVector projectionOn(PhysicsVector v) {
        if (this.dimension != v.dimension) {
            throw new IllegalArgumentException("Dimensions must match");
        }
        double dot = this.dot(v);
        double magSq = v.magnitude() * v.magnitude();
        double[] result = new double[dimension];
        for (int i = 0; i < dimension; i++) {
            result[i] = (dot / magSq) * v.components[i];
        }
        return new PhysicsVector(result, this.type, this.unit);
    }

    // Helper: dot product
    private double dot(PhysicsVector v) {
        double sum = 0;
        for (int i = 0; i < dimension; i++) {
            sum += this.components[i] * v.components[i];
        }
        return sum;
    }

    // ---------------- Utility Methods ----------------
    public void printDetails() {
        System.out.println("Vector ID: " + id);
        System.out.println("Type: " + type + " (" + unit + ")");
        System.out.println("Dimension: " + dimension);
        System.out.print("Components: ");
        for (double c : components) {
            System.out.print(c + " ");
        }
        System.out.println("\nMagnitude: " + magnitude());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(type + " <");
        for (int i = 0; i < dimension; i++) {
            sb.append(components[i]);
            if (i < dimension - 1) sb.append(", ");
        }
        sb.append("> " + unit);
        return sb.toString();
    }
}