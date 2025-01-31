package Lab13;

import java.util.Random;
import java.util.Scanner;

public class Lab13task1 {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100); 
        }

        System.out.println("Generated array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter the index of the array: ");
            int index = scanner.nextInt();

            System.out.println("Value at index " + index + ": " + array[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Out of Bounds.");
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter an integer.");
        }
    }
}
