public class NumberPractice 
{
  public static void main(String args[]) 
  {
    // Create a float with a negative value and assign it to a variable
    float negativeValue = -1.0f;
    System.out.println(negativeValue);

    // Create an int with a positive value and assign it to a variable
    int value = 2;
    System.out.println(value);

    // Use the modulo % operator to find the remainder when the int is divided by 3
    int mod = value % 3;
    System.out.println(mod);

    if (value % 2 == 0)
    {
      System.out.println(value + "is even");
    }
    else
    {
      System.out.println(value + "is odd");
    }
         
    // Use the modulo % operator to determine whether the number is even
    // (A number is even if it has a remainder of zero when divided by 2)
    // Use an if-else to print "Even" if the number is even and "Odd"
    // if the number is odd.

    // Divide the number by another number using integer division
    int number = value / 2;
    System.out.println(number);


    /*
     * Reminder!
     * 
     * When dividing ints, the result is rounded down.
     * Example: 
     * 7 / 3 = 2 when performing int division
     */

  }
}
