import java.util.Arrays;

public class Lab4 {
    public static void main(String[] args) {
        Integer[] array1 = { 4, 2, 1, 3, 5 };
        Integer[] array2 = { 45,12,85,32,89,39,69,44,42,1,6,8 };
        String[] array3 = { "John", "Matt", "Kelsey", "Laura"};
        Character[] array4 = { 'H', 'A', 'B', 'E', 'D', 'C'};
        Double[] array5 = {1.1, 2.1, 0.7, 3.4, 1.5};

        printArray(array1);
        sortArray(array1);

        printArray(array2);
        sortArray(array2);

        printArray(array3);
        sortArray(array3);

        printArray(array4);
        sortArray(array4);

        printArray(array5);
        sortArray(array5);

    }

    public static <T> void printArray(T[] anArray) {
        System.out.println("\nArray before sorting:");
        for (T ele: anArray) {
            System.out.println(ele);
        }
    }

    public static <T> void sortArray (T[] anArray) {
        Arrays.sort(anArray);
        System.out.println("\nArray after sorting:");
        for (T ele: anArray) {
            System.out.println(ele);
        }
    }
}