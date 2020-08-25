package HomeWork_3;

import java.util.Scanner;

public class HW_3_1 {
    public static void main(String[] args) {
        System.out.println("Угадайте число от 0 до 9");
        int number = (int) (Math.random() * 9);
        Scanner scanner = new Scanner(System.in);
        while (true){
            int a = scanner.nextInt();
            if (number == a){
                System.out.println("Вы угадали!");
                break;
            }else if (number < a){
                System.out.println("Вы не угадали, попробуйте ещё раз. Загаданное число меньше.");
            }else if (number > a){
                System.out.println("Вы не угадали, попробуйте ещё раз. Загаданное число больше.");
            }
        }
        scanner.close();
    }


}
