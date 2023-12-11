public class binarySearch {
    public static void main(String[] args) {
        int arr[] = {2,4,5,6,8,12,14,15,18,21};
        int key = 12;
        int ans = binSearch(arr, key);
        if(ans == -1){
            System.out.println("element is not present in array");
        }
        else{
            System.out.println("element at index " + ans);
        }
    }
    public static int binSearch(int arr[], int key){
        int low = 0, high = arr.length-1;
        int mid = (low+high)/2;
        while(low<=high){
            if(arr[mid]==key){
                return mid;
            }
            else if(arr[mid]<key){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return -1;
    }
}
