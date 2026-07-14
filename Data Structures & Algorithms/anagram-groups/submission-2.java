class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> frequencyMap=new HashMap<>();

        //base case
        if(strs == null || strs.length==0){
            return new ArrayList<>();
        }

        for(String str: strs){
            String frequencyStr=frequencyString(str);

            if(frequencyMap.containsKey(frequencyStr)){
                frequencyMap.get(frequencyStr).add(str);
            }
            else{
                List<String> strList=new ArrayList<>();
                strList.add(str);
                frequencyMap.put(frequencyStr,strList);//if no list is there add list to that frequency

            }

        }

        return new ArrayList<>(frequencyMap.values());
        
    }
    public String frequencyString(String str){
        int freq[]= new int[26];

        for(char c:str.toCharArray()){
            freq[c-'a']++; //increment the alphabet count
        }

        StringBuilder freqString=new StringBuilder("");
        char c='a';
        for(int i:freq){
            freqString.append(c);
            freqString.append(i);
            c++;
        }
        return freqString.toString();

    }
}