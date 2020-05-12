import java.util.*;

public class sorting {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>(); // making an arrayList
        Random rand = new Random(); // calling Random Function

        // using For Loop
        for (int j = 0; j < 100; j++) {
            int randomNumber = rand.nextInt(100);
            numbers.add(randomNumber);
        }

        // Print out Numbers
        System.out.println("100 Random Numbers: " + numbers);

        // Sort the numbers.
        // The sort method iterates through the loop and compares items to one another.
        Collections.sort(numbers);
        System.out.println("Ascending numbers: " + numbers);

        // Second Sort Method
        // This method sorts items in descending order.
        Collections.sort(numbers, Collections.reverseOrder());
        System.out.println("Descending numbers: " + numbers);
    }
}