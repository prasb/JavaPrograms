
public class ReverseString {
	public static void main ( String args[]) {
		String torev = "test";
		System.out.println(torev.length());
		String rev ="";
		
		System.out.println(torev.charAt(3));
		for( int i=torev.length()-1; i>=0 ;i--){
			rev = rev + torev.charAt(i);
			System.out.println(rev);

			System.out.println(i);
		}
		System.out.println(rev);
	}
	

}
