

public class binaryToDecimal {

    public static int binDec(int binNum){
        int decNum = 0;
        int pow = 0;
        int lastDigit = 0;
        while(binNum > 0){
            lastDigit = binNum % 10;
            decNum += lastDigit * (int)Math.pow(2,pow);
            pow++;
            binNum = binNum / 10;
        }
        return decNum;
    }
    public static void main(String[] args) {
        int binNum = 101;
        int decNum = binDec(binNum);
        System.out.println("Binary = " + binNum + " to Decimal = " + decNum);
    }
}
