package Array;
import java.util.Scanner;
public class Numbercheck {

		    public static void main(String[] args) {
		        int[] numbers = {1, 4, 34, 56, 7};  // Initialized array

		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter the number to search: ");
		        int search = scanner.nextInt();

		        int index = -1;

		        for (int i = 0; i < numbers.length; i++) {
		            if (numbers[i] == search) {
		                index = i;
		                break;
		            }
		        }

		        System.out.println(index);

		        scanner.close();
		    }
		}

	


