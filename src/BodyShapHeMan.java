public class BodyShapHeMan implements BodyShape {
    @Override
    public void drawSkeletalStructure() {
        System.out.println("Thick hard bones.");
    }

    @Override
    public void drawMuscleStructure() {
        System.out.println("Extremely dense and massive muscle layer.");
    }

    @Override
    public void drawFleshLayer() {
        System.out.println("Skin tight, thin, rippling flesh layer.");
    }
}
