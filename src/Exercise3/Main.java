package Exercise3;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File file = new File("files/words.txt");
        try ( FileInputStream fis = new FileInputStream(file)){
            Scanner scanner = new Scanner(fis);

            StringBuilder contentBuilder = new StringBuilder();

            while (scanner.hasNextLine()) {
                String words = scanner.nextLine();
                contentBuilder.append(words);
            }

            String content = contentBuilder.toString();

            }

            fis.close();

        } catch (IOException ex){
            ex.fillInStackTrace();
        }

        }
    public static Map<String, Integer> countWordFrequencies(String content) {
        String[] words = content.split("\\s+");
        Map<String, Integer> wordFrequencies = new HashMap<>();


        for (String word: words) {
            wordFrequencie.put()
        }
    }





