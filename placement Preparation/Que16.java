//Program to check string is pangram or not
import java.util.HashSet;
import java.util.Set;

class PangramChecker {
    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog";

        boolean isPangram = checkPangram(str);

        if (isPangram) {
            System.out.println("The string is a pangram.");
        } else {
            System.out.println("The string is not a pangram.");
        }
    }

    public static boolean checkPangram(String str) {
        // Remove spaces and convert the string to lowercase
        str = str.replaceAll("\\s", "").toLowerCase();

        // Initialize a set to store encountered characters
        Set<Character> set = new HashSet<>();

        // Iterate over each character of the string
        for (char ch : str.toCharArray()) {
            // If the character is an alphabet, add it to the set
            if (Character.isLetter(ch)) {
                set.add(ch);
            }
        }

        // Check if the set contains all alphabets (26 letters)
        return set.size() == 26;
    }
}
