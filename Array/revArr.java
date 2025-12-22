package Array;

import java.util.Arrays;

public class revArr {
  public static void main(String[] args) {
    int[] arr = {1,3,6,8,9,12,14,16};
    System.out.println("before rev");
    System.out.println(Arrays.toString(arr));
    arrRev(arr);
    System.out.println("after rev");
    System.out.println(Arrays.toString(arr));
  }
  static void arrRev(int[] arr){
    int start = 0;
    int end = arr.length-1;
    while(start<end){
      int temp = arr[start]; 
      arr[start]=arr[end];
      arr[end]=temp;
      start++;
      end--;
    }
  }
}
