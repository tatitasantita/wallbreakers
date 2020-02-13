class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> newList = new ArrayList<>();
        String holder= ""; 
        
        for (int i=1; i< n+1; i++){
            if (i % 5 == 0 && i % 3 == 0){
                newList.add("FizzBuzz");
            }
            else if (i % 5 == 0){
                newList.add("Buzz");
            }
            else if (i % 3 == 0){
                newList.add("Fizz");
            }
            else {
                holder= Integer.toString(i); 
                newList.add(holder); 
            }
        }
        return newList; 
    }
}