/* Given a non-empty array of integers, every element appears twice except for one. Find that single one.

Note:

Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
*/
class SingleNumber {
    public int singleNumber(int[] nums) {
        TreeMap<Integer,Boolean> numberMap = new TreeMap<Integer,Boolean>();
        for(int i = 0; i < nums.length; i++){
            int current = nums[i];
            if (numberMap.get(current) == null){
                numberMap.put(current,true);
            }
            else{
                numberMap.put(current,false);
            }
        }
        for(Map.Entry<Integer, Boolean> entry : numberMap.entrySet()) {
            int key = entry.getKey();
            boolean value = entry.getValue();
            if (value)
                return key;
        }
        return -1;
    }
}
