import com.google.gson.Gson;

import java.io.FileReader;
import java.io.IOException;

public class AvatarPersonalBuilder implements AvatarBuilder {
    @Override
    public Character createCharacter(String avatarFile) {
        Gson gson = new Gson();
        try (FileReader reader = new FileReader(avatarFile)) {
            AvatarContext context = gson.fromJson(reader, AvatarContext.class);
            FeatureFactoryFlexible featureFactory = new FeatureFactoryFlexible(context);

            // Instantiate an anonymous inner class so we don't need to define a "Character" concrete subclass.
            return new Character() {
                // Instance initializer block to simulate constructor call
                {
                    this.setName(context.getName());
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
            };
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
