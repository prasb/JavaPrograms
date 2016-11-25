/**
 * You are given an array of numbers. Find out the array index or position where sum of numbers preceeding the index is equals to sum of numbers succeeding the index. - 
 * See more at: http://www.java2novice.com/java-interview-programs/find-middle-index/#sthash.nj0qStIQ.dpuf
 * @author prbalakr
 *
 */
public class FindMiddleIndex {
	public static void main(String args[]) {
		int intArr[] = {1,2,4,5,6,7,8,8,1,2,4,5,6,7,8};
		int sumTillIndex =0;

		for(int i=0; i < intArr.length; i ++){
			if(i>0){//avoid first case
				sumTillIndex += intArr[i-1];//we get the some till index from first loop
			}
			int sumAfterIndex=0;//this has to be initialized for each outter loop
			for(int j=i+1; j< intArr.length;j++){
				sumAfterIndex += intArr[j]; 
			}
			if(sumTillIndex == sumAfterIndex){
				System.out.println("Found an Index: "+i);
			}
		}
	}

}
