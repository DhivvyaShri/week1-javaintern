
import java.util.Scanner;

public class Task6_CastingPractice {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int intValue = sc.nextInt();

        System.out.print("Enter a float value: ");
        float floatValue = sc.nextFloat();

        System.out.print("Enter a double value: ");
        double doubleValue = sc.nextDouble();

        System.out.println("\n----- Original Values -----");
        System.out.println("Integer: " + intValue);
        System.out.println("Float: " + floatValue);
        System.out.println("Double: " + doubleValue);

        double intToDouble = intValue;

        double floatToDouble = floatValue;

        int doubleToInt = (int) doubleValue;

        float doubleToFloat = (float) doubleValue;

        System.out.println("\n----- After Type Casting -----");
        System.out.println("Int to Double: " + intToDouble);
        System.out.println("Float to Double: " + floatToDouble);
        System.out.println("Double to Int: " + doubleToInt);
        System.out.println("Double to Float: " + doubleToFloat);

        sc.close();
    }
}
