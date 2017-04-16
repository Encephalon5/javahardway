import java.util.Scanner;

public class RudeQuestions {
   public static void main( String[] args) {
    String name, programming;
    int age;
    double weight, income;

    Scanner keyboard = new Scanner(System.in);

    System.out.print( "Hello. What is your name?");
    name = keyboard.next();

    System.out.print( "Hi, " + name + "! How old are you?");
    age = keyboard.nextInt();

    System.out.println( "So you're " + age + ", eh? that's not very old.");
    System.out.print( "How much do you weigh, " + name + "? " );
    weight = keyboard.nextDouble();

    System.out.println( weight + "! Better keep that quiet!!" );
    System.out.print("Finally, what's your income, " + name + "? " );
    income = keyboard.nextDouble();

    System.out.print( "Hopefully that is " + income + " per hour" );
    System.out.println( " And not per year!" );
    System.out.print( "Well, thanks for answering my rude questions, " );
    System.out.println( name + ".");

    System.out.print( "Here's another question, a bit less rude... Do you like programming?" );
    programming = keyboard.next();
    System.out.print( "So, " + programming + "?");
    System.out.println( "I'm glad to hear it!");
   }
}
