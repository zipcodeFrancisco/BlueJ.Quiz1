
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StringUtilsReverseTest {

    private StringUtilities utilities;

    @Before
    public void setUp() {
        utilities = new StringUtilities();
    }

    @Test
    public void test0() {
        // Given
        String input = "Smartdust";
        String expected = "tsudtramS";

        // when
        String actual = utilities.reverse(input);

        // then
        Assert.assertEquals(expected, actual); 
    }

    @Test
    public void test1() {
        // Given
        String input = "5HT";
        String expected = "TH5";

        // when
        String actual = utilities.reverse(input);

        // then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void test2() {
        // Given
        String input = "Electrogavitics";
        String expected = "scitivagortcelE";

        // when
        String actual = utilities.reverse(input);

        // then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void test3() {
        // Given
        String input = "Manipura";
        String expected = "arupinaM";

        // when
        String actual = utilities.reverse(input);

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test4() {
        // Given
        String input = "Tantra";
        String expected = "artnaT";

        // when
        String actual = utilities.reverse(input);

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test9() {
        // Given
        String input = "Kundalini";
        String expected = "Kundalini";

        // when
        String actual = utilities.reverse(utilities.reverse(input));

        // then
        Assert.assertEquals(expected, actual);
    }
    
    
    @Test
    public void test10() {
        // Given
        String input = "Demiurge";
        String expected = input;

        // when
        String actual = utilities.reverse(utilities.reverse(input));

        // then
        Assert.assertEquals(expected, actual);
    }
}
