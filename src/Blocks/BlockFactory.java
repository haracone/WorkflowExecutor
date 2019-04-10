package Blocks;

import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BlockFactory {
    private Properties properties = new Properties();
    private static final Logger logger = Logger.getLogger(BlockFactory.class.getName());

    public BlockFactory() throws IOException {
        properties.load(BlockFactory.class.getResourceAsStream("listOfBlocks.properties"));
    }

    public Blockable CreateBlock(String str) {
        try {
            if (str == null)
                throw new Exception("Missing returned class");
            Class createdClass = Class.forName(properties.getProperty(str));
            return (Blockable) createdClass.getDeclaredConstructor().newInstance();
        }
        catch (Exception e) {
            logger.log(Level.SEVERE, "ERROR:", e);
        }
        return null;
    }
}