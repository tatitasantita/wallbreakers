class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] answer = new int[2];
        int k= 0;
        for (int i=0; i< nums.length; i++){
            k++;
            for(int j= k ; j < nums.length; j++){
                 if (nums[i]+nums[j]==target){
                    answer[0]=i;
                    answer[1]=j;
                    return answer; 
                }
            }
        }
        return answer; 
    }
}