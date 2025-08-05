public class Spiral_matrix {
    public static void main(String[] args){
        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        //1 2 3 4
        //5 6 7 8
        //9 10 11 12
        int top = 0;
        int bottom = arr.length-1;
        int left = 0;
        int right = arr[0].length-1;
        while(top<right && top<bottom){
            for(int i=top; i<=right; i++){
                System.out.print(arr[top][i]+" ");
            }
            top++;
            for(int i=top; i<=bottom; i++){
                System.out.print(arr[i][right]+" ");
            }
            right--;
            for(int i=right; i>=left; i--){
                System.out.print(arr[bottom][i]+" ");
            }
            bottom--;
            for(int i=left; i<=right; i++){
                System.out.print(arr[top][i]+" ");
            }
        }

    }
    
}
