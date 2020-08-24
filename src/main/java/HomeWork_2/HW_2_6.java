package HomeWork_2;

public class HW_2_6 {
    public static boolean main(String[] args) {
        int[] a = {1, 2, 3, 8, 5, 9};
        int sum = 0;
        int sum1 = 0;
        for(int i : a){
            sum = sum + a[i];
        }
        for(int i : a){
            sum1 = sum1 + a[i];
            if ((sum - sum1) == sum1){
                return true;
            }
        }
        return false;
    }
}
