package BinarySearch.SearchingIn1DArray;

public class GetsmallesLetterGreaterThanTarget {

    public static void main(String[] args) {
        char[] letter = {'c', 'f', 'j'};
        char target = 'f';
        System.out.println(find(letter, target));
    }

    static char find(char[] letter, char target) {
        int start = 0;
        int end = letter.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < letter[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return letter[start % letter.length];
    }
}
