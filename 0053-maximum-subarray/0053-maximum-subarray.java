class Solution {
    public int maxSubArray(int[] nums) {
        int globalSum = 0 ,
            maxSubArray = Integer.MIN_VALUE;
        for (int idx = 0; idx < nums.length; idx+=1){
            globalSum += nums[idx];

            maxSubArray= Math.max(maxSubArray,globalSum);

            if(globalSum <0){
                globalSum =0;
            }
        }
        return maxSubArray;
    }
}