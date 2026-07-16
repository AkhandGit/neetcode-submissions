public class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer>posi=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int complement = target - nums[i];
            if (posi.containsKey(complement)) {
                return new int[]{ posi.get(complement), i };
            }
            posi.put(nums[i], i);
        }
        return new int[]{};
    }
}