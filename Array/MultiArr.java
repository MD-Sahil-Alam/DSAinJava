package Array;

import java.util.Arrays;

class MultiArr{
  public static void main(String[] args) {
    int arr[][] = {{1,3,5,7},{2,4,6,8}};

    System.out.println("using for loop");
    for(int row = 0; row < arr.length;row++){
      for (int col = 0; col < arr[row].length;col++) {
          System.out.print(arr[row][col]);
      }
      System.out.println("");
    }

    System.out.println("using for each");
    for(int[] row : arr){
      for (int num : row) {
        System.out.print(num);
      } 
       System.out.println("");
    }

    System.out.println("using for Arrays class");
    for(int[] a : arr){
      System.err.println(Arrays.toString(a));
    }
  }
}
