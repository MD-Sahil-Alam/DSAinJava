package Shorting.CyclicShort;

public class FindDuplicateNumberAmazon {

    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2, 2};
        System.out.println(sort(arr));
    }

    static int sort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            if (arr[i] != i + 1) {
                int correct = arr[i] - 1;

                if (arr[i] != arr[correct]) {
                    int temp = arr[i];
                    arr[i] = arr[correct];
                    arr[correct] = temp;
                } else {
                    // duplicate found
                    return arr[i];
                }
            } else {
                i++; // move forward only if correct
            }
        }
        return -1; // no duplicate
    }
}
