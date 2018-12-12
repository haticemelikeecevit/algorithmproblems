/*
Given a collection of distinct integers, return all possible permutations.
*/
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> perm = new ArrayList<>();
        if (nums.length == 1){
            ArrayList<Integer> tmp = new ArrayList<Integer>();
            tmp.add(nums[0]);
            perm.add(tmp);
            return perm;
        }
        for (int i = 0; i < nums.length; i++){
            List<List<Integer>> tmp = permute(divideArray(nums,i));
            for (int j = 0; j < tmp.size(); j++){
                List<Integer> tmp2 = tmp.get(j);
                tmp2.add(0,nums[i]);
            }
            perm.addAll(tmp);
        }
        return perm;
    }
    int[] divideArray(int[] nums, int index){
        int[] divided = new int[nums.length - 1];
        int idx = 0;
        for(int i = 0; i < nums.length; i++){
            if (i != index){
                divided[idx] = nums[i];
                idx++;}
        }
        return divided;
    }
}
