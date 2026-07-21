import java.util.Arrays;

public class moveZeros {
    public static void main(String[] args) {
        int[] nums = { 0, 1, 0, 3, 12 };
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
        System.out.println(Arrays.toString(nums));
        // if you have to do move zero to start in that cas the condition is 
        // if(nums[i]==0) then swap it 
    }

}
