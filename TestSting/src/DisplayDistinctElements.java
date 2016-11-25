/***
 * Display Distict Elements
 * @author prbalakr
 *
 */
public class DisplayDistinctElements {
	public static void main (String args[]) {
		int[] array = {2,4,3,5,1,34,25,2,3,4};
		int flag = 0;
		for (int i = 0; i < array.length; i++)
		{  
		    flag = 0;
		    for (int j = i + 1; j < array.length; j++)
		    {
		        if (array[i] == array[j])
		        {
		            flag = 1;
		        }
		    }

		    if (flag == 0)
		    {
		        System.out.println(array[i]);
		    }
		}
	}

}
