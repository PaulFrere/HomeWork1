package HomeWork_2;

public class HW_2_5 {
    public static void main(String[] args) {
        int max = -1000000;
        int min = 1000000;
        int[] number = {4, 8, 1, 17, 9, 25, 13, -6, 12, 14, 22};
         for (int a : number){
             if (a > max){
                 max = a;
             }
             if (a < min){
                 min = a;
             }
         }
         System.out.println("Максимальное число: " + max);
         System.out.println("Минимальное число: " + min);
    }
}
