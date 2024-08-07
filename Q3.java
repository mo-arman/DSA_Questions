public class Q3 {

    public static void main(String[] args) {
        int[] Array = {2,3,4,5,6,7,8,9,33,45,67};
        System.out.println(SubArray(Array));
    }
    static int SubArray(int[] arr){
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        for(int i=0; i<arr.length; i++){
            currentSum += arr[i];

            if(currentSum > maxSum){
                maxSum = currentSum;
            }
            if(currentSum<0){
                currentSum = 0;
            }
        }
        return maxSum;
    }
}
