public class ArrayPractice {
  public static void main(String[] args) 
  {
    // Create an array of Strings of size 4
    String[] array = new String[4]; 

    // Set the value of the array at each index to be a different String
    array[0] = "Honda";
    array[1] = "Ford";
    array[2] = "Toyota";
    array[3] = "Chevy";

    // It's OK to do this one-by-one


    // Get the value of the array at index 2
    String value = array[2];
    System.out.println(value);

    // Get the length of the array
    int arrayLength = array.length;
    System.out.println(arrayLength);

    // Iterate over the array using a traditional for loop and print out each item

    for(int i = 0; i < array.length; i++)
      System.out.println(array[i]);


    // Iterate over the array using a for-each loop and print out each item
    for(String cars : array)
    {
      System.out.println(cars);
    }

    /*
     * Reminder!
     * 
     * Arrays start at index 0
     */
  }
}
//compiling is javac src/"filename"
//running is -cp src "Name of file"