package Blocks;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import static org.junit.Assert.*;

public class BlockWriteFileTest {

    @Test
    public void run() throws IOException {
        BlockWriteFile blockWriteFile = new BlockWriteFile();
        String actual = blockWriteFile.run(new String[]{"Blocks\\out_file.txt"}, "entry");
        BufferedReader bufferedReader = new BufferedReader(new FileReader("Blocks\\out_file.txt"));
        String expected = bufferedReader.readLine();
        assertEquals(expected, "entry");
    }
}