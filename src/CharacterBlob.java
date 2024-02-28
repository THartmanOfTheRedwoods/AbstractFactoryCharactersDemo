public class CharacterBlob extends Character {
    FeatureFactory featureFactory;

    public CharacterBlob(FeatureFactory featureFactory) {
        this.featureFactory = featureFactory;
        this.build();
    }
    @Override
    protected void build() {
        System.out.println("Building avatar character.");
        this.body = featureFactory.getBodyShape();
        this.eyes = featureFactory.getEyes();
    }
}