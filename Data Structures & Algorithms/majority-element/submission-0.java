class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> ans= new HashMap<>();
        for(int num: nums){
            ans.put(num,ans.getOrDefault(num,0)+1);
        }
        int maxKey = -1;
        int maxValue = 0;

        for (Map.Entry<Integer, Integer> entry : ans.entrySet()) {
            if (entry.getValue() > maxValue) {
                maxValue = entry.getValue();
                maxKey = entry.getKey();
            }
        }
        return maxKey;
    }
}