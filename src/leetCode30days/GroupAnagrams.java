package leetCode30days;

import java.util.ArrayList;
import java.util.*;
import java.util.Map;

public class GroupAnagrams {

    public static void main(String[] args) {
            // still need to add test casces
            String[] test = {"eat", "tea", "tan", "ate", "nat", "bat"};
            System.out.println(groupAnagrams(test));

    }
    
    public static List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) return new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] ca = s.toCharArray();
            Arrays.sort(ca);
            String keyStr = String.valueOf(ca);
            if (!map.containsKey(keyStr)) map.put(keyStr, new ArrayList<>());
            map.get(keyStr).add(s);
        }
        return new ArrayList<>(map.values());
    }
    
}