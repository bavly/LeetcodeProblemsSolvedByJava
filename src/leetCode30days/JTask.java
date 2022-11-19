package leetCode30days;

import java.util.ArrayList;
import java.util.List;

public class JTask {
    public static void main(String[] args) {
		//System.out.println(backspaceCompare("y#f#o##f", "y#f#o##f"));
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(3);
        list.add(5);
        int res = countPairs(list, 2);
        System.out.println(res);
        int result = changeAds(30);
        System.out.println(result);
	}

    public static int countPairs(List<Integer> projectCosts, int target) {
        List<Integer> data = new ArrayList<Integer>();
        int mainresult = 0;
        for (int i = 0 ; i < projectCosts.size() ; i++)
        {
            int value = projectCosts.get(i) - target;
            int result = Math.abs(value);
            int check = projectCosts.indexOf(result);
            if (check == -1 && check != i)
            {
                continue;
            }
            if (!data.contains(check))
            {
                data.add(check);
                mainresult++;
            }
            
        }
        return mainresult;
    }

    public static int changeAds(int base10) {
        String x = (Integer.toBinaryString(base10)).toString();
        String result = ""; 
        for(int i = 0 ; i<x.length() ; i++)
        {
            if (x.charAt(i) == '1' )
                result += "0";
            if (x.charAt(i) == '0'  )
                result+= "1";
        }
        int decimal =Integer.parseInt(result,2);  
        return decimal;
    }

}
