class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Integer> countS= new HashMap<>();
        for(int i=0; i<s.length();i++){
            countS.put(s.charAt(i),countS.getOrDefault(s.charAt(i),0)+1);    
        }
        for(char c: t.toCharArray()){
            if(!countS.containsKey(c) || countS.get(c)==0){
                return false;
            }
            else{
                countS.put(c,countS.get(c)-1);
            }
        }
        return true;
    }
}
