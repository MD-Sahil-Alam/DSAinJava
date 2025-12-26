package BinarySearch.SearchingIn1DArray;

public class CilingWhileLoop {
  public static void main(String[] args) {
    int[] arr =  {-10,-3,-2,1,2,4,8,9,11,12,14,16,20,22};
    int target = 5;
    System.out.println(bser(arr, target)); 
  }
  static int bser(int[] arr , int target){
    int start = 0;
    int end = arr.length-1;
    while (start<=end) { 
        int mid = start+(end-start)/2;
        if(arr[mid] == target){
          return mid;
        }else if (target<arr[mid]) {
          end = mid-1;
        }else{
          start = mid+1;
        }
    }
    return start;
  }
}
