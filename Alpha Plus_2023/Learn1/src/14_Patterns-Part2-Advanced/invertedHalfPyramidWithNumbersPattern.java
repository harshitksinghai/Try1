public class invertedHalfPyramidWithNumbersPattern {
    public static void main(String[] args) {
        int totalRows = 5;
        inHalfPyramidNum(totalRows);
    }
    public static void inHalfPyramidNum(int totalRows){
        for(int row=0; row<totalRows; row++){
            for(int i=1; i<= totalRows-row; i++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
