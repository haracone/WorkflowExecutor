package Blocks;

import java.util.Arrays;

public class BlockSort implements Blockable {
    public String run(String[] args, String text) {
        String[] splitedText = text.split("\n");
        StringBuilder stringBuilder = new StringBuilder();

        Arrays.sort(splitedText);
        for (String str: splitedText)
            stringBuilder.append(str).append("\n");

        return stringBuilder.toString();
    }
}
