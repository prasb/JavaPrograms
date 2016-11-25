
public class ConvertDecimaNumberToBinary {
	public static void main (String args[]){
		int[] binary = new int[25];
		int decimal = 25;
		int temp =0;
		while (decimal!=0) {
			int remainder = decimal%2;
		//	System.out.println(temp);

			binary[temp] = remainder;
			decimal = decimal/2; 	
			System.out.println("The output is binary["+temp+"]"+" "+remainder);

			temp++;	
						
		}
		
		System.out.println(temp);
		
		for(int i=temp-1;i>=0;i--){
			System.out.print(binary[i]);
		}
	}

}
