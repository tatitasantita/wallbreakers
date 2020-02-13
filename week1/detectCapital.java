class Solution {
    public boolean detectCapitalUse(String word) {
        int size= word.length(); 
        
        if (size==1) return true; 
        
        if(word.equals(word.toLowerCase())){
            return true; 
        }
        if(word.equals(word.toUpperCase())){
            return true; 
        }
        
        String newString= word.substring(1, size); 
        if(Character.isUpperCase(word.charAt(0)) && newString.equals(newString.toLowerCase())){
            return true; 
        } 
        
    
        return false;
    }
}