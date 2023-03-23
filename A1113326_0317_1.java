import java.util.*;

public class A1113326_0317_1 {

    public static void main(String [] argv) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入 n 的值：");
        int n = scanner.nextInt();
        System.out.print("請輸入 m 的值：");
        int m = scanner.nextInt();

        int[][] array = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] = (i+1) * (j+1);
            }
        }

        System.out.println("產生的陣列為：");

        for (int[] row : array) {
            for (int value : row) {
                System.out.print(value + "\t");
            }
            System.out.println();
        }
    }
}
