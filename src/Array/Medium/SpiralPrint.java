package Array.Medium;

import java.util.ArrayList;
import java.util.List;

public class SpiralPrint {

//Question link leetcode: https://leetcode.com/problems/spiral-matrix/description/
    public static void main(String[] args) {
        // sample output of the given input: 1,2,3,4,8,12,11,10,9,5,6,7
        int[][] arr = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        for (Integer i : spiralOrder(arr)) {
            System.out.print(i + "  ");
        }

    }
    public static List<Integer> spiralOrder(int[][] matrix) {
        int left, right, top, bottom;
        right = matrix[0].length - 1;
        left = 0;
        top = 0;
        bottom = matrix.length - 1;
        List<Integer> ans = new ArrayList<>();


        while (top <= bottom && left <= right) {
            if (top <= bottom && left <= right) {
                for (int i = left; i <= right; i++) {
                    ans.add(matrix[top][i]);
                }
                top++;
            }
            if (top <= bottom && left <= right) {
                for (int i = top; i <= bottom; i++) {
                    ans.add(matrix[i][right]);
                }
                right--;
            }

            if (top <= bottom && left <= right) {
                for (int i = right; i >= left; i--) {
                    ans.add(matrix[bottom][i]);
                }
                bottom--;
            }

            if (top <= bottom && left <= right) {
                for (int i = bottom; i >= top; i--) {
                    ans.add(matrix[i][left]);
                }
                left++;
            }
        }
        return ans;
    }
}
