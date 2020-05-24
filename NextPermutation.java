 public void nextPermutation(int[] nums) {
        if(nums.length == 1) return;
         for(int i = nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                int m = -1;
                for(int j = i+2;j<nums.length;j++){
                    if(nums[j] > nums[i] && nums[j] <nums[i+1]){
                        m = j;
                    }
                }
                if(m==-1){
                    int temp = nums[i];
                    nums[i] = nums[i+1];
                    nums[i+1] =temp;
                }else{
                    int temp = nums[i];
                    nums[i] = nums[m];
                    nums[m] =temp;
                }
                Arrays.sort(nums,i+1,nums.length);
                return;
            }
        }
        Arrays.sort(nums);
        
        
    }
