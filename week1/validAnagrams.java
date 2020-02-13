class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sString= s.toCharArray();  
        Arrays.sort(sString); 
        
	    char[] tString= t.toCharArray(); 
        Arrays.sort(tString);
        
	    s= String.valueOf(sString);
        t= String.valueOf(tString);
        return s.equals(t);
    }
}