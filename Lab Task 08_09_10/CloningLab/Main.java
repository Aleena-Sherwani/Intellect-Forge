package CloningLab;
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        // Shallow Copy Demo 
        System.out.println("=== Shallow Copy ===");
        Array v1 = new Array(3);
        System.out.println("v1: " + v1);

        Array v2 = v1.shallowClone();
        System.out.println("v2: " + v2);

        v2.increment();
        System.out.println("After incrementing v2:");
        System.out.println("v2: " + v2);
        System.out.println("v1: " + v1); // also changed

        // Deep Copy Demo 
        System.out.println("\n=== Deep Copy ===");
        Array v3 = new Array(3);
        System.out.println("v3: " + v3);

        Array v4 = v3.deepClone();
        System.out.println("v4: " + v4);

        v4.increment();
        System.out.println("After incrementing v4:");
        System.out.println("v4: " + v4);
        System.out.println("v3: " + v3); // stays same
    }
}