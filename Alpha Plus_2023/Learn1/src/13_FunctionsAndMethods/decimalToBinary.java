
public class decimalToBinary {

    public static int decBin(int decNum){
        int pow = 0;
        int binNum = 0;
        int rem = 0;
        while(decNum>0){
            rem = decNum%2;
            decNum = decNum/2;
            binNum += rem * (int)Math.pow(10, pow);
            pow++;
        }

        return binNum;
    }
    public static void main(String[] args) {
        int decNum = 10;
        int binNum = decBin(decNum);
        System.out.println("decimal = " + decNum + " to Binary = " + binNum);
    }
}
