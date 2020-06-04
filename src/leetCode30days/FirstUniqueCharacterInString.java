package leetCode30days;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacterInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Te");

	}

	public int firstUniqCharSecond(String s) {

		if (s == null || s.length() == 0) {
			return -1;
		}
		Map<Character, Integer> hm = new HashMap<>();
		for (char i : s.toCharArray()) {
			if (!hm.containsKey(i)) {
				hm.put(i, 1);
			} else {
				hm.put(i, hm.get(i) +1);
			} 
		}
		for (int i = 0; i < s.length(); i++) {
			if (hm.get(s.charAt(i)) == 1) {
				return i;
			}
		}
		return -1;
	}

	public int firstUniqChar(String s) {

		Map<Character, Integer> counts = new HashMap<Character, Integer>();

		for (int i = 0; i < s.length(); i++) {
			int count = counts.getOrDefault(s.charAt(i), 0);

			counts.put(s.charAt(i), count + 1); // O(1)
		}

		int index = -1;
		// O(n)
		for (int j = 0; j < s.length(); j++) {
			if (counts.get(s.charAt(j)) == 1) {
				index = j;
				return index;
			}
		}

		return index;

	}

}
