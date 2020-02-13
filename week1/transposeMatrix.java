class Solution {
    public int[][] transpose(int[][] A) {
        int s1= A.length; 
        int s2= A[0].length; 
        int [][] newMatrix= new int[s2][s1];
        for(int i=0; i<s1; i++){
            for(int j=0; j<s2; j++){
                newMatrix[j][i]= A[i][j];
            }
        }
        return newMatrix; 
    }
}