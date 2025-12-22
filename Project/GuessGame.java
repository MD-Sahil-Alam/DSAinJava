package Project;
import java.util.Scanner;

class GuessGame {
    public static void main(String[] args){ 
      Scanner in = new Scanner(System.in);
      
      boolean correct = false;
      int guess;
      int rand = (int)(Math.random()*100) + 5;

      while (correct == false) {
          System.out.println("guess");
          guess = in.nextInt();
        if (guess == rand) {
          System.out.println("Congract" +rand);
          correct = true;
        } else if (rand > guess) {
          System.out.println("your guess is smaller than correct number");
        }else {
          System.out.println("your guess is heigher than correct number");
        }
      }
    in.close();
    }
}
