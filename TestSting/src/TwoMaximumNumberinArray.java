
public class TwoMaximumNumberinArray {

	public static void main (String args[]){
		int array[] = {2,4,6,23,54,55};
		array[0]=0;
		array[1]=0;
		int n=0;
		for(int arr : array){
				if(array[0] < arr){
					array[1] = array[0];
					array[0]=arr;
				}
				else if(array[1]< arr) {
					array[1] = arr;
				}
		}
		
		System.out.println(array[1]+"  "+array[0]);
	}
}
