public class butterflyPattern {
    public static void main(String[] args) {
        int totalRows = 10;
        bPattern(totalRows);
    }
    public static void bPattern(int totalRows){
        //upper portion
        for(int row=0; row<totalRows; row++){
            //stars1
            for(int stars1=0; stars1<row+1; stars1++){
                System.out.print("*");
            }
            //spaces
            for(int spaces=0; spaces<2*(totalRows-(row+1)); spaces++){
                System.out.print(" ");
            }
            //stars2
            for(int stars2=0; stars2<row+1; stars2++){
                System.out.print("*");
            }
            System.out.println();
        }
        //lower portion (reversed)
        for(int row=totalRows-1; row>=0; row--){
            //stars1
            for(int stars1=0; stars1<row+1; stars1++){
                System.out.print("*");
            }
            //spaces
            for(int spaces=0; spaces<2*(totalRows-(row+1)); spaces++){
                System.out.print(" ");
            }
            //stars2
            for(int stars2=0; stars2<row+1; stars2++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
