class Solution {
    public int[] sortArrayByParity(int[] A) {
        int sizeA= A.length; 
        int count= 0; 
        int temp= 0; 
        for (int i=0; i<sizeA; i++){
            if(A[i] % 2 == 0){
                temp= A[count]; 
                A[count]= A[i];
                A[i]= temp; 
                count++;
            }
        }
        return A; 
    }
}