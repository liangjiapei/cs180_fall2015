import org.junit.*;

import static org.junit.Assert.*;

import java.io.*;

/**
 * Created by liangjiapei on 8/25/15.
 */
public class TemperatureTest {

    ByteArrayOutputStream outContent;
    ByteArrayOutputStream errContent;

    @Before
    public void setUp() {
        outContent = new ByteArrayOutputStream();
        errContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }


    @Test(timeout = 100)
    public void testFahrenheitToCelcius() {
        String expected;
        expected = "Fahrenheit: 212.0\nCelcius: 100.0\n";
        String actual = outContent.toString();
        String message = "Make sure that the conversion from Fahrenheit to Celcius is corret.";
        assertEquals(errContent.toString(), expected, actual);
    }

}