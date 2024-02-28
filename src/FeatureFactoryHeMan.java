public class FeatureFactoryHeMan implements FeatureFactory {
    @Override
    public BodyShape getBodyShape() {
        return new BodyShapHeMan();
    }

    @Override
    public Eyes getEyes() {
        return new EyesAlmond("blue");
    }

    @Override
    public Nose getNose() {
        return new NoseWavy();
    }

    @Override
    public Ears getEars() {
        return new EarsCauliflower();
    }

    @Override
    public Hair getHair() {
        return new HairBuzzCut("blonde");
    }

    @Override
    public Attire getAttire() {
        return new AttireSuspenderShorts();
    }
}
