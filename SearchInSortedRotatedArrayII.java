public int binarySearch(int[] arr, int low, int high,int target){
        while(low<=high){
            int mid = low+ (high-low)/2;
            if(arr[mid] == target) {
                return mid;
            }else if(target < arr[mid]){
                high = mid -1;
            }else{
                low = mid +1;  
            }
        }
        return -1;
    }
    public static int getIndexOfMinimumValue(int[] nums){

        if(nums.length == 0) return -1;
        if(nums.length == 1) return nums[0];

        int low = 0;
        int high = nums.length-1;

        while(low<high){
            int mid = low+(high-low)/2;

            if(mid>0 && nums[mid] < nums[mid-1]){
                return mid;
            }else if(nums[mid] >= nums[low] && nums[mid] > nums[high]){
                low = mid +1;
            }else{
                high = mid -1;
            }
        }
        return low;
    }
    public int search(int[] nums, int target) {
        if(nums.length == 0) return -1;
        if(nums.length == 1 ) {
            return nums[0] == target ? 0 : -1;
        }
        
        int size = nums.length;
        int min = getIndexOfMinimumValue(nums);
        if(min == 0){
            return binarySearch(nums,min,size-1,target);
        }else{
           if(target>=nums[min] && target <= nums[size-1]){
               return binarySearch(nums,min,size-1,target);
           } else{
               return binarySearch(nums,0,min-1,target);
            }
        }   
    }
