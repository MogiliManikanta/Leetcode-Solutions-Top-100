class Solution {
    public int jump(int[] nums) {
        int jumps = 0;
        int reachable = 0;
        int current=0;
        for(int i=0;i<nums.length-1;i++){
            reachable=Math.max(reachable,nums[i]+i);
            if(current==i){
                current=reachable;
                jumps++;
            }
        }
        return jumps;
    }
}