public class Move_zeros {
    public static void main(String[] args){
        int[] arr = {1,2,0,4,0,1,0,0};
        int left = 0;
        for(int right=0; right<arr.length; right++){
            if(arr[right]!=0){
                int temp = arr[left];
                arr[left++] = arr[right];
                arr[right] = temp;
            }
        }

        for(int i: arr) System.out.print(i+" ");
    }
}
