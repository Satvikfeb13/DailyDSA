// package Misllenous;

import java.util.Arrays;

public class MergeEvenOdd {
    public static void main(String[] args) {
        int[] even = { 2, 4, 6 };
        int[] odd = { 1, 3, 5 };
        // number = {1,2,3,4,5,6}
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


        System.out.println(Arrays.toString(ans));
    }


}
