class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int maxSum = 0, minSum =0;
        int currMax=0, currMin=0;

        for(int num : nums){
            currMax= Math.max(num, currMax+num);
            currMin = Math.min(num, currMin+num);
            maxSum = Math.max(maxSum, currMax);
            minSum = Math.min(minSum, currMin);


        }


        return Math.max(Math.abs(maxSum), Math.abs(minSum));

    }
}
