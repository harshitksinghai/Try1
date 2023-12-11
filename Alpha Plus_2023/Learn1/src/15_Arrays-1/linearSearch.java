

public class linearSearch{
    public static void main(String[] args) {
        int arr[] = {7,4,8,2,63,9,4,2,0};
        int key = 10;
        boolean isPresent = linearS(arr, key);
        System.out.println(isPresent);
    }

    public static boolean linearS(int[] arr, int key) {
        for(int i=0; i<arr.length; i++){
            if(arr[i] == key){
                return true;
            }
        }
        return false;
    }

}