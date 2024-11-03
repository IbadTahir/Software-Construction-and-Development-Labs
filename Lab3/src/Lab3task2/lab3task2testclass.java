package Lab3task2;
import java.util.Scanner;

public class lab3task2testclass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();

        System.out.print("Enter length of the rectangle: ");
        double length = scanner.nextDouble();
        rectangle.setLength(length);

        System.out.print("Enter width of the rectangle: ");
        double width = scanner.nextDouble();
        rectangle.setWidth(width);

        System.out.println("\n=========== RECTANGLE PROPERTIES ===========");
        System.out.println("Length: " + rectangle.getLength());
        System.out.println("Width: " + rectangle.getWidth());
        System.out.printf("Perimeter: %.2f\n", rectangle.calculatePerimeter());
        System.out.printf("Area: %.2f\n", rectangle.calculateArea());
        System.out.println("============================================");

        scanner.close();
    }
}
