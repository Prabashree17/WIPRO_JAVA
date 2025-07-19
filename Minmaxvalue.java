package Array;

public class Minmaxvalue {

		    public static void main(String[] args) {
		        int[] numbers = {45, 12, 67, 3, 89, 21, 5};  // Initialize the array

		        int max = numbers[0];
		        int min = numbers[0];

		        for (int i = 1; i < numbers.length; i++) {
		            if (numbers[i] > max) {
		                max = numbers[i];
		            }
		            if (numbers[i] < min) {
		                min = numbers[i];
		            }
		        }

		        System.out.println("Maximum value in the array: " + max);
		        System.out.println("Minimum value in the array: " + min);
		    }
		}
