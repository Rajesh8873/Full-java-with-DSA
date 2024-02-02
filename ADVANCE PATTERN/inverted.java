public class inverted {
    // inverted & Rotated Half-Pyramid
    public static void  half_pyramid(int n ) {
        // outer
        for(int i=1; i<=n; i++){
            // space
            for(int j=1; j<=-n; j++){
            System.out.print("");
           }
           //stars
          for(int j=1; j<=i; j++) {
             System.out.print("*");
          } 

           System.out.println();
        }
    }

    public static void main(String[] args) {
        half_pyramid(7);
    }
}
