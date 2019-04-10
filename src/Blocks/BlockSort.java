package Blocks;

import java.util.Arrays;

public class BlockSort implements Blockable {
    public String run(String[] args, String text) {
        String[] splitedText = text.split("\n");
        StringBuilder stringBuilder = new StringBuilder();

        Arrays.sort(splitedText);
        for (String str: splitedText)
            stringBuilder.append(str).append("\n");

        if (stringBuilder.length() > 1)
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        return stringBuilder.toString();
    }
}
