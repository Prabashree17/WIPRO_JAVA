package Array;
import java.util.LinkedHashSet;
import java.util.Set;

public class Removeduplicates {
       	    public static void main(String[] args) {
		        int[] arr = {12, 34, 12, 45, 67, 89};

		        // Use LinkedHashSet to maintain insertion order and remove duplicates
		        Set<Integer> uniqueSet = new LinkedHashSet<>();

		        for (int num : arr) {
		            uniqueSet.add(num);
		        }

		        // Print the result
		        System.out.print("Array after removing duplicates: {");
		        int i = 0;
		        for (int num : uniqueSet) {
		            System.out.print(num);
		            if (++i < uniqueSet.size()) {
		                System.out.print(", ");
		            }
		        }
		        System.out.println("}");
		    }
		}
