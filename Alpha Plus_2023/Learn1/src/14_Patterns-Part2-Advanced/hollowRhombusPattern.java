public class hollowRhombusPattern {
    public static void main(String[] args) {
        int totalRows = 5;
        hollowRPattern(totalRows);
    }
    public static void hollowRPattern(int totalRows){
        for(int row=0; row<totalRows; row++){
            //spaces
            for(int space=0; space<totalRows-row-1; space++){
                System.out.print(" ");
            }
            //hollowRectanglePattern
            for(int col=0; col<totalRows; col++){
                if(row == 0 || row == totalRows-1 || col == 0 || col == totalRows-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
