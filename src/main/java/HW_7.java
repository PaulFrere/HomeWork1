public class HW_7 {
    public static void main(String[] args) {
        int a = 1986;
        if (a % 400 == 0) {
            System.out.println("Год високосный!");
        }else if (a % 100 == 0){
            System.out.println("Год не високосный!");
        }else if (a % 4 == 0){
            System.out.println("Год високосный!");
        }else {
            System.out.println("Год не високосный!");
        }
    }
}
