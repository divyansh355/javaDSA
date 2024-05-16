package Assignments.Arrays;

import java.util.Arrays;

public class Leetcode832 {
    public static void main(String[] args) {
    int[][] image = {{1,1,0}, {1,0,1}, {0,0,1}};
        System.out.println(Arrays.deepToString(flipAndInvertImage(image)));
    }

    static int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < (n + 1) / 2; j++) {
                int temp = image[i][j] ^ 1;
                image[i][j] = image[i][n - 1 - j] ^ 1;
                image[i][n - 1 - j] = temp;
            }
        }
        return image;
    }
}
