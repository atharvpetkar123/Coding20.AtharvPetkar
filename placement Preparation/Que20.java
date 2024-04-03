//Write a program to find a word in a given string that has the highest number of repeated letters. If not found, return -1.
class HighestRepeatedLettersWord {
    public static void main(String[] args) {
        String input = "Hello, welcome to the wonderful world of programming";

        String result = findWordWithHighestRepeatedLetters(input);

        if (!result.equals("")) {
            System.out.println("Word with the highest number of repeated letters: " + result);
        } else {
            System.out.println("No word found with repeated letters.");
        }
    }

    public static String findWordWithHighestRepeatedLetters(String input) {
        String[] words = input.split("\\s+");
        int maxRepeatedLetters = 0;
        String wordWithMaxRepeatedLetters = "";

        for (String word : words) {
            int repeatedLettersCount = countRepeatedLetters(word);
            if (repeatedLettersCount > maxRepeatedLetters) {
                maxRepeatedLetters = repeatedLettersCount;
                wordWithMaxRepeatedLetters = word;
            }
        }

        return wordWithMaxRepeatedLetters;
    }

    public static int countRepeatedLetters(String word) {
        int[] count = new int[26]; // Assuming only lowercase English letters
        int repeatedCount = 0;

        for (char ch : word.toLowerCase().toCharArray()) {
            if (Character.isLetter(ch)) {
                if (++count[ch - 'a'] == 2) {
                    repeatedCount++;
                }
            }
        }

        return repeatedCount;
    }
}
