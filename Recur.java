import java.util.*;
class Recur{

  static int facto(int n){
    if(n<1){
      return 1;
    }else{
      return n*facto(n-1);
    }
  }
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("enter a no");
    int num = in.nextInt();
      int res = facto(num);
      System.out.println("factorial of " +num+ " is " + res );
  }
}