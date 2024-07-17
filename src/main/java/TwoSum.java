package main.java;/*
import java.util.HashMap;
import java.util.Map;

class solution{
public  int twoSum(int[] nums, int target)
    {
        Map<Integer,Integer> map= new HashMap<>();
        for(int i = 0; i < nums.length; i++)
        {
            int cur = nums[i];
            int x = target - cur;
            if(map.containsKey(x)) {

                    return new int[] {
                            map.get(x), i};
                }
            map.put(cur, i );

        }
        return null;
    }


    public static void main(String[] args) {
        int[] nums= { 2, 7,11,15};
        int target = 9;

        solution ob1= new solution();
        ob1.twoSum(nums,target);
        }
    }
*/
