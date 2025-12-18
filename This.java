public class This {
  int model;
  String name;
  //custructor
  public This(String name,int model){
    this.name = name;
    this.model = model;
   }

   public static void main(String[] args) {
       This c1 = new This("audi",53);
       System.out.println(c1.name+c1.model);
   }
}
