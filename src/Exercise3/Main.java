import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        File file = new File("files/words.txt");
        try (FileInputStream fis = new FileInputStream(file)) {
            Scanner scanner = new Scanner(fis);

            StringBuilder contentBuilder = new StringBuilder();

            while (scanner.hasNextLine()) {
                String words = scanner.nextLine();
                contentBuilder.append(words).append(" ");
            }

            String content = contentBuilder.toString();

            Map<String, Integer> wordFrequencies = countWordFrequencies(content);

            List<Map.Entry<String, Integer>> sortedEntries = new ArrayList<>(wordFrequencies.entrySet());
            sortedEntries.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));

            for (Map.Entry<String, Integer> entry : sortedEntries) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static Map<String, Integer> countWordFrequencies(String content) {
        String[] words = content.split("\\s+");
        Map<String, Integer> wordFrequencies = new HashMap<>();

        for (String word : words) {
            int currentFrequency = wordFrequencies.getOrDefault(word, 0);
            wordFrequencies.put(word, currentFrequency + 1);
        }
        return wordFrequencies;
    }
}