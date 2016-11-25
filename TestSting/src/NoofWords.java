import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;


public class NoofWords {
	public static void main (String args []) throws IOException {
		InputStream is = new FileInputStream("D://Test.txt");
		BufferedReader buf = new BufferedReader(new InputStreamReader(is));
		String line = buf.readLine(); 
		StringBuilder sb = new StringBuilder(); 
		while(line != null)
		{
			
		sb.append(line).append("\n"); 
		line = buf.readLine();
		} 
		String fileAsString = sb.toString();
	//	System.out.println("Contents : " + fileAsString);
		StringTokenizer token = new StringTokenizer(fileAsString," ");
		
		ArrayList<String> list = new ArrayList<String>();
		ArrayList<String> repitive = new ArrayList<String>();

		int i=0;
		while (token.hasMoreElements()) {
			
			list.add(i,token.nextToken() );
			i++;
			//System.out.println(token.nextToken());
		}
	
		for( int k=0;k<list.size();k++){
			int temp =0;
			String val=null;
			for( int a = 0; a < list.size();a++){
				if (list.get(k).equals(list.get(a))){
					temp++;
					val = list.get(k).toString();
				}			
			}
			repitive.add(val + " => "+temp);
		}
	
		System.out.println(repitive);
		
	}

}
