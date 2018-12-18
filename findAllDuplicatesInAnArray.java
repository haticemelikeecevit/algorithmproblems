/*Given an array of integers, 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.

Find all the elements that appear twice in this array.

Could you do it without extra space and in O(n) runtime?
*/
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer,Integer> numberMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            int current = nums[i];
            if (numberMap.get(current) == null){
                numberMap.put(current, 1);
            }
            else{
                int n = numberMap.get(current);
                numberMap.put(current, n+1);
            }
        }
        List<Integer> duplicate = new ArrayList<>();
        Iterator it = numberMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Integer,Integer> pair = (Map.Entry)it.next();
            int n = pair.getValue();
            if (n == 2)
                duplicate.add(pair.getKey());
            it.remove(); // avoids a ConcurrentModificationException
        }
        return duplicate;
    }
}
