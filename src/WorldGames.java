import java.util.Scanner;

/**
 * @author Mirco Forcella
 * Class mainly used by class Tester with 2 methods
 */
public class WorldGames {
    /**
     * this method concatenate a word of our choice with an "hello"
     * @param word
     * @return a String "Hello word"
     */
    public String addHelloWord(String word){
        return "Hello" + word;
    }
    /**
     * concatenates 2 Strings in this case named "name" and "surname"
     * @param name
     * @param surname
     * @return the concatenated strings divided by a space.
     */
    public String getFullName(String name,String surname){
        return name + " "+ surname;
    }
}
