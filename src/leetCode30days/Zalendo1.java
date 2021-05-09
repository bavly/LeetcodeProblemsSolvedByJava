package leetCode30days;

public class Zalendo1 {

    public static void main(String[] args) {
		//System.out.println(backspaceCompare("y#f#o##f", "y#f#o##f"));
         System.out.println( "We test coders. Give us a try?");
         solution("Forget  CVs..Save time . x x");
	}

  public static int solution(String S) {

    // write your code in Java SE 8
    String temp ="";
    String[] arrOfString;
    int max = 0;
    int res = 0 ; 
    int counterSpace = 0;
    boolean check = false;
    for (int i = 0; i < S.length(); i++)
    {
      if (check == true && S.charAt(i) == ' ')
      {
          counterSpace++;
          res = counterSpace;
          if (res > max)
          max = res;
          continue;
      }
      else
      {
        counterSpace = 0;
      }
        if (S.charAt(i) == '?' || S.charAt(i) == '.' || S.charAt(i) == '!' )
        {
            check = true;
            arrOfString = temp.split(" ", 0);
            res = 0;
            for (int j = 0; j < arrOfString.length; j++ )
            {
                if(arrOfString[j].equals(""))
                {
                  continue;
                }
                else {
                  res ++;
                }

            }
            if (res > max)
                max = res;

            temp = ""; 
        }
        else
        {
          check = false;
          temp = temp + S.charAt(i); 
        }

    }

    return max;
}
    
}
