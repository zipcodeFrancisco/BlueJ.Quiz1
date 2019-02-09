 

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LoopsFunAcronymTest {
    private LoopFun loop;

    @Before
    public void setUp() {
        loop = new LoopFun();
    }


    @Test
    public void testAcronymBasic() {
        //Given
        String phrase = "Portable Network Graphics";
        String expected = "PNG";

        //When
        String actual = loop.acronym(phrase);

        //Then
        assertEquals(expected, actual);
    }

    @Test
    public void testAcronymBasicLowercaseWords() {
        //Given
        String phrase = "Ruby on Rails";
        String expected = "ROR";

        //When
        String actual = loop.acronym(phrase);

        //Then
        assertEquals(expected, actual);
    }

    @Test
    public void testAcronymBasicPunctuation() {
        //Given
        String phrase = "First In, First Out";
        String expected = "FIFO";

        //When
        String actual = loop.acronym(phrase);

        //Then
        assertEquals(expected, actual);
    }
}
