import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] sum = new int[16];

        int depth = 0;

        int[][] mainArr = {
                {1, 1, 1, 0, 0, 0},
                {0, 1, 0, 0, 0, 0},
                {1, 1, 1, 0, 0, 0},
                {0, 0, 2, 4, 4, 0},
                {0, 0, 0, 2, 0, 0},
                {0, 0, 1, 2, 4, 0}
        };


        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                sum[depth] = mainArr[i][j] + mainArr[i][j + 1] + mainArr[i][j + 2]
                        + mainArr[i + 1][j + 1]
                        + mainArr[i + 2][j] + mainArr[i + 2][j + 1] + mainArr[i + 2][j + 2];
                depth++;
            }
        }

        Arrays.sort(sum);
        System.out.println(sum[15]);

    }
}
