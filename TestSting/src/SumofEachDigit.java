/**
 * Below example shows how to find out sum of each digit in the given number using recursion logic. For example, if the number is 259, then the sum should be 2+5+9 = 16. - 
 * See more at: http://www.java2novice.com/java-interview-programs/number-sum-recursive/#sthash.zBtT4VHj.dpuf
 * @author prbalakr
 *
 */
public class SumofEachDigit {
	public static void main (String args[]){
		int number = 999;
		int sum =0;
		 while (number > 0) {
			 sum = sum + number%10;
			 number = number/10;
			 System.out.println(number);
		 }
		 
		 System.out.println(sum);
	}

}
