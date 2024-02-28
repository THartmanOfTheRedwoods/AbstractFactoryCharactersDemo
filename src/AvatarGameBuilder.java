public class AvatarGameBuilder implements AvatarBuilder {
    @Override
    public Character createCharacter(String character) {
        Character avatar = null;

        switch(character) {
            case "He-Man":
                avatar = new CharacterHeMan(new FeatureFactoryHeMan());
                avatar.setName("He-Man, master of the universe");
                break;
            case "Blob":
                avatar = new CharacterBlob(new FeatureFactoryBlob());
                avatar.setName("The Blob");
                break;
        }
        return avatar;
    }
}
