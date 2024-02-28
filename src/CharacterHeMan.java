public class CharacterHeMan extends Character {
    FeatureFactory featureFactory;

    public CharacterHeMan(FeatureFactory featureFactory) {
        this.featureFactory = featureFactory;
        this.build();
    }
    @Override
    protected void build() {
        System.out.println("Building avatar character.");
        this.body = featureFactory.getBodyShape();
        this.eyes = featureFactory.getEyes();
        this.nose = featureFactory.getNose();
        this.ears = featureFactory.getEars();
        this.hair = featureFactory.getHair();
        this.attire = featureFactory.getAttire();
    }
}