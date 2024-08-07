public class Q1{
    public static void main(String[] args) {
        int [] arr = {4,5,6,78,87,43,21};
        int N = arr.length;
        System.out.println("Minimum element is:"+setmin(arr, N));
        System.out.println("Maximum element is:"+setmax(arr, N));
    }
    static int setmin(int[] arr, int N){
        int mini = Integer.MAX_VALUE;
        for(int i = 0; i<N; i++){
            if(arr[i] < mini){
                mini = arr[i];
            }
        }
        return mini;
    }
    static int setmax(int[] arr, int N){
        int max = Integer.MIN_VALUE;
        for(int i =0; i<N; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
}