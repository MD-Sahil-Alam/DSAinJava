package BinarySearch;

public class FloorOfNoWileLoop {
  public static void main(String[] args) {
    int[] arr =  {-10,-3,-2,1,2,4,8,9,11,12,14,16,20,22};
    int target = 21; 
    System.out.println(floor(arr,target));
  }
  static int floor(int[] arr , int target){
    int start = 0;
    int end = arr.length-1;
    while(start<=end){
      int mid = start+(end-start)/2;
      if (arr[mid]==target) {
        return mid;
      }else if(target<arr[mid]){
        end = mid-1;
      }else{
        start = mid+1;
      }
    } 
    return end;
  }
}
