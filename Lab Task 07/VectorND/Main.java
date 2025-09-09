public class Main {
    public static void main(String[] args) {
        PhysicsVector force = new PhysicsVector(new double[]{3, 4}, "Force", "N");
        PhysicsVector displacement = new PhysicsVector(new double[]{6, 8}, "Displacement", "m");

        force.printDetails();
        System.out.println("Force vector: " + force);
        System.out.println("Displacement vector: " + displacement);

        PhysicsVector sum = force.add(displacement);
        System.out.println("Sum: " + sum);

        System.out.println("Magnitude of Force = " + force.magnitude());
        System.out.println("Direction of Force (radians) = " + force.direction());
        System.out.println("Angle between Force & Displacement = " + force.angleWith(displacement));

        PhysicsVector proj = force.projectionOn(displacement);
        System.out.println("Projection of Force on Displacement: " + proj);
    }
}