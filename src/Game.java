public class Game {

    public static void main(String[] args) {
        AvatarBuilder avatarBuilder = new AvatarGameBuilder();  // Factory method
        Character heMan = avatarBuilder.createCharacter("He-Man"); // Argument used to choose both Character and Abstract Feature Factory
        Character theBlob = avatarBuilder.createCharacter("Blob");

        System.out.printf("Adding characters: %s ...and...%s to game.%n%n", heMan.getName(), theBlob.getName());

        System.out.println("-".repeat(80));
        heMan.display();

        System.out.println("-".repeat(80));
        theBlob.display();

        // The Flexible solution to prevent Concrete Factory and Character Product class Explosion
        // Which is a common problem with Abstract Factory.
        AvatarBuilder avatarBuilder1 = new AvatarPersonalBuilder();
        Character custom = avatarBuilder1.createCharacter(
                Game.class.getClassLoader().getResource("avatar001.json").getPath());
        custom.build();

        System.out.println("-".repeat(80));
        custom.display();

    }
}
