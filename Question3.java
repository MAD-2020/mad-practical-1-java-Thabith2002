import java.util.Scanner;

public class Question3
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter integer: ");
    int num = in.nextInt();
    
    // Closing Scanner after the use
    in.close();

    // Calculating product of two numbers
    int product = num*num;

    // Displaying the multiplication result
    System.out.println("Output: "+product);
}
}
