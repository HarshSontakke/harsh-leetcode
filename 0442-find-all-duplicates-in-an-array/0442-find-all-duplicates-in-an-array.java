class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List <Integer> result = new ArrayList<>();
        for(int i = 0; i < nums.length ; i++){
            int value = Math.abs(nums[i]);
            int index = value - 1;

            if(nums[index] < 0){
                result.add(value);
            }else{
                nums[index] = - nums[index];
            }
        }
        return result;
    }
}