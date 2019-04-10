package Blocks;

public class BlockGrep implements Blockable {
    public String run(String[] args, String text) {
        StringBuilder stringBuilder = new StringBuilder();
        String [] splittedText = text.split("\n");

        for (String str: splittedText) {
            if (str.contains(args[0]))
                stringBuilder.append(str).append("\n");
        }

        if (stringBuilder.length() > 1)
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);

        return stringBuilder.toString();
    }
}