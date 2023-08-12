class Solution {
    public int firstMissingPositive(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]<=0 || nums[i]>n){
                continue;
            }
            //int element=nums[i];
            int chair=nums[i]-1;
            if(nums[i]!=nums[chair]){
                int temp=nums[i];
                nums[i]=nums[chair];
                nums[chair]=temp;
                i--;//important term
            }
        }
        for(int i=0;i<n;i++){
            if(i+1==nums[i]){
                continue;
            }
            else{
                return i+1;
            }
        }
        return n+1;
    }
}