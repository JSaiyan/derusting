import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class ListPractice {


  public static void main(String[] args) 
  {
    // Create an empty ArrayList of Strings and assign it to a variable of type List
    List<String> cars = new ArrayList<>();

    // Add 3 elements to the list (OK to do one-by-one)
    cars.add("Honda");
    cars.add("Toyota");
    cars.add("Chevy");

    // Print the element at index 1
    System.out.println(cars.get(1));


    // Replace the element at index 1 with a new value
    cars.set(1, "Tesla"); //integer for the index and string 
    System.out.println(cars.get(1));


    // (Do not insert a new value. The length of the list should not change)


    // Insert a new element at index 0 (the length of the list will change)
    cars.add(0, "BMW"); 
    System.out.println(cars.get(0));

    // Check whether the list contains a certain string
    boolean containsCars = cars.contains("BMW");
    System.out.println(containsCars);

    // Iterate over the list using a traditional for-loop.
    for (int i = 0; i < cars.size(); i++)
    System.out.println(cars.get(i));

    // Print each index and value on a separate line
     for (int i = 0; i < cars.size(); i++)
    System.out.println(i + cars.get(i));

    // Sort the list using the Collections library
    Collections.sort(cars);
    System.out.println(cars);

    // Iterate over the list using a for-each loop

    for(String cars1: cars)
    {
      System.out.println();
       System.out.println(cars1);
    }


    // Print each value on a second line


    /*
     * Usage tip!
     * 
     * Use a traditional for-loop when you need to use the index or you need to iterate in an
     * unconventional order (e.g. backwards)
     * 
     * Otherwise, if you're iterating the in the conventional order and don't need the
     * index values a for-each loop is cleaner.
     */
  }
}