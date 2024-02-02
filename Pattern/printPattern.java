package Pattern;

public class printPattern {
    // public static void main(String[] args) {
    // for(int line=1; line<=6 ; line++){
    //     //one line
    //     for(int star=1; star<=line; star++) {
    //         System.out.print("*");
    //     }
    //     System.out.println();
    // }
    // }
      
    // ================PRINT INVERTED STAR-PATTERN===========

    // public static void main(String[] args) {
    //     int n =8;
    //     for(int line=1; line<=4; line++ ){
         
    //     for(int star=1; star<=(n-line+1); star++){
    //         System.out.print("*");
    //     }
    //     System.out.println();
    //     }
    // }

   
    // ****** PRINT HALF-PYRAMID PATTERN*************

    
    // public static void main(String[] args) {
    //   int n=6;
    //   for(int line=1; line<=n; line++){
    //     //numbers print
    //     for(int number=1; number<=line; number++ ){
    //         System.out.print(number);
    //     }
    //     System.out.println();
    //   }
        
    // }


    // ######################## PRINT CHARACTER PATTERN ###################

    public static void main(String[] args) {
        int n = 6;
        char ch = 'A';
        // outer loop
        for(int line=1; line<=n; line++){
         
            // inner loop
        for(int chars=1; chars<=line; chars++){
            System.out.print(ch);
            ch++;
        }
        System.out.println();
        }
    }
}
