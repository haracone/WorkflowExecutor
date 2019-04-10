package Blocks;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BlockSort implements Blockable {
    private static final Logger logger = Logger.getLogger(BlockSort.class.getName());

    public String run(String[] args, String text) {
        try {
            if (text == null)
                throw new Exception("Missing text");

            String[] splitedText = text.split("\n");
            StringBuilder stringBuilder = new StringBuilder();

            Arrays.sort(splitedText);
            for (String str : splitedText)
                stringBuilder.append(str).append("\n");

            if (stringBuilder.length() > 1)
                stringBuilder.deleteCharAt(stringBuilder.length() - 1);

            return stringBuilder.toString();
        } catch (Exception e) {
            logger.log(Level.SEVERE, "ERROR:", e);
        }
        return null;
    }
}
