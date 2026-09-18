class Solution {
    public int [] firstOcc(int [] nums, int target){
        int low = 0;
         int high = nums.length-1;
         int first = -1;
        while (low<=high){
            int mid = (low+high)/2;
            if(nums[mid]==target){
                first = mid;
                high = mid -1;
            } else if (nums[mid]<target){
                low = mid +1;
            } else {
                high = mid -1;
            }
        }
        return new int[]{first};
    }
    public int [] lastOcc (int [] nums, int target){
        int low = 0; int high = nums.length-1; int last = -1;
        while (low <= high){
            int mid = (low + high)/2;
            if(nums[mid] == target){
                last = mid;
                low = mid+1;
            }else if (nums[mid]<target){
                low = mid +1;
            }else {
                high = mid-1;
            }
        } 
        return new int [] {last};
    }

    public int[] searchRange(int[] nums, int target) {
        int First = firstOcc(nums,target)[0];
        if (First == -1 ) return new int [] {-1,-1};
        int Last = lastOcc(nums,target)[0];
        return new int [] {First , Last};
        
    }
}