public class BodyShapeBlob implements BodyShape{
    @Override
    public void drawSkeletalStructure() {
        System.out.println("No skeleton");
    }

    @Override
    public void drawMuscleStructure() {
        System.out.println("Thin circular muscle layer");
    }

    @Override
    public void drawFleshLayer() {
        System.out.println("Smooth, malleable flesh layer");
    }
}