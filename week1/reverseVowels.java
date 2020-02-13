class Solution {
    public String reverseVowels(String s) {
        Stack<Character> vowelsReversed = new Stack<Character>();
        ArrayList<Character> vowels = new ArrayList<>(); 
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');
        
        for (Character letter: s.toCharArray()){
            if (vowels.contains(letter)){
                vowelsReversed.push(letter); 
            }
        }
        StringBuilder newWord= new StringBuilder(s); 
        
        for(int i=0; i < s.length(); i++){
            if (vowels.contains(s.charAt(i))){
                newWord.setCharAt(i,vowelsReversed.pop()); 
            }
        }
        
        return newWord.toString(); 
    }
}