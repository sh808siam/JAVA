import java.util.Scanner;

public class index_Char_Ascii{
  public static void main(String args[]){
    System.out.print("Enter your content:");
    Scanner hold = new Scanner(System.in);
    String var = hold.nextLine();
    for (int i = 0; i < var.length(); i++){
      System.out.println("| Index--> "+i+" | Character--> "+var.charAt(i)+" | ASCII--> "+var.codePointAt(i)+" |");
    }
  }
}