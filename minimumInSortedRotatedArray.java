public int findMinimum(int[] arr){
        int low = 0;
        int high = arr.length-1;

        while(low<=high){
            int mid =low+(high-low)/2;

            int prev = (mid+high)%arr.length;
            int next = (mid+1)%arr.length;

            if(arr[mid] <= arr[prev] && arr[mid] <= arr[next]){
                return arr[mid];
            }else if(arr[low] <= arr[mid] && arr[mid] > arr[high]){
                low = mid+1;
            }else {
                high = mid - 1;
            }
        }
        return arr[low];
    }
