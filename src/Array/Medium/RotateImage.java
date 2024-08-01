package Array.Medium;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

//Question Link: https://leetcode.com/problems/rotate-image/
public class RotateImage {
    public static void main(String[] args) {
        //sample input output:: matrix = [[1,2,3],[4,5,6],[7,8,9]]
        //Output: [[7,4,1],[8,5,2],[9,6,3]]
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        rotate(arr);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + "  ");
            }
        }
    }

    public static void rotate(int[][] matrix) {

        int n = matrix.length;
        int m = matrix[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < m; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for (int i = 0; i < n; i++) {
            int e = m - 1;
            int s = 0;
            while (e >= s) {
                int temp = matrix[i][e];
                matrix[i][e] = matrix[i][s];
                matrix[i][s] = temp;
                e--;
                s++;
            }
        }
    }
}
