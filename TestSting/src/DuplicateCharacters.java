import java.util.HashMap;
import java.util.Map;


public class DuplicateCharacters {
	public static void main (String args[]) {
		String duplicate = "abcdefaf";
		char array[] = new char[duplicate.length()-1];
		array = duplicate.toCharArray();
		Map<Character,Integer> dup = new HashMap<Character,Integer>();
		
		for ( Character ch : array) {	
			if(dup.containsKey(ch)) {
				dup.put(ch, dup.get(ch)+1);
			}
			else {
				dup.put(ch, 1);
			}			
			}
		for(Map.Entry<Character, Integer> entryset : dup.entrySet()) {
			if(entryset.getValue()>1){
			System.out.println(entryset.getKey()+"=> "+entryset.getValue());
			}
		}
		}
}

