class Solution {
    public boolean isSubsequence(String s, String t) {
        String[] str1=s.split("");
        int count=0;
        String[] str2=t.split("");
        if(s.equals("")){
            return true;
        }
        if(str1.length==0){
            return true;
        }
        int j=0;
        for(String str:str1){
            for(j=j;j<str2.length;j++){
                if(str2[j].equals(str)){
                    count++;
                    j++;
                    break;
                    
                }
            }
        }
        if(count==str1.length){
            return true;
        }
        else{
            return false;
        }
        
    }
}