class Solution {
   public int[] twoSum(int[] nums, int target) {

    HashMap<Integer,Integer> map = new HashMap<>();
    int noToFind = 0;
    for(int i = 0; i < nums.length; i++)
    {
        if(map.containsKey(nums[i]))
        {
            int[] arr = {map.get(nums[i]), i};
            return arr;
        }
        noToFind = target - nums[i];
        map.put(noToFind, i);
    }
    return null;
}
}