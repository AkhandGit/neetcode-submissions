class Solution {
    public int longestConsecutive(int[] nums) {
        int longestCount= 0;
        Map<Integer,Boolean> numTravelled= new HashMap<>();

        for(int num: nums){
            numTravelled.put(num,Boolean.FALSE);
        }

        for(int num: nums){
            int currentCount=1;
            int nextNum=num+1;

            while(numTravelled.containsKey(nextNum) && numTravelled.get(nextNum)==false){
                currentCount+=1;
                numTravelled.put(nextNum,Boolean.TRUE);
                nextNum++;
            }
            
            int prevNum=num-1;


            while(numTravelled.containsKey(prevNum) && numTravelled.get(prevNum)==false){
                currentCount+=1;
                numTravelled.put(prevNum,Boolean.TRUE);
                prevNum--;
            }

            longestCount=Math.max(longestCount,currentCount);
        }
        return longestCount;
    }
}
