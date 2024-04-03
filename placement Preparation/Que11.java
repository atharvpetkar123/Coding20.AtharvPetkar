//String question - Remove all characters from string except alphabets
import java.util.regex.*;

class RemoveNonAlphabets {
    public static void main(String[] args) {
        String input = "Hello123, World!";

        String result = removeNonAlphabets(input);

        System.out.println("String with only alphabets: " + result);
    }

    public static String removeNonAlphabets(String input) {
        // Use regular expression to remove non-alphabetic characters
        return input.replaceAll("[^a-zA-Z]", "");
    }
}
