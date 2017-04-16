import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;
public class CaesarCipher {
  /**
   *Returns the character shifted by the given number of letters.
  */
  public static char shiftLetter( char c, int n ) {
    int u = c;

    if ( ! Character.isLetter(c) )
        return c;

    u = u + n;
    if ( Character.isUpperCase(c) && u > 'Z'
      || Character.isLowerCase(c) && u > 'z' ) {
        u -= 26;
    }
    if ( Character.isUpperCase(c) && u < 'A'
      || Character.isLowerCase(c) && u < 'a' ) {
        u -= 26;
    }
    return (char)u;
  }


  public static void main( String[] args ) throws Exception {
    PrintWriter fileout = new PrintWriter("cipherout.txt");
    Scanner fileIn = new Scanner(new File("cipherin.txt"));
    Scanner keyboard = new Scanner(System.in);
    String input, cipher = "";
    int shift;

    System.out.println("Getting information from file...");
    input = fileIn.nextLine();
    fileIn.close();
    System.out.print("Shift (0-26): ");
    shift = keyboard.nextInt();

    for ( int i=0; i<input.length(); i++ ) {
        cipher += shiftLetter( input.charAt(i), shift );
    }
    fileout.println( cipher );
    fileout.close();
  }
}
