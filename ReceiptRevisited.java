import java.io.PrintWriter;
import java.util.Scanner;
public class ReceiptRevisited {
  public static void main( String[]args ) throws Exception {
    PrintWriter fileout = new PrintWriter("receipt.txt");
    Scanner keyboard = new Scanner(System.in);
    double pG, nG, net, tax;

    System.out.print("How many gallons did you purchase? > ");
    nG = keyboard.nextDouble();

    System.out.print("What was the cost per gallon? > ");
    pG = keyboard.nextDouble();

    tax = 1.06;
    net = (nG * pG) * tax;

    fileout.println( "+------------------------+" );
    fileout.println( "                        " );
    fileout.println( "      CORNER STORE      " );
    fileout.println( "                        " );
    fileout.println( " 2014-06-25    4:38PM   " );
    fileout.println( "                        " );
    fileout.println( " Gallons: " + nG + "    " );
    fileout.println( " Price/Gallon: $ "+pG+" " );
    fileout.println( "                        " );
    fileout.println( " Fuel total: " +net+ "  " );
    fileout.println( "                        " );
    fileout.println( "+------------------------+" );
    fileout.close();
  }
}
