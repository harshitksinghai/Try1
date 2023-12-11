public class solidRhombusPattern {
    public static void main(String[] args) {
        int totalRows = 5;
        solidRPattern(totalRows);
    }
    public static void solidRPattern(int totalRows){
        for(int row=0; row<totalRows; row++){
            //spaces
            for(int space=0; space<totalRows-row-1; space++){
                System.out.print(" ");
            }
            //stars
            for(int star=0; star<totalRows; star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
