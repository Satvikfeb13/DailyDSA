import java.util.Arrays;

class RemoveDuplicate {

    public static void main(String[] args) {
        int[] arr = { 1, 1, 1, 2, 2, 2, 3, 3, 3 };
        int cm = 1;
        int officer = 1;
        int res = 1;
        while (cm < arr.length) {
            if (arr[cm] == arr[cm - 1]) {
                cm++;
                continue;
            }
            arr[officer] = arr[cm];
            officer++;
            cm++;
            res++;

        }
        System.out.println(res);
        System.out.println(Arrays.toString(arr));
    }
}