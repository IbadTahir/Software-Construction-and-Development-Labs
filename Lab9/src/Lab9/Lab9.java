package Lab9;

public class Lab9 {
    public static <T> void printArrayInReverse(T[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        System.out.println("Integer array in reverse:");
        printArrayInReverse(intArray);

        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        System.out.println("Double array in reverse:");
        printArrayInReverse(doubleArray);

        Character[] charArray = {'a', 'b', 'c', 'd', 'e'};
        System.out.println("Character array in reverse:");
        printArrayInReverse(charArray);
    }
}
