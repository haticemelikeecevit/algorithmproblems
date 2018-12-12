/*
Given a sorted array consisting of only integers where every element appears twice except for one element which appears once. Find this single element that appears only once.
*/
class Solution {
    public int singleNonDuplicate(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++){
            if (nums[i] == nums[i + 1])
                i++;
            else{
                return nums[i];
            }
        }
        if (nums[nums.length - 2] != nums[nums.length - 1])
            return nums[nums.length - 1]; 
        return -1;
    }
}
