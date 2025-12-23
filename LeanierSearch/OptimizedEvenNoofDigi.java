package LeanierSearch;

public class OptimizedEvenNoofDigi {
  public static void main(String[] args) {
    int[] nums = {-21,135,2,6,7897};
    int evennum = 0;

    for (int i = 0; i < nums.length; i++) {
      int n = Math.abs(nums[i]);
      int count = (int)Math.log10(n)+1;
      if (count%2==0) {
        evennum++;
      }
    }
    System.out.println(evennum);
  }
}
