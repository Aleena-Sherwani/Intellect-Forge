abstract class Teddy extends CuddlyToy {
    public Teddy(String color, String size, String job) {
        super(color, size, job);
    }

    @Override
    public void makeNoise() {
        System.out.println("*Growl*");
    }
}