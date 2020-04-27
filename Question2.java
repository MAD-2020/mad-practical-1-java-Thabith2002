import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    System.out.print("Please enter your weight in kg: ");
    double weight = in.nextDouble();
    System.out.print("Please enter your height in cm: ");
    double height = in.nextDouble();

     // multiplication by 100*100 for cm to m conversion
    double bmi = (100*100*weight)/(height*height);
         
    System.out.println("Your BMI is: "+bmi);   
  }
}
