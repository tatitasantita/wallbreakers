class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        int rowSize= A.length; 
        int colSize= A[0].length; 
        int[][] newImage= new int[rowSize][colSize]; 
        
        int k= colSize-1;
        
        // reverse each row 
        for(int i=0; i<rowSize; i++){
            k= colSize-1; 
            for(int j=0; j<colSize; j++){
                newImage[i][k]= A[i][j];
                 k--;
            } 
        }
        
        // invert
        for(int i=0; i<rowSize; i++){
            for(int j=0; j<colSize; j++){
                if(newImage[i][j]==0){
                    newImage[i][j]= 1; 
                }
                else{
                    newImage[i][j]= 0;
                }
            } 
        }
        
        return newImage; 
    }
}