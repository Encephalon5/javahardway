import java.util.Scanner;

public class BMICalculatorStudy {
  public static void main( String[] args ) {
    Scanner keyboard = new Scanner(System.in);
    double in, lb, kg, m, bmi;

    System.out.print( "Your height in in: ");
    in = keyboard.nextDouble();

    System.out.print( "Your weight in lb: ");
    lb = keyboard.nextDouble();

    m = (in/39.370);
    kg = (lb*.453);

     bmi = kg / (m*m);

    System.out.println( "Your BMI is " + bmi);
  }
}
