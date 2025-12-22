package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Arr {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

      int[] arr = new int[5];
      
      System.out.println("emter 5 elem of arr");
      for (int i = 0; i < arr.length; i++) {
        arr[i]=in.nextInt();
      }


      System.out.println("normal method to print using for loop");
      for (int i = 0; i < arr.length; i++) {
        System.out.println(arr[i]);
      }

      System.out.println("\nenhanced method to print using for each");
      for(int elem : arr){
        System.err.println(elem);
      }

      System.out.println("\nanother method to print using Arrays.toString(arr)");
      System.out.print(Arrays.toString(arr));

  }
}
