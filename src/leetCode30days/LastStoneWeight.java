package leetCode30days;

import java.util.Arrays;

public class  LastStoneWeight {

	public static void main(String[] args) {

		int[] arr = {2,7,4,1,8,1};
		System.out.println(lastStoneWeight(arr));
	}

	public static int lastStoneWeight(int[] stones) {

		 
        // there are 2 solutions 
        // First for recursion 
        
        if(stones==null || stones.length==0){
            return 0;
        }
        
        if (stones.length == 1)
            return stones[0];
        
        Arrays.sort(stones);
        
        if(stones[stones.length-1]==stones[stones.length-2]){
            return lastStoneWeight(Arrays.copyOfRange(stones,0,stones.length-2));
        }
        else
        {
            stones[stones.length-2]=stones[stones.length-1]-stones[stones.length-2];
            return lastStoneWeight(Arrays.copyOfRange(stones,0,stones.length-1));
 
        }
         

	}

}
