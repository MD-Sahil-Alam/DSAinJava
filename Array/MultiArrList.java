package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiArrList{
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

   ArrayList<ArrayList<Integer>>list = new ArrayList<>();
   
   //initalization
   for (int i = 0; i < 3; i++) {
    list.add(new ArrayList<>());
   }

   //add elemint
   for (int i = 0; i < 3; i++) {
    list.get(i).add(in.nextInt());
   }

    System.out.println(list);
  }
}