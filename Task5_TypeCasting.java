
public class Task5_TypeCasting {
    public static void main(String[] args) {
        int intValue = 100;
        double doubleValue = intValue;
        System.out.println("Implicit Type Casting:");
        System.out.println("Before casting (int): " + intValue);
        System.out.println("After casting (double): " + doubleValue);
        double decimalValue = 45.78;
        int convertedValue = (int) decimalValue;
        System.out.println("\nExplicit Type Casting:");
        System.out.println("Before casting (double): " + decimalValue);
        System.out.println("After casting (int): " + convertedValue);
    }
}
