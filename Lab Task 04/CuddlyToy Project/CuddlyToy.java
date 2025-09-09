abstract class CuddlyToy {
    protected String color;
    protected String size;
    protected String job;

    public CuddlyToy(String color, String size, String job) {
        this.color = color;
        this.size = size;
        this.job = job;
    }

    public abstract void makeNoise(); // Each toy makes its own sound

    public void tellAboutYourself() {
        System.out.println("I am a " + size + " " + color + " " + getClass().getSimpleName() +
                ". My job is: " + job);
    }
}
