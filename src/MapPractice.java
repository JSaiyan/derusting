import java.util.HashMap;
import java.util.Map;

public class MapPractice {
  public static void main(String[] args) 
  {
    // Create a HashMap with String keys and Integer values and
      Map<String, Integer> carMap = new HashMap<>(); 


    // assign it to a variable of type Map
   


    // Put 3 different key/value pairs in the Map
    // (it's OK to do this one-by-one)
    carMap.put("Honda", 1);
    carMap.put("Ford", 2);
    carMap.put("Chevy", 3);
    carMap.put("Lexus", 4);

    // Get the value associated with a given key in the Map
    int car = carMap.get("Honda");
    System.out.println(car);

    // Find the size (number of key/value pairs) of the Map
      int car1 = carMap.size();
      System.out.println(car1);


    // Replace the value associated with a given key (the size of the Map shoukld not change)
    carMap.put("Honda", 3);
    System.out.println(carMap.get("Honda"));

    // Check whether the Map contains a given key
    boolean containsCar = carMap.containsKey("Honda");
    System.out.println(containsCar);

    // Check whether the Map contains a given value
    boolean containsValue1 = carMap.containsValue(2);
    System.out.println(containsValue1);


    // Iterate over the keys of the Map, printing each key
    for (String key : carMap.keySet())
    {
      System.out.println(key);
    }

    // Iterate over the values of the map, printing each value
    for (Integer value : carMap.values())
    {
      System.out.println(value);
    }

    // Iterate over the entries in the map, printing each key and value
    for(String key : carMap.keySet())
    {
      System.out.println(key + " " + carMap.get(key));
    }


    /*
     * Usage tip!
     * 
     * Maps are great when you want a specific key to value mapping.
     * Example: The key could be a person's name, and the value could be their phone number
     * 
     * However if your keys are simple ascending 0-indexed integers with no gaps
     * (0, 1, 2, 3, 4...) then an array or List is likely a better choice.
     * Example: If you want to store the order of songs in a playlist.
     * 
     * If you're finding that you're just wanting to store unordered values and the keys
     * are unimportant, a Set may be a better choice.
     * Example: If you want to hold the student ID numbers of everyone in a course,
     * and you don't care about any ordering.
     */
  }
}
