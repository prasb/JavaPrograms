
public class ReverseNumber {
	 public static void main ( String args[]) {
		 int num = 123;
		 int reverse =0;
		 int reversenum =0;
		 while(num != 0){
			 
			reversenum = (reversenum * 10) + (reversenum + num%10);			
			num = num/10;
			System.out.println(num); 

			
		 } 
		System.out.println(reversenum); 
	 }
}

	 