public class floydTrianglePattern {
    public static void main(String[] args) {
        int totalRows = 5;
        floydTriPattern(totalRows);
    }

    public static void floydTriPattern(int totalRows) {
        int Num = 1;
        for(int row=0; row<totalRows; row++){
            for(int numCount=0; numCount<row+1; numCount++){
                System.out.print(Num + " ");
                Num++;
            }
            System.out.println();
        }
    }
    
}
