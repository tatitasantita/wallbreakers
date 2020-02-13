class Solution {
    
    public int[] plusOne(int[] digits) {
        
        String number= ""; 
        for(Integer item: digits){
            number+= item;
        }

        Long intNumber= Long.parseLong(number); 
        intNumber++;

        number= Long.toString(intNumber);
        int[] newDigits= new int[number.length()];
        
        int charToInt= 0; 
        for(int i= 0; i< number.length() ;i++){
            charToInt= Character.getNumericValue(number.charAt(i));
            newDigits[i]= charToInt;
        }
        
        return newDigits; 

    }
}