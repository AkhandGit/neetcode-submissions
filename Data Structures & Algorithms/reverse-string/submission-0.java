class Solution {
    public void reverseString(char[] s) {
        int i=0;
        int j=s.length-1;
        while(i<j){

            char temp=s[i];
            s[i]=s[j];
            s[j]=temp;
            i++;
            j--;


        }      
    }
}
/* 
0,3
temp=n
[t,e,e,t]
[t,e,e,n]

1,2

*/
