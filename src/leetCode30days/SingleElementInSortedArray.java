package leetCode30days;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class SingleElementInSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int singleNonDuplicate(int[] nums) {

		Map<Integer, Integer> map = new HashMap<>();
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(nums[i])) {
				count = map.get(nums[i]);
				map.put(nums[i], count + 1);
			} else
				map.put(nums[i], 1);

		}

		for (Entry<Integer, Integer> entry : map.entrySet()) {
			// if frequency is more than 1
			// print the element
			if (entry.getValue() == 1)
				return entry.getKey();
		}

		return -1;

	}
}