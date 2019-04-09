import java.io.*;

class WorkflowFileReader {
    private File workflow;
    private InputStreamReader reader = null;

    WorkflowFileReader (File workflow) throws FileNotFoundException {
        this.workflow = workflow;
        reader = new InputStreamReader(new FileInputStream(workflow));
    }

    void FindDesc() throws IOException {
        StringBuilder buff = new StringBuilder();
        int letter = 0;

        while ((!buff.toString().equals("desc")) && (letter != -1)) {
            buff.delete(0, buff.length());
            letter = reader.read();
            while (((letter != -1) && (Character.isLetterOrDigit(letter)))) {
                buff.append((char) letter);
                letter = reader.read();
            }
        }
    }

    String ReadBlockId() throws IOException {
        StringBuilder buff = new StringBuilder();
        int letter = 0;

        while (letter != '=' && !buff.toString().equals("csed")) {
            letter = reader.read();
            if (Character.isLetterOrDigit(letter))
                buff.append((char) letter);
        }
        return buff.toString();
    }

    String ReadBlock() throws IOException {
        StringBuilder buff = new StringBuilder();
        int letter = 0;

        while (!Character.isLetterOrDigit(letter))
            letter = reader.read();

        while (letter != '\n' && letter != '\r') {
            buff.append((char)letter);
            letter = reader.read();
        }
        return buff.toString();
    }

    String ReadList() throws IOException {
        int letter = 0;
        char c;

        letter = reader.read();
        while (!Character.isDigit(letter) && letter != -1)
            letter = reader.read();
        c = (char) letter;
        return Character.toString(c);
    }
}
