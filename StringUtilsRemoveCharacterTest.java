 

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringUtilsRemoveCharacterTest {

    private StringUtilities utilities;

    @Before
    public void setUp() {
        utilities = new StringUtilities();
    }



    @Test
    public void test1(){
        // Given
        String word = "tryptamine";
        String expected = "rypamine";
        char charToRemove = 't';

        //When
        String actual = utilities.removeCharacter(word, charToRemove);

        //Then
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        // Given
        String word = "diethyl";
        String expected = "diethl";
        char charToRemove = 'y';

        //When
        String actual = utilities.removeCharacter(word, charToRemove);

        //Then
        assertEquals(expected, actual);
    }

    @Test
    public void test3(){
        // Given
        String word = "hydroxytryptamine";
        String expected = "hydroytryptamine";
        char charToRemove = 'x';

        //When
        String actual = utilities.removeCharacter(word, charToRemove);

        //Then
        assertEquals(expected, actual);
    }
}
