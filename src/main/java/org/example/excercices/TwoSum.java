package org.example.excercices;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target){
        // 2, 7, 0, 7 compare To key() , if prsent

        Map<Integer, Integer> map = new HashMap<>();
        map.put(target-nums[0], 0  );
        for (int i = 1; i < nums.length; i++) {
            int n = nums[i];
            if(map.containsKey(n)){
                    return new int[]{map.get(n), i};
            }
            map.put(target-n,i);
        }
        return new int[]{};

    }
}
