package Exercise1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        File file = new File("files/fileExercise1.txt");
        try (FileInputStream fis = new FileInputStream(file)) {
            Scanner scanner = new Scanner(fis);
            while (scanner.hasNextLine()) {
                String phoneNumber = scanner.nextLine();
                if (isValidPhoneNumber(phoneNumber)) {
                    System.out.println(phoneNumber);
                }
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static boolean isValidPhoneNumber(String phoneNumber) {
        String pattern1 = "^\\(\\d{3}\\) \\d{3}-\\d{4}$";
        String pattern2 = "^\\d{3}-\\d{3}-\\d{4}$";
        return phoneNumber.matches(pattern1) ||phoneNumber.matches(pattern2);
    }
}