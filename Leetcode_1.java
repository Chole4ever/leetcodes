package src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/*
 **Input:** nums = [2,7,11,15], target = 9
 **Output:** [0,1]
 */
public class Leetcode_1 {
    public static void main(String[] args) {
        int[] nums = new int[]{3,2,4};
        int target = 6;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        int[] answer = new int[2];
        for(int i=0;i<nums.length;i++)
        {

            if(hashMap.containsKey(target-nums[i]))
            {
                answer[1] = i;
                answer[0] = hashMap.get(target-nums[i]);
                return answer;
            }
            hashMap.put(nums[i],i);
        }
        return answer;
    }
}
