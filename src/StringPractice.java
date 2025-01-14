import java.util.ArrayList;
import java.util.List;


public class StringPractice {
  public static void main(String[] args) {
    // Create a string with at least 5 characters and assign it to a variable
    String cars = "Honda";



    // Find the length of the string
    int carLength = cars.length();
    System.out.println(carLength);

    // Concatenate (add) two strings together and reassign the result
    cars = cars + "Accord";
    System.out.println(cars);

    // Find the value of the character at index 3
    char vehicle = cars.charAt(3);
    System.out.println(vehicle);

    // Check whether the string contains a given substring (i.e. does the string have "abc" in it?)
      boolean containsCars = cars.contains("Civic");
      System.out.println(containsCars);


    // Iterate over the characters of the string, printing each one on a separate line
    for (int i = 0; i < cars.length(); i++)
    {
      System.out.println(cars.charAt(i));
    }

    // Create an ArrayList of Strings and assign it to a variable
    List<String> carList = new ArrayList<>();

    // Add multiple strings to the List (OK to do one-by-one)
    carList.add("Lexus");
     carList.add("BMW");
      carList.add("Tesla");

    // Join all of the strings in the list together into a single string separated by commas
    // Use a built-in method to achieve this instead of using a loop
    String carString = carList.toString(); 
     System.out.println(carString);

    // Check whether two strings are equal
    boolean carEqual = cars.equals("Accord");
     System.out.println(carEqual);

    /*
     * Reminder!
     * 
     * When comparing objects in Java we typically want to use .equals, NOT ==.
     * 
     * We use == when comparing primitives (e.g. int or char).
     */
  }
}
