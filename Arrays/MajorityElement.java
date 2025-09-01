class Solution {
    public int majorityElement(int[] nums) {
        int max=0,major=0;
        for(int i=0;i<nums.length;i++){
            int c=1;
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]) c++;

            }
            if(max<c) {max=c;
             major=nums[i];
            }
        }
        return major;
        
    }
}
