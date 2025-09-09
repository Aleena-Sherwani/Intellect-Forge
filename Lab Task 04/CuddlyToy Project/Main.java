public class Main {
    public static void main(String[] args) {
        // Array of CuddlyToy references
        CuddlyToy[] toys = new CuddlyToy[4];

        toys[0] = new EngineDriver("Small");
        toys[1] = new Gardener("Medium");
        toys[2] = new Clown("Large");
        toys[3] = new BankManager("Small");

        // Demonstrating the functionality
        for (CuddlyToy toy : toys) {
            toy.makeNoise();
            toy.tellAboutYourself();
            System.out.println("------------------");
        }
    }
}