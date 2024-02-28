public class AvatarContext {
    private String name;
    private String body;
    private String eyes;
    private String eyeColor;
    private String ears;
    private String nose;
    private String hair;
    private String hairColor;
    private String attire;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getEyes() {
        return eyes;
    }

    public void setEyes(String eyes) {
        this.eyes = eyes;
    }

    public String getEars() {
        return ears;
    }

    public void setEars(String ears) {
        this.ears = ears;
    }

    public String getNose() {
        return nose;
    }

    public void setNose(String nose) {
        this.nose = nose;
    }

    public String getHair() {
        return hair;
    }

    public void setHair(String hair) {
        this.hair = hair;
    }

    public String getAttire() {
        return attire;
    }

    public void setAttire(String attire) {
        this.attire = attire;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    @Override
    public String toString() {
        return String.format("""
                Name: %s,
                Body: %s,
                Eyes: %s, Color %s,
                Ears: %s,
                Nose: %s,
                Hair: %s, Color %s
                Attire: %s
                """,
                this.name, this.body, this.eyes,
                this.eyeColor, this.ears, this.nose,
                this.hair, this.hairColor, this.attire);
    }
}
