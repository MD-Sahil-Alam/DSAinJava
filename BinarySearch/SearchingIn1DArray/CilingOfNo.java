package BinarySearch.SearchingIn1DArray;

public class CilingOfNo {
  public static void main(String[] args) {
    int[] arr = {14,17,18,33};
    int target = 15;
    System.out.println(bSearch(arr,target));
  }
  static int bSearch(int[] arr, int target){
    int start = 0;
    int end = arr.length-1;
    int found = 0;
    for (int i = 0; i < arr.length; i++) {
      int mid = start+(end-start)/2;
      if (arr[mid] == target) {
        return mid;
      }else if (target<arr[mid]){
        found = mid;
        end = mid-1;
      }else{
        found = mid+1;
        start = mid ;
      }
    }
    return arr[found];
  } 
}
