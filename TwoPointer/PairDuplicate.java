import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PairDuplicate {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 1, 2, 2, 2, 3, 3, 3 };
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length - 1;
        int target = 4;
        List<List<Integer>> ans = new ArrayList<>();
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                ans.add(Arrays.asList(arr[left], arr[right]));
                while (left < right && arr[left] == arr[left + 1])
                    left++;
                while (left < right && arr[right] == arr[right - 1])
                    right--;

                left++;
                right--;
            } else if (sum > target) {
                right--;
            } else {
                left++;
            }
        }

        for (List<Integer> ls : ans) {
            System.out.println(ls);
        }
    }
}
