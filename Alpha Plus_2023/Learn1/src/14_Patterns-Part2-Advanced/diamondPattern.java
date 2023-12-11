public class diamondPattern {
    public static void main(String[] args) {
        int totalRows = 4;
        dPattern(totalRows);
    }
    public static void dPattern(int totalRows){
        //upper portion
        for(int row=0; row<totalRows; row++){
            //spaces
            for(int space=0; space<totalRows-row-1; space++){
                System.out.print(" ");
            }
            //stars
            for(int star=0; star<2*row+1; star++){
                System.out.print("*");
            }
            System.out.println();
        }
        //lower portion (reversed)
        for(int row=totalRows-1; row>=0; row--){
            //spaces
            for(int space=0; space<totalRows-row-1; space++){
                System.out.print(" ");
            }
            //stars
            for(int star=0; star<2*row+1; star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
