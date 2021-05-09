package leetCode30days;

import java.util.HashMap;
import java.util.Map;

public class ContinuousSubarraySum {

    public static void main(String[] args) {
        int[] arr = {2,7,4,1,8,1};
        int k = 6;
        // problem here 
        //https://leetcode.com/problems/continuous-subarray-sum/
		System.out.println(checkSubarraySum(arr, k));
    }

    public static boolean checkSubarraySum(int[] nums, int k) {
        Map <Integer, Integer> hm = new HashMap<>();
        hm.put(0, -1);
        for (int i =0 ; i < nums.length ; i++)
        {
            int sum = 0 ;
            sum += nums[i];
            if (k!= 0)
                sum = sum % k;
            if (hm.containsKey(sum))
            {
                int lastIx = hm.get(sum);
                if(i - lastIx > 1) 
                    return true; // 2 elemeents
            }
            else
            {
                hm.put(sum, i);
            }
            
        }
        return false;
    }



    
}
