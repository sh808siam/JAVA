import java.util.Scanner;

class Addition{
 public static void main(String args[]){
  Scanner userInput = new Scanner(System.in);
  double fnum, snum, ans;
  System.out.println("Please enter First number: ");
  fnum = userInput.nextDouble();
  System.out.println("Please enter Second number: ");
  snum = userInput.nextDouble();
  ans = fnum + snum;
  System.out.println(ans);
 }
}