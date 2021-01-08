import java.util.Scanner;
class Main {
  public static void main(String [] args) {
    while(true) {
      System.out.print("Enter an improper fraction: ");
      Scanner in = new Scanner(System.in);
      int firstnum = in.nextInt();
      String fill = in.next();
      int denominator = in.nextInt();

      int wholenumber = firstnum / denominator;
      int remainder = firstnum % denominator;
    
      System.out.println("The mixed number is: " + wholenumber + " " + remainder + "/" + denominator);
    }
  }
}