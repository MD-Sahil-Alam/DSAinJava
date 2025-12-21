package Abstraction;
abstract class Human{
  public void Hsound(){
    System.out.println("AAHHhhhh");
  }
  abstract void Sound();
} 

class Child extends Human{
  public void Sound(){
    System.out.println("ZZzzz");
  }
}

public class Abs {
  public static void main(String[] args) {
      Child c1 = new Child();
      c1.Sound();
      c1.Hsound();
  }
  
}
