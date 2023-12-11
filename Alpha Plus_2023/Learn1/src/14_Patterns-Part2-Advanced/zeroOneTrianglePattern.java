public class zeroOneTrianglePattern {
    public static void main(String[] args) {
        int totalRows = 5;
        zOTriPattern(totalRows);
    }

    public static void zOTriPattern(int totalRows) {
        for(int row=0; row<totalRows; row++){
            for(int col=0; col<row+1; col++){
                if((row+col)%2==0){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
    
}
