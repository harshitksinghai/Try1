import java.util.Scanner;

public class optimisedPrimeNum{

    public static boolean isPrime(int n){
        if(n == 2){
            return true;
        }
        else{
            for(int i=2; i < Math.sqrt(n); i++){
                if(n%i == 0){
                    return false;
                }
            }
            return true;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(isPrime(num));
    }


}
