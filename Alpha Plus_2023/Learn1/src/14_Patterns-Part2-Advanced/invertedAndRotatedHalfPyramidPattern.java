public class invertedAndRotatedHalfPyramidPattern {
    public static void main(String[] args) {
        int totalRows = 4;
        inRoHalfPyramidPattern(totalRows);
    }
    public static void inRoHalfPyramidPattern(int totalRows){
        for(int row=0; row<totalRows; row++){
            //spaces
            for(int space=0; space < totalRows - row - 1; space++){
                System.out.print(" ");
            }
            //stars
            for(int star=0; star < row + 1; star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
