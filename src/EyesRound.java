public class EyesRound implements Eyes{
    private final String color;

    public EyesRound(String color) {
        this.color = color;
    }

    @Override
    public void drawEyes() {
        System.out.println("Large round puss-n-boots eyes.");
        colorEyes();
    }

    @Override
    public void colorEyes() {
        System.out.printf("Filling Circle With %s.%n", color);
    }
}