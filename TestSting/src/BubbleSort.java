
public class BubbleSort {
	public static void main (String args[]) {
		int swap=0;
		int arr[] = { 15,6,1,2,45,34,21};
		for ( int i =0 ;i < arr.length; i++){
			for (int j=0; j<arr.length-i-1;j++) {
				if(arr[j] > arr[j+1]) {
					    swap=arr[j];
					    arr[j]=arr[j+1];
					    arr[j+1]=swap; 
				}
			}
		}
				for ( int i =0 ;i < arr.length; i++){
			System.out.println(arr[i]);
		}
	}

}
