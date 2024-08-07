public class Q2 {
    public static void main(String[] args) {
        int[] originalArray = {9,8,7,6,5,4,3,2,1};
        ReverseArray(originalArray);
    }
    static void ReverseArray(int[] arr){
        int[] reverseArr = new int[arr.length];
        for(int i = 0; i<arr.length; i++){
            reverseArr[i] = arr[arr.length-i-1];
        }
        System.out.println("Reversed Array: ");
        for(int i : reverseArr){
            System.out.print(i+" ");
        }
    }
}
