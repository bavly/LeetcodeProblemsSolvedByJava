package leetCode30days;

import java.util.HashMap;
import java.util.Map;

public class ContiguousArray {

    public static void main(String[] args) {
		int[] arr = {2,7,4,1,8,1};
		System.out.println(findMaxLength(arr));
    }

    public static int findMaxLength(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int maxlen = 0, count = 0;
        for (int i = 0; i < nums.length; i++) {
            count = count + (nums[i] == 1 ? 1 : -1);
            if (map.containsKey(count)) {
                maxlen = Math.max(maxlen, i - map.get(count));
            } else {
                map.put(count, i);
            }
        }
        return maxlen;
        
    }
    
}