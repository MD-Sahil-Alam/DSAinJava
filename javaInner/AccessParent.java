package javaInner;
class Out{
  int a = 10;
  class inner{
    int b = 20;
    public int getFromParent(){
      // One advantage of inner classes, is that they can access attributes and methods of the outer class:
      return a;
    }
  }
}

public class AccessParent {
  public static void main(String[] args) {
      Out myObj = new Out();
      Out.inner in = myObj.new inner();
      System.out.println(in.getFromParent());
  }
}
