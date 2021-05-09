package leetCode30days;

import java.util.HashMap;
import java.util.Map;

public class hashMap<charachter> {

	public static void main(String[] args) {
		//Input: J = "aA", S = "aAAbbbb"
		//Output: 3

		System.out.println("tet");
	}

	public int numJewelsInStones(String j, String S) {
		
		Map <Character , Boolean> hm = new HashMap <Character,Boolean>();
		
		for (int i=0 ; i< j.length() ; i++)
		{
			hm.put(j.charAt(i), true);
		}
		
		int counter = 0;
		
		for (int i=0 ; i< S.length() ; i++)
		{
			if (hm.containsKey(S.charAt(i)))
				counter++;	
		}
		
		
		return counter;

	}

}
