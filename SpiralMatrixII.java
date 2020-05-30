public int[][] generateMatrix(int n) {
        int j =1;
        
        int[][] matrix = new int[n][n];
        int top = 0;
        int bottom = n-1;
        int left = 0;
        int right = n -1;
        int dir =0;
        while(top <= bottom && left <= right){
            if(dir ==0){
                for(int i=left;i<=right;i++){
                    matrix[top][i] = j++;
                }
                top++;
                dir =1;
            }else if(dir == 1){
                for(int i = top;i<=bottom;i++){
                    matrix[i][right] = j++;
                }
                right--;
                dir =2;
            }else if(dir==2){
                for(int i =right;i>=left;i--){
                    matrix[bottom][i] = j++;
                }
                bottom--;
                dir = 3;
            }else{
                for(int i=bottom;i>=top;i--){
                    matrix[i][left] = j++;
                }
                left++;
                dir =0;
            }
        }
        return matrix;
    }
