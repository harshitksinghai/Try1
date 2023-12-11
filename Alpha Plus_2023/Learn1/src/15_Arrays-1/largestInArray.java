

public class largestInArray {
    public static void main(String[] args) {
        int arr[] = {7,4,8,9,2,-63,9,4,2,0};
        int largest = largestE(arr); 
        System.out.println(largest);
    }

    public static int largestE(int[] arr) {
        int largest = Integer.MIN_VALUE;
        //int smallest = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>largest){
             largest = arr[i];
            }
        //    else{smallest = arr[i];}
        }
        return largest;
    }
}
