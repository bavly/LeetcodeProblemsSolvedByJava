package leetCode30days;

import java.util.Arrays;
import java.util.Comparator;

@SuppressWarnings("rawtypes")
public class LuxoftQuize implements Comparator {

	public static void main(String[] args) {

		LuxoftQuize comparator = new LuxoftQuize();

		@SuppressWarnings("unchecked")
		int result = Arrays.binarySearch(strings, "cc", comparator);

		System.out.println(result);

	}

	static String[] strings = { "d", "bbb", "aaaa" };

	public int compare(Object o1, Object o2) {

		int s1 = ((String) o1).length();

		int s2 = ((String) o2).length();

		return s1 - s2;

	}

}
