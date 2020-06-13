class Solution {
    public boolean canJump(int[] nums) {
        int size = nums.length;
        int reachable  = 0;
        for(int i = 0; i<size ; i++){
            if(reachable < i) return false;
            reachable = Math.max(reachable, i+nums[i]);
        }
        return true;
    }
}
