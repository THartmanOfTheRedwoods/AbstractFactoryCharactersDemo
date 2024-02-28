public abstract class Hair {
    protected String color;

    public Hair(String color) {
        this.color = color;
    }

    public abstract void drawHairStyle();

    public void setHairColor(String color) {
        this.color = color;
    }
}
