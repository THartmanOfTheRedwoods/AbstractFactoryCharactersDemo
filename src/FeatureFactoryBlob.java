public class FeatureFactoryBlob implements FeatureFactory {
    @Override
    public BodyShape getBodyShape() {
        return new BodyShapeBlob();
    }

    @Override
    public Eyes getEyes() {
        return new EyesRound("green");
    }

    @Override
    public Nose getNose() {
        return null;
    }

    @Override
    public Ears getEars() {
        return null;
    }

    @Override
    public Hair getHair() {
        return null;
    }

    @Override
    public Attire getAttire() {
        return null;
    }
}
