package leetCode30days;

import java.util.ArrayList;
import java.util.*;

public class GroupAnagrams {

    public static void main(String[] args) {
            // still need to add test casces
            //input: ['abc', 'cab', 'cafe', 'face', 'goo', 'ogo']
            //output: [['abc', 'cab'], ['cafe', 'face'], ['goo', 'ogo']]
            String[] test = {"abc", "cab", "cafe", "face", "goo", "ogo"};
            System.out.println(groupAnagrams(test));

    }
    
    public static List<List<String>> groupAnagrams(String[] input) {
        if (input == null || input.length == 0) return new ArrayList<>();
        TreeMap<String, List<String>> treeMap = new TreeMap<>();
        for (int i=0; i<input.length ; i++) {
            char[] character = input[i].toCharArray();
            Arrays.sort(character);
            String keyString = String.valueOf(character);
            if (!treeMap.containsKey(keyString)) 
                treeMap.put(keyString, new ArrayList<>());
            treeMap.get(keyString).add(input[i]);
        }
        return new ArrayList<>(treeMap.values());
    }
    
}