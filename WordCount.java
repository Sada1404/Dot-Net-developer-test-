import java.util.HashMap;

public class WordCount {
    public static void main(String[] args) {
        String str = "Hello World, Hello Java";
        System.out.println("Number of words: " + countWords(str));
    }

    public static int countWords(String str) {
        HashMap<String, Integer> wordCount = new HashMap<>();
        String[] words = str.split("\\s+"); // Split the string by whitespace

        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        return wordCount.size();
    }
}