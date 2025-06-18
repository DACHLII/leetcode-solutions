/*
 * @lc app=leetcode id=2966 lang=java
 *
 * [2966] Divide Array Into Arrays With Max Difference
 */

// @lc code=start

import java.util.Arrays;
import java.util.ArrayList;
import java.lang.Math;
class Solution {
    public int[][] divideArray(int[] nums, int k) {
        int[][] output;
        Arrays.sort(nums);
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        boolean[] unused_marker = new boolean[nums.length];
        ArrayList<Integer> currentList = new ArrayList<>();
        ArrayList<Integer> num_tracker = new ArrayList<>();
        // base case
        if(helper_divide(nums,k, result,unused_marker,currentList,num_tracker))
        {
            // TODO : convert to 2D array
            output = result.stream().map(group -> group.stream().mapToInt(Integer::intValue).toArray()).toArray(int[][]::new);
            return output;
        }
        else
        {
            output = new int[0][0];
            return output;
        }

    }
    public boolean helper_divide(int[]nums,int k, ArrayList<ArrayList<Integer>> result, boolean[] unused_marker, ArrayList<Integer> currentList,ArrayList<Integer> num_tracker)
    {
        
        
        boolean allUsed = true;
        for (int i = 0; i < unused_marker.length; i++) {
            if (!unused_marker[i]) {
                allUsed = false;
                break;
            }
        }
        if (allUsed) {
            return true;  
        }

        for(int i = 0; i < nums.length; i++)
        {
            // trying to form a group
            if(unused_marker[i] == false)
            {
                currentList.add(nums[i]);
                unused_marker[i] = true;
                num_tracker.add(i);
            }
            // formed a group?
            if(currentList.size() == 3)
            {
                int min = Math.min(currentList.get(2),Math.min(currentList.get(0),currentList.get(1)));
                int max = Math.max(currentList.get(2),Math.max(currentList.get(0),currentList.get(1)));
                if(max-min <= k)
                {
                    // valid group, go ahead and add it to the list
                    result.add(new ArrayList<>(currentList));

                    helper_divide(nums,k,result,unused_marker,currentList,num_tracker);

                    // failure area, backtrack
                    result.remove(currentList);
                    currentList.remove(currentList.size() - 1);
                    for(int j = 0; j < 3; j++)
                    {
                        unused_marker[num_tracker.get(j)] = false;
                    }

                }
            }

        }
        

        return false;
    }
}
// @lc code=end

