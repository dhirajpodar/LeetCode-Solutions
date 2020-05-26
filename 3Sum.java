public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> finalList = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            if(i == 0 || (i>0 && nums[i] != nums[i-1])){
                int low = i+1;
                int high = nums.length-1;
                int target = 0-nums[i];
                while(low<high){
                    if(nums[low] == target - nums[high]){
                        finalList.add(Arrays.asList(nums[i],nums[low],nums[high]));
                        while(low<high && nums[low] == nums[low+1]) low++;
                        while(low<high && nums[high] == nums[high-1]) high--;
                        low++;
                        high--;
                    }else if(nums[low] < target-nums[high]){
                        low++;
                    }else{
                        high--;
                    }
                    
                }
            }
        }
        return finalList;
    }
