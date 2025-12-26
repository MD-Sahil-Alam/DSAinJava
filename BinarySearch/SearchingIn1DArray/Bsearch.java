package BinarySearch.SearchingIn1DArray;

public class Bsearch {
  public static void main(String[] args) {
    int[] arr = {-10,-3,-2,1,2,4,6,8,9,11,12,14,16,20,22};
    int target =11; 
    System.out.println(search(arr,target));
    
  }
  static int search(int[] arr,int target){
    int start = 0;
    int end = arr.length-1;
    for (int i = 0; i < arr.length; i++) {
      // int mid = (start+end)/2;
      // (start+end)/2; may exceed range of intiger
      // start+(end-start)/2; better way to find mid 
      int mid = start+(end-start)/2;
      if(arr[mid]==target){
        return mid;
      }else if(target < arr[mid]){
        end = mid-1;
      }else{
        start = mid+1;
      }
    }
    return -1;
  }
}
