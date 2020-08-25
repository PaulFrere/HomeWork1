package HomeWork_3;

import java.util.Arrays;
import java.util.Scanner;

public class HW_3_2 {
    public static void main(String[] args) {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        System.out.println("Угадайте загаданное слово из предложенных.");
        System.out.println(Arrays.toString(words));
        Scanner scanner = new Scanner(System.in);
        int i = (int) (Math.random() * words.length);
        while (true){
            String word = scanner.nextLine();
            if (word.equals(words[i])){
                System.out.println("Вы угадали!");
                break;
            }else {
                for (int j = 0; j < 15; j++) {
                    char let = words[i].charAt(j);
                    String str = "" + let;
                    System.out.println("Вы не угадали, попробуйте ещё раз.");
                    System.out.println("Это слово: " + str + "############");
                    break;
                }
            }
        }
        scanner.close();
    }
}
