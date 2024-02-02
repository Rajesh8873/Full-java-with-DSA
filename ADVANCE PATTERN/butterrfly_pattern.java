public class butterrfly_pattern {
    public static void butterfly_pattern(int n){
      //1st half
      for(int i=1; i<=n; i++){
        //stars - 1 
        for(int j=1; j<=i; j++){
            System.out.print("*");
        }
        //space - 2*(n-1)
        for(int j=1; j<=2*(n-i); j++){
            System.out.print(" ");
        }
        //stars-i
        for(int j=1; j<=i; j++){
            System.out.print("*");
        }
        System.out.println();
      }


      //2nd Half
      for(int i=n; i>=1; i--){
         //stars - 1 
         for(int j=1; j<=i; j++){
            System.out.print("*");
        }
        //space - 2*(n-1)
        for(int j=1; j<=2*(n-i); j++){
            System.out.print(" ");
        }
        //stars-i
        for(int j=1; j<=i; j++){
            System.out.print("*");
        }
        System.out.println();
    }

    }
   public static void main(String[] args) {
    butterfly_pattern(4);
   } 
}
