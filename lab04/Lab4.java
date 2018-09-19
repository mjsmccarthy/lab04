import java.util.Arrays;
import java.util.Collections;

public class Lab4 {
    public static void main(String[] args) {
        Integer[] array1 = { 4, 2, 1, 3, 5 };
        Integer[] array2 = { 45,12,85,32,89,39,69,44,42,1,6,8 };
        Integer[] array3 = { 1, 2, 3, 4, 5};
        Integer[] array4 = { 5, 4, 3, 2, 1};
        Integer[] array5 = {1, 2, 7, 3, 1};
        Integer[] array6 = null;

        try {
	        System.out.println("Before Sorting:");
	        printArray(array1);
	        System.out.println("\nAfter Sorting:");
	        Integer[] x1 = sortArray(array1);
	        printArray(x1);
	        
	        System.out.println("\nBefore Sorting:");
	        printArray(array2);
	        System.out.println("\nAfter Sorting:");
	        Integer[] x2 = sortArray(array2);
	        printArray(x2);
	
	        System.out.println("\nBefore Sorting:");
	        printArray(array3);
	        System.out.println("\nAfter Sorting:");
	        Integer[] x3 = sortArray(array3);
	        printArray(x3);
	
	        System.out.println("\nBefore Sorting:");
	        printArray(array4);
	        System.out.println("\nAfter Sorting:");
	        Integer[] x4 = sortArray(array4);
	        printArray(x4);
	
	        System.out.println("\nBefore Sorting:");
	        printArray(array5);
	        System.out.println("\nAfter Sorting:");
	        Integer[] x5 = sortArray(array5);
	        printArray(x5);
	
	        System.out.println("\nBefore Sorting:");
	        printArray(array6);
	        System.out.println("\nAfter Sorting:");
	        Integer[] x6 = sortArray(array6);
	        printArray(x6);
        }
        
        catch (NullPointerException e) {
        	System.out.println("Array cannot be null");
        }
        
        

    }

    public static <T> void printArray(T[] anArray) {
    	if (anArray == null) {
    		throw new NullPointerException("Array cannot be null");
    	}
        for (T ele: anArray) {
            System.out.println(ele);
        }
    }

    public static Integer[] sortArray (Integer[] anArray) throws IllegalArgumentException{
        Integer[] newArray = Arrays.copyOf(anArray, anArray.length);
        Arrays.sort(newArray, Collections.reverseOrder());
        return newArray;
    }
}