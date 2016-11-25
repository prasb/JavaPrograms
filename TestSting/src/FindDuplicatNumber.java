import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * You have got a range of numbers between 1 to N, where one of the number is repeated.
 *  You need to write a program to find out the duplicate number. -
 *  See more at: http://www.java2novice.com/java-interview-programs/duplicate-number/#sthash.0jVOQleu.dpuf
 * @author prbalakr
 *
 */

public class FindDuplicatNumber {
	public static void main ( String args []) {
		int[] array = { 2,3,4,6,4,1,3,5,5};
		Set<Integer> intset = new HashSet<Integer>();
		for ( int i=0; i < array.length;i++) {
			int k =0;

			for (int j =0; j < array.length;j++){
				if ( array[j] == array[i] ) {
					k++;
					if(k>=2){
						intset.add(array[j]);						
					}
					
				}
			}
		}
		Iterator t1 =  intset.iterator();
          while (t1.hasNext()){
        	  System.out.println(t1.next());
          }
	}
	
		
}

	