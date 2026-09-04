class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap <Integer,Integer> preSumCount = new HashMap<>();
        preSumCount.put(0,1);
        int count = 0;
        int sum = 0;
        for (int num : nums){
            sum += num;
            count += preSumCount.getOrDefault(sum-k,0);
            preSumCount.merge(sum,1,Integer::sum);
        }
        return count;
    }
}