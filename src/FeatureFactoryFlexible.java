import java.lang.reflect.Constructor;

public class FeatureFactoryFlexible implements FeatureFactory {
    AvatarContext context;
    public FeatureFactoryFlexible(AvatarContext context) {
        this.context = context;
    }

    public static Object createInstance(String className, Object[] parameters) throws Exception {
        // Load the class dynamically
        Class<?> clazz = Class.forName(className);

        // Get the types of the parameters
        Class<?>[] parameterTypes = new Class[parameters.length];
        for (int i = 0; i < parameters.length; i++) {
            parameterTypes[i] = parameters[i].getClass();
        }

        // Get the constructor with the corresponding parameter types
        Constructor<?> constructor = clazz.getConstructor(parameterTypes);

        // Create an instance by invoking the constructor with the parameters
        return constructor.newInstance(parameters);
    }

    @Override
    public BodyShape getBodyShape() {
        try {
            return (BodyShape)createInstance(context.getBody(), new Object[0]);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Eyes getEyes() {
        try {
            return (Eyes)createInstance(context.getEyes(), new Object[]{context.getEyeColor()});
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Nose getNose() {
        try {
            return (Nose)createInstance(context.getNose(), new Object[0]);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Ears getEars() {
        try {
            return (Ears)createInstance(context.getEars(), new Object[0]);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Hair getHair() {
        try {
            return (Hair)createInstance(context.getHair(), new Object[]{context.getHairColor()});
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Attire getAttire() {
        try {
            return (Attire)createInstance(context.getAttire(), new Object[0]);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
