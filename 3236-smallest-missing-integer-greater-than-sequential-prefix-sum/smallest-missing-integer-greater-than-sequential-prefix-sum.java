class Solution {
    public int missingInteger(int[] nums) {
        int n = nums.length;
        int Sum = nums[0];

        for(int i=1; i < n; i++){
            if(nums[i] == nums[i - 1] + 1)
                Sum += nums[i];
            else
                break;
        }

        while(true){
            boolean found = false;
            for(int i=0; i<nums.length; i++){
                if(nums[i] == Sum){
                    found = true;
                    break;
                }
            }
            if(!found)
                return Sum;
            Sum++;
        }
    }
}