package Array;
import java.util.Arrays;
public class Evenoddarrange {

	public static void main(String[] args) {
		
		        int[] arr = {1, 0, 1, 0, 0, 1, 1};  // You can change input here

		        int[] result = new int[arr.length];
		        int start = 0;
		        int end = arr.length - 1;

		        for (int num : arr) {
		            if (num % 2 == 0) {
		                result[start++] = num;  // Place even numbers at the start
		            } else {
		                result[end--] = num;    // Place odd numbers at the end
		            }
		        }

		        // Optional: reverse the odd part to maintain stable order if needed
		        System.out.println("Rearranged array: " + Arrays.toString(result));
		    }
		}

