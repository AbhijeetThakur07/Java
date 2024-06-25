class Solution {
    public double minimumAverage(int[] nums) {

        // sort input
        Arrays.sort(nums);

        // two pointers: end and start
        int start = 0, end = nums.length - 1, i = 0;
        double[] avg = new double[nums.length/2];
        while( start < end && i < nums.length/2 ) {
            avg[i] = ( nums[start] + nums[end] )/2.0;
            start ++;
            end --;
            i ++;
        }

        // sort avg array
        Arrays.sort(avg);

        // get least
        return avg[0];
        
    }
}