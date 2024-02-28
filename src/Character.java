public abstract  class Character {
    String name;
    BodyShape body;
    Eyes eyes;
    Ears ears;
    Nose nose;
    Hair hair;
    Attire attire;

    protected abstract void build();

    void setName(String name) {
        this.name = name;
    }
    String getName() {
        return name;
    }

    public void display() {
        System.out.printf("Name: %s%n", this.name);
        if(body != null) {
            this.body.drawSkeletalStructure();
            this.body.drawMuscleStructure();
            this.body.drawFleshLayer();
        }
        if(eyes != null) this.eyes.drawEyes();
        if(ears != null) this.ears.drawEarShape();
        if(nose != null) this.nose.drawNose();
        if(hair != null) this.hair.drawHairStyle();
        if(attire != null) {
            this.attire.drawLowerBodyAttire();
            this.attire.drawUpperBodyAttire();
            this.attire.drawAccessories();
        }
    }

    @Override
    public String toString() {
        return String.format("""
                Name: %s
                Body: %s
                Ears: %s
                Eyes: %s
                Nose: %s
                Hair: %s
                Attire: %s
                """,
                this.name,
                this.body,
                this.ears,
                this.eyes,
                this.nose,
                this.hair,
                this.attire);
    }
}