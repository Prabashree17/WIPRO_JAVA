package Array;

public class Biggestnum {

	public static void main(String[] args) {
		        // Check if exactly 9 arguments are passed
		        if (args.length != 9) {
		            System.out.println("Please enter 9 integer numbers");
		            return;
		        }

		        int[][] arr = new int[3][3];
		        int index = 0;
		        int max = Integer.MIN_VALUE;

		        System.out.print("The given array is : ");
		        for (int i = 0; i < 3; i++) {
		            for (int j = 0; j < 3; j++) {
		                int num = Integer.parseInt(args[index]);
		                arr[i][j] = num;
		                System.out.print(num + " ");
		                if (num > max) {
		                    max = num;
		                }
		                index++;
		            }
		        }

		        System.out.println();
		        System.out.println("The biggest number in the given array is " + max);
		    }
		}

	


