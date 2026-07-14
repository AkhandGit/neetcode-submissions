class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        Map<Integer,Integer> frequencyMap= new HashMap<>();
        for(int num:nums){
            frequencyMap.put(num,frequencyMap.getOrDefault(num,0)+1);
        }
        List<Integer> result = new ArrayList<>();

        for(Map.Entry<Integer,Integer> entry: frequencyMap.entrySet()){
            int key = entry.getKey();
            int value = entry.getValue();

            if(value>n/3){
                result.add(key);
            }
        }

        return result;

        
    }
}