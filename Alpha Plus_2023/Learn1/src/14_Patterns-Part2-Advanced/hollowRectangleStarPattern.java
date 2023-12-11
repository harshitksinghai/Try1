

public class hollowRectangleStarPattern {
    public static void main(String[] args) {
        int totalRows = 5;
        int totalCols = 10;
        hollowRecPattern(totalRows, totalCols);
    }
    public static void hollowRecPattern(int totalRows, int totalCols){
        for(int row = 0; row < totalRows; row++){
            for(int col = 0; col < totalCols; col++){
                if(row == 0 || row == totalRows-1 || col == 0 || col == totalCols-1){
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
