package Flowcontrol;
import java.util.Scanner;

public class Reversenumber {

	public static void main(String[] args) {

		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter a number: ");
		        int number = scanner.nextInt();
		        int originalNumber = number;

		        int reverse = 0;

		        while (number != 0) {
		            int digit = number % 10;         // Get last digit
		            reverse = reverse * 10 + digit;  // Build reversed number
		            number /= 10;                    // Remove last digit
		        }

		        System.out.println("Reversed number of " + originalNumber + " is: " + reverse);

		        scanner.close();
		    }
		}

	


