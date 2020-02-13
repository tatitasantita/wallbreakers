class Solution {
    public String reverseWords(String s) {
         
        String reversedString=""; 
        for(String revString: s.split(" ")){
            StringBuilder sBuild= new StringBuilder(revString);
            sBuild.reverse(); 
            reversedString= reversedString+ sBuild.toString()+" "; 
        } 
        return reversedString.trim();
        
    }
}