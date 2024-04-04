import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateChars {
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println("Duplicate characters: " + findDuplicates(str));
    }

    public static Set<Character> findDuplicates(String str) {
        Map<Character, Integer> charCount = new HashMap<>();
        Set<Character> duplicates = new HashSet<>();

        for (char c : str.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            if (entry.getValue() > 1) {
                duplicates.add(entry.getKey());
            }
        }

        return duplicates;
    }
}