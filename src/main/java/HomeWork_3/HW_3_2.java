package HomeWork_3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HW_3_2 {

    public static final int FAKE_WORD_LENGTH = 15;
    public static final String[] WORDS = new String[] {
            "apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry",
            "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut",
            "pear", "pepper", "pineapple", "pumpkin", "potato"};

    public static void main(String[] args) {

        System.out.println("Есть слова, я загадал одно из них, угадай, какое: " + Arrays.toString(WORDS));

        Random random = new Random();
        int index = random.nextInt(WORDS.length);
        String targetWord = WORDS[index];

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Введите слово: ");
            String userWord = scanner.nextLine();

            if (targetWord.equals(userWord)) {
                System.out.println("Все верно!");
                break;
            }

            System.out.println("Не верно! Ниже тебе подсказка.");
            printPrompt(targetWord, userWord);
            System.out.println();
        } while (true);

        System.out.println("Игра окончена!");
    }

    private static void printPrompt(String targetWord, String userWord) {
        for (int i = 0; i < FAKE_WORD_LENGTH; i++) {
            char chr = '#';
            if ( i < userWord.length() && i < targetWord.length() && userWord.charAt(i) == targetWord.charAt(i) ) {
                chr = userWord.charAt(i);
            }
            System.out.print(chr);
        }
    }

}
