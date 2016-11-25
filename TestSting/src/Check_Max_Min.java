import java.util.Arrays;
import java.util.Scanner;

public class Check_Max_Min {
	public static void main(String args[]) {

		int numbers[] = new int[]{ 1,2,3,4,6,7,8 };

		int smallest = numbers[0];
		int largest = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] > largest) {
				largest = numbers[i];
			}
			else if (numbers[i] < smallest) {
				smallest = numbers[i];
			}
		}				
		int j =0;
		int[] arrnew = new int[largest];
		for (int i = smallest; i <= largest; i++) {	
			arrnew[j] = i;
			j++;			
		}		
		if (Arrays.equals(arrnew, numbers)) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
	}
}
