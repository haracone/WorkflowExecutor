import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;

class BlockFactory {
    private Properties properties = new Properties();

    BlockFactory() throws IOException {
        properties.load(BlockFactory.class.getResourceAsStream("listOfBlocks.properties"));
    }

    Blockable CreateBlock(String str) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        try {
            Class createdClass = Class.forName(properties.getProperty(str));
            return (Blockable) createdClass.getDeclaredConstructor().newInstance();
        }
        catch (NullPointerException e) {
            e.fillInStackTrace();
        }
        return null;
    }
}