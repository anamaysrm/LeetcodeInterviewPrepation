



Approach 1 -> 

  class Solution {
    public boolean increasingTriplet(int[] nums) {
        boolean[] less = new boolean[nums.length];
        int min = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(min < nums[i]) less[i] = true;
            else min = nums[i];
        }
        int max = nums[nums.length - 1];
        for(int i = nums.length - 2; i >= 0; i--){
            if(max > nums[i]) {
                if(less[i]) return true;
            }
            else max = nums[i];
        }
        return false;
    }
}

  O(n) time and O(n) space

Approach 2 ->
  class Solution {
    public boolean increasingTriplet(int[] nums) {
        int [] rmax = new int [nums.length];
        int [] lmin = new int [nums.length];
        lmin[0] = nums[0];
        rmax[nums.length-1] = nums[nums.length-1];
        for(int i=0;i<nums.length;i++) {
            if(i!=0) {
                lmin[i] = Math.min(lmin[i-1], nums[i-1]);
            }
                
            if(i!=0) {
                rmax[nums.length-1-i] = Math.max(rmax[nums.length-i], nums[nums.length-i]);
            }
        }
        for(int i=1;i<nums.length-1;i++) {
            if(nums[i] < rmax[i] && nums[i] > lmin[i]) return true;
        }
        return false;
    }
}
O(n) time and O(n) space

Approach 3 -> 

  class Solution {
    public boolean increasingTriplet(int[] nums) {
        int first_num = Integer.MAX_VALUE;
        int second_num = Integer.MAX_VALUE;
        for (int n: nums) {
            if (n <= first_num) {
                first_num = n;
            } else if (n <= second_num) {
                second_num = n;
            } else {
                return true;
            }
        }
        return false;
    }
}
  O(n) time and O(1) space

Approach 4 ->

  class Solution {
    public boolean increasingTriplet(int[] nums) {
        int n = nums.length;
        if (n < 3) {
            return false;
        }

        int[] memo = new int[n];
        memo[0] = nums[0];
        
        // remember the minimum in the subarray to the left
        for (int i = 1; i < n-1; i++) {
            memo[i] = Math.min(memo[i-1], nums[i]);
        }

        int max = nums[n-1];
        for (int i = n-2; i >= 1; i--) {
            int min = memo[i-1];
            // remember the maximum in the subarray to the right
            max = Math.max(max, nums[i+1]);
     
            if (min < nums[i] && nums[i] < max) {
                return true;
            }
            
        }
        
        return false;
    }
}
  O(n) time and O(n) space

  
