public class parterns {
    public static void hollow_rectangle(int totRows, int totCols) {
        //outer loop
       for(int i=1; i<=totRows; i++){
        //inner_loop
          for(int j=1; j<=totCols; j++){
            // cell-(i,j)
               if( i == 1|| i == totRows||j == 1||j == totCols){
                  //boundry cells
                  System.out.print("*");
               }else{
                System.out.print(" "); 
                }
            }
            System.out.println();        
        }
    }

    public static void main(String[] args) {
        hollow_rectangle(4, 5);
    }
}