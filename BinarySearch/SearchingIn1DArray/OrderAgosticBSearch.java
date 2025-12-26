package BinarySearch.SearchingIn1DArray;


public class OrderAgosticBSearch {
  public static void main(String[] args) {
    // int[] arr = {-10,-3,-2,1,2,4,6,8,9,11,12,14,16,20,22};
    int[] arr = {22, 20, 16, 14, 12, 11, 9, 8, 6, 4, 2, 1, -2, -3, -10};
    int target  = 2;
    System.out.println(bserch(arr,target));
  }

  static int bserch(int[] arr,int target){
    int s = arr[0];
    int e = arr.length-1;
    if(s>e){
      return dBsearch(arr,target);
    }else{
      return aBsearch(arr,target);
    }
  }

  static int dBsearch(int[] arr,int target){
    int start = 0;
    int end  = arr.length-1;
    for (int i = 0; i < arr.length; i++) {
      int mid = start+(end-start)/2;
      if (arr[mid]==target) {
        return mid;
      }else if(target<arr[mid]){
        start = mid+1;
      }else{
        end = mid-1;
      }
    }
    return -1;
  }

  static int aBsearch(int[] arr,int target){
    int start = 0;
    int end = arr.length-1;
    for (int i = 0; i < arr.length; i++) {
      int mid = start+(end-start)/2;
      if (arr[mid]==target) {
        return mid;
      }else if (target<arr[mid]) {
        end = mid-1;
      }else{
        start = mid+1;
      }
    }
    return -1;
  }
  
}
