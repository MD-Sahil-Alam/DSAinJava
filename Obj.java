class student{
  String name;
  double marks;
  int roll;
   static String sayhii(String n){
    return "hii "+n;
   };
};

class car{
  String cname;
  int model;
}

public class Obj{
  public static void main(String[] args){
  student s1 = new student();
    s1.name = "sahil";
    s1.marks = 87.88;
    s1.roll = 28;
    System.out.println (student.sayhii(s1.name)+"\ns1 data is\n" + s1.name + " \n"+ s1.marks + " \n"+ s1.roll);

  student s2 = new student();
    s2.name = "asad";
    s2.marks = 89.99;
    s2.roll = 46;
    System.out.println (student.sayhii(s2.name)+"s2 data \n" + s2.name + " \n"+ s2.marks + " \n"+ s2.roll);

  car c1 = new car();
    c1.cname = "audi";
    c1.model = 6;
    System.err.println("\ncar name c1 =\n"+c1.cname + "\nmodel= "+ c1.model);
  }
}