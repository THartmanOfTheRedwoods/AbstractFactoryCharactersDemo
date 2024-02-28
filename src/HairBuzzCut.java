public class HairBuzzCut extends Hair {

    public HairBuzzCut(String color) {
        super(color);
    }
    @Override
    public void drawHairStyle() {
        System.out.printf("Get out the clippers, its buzz cut time with stubble color %s.%n", color);
    }
}
