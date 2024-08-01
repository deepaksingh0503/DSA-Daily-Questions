package ArrayQuestions;
import java.util.*;
public class SortColors {
    public static void main(String[] args) {
        int[] arr = {1,2,0,0,1,2,1,2,1,0,0};
        sortColors(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void sortColors(int[] arr) {

    }


    public static void sortColors1(int[] nums){
        //Just using the given sorting function to sort array .
        Arrays.sort(nums);
    }

}
