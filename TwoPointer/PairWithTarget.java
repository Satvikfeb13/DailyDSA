import java.util.Arrays;

public class PairWithTarget {

    public static int[] twoSum(int[] numbers, int target) {
        int start=0;
        int end=numbers.length-1;
        while(start<end){
            int sum=numbers[start]+numbers[end];
            if(sum==target){
                return new int[]{start+1,end+1};
            }else if(sum>target){
                end--;
            }else{
                start++;
            }
        }
        return  new int[]{-1,-1};
    }

    public static void main(String[] args) {
        int target = 9;
        int[] arr = { 2, 7, 11, 15 };
        int[] ans= twoSum(arr, target);
        System.out.println(Arrays.toString(ans))

;    }
}