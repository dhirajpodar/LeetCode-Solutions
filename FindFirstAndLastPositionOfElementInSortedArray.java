 public int[] searchRange(int[] nums, int target) {
        if(nums.length >= 1){
            int low =0;
            int high = nums.length-1;
            
            while(low<=high){
                int mid = low + (high-low)/2;
                if(nums[mid] == target){
                        int i=mid;
                        int j=mid;
                        while(i>0 && nums[i] == nums[i-1]){
                            i-- ;
                        }
                        while(j<high && nums[j] == nums[j+1]){
                            j++;
                        }
                        return new int[]{i,j};
                    
                }else if(target < nums[mid] ){
                    high = mid-1;
                }else{
                    low = low+1;
                }
            }
        }
        return new int[]{-1,-1};
    }
