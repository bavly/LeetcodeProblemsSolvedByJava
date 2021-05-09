package leetCode30days;

import java.util.Stack;

public class BackspaceStringCompare {

	public static void main(String[] args) {
		//System.out.println(backspaceCompare("y#f#o##f", "y#f#o##f"));
         System.out.println(backspaceCompare2("ab#c", "ad#c"));
	}

	public static boolean backspaceCompare(String S, String T) {

		T.toLowerCase();
		S.toLowerCase();
		String resultS = "";
		String resultT = "";
		String resultNewS = "";
		String resultNewT = "";

		for (int i = 0; i < S.length(); i++) {
			
			if (S.charAt(i) == '#' && i != 0) {
				char remove = S.charAt(i - 1);
				String newString = Character.toString(remove);
				resultS = S.replaceFirst(newString, "");
				resultNewS = resultS.replaceFirst("#", "");
				//System.out.println(resultNewS);
				S = resultNewS;
				i = -1;

			}
			
			else if  (S.charAt(i) == '#' && i == 0) {
				String newS = S.replaceFirst("#", "");
				S = newS;
			}
			
			for (int j = 0; j < T.length(); j++) {
				
				if (T.charAt(j) == '#' && j != 0)
				{		
					char remove = T.charAt(j-1);
					String newStringT=Character.toString(remove);
					resultT = T.replaceFirst(newStringT , "");
					resultNewT = resultT.replaceFirst("#" , "");
					//System.out.println(resultNewT);
					T = resultNewT;
					j = -1;
				
				}
				
				else if  (T.charAt(j) == '#' && j == 0) {
					String newT = T.replaceFirst("#", "");
					 T = newT;
				}
				
				
				
			}
			
			

		}

	



		System.out.println(S);

		if (S.equals(T) == true)
			return true;

		else
			return false;

	}
	public static boolean backspaceCompare2(String A, String B) {
		
		
		Stack<Character> result_A = new Stack<>();
		String res_A = "";
		for (int i = 0; i < A.length(); i++)
		{
			
			if (A.charAt(i) == '#' && result_A.size()>0)
			{
				result_A.pop();
			}
			else if ( A.charAt(i)!='#')
				result_A.push(A.charAt(i));

		}
	
		if(!result_A.empty())
		{
			res_A = result_A.toString();
			//System.out.println(res_A);
			result_A.pop();
		}

		Stack<Character> result_B = new Stack<>();

		String res_B = "";
		for (int i = 0; i < B.length(); i++)
		{

			if (B.charAt(i) == '#' && result_B.size() > 0)
			{
				result_B.pop();
			}
			else if (B.charAt(i)!='#')
				result_B.push(B.charAt(i));

		}
		if(!result_B.empty())
		{
			res_B = result_B.toString();
			result_B.pop();
		}


		if (res_A.equals(res_B) == true)
			return true;
		else
			return false;


		
	}


}
