package HomeWork_2;

public class HW_2_4 {
    public static void main(String[] args) {

        int[][] sq = new int[5][5];
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                if (i == j){
                    sq[i][j] = 1;
                    }else{
                    sq[i][j] = 0;
                }
                System.out.print(sq[i][j]);
            }
            System.out.println();
        }
    }
}
