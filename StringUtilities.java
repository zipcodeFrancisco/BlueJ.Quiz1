
import java.util.*; 

public class StringUtilities {
    /**
     * @param input value to be returned
     * @return `input`
     */
    public String returnInput(String input) {
        return input;
    }

    /**
     * @param baseValue value to be added to
     * @param valueToBeAdded value to add
     * @return the concatenation of `baseValue` and `valueToBeAdded`
     */
    public String concatenate(String baseValue, String valueToBeAdded) {
        return baseValue + valueToBeAdded;
    }

    /**
     * @param valueToBeReversed value to be reversed
     * @return identical string with characters in opposite order
     */
    public String reverse(String valueToBeReversed) {
        //System.out.print('\u000C');
        String result = "";
        int lengthStr = valueToBeReversed.length();
        for(int i = 0; i < lengthStr; i++){
            result += valueToBeReversed.substring(lengthStr-(i+1), lengthStr-i);
        }
        return result;
    }

    /**
     * @param word word to get middle character of
     * @return middle character of `word`
     */
    public Character getMiddleCharacter(String word) {
        Integer result = word.length() / 2;
        String res = word.substring(result, result + 1);
        return res.charAt(0);
    }

    /**
     * @param value value to have character removed from
     * @param charToRemove character to be removed from `value`
     * @return `value` with char of value `charToRemove` removed
     */
    public String removeCharacter(String value, Character charToRemove) {
        return value.replaceAll(charToRemove.toString() , "");
    }

    /**
     * @param sentence String delimited by spaces representative of a sentence
     * @return last `word` in sentence
     */
    public String getLastWord(String sentence) {
        //System.out.print('\u000C');
        //System.out.println(sentence);
        String[] arrayStr = sentence.split(" ");
        //System.out.println( arrayStr[arrayStr.length-1] );
        String result = arrayStr[arrayStr.length-1];
        return result;
    }
}
