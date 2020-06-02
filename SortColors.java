public static int partition(int[] arr,int low, int high){
        int pivot = arr[high];
        int j = low;
        for(int i = low;i<high;i++){
            if(arr[i]<pivot){
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                j++;
            }
        }
        int temp = arr[j];
        arr[j] = arr[high];
        arr[high] = temp;

        return j;
    }
    public int[] quickSort(int[] nums, int low, int high){
        if(low<high){
            int pivot = partition(nums,low,high);
            quickSort(nums,low,pivot-1);
            quickSort(nums,pivot+1,high);
        }
        return nums;
    }
    public void sortColors(int[] nums) {
        nums = quickSort(nums,0,nums.length-1);
    }
