public class HairCombOver extends Hair{
    public HairCombOver(String color) {
        super(color);
    }

    @Override
    public void drawHairStyle() {
        System.out.printf("The Donald look is in, Comb Over club with color %s.%n", color);
    }
}
