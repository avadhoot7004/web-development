public class main {
    public static void main(String[] args) {
        // Primitive data types
        byte byteValue = 10;
        short shortValue = 100;
        int intValue = 1000;
        long longValue = 100000L;
        float floatValue = 10.5f;
        double doubleValue = 100.99;
        char charValue = 'A';
        boolean booleanValue = true;

        // Non-primitive data type (String)
        String stringValue = "Hello Java!";

        // Array (Non-primitive type)
        int[] intArray = {1, 2, 3, 4, 5};

        // Output all data types
        System.out.println("Byte Value: " + byteValue);
        System.out.println("Short Value: " + shortValue);
        System.out.println("Int Value: " + intValue);
        System.out.println("Long Value: " + longValue);
        System.out.println("Float Value: " + floatValue);
        System.out.println("Double Value: " + doubleValue);
        System.out.println("Char Value: " + charValue);
        System.out.println("Boolean Value: " + booleanValue);
        System.out.println("String Value: " + stringValue);

        System.out.print("Array Values: ");
        for (int num : intArray) {
            System.out.print(num + " ");
        }
    }
}