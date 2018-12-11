/*
Given an array A of non-negative integers, return an array consisting of all the even elements of A, followed by all the odd elements of A.

You may return any answer array that satisfies this condition.
*/
class Solution {
    public int[] sortArrayByParity(int[] A) {
        int[] nums = new int[A.length];
        int even = 0;
        int odd = A.length - 1;
        for (int i = 0; i < A.length; i++){
            int current = A[i];
            if (current % 2 == 0){
                nums[even] = current;
                even++;
            }
            else{
                nums[odd] = current;
                odd--;
            }
        }
        return nums;
    }
}
