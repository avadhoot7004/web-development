import java.util.Arrays;

public class arrays {
    public static void main(String[] args) {
        // Array declaration and initialization
        int[] numbers = {5, 3, 8, 6, 2};

        // Sum of array elements
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum of array elements: " + sum);

        // Sorting the array
        Arrays.sort(numbers);
        System.out.println("Sorted array: " + Arrays.toString(numbers));

        // Binary search
        int index = Arrays.binarySearch(numbers, 6);
        System.out.println("Index of 6: " + index);

        // String array manipulation
        String[] names = {"Avadhoot", "Kartik", "Aryan"};
        System.out.println("Original names: " + Arrays.toString(names));

        // Sorting string array
        Arrays.sort(names);
        System.out.println("Sorted names: " + Arrays.toString(names));
    }
}