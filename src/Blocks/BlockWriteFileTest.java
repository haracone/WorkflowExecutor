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
        String actual = blockWriteFile.run(new String[]{null,"out_test.txt"}, "entry");
        BufferedReader bufferedReader = new BufferedReader(new FileReader("out_test.txt"));
        String expected = bufferedReader.readLine();
        assertEquals(expected, "entry");
    }
}