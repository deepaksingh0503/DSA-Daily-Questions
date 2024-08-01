package Array.Medium;
import java.util.*;
public class SortColors {
    public static void main(String[] args) {
        int[] arr = {1,2,0,0,1,2,1,2,1,0,0};
        sortColors(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void sortColors(int[] arr) {
        //sample input : [2,0,2,1,1,0]
        //In this solution we can just count the number of 0's, 1's and 2's  and can just override the original array.
        int zeroCount=0;
        int oneCount=0;
        int twoCount=0;

        for(int i=0; i<arr.length; i++){
            if(arr[i]==0){
                zeroCount++;
            }else if(arr[i]==1){
                oneCount++;
            }else{
                twoCount++;
            }
        }
        for(int i=0; i<arr.length; i++){
            if(zeroCount>0){
                arr[i]=0;
                zeroCount--;
            }else if(oneCount>0){
                arr[i]=1;
                oneCount--;
            }else{
                arr[i]=2;
            }
        }
    }


    public static void sortColors1(int[] nums){
        //Just using the given sorting function to sort array .
        Arrays.sort(nums);
    }

}
