package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.ByteArrayInputStream;
import java.io.PrintStream;
import java.io.InputStream;
import java.io.IOException;

/**
 * Tests the main class, which should:
 *  - in main, print "Hello, world!" to standard output.
 */
public class MainTest {
    
    private static final String helloWorld = "Hello, world!" 
                                           + System.lineSeparator();
    
    /**
     * Tests if main prints "Hello, world!"
     */
    @Test
    public void mainTest() {
        //set input and output
        InputStream standardIn = System.in;
        PrintStream standardOut = System.out;
        
        //prepare output buffer
        ByteArrayOutputStream outputBuffer = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputBuffer));
        
        //prepare input buffer
        ByteArrayInputStream inputBuffer;
        inputBuffer = new ByteArrayInputStream(helloWorld.getBytes());
        System.setIn(inputBuffer);
        
        //run main
        Main.main(null);
        
        //check output buffer
        assertEquals(helloWorld, outputBuffer.toString());
        
        //finalize resources
        try {
            outputBuffer.close();
        } catch (IOException ioe) {
            System.err.println("outputBuffer not initialised");
        } finally {
            outputBuffer = null;
        }
        try {
            inputBuffer.close();
        } catch (IOException ioe) {
            System.err.println("inputBuffer not initialised");
        } finally {
            inputBuffer = null;
        }
        System.setOut(standardOut);
        System.setIn(standardIn);
    }
    
    /**
     * tests if reversed strings are correctly reversed
     */
    @Test
    public void reverseStringTest() {
        String base = "";
        String[] strings = new String[27];
        for(char chr = 'a'; chr <= 'z'; ++chr)
            strings[chr - 'a'] = new StringBuilder().append(chr).toString();
        
        for(char chr = 'a'; chr <= 'z'; ++chr) {
            String ref = base;
            for(char chr2 = 'a'; chr2 <= 'z'; ++chr2)
                ref += strings[chr2 - 'a'];
            String rev = Main.reverseString(ref);
            
            assertEquals(ref.length(), rev.length());
            for(int index = 0; index < ref.length(); ++index)
                assertEquals(ref.charAt(index), rev.charAt(rev.length() - index - 1));
        }
    }
    
}
