abstract class Bunny extends CuddlyToy {
    public Bunny(String color, String size, String job) {
        super(color, size, job);
    }

    @Override
    public void makeNoise() {
        System.out.println("*Squeak*");
    }
}