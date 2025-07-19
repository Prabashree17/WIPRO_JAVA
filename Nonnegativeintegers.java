package Flowcontrol;

public class Nonnegativeintegers {

    // Method to check if two numbers have the same last digit
    public static boolean lastDigit(int a, int b) {
        return (a % 10) == (b % 10);
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(lastDigit(7, 17));   // true
        System.out.println(lastDigit(6, 17));   // false
        System.out.println(lastDigit(3, 113));  // true
    }
}
