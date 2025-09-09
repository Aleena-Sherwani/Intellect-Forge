public class Main {
    public static void main(String[] args) {
        Triangle t1 = new Triangle(3, 4, 5);
        Triangle t2 = new Triangle(t1);           
        Triangle t3 = t1.clone();          
        Triangle t4 = new Triangle(5, 5);        
        Triangle t5 = new Triangle();             

        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        System.out.println(t4);
        System.out.println(t5);

        System.out.println("Total Triangle objects created: " + Triangle.objectCount());
    }
}