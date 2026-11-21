class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int [] nums3 = new int [nums1.length + nums2.length];
        for (int i = 0 ; i < nums1.length ; i++ ){
            nums3[i] = nums1[i];
        }
        for (int j = 0; j < nums2.length; j++){
           nums3[nums1.length + j] = nums2[j];
        }
        for (int i = 0 ; i < nums3.length -1 ; i++){
            for(int j = 0 ; j < nums3.length -1- i ; j++){
                if(nums3[j] > nums3[j+1]){
                    int temp = nums3[j];
                    nums3[j] = nums3[j+1];
                    nums3[j+1] = temp;
                }
            }
        }
        int mid = nums3.length / 2;
        if (nums3.length % 2 == 1) return nums3[mid]; 
        return (nums3[mid-1] + nums3[mid])/2.0;
    }
}