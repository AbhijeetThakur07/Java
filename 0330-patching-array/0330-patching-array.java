class Solution {
    public int minPatches(int[] nums, int n) {
        long maxReach=0;
        int patch=0;
        int i=0;
        int len=nums.length;
        while(maxReach<n){
            if(i<len && nums[i]<=maxReach+1){
                maxReach+=nums[i];
                i++;
            }
            else{
                maxReach+=(maxReach+1);
                patch++;
            }
        }
        return patch;
    }
}