class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0;i<nums.length;i++){
            int remain = target - nums[i];
            if(map.containsKey(remain)){
                return new int [] {i,map.get(remain)};
            }
            
            map.put(nums[i],i);
            // [2,7,11,15]
        
        }
        
        return null;
    }
}