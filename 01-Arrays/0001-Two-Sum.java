class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i= 0;i<nums.length;i++){
            for (int j=i+1; j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
            return new int[]{};
        }
        
    }
    /*.
Problem: Two Sum
LeetCode Number: 1
Topic: Arrays
Difficulty: Easy

Approach:
Check every possible pair of elements.
If their sum equals the target, return their indices.

Time Complexity: O(n^2)
Auxiliary Space Complexity: O(1)
*/
