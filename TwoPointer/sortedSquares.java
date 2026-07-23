import java.util.Arrays;

public class sortedSquares {
    public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static int[] MergeArray(int[] even, int[] odd) {
        int evenindex = 0;
        int oddindex = 0;
        int index = 0;
        int size = even.length + odd.length;
        int[] ans = new int[size];
        while (evenindex < even.length && oddindex < odd.length) {
            if (even[evenindex] == odd[oddindex]) {
                ans[index] = even[evenindex];
                index++;
                evenindex++;
                oddindex++;
            } else if (even[evenindex] > odd[oddindex]) {
                ans[index] = odd[oddindex];
                index++;
                oddindex++;
            } else {
                ans[index] = even[evenindex];
                index++;
                evenindex++;
            }
        }

        while (evenindex < even.length) {
            ans[index] = even[evenindex];
            index++;
            evenindex++;
        }

        while (oddindex < odd.length) {
            ans[index] = odd[oddindex];
            index++;
            oddindex++;
        }
        return ans;

    }

    public static int[] sortedSquaresm2(int[] nums) {
        int postiveindex = nums.length;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= 0) {
                postiveindex = i;
                break;
            }
        }
        int[] positive = new int[nums.length - postiveindex];
        int[] negative = new int[postiveindex ];
        positive = Arrays.copyOfRange(nums, postiveindex, nums.length);
        negative = Arrays.copyOfRange(nums, 0, postiveindex);
        // reverse the whole array
        reverse(negative, 0, negative.length - 1);
        // Square of positive an array
        for (int i = 0; i < positive.length; i++) {
            positive[i] = positive[i] * positive[i];
        }
        // Square of Negative an array
        for (int i = 0; i < negative.length; i++) {
            negative[i] = negative[i] * negative[i];
        }
        // Merge the array
        return MergeArray(positive, negative);

    }

    public static int[] sortedSquaresm1(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = { -4, -1, 0, 3, 10 };
        // squqre it aand sort it but this will take an O(nlogn)
        // time complexity O(nlogn)
        // space complexity O(1)
        System.out.println(Arrays.toString(sortedSquaresm1(nums)));
        // Break the array into two Part
        // Negative -4 -1 0
        // Positive 3 10
        // Reverse the Negative Part 0 -1 -4
        // Negative 0 1 16
        // Then square both array
        // Negative 0 1 16
        // Positive 9 100
        // Talking about the time complexity it is O(n)
        // and Space complexity is O(n) O(positive.length+negative.length)
        System.out.println(Arrays.toString(sortedSquaresm2(nums)));

    }
}
