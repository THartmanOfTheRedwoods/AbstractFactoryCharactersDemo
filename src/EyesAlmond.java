public class EyesAlmond implements Eyes {
    private final String color;
    public EyesAlmond(String color) {
        this.color = color;
    }
    @Override
    public void drawEyes() {
        System.out.println("Thin Almond shaped eyes.");
        colorEyes();
    }

    @Override
    public void colorEyes() {
        System.out.printf("Filling almond with %s.%n", color);
    }
}