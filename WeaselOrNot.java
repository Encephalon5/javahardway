import java.util.Scanner;

public class WeaselOrNot {
  public static void main( String[] args ) {
    Scanner keyboard = new Scanner(System.in);
    String word;
    boolean test, testa;

    System.out.println( "Type the world \"weasel\", please." );
    word = keyboard.next();

    test = "weasel".equals(word);
    testa = ! word.equals("weasel");

    System.out.println( "You typed what was requested: " + test );
    System.out.println( "You ignored polite instructions: " + testa );
  }
}
