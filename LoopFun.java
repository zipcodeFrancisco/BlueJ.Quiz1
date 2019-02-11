
import java.util.stream.IntStream; 

public class LoopFun
{

      /**
       * Given a number, return the factorial of that number.
       * For example, given 5, the factorial is 5 x 4 x 3 x 2 x 1 which should return 120.
       * @param number
       * @return the factorial of the number
       */
      public Integer factorial(Integer number){
          Integer container = 1;
          for(int i = 1; i <= number; i++ ){
              //System.out.println( i + "" );
              container = i*container;
          }
          return container;
      }

      /**
       * Given a phrase, get the acronym of that phrase. Acronym is the combination of
       * the first character of each word in upper case.
       * For example, given "Ruby on Rails", this method will return "ROR"
       * @param phrase
       * @return Upper case string of the first letter of each word
       */
      public String acronym(String phrase) {
          String[] arrayStr = phrase.split(" ");
          String container = "";
          for(int i = 0; i < arrayStr.length; i++){
              container += arrayStr[i].substring(0, 1).toUpperCase();
          }
          
          return container;
      }

      /**
       * To prevent anyone from reading our messages, we can encrypt it so it will only be readable by its
       * intended audience. This method encrypt the message by shifting the letter by 3 characters. If the character is
       * at the end of the alphabet, it will wraps around.
       * For example:
       *  'a' => 'd'
       *  'w' => 'z'
       *  'x' => 'a'
       *  'y' => 'b'
       * @param word
       * @return the encrypted string by shifting each character by three character
       */
      public String encrypt(String word) {
          //System.out.print('\u000C');
          //System.out.println(word);
          //String[] alphabet = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
          char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
          char[] arrayChar = word.toCharArray();
          Integer lengthArr = alphabet.length;
          String container = "";
          //System.out.println( lengthArr );
          for( char c : arrayChar){
              Integer indexChar = new String(alphabet).indexOf(c);
              //System.out.println(indexChar);
              Integer indexUp = ((indexChar + 3)%lengthArr);
              //System.out.println( " --> " +  indexUp + " - " + alphabet[indexUp]);
              container += alphabet[indexUp];
              //System.out.println( c + "-" + findIndex(alphabet,'b'));
          }
          //System.out.println(container);
          return container;
      }
      
}
