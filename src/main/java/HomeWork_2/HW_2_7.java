package HomeWork_2;

public class HW_2_7 {
    public static void main(String[] args) {
        int n = -4;
        int[] df = {4, 8, 5, 3, 1, 1, 2, 6, 5, 9, 7, 3, 1};
        if (n >= 0) {
            for (int i : df) {
                if ((i + n) < df.length) {
                    i = i + n;
                    System.out.print(df[i] + " ");
                    i = i - n;
                } else {
                    i = i + n - (df.length - 1);
                    System.out.print(df[i] + " ");
                    i = i - n + (df.length - 1);
                }
            }
        }
        if (n < 0) {
            for (int j = df.length - 1; j > 0; j--) {
                if ((j + n) >= 0) {
                    j = j + n;
                    System.out.print(df[j] + " ");
                    j = j - n;
                } else {
                    j = j + n + (df.length + n - 1);
                    System.out.print(df[j] + " ");
                    j = j - n - (df.length + n - 1);
                }
            }
        }
    }
}

