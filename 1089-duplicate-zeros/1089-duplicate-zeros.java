class Solution {
    public void duplicateZeros(int[] arr) {
        int possibleZeroDups=0;
        int lastIdx = arr.length-1;
        for(int i = 0; i <= lastIdx-possibleZeroDups;i++){
            if(arr[i]==0){
                if(i == lastIdx-possibleZeroDups){
                    arr[lastIdx]=0;
                    lastIdx-=1;
                    break;
                }
                possibleZeroDups++;
            }
        }
        int newlastIdx = lastIdx - possibleZeroDups;

        for(int i = newlastIdx; i>= 0;i--){
            if(arr[i]==0){
                arr[i + possibleZeroDups]=0;
                possibleZeroDups--;
                arr[i + possibleZeroDups]=0;
            } else {
                arr[i + possibleZeroDups]=arr[i];
            }
        }
    }
}