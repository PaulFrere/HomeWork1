package HomeWork_2;

public class HW_2_2 {
    public static void main(String[] args) {
        int[] a = new int[8];
        int b = 0;
        for(int i = 0; i < a.length; i++){
            a[i] = b;
            b = b +3;
            System.out.print(a[i] + " ");
        }
    }
}
