package Flowcontrol;
import java.util.Scanner;

public class Sumofalldigits {

	public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter a number: ");
		        int number = scanner.nextInt();
		        int originalNumber = number;

		        int sum = 0;

		        // Make sure to handle negative numbers too
		        number = Math.abs(number);

		        while (number > 0) {
		            int digit = number % 10;   // Extract last digit
		            sum += digit;              // Add it to sum
		            number /= 10;              // Remove last digit
		        }

		        System.out.println("Sum of digits of " + originalNumber + " is: " + sum);

		        scanner.close();
		    }
		}


	


