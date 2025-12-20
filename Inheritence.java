class Parents{
  String lastName="alam";
  public void Hair(){
    System.out.println("Blond");
  }
}


class Child extends Parents{
  public static void main(String[]args){
    Child child1= new Child();
    System.out.println(child1.lastName);
    child1.Hair();
  }
}
