public class solid_rhombus {
    public static void solid_rohambus(int n){
        for(int i=1; i<=n; i++ ){
            //spaces
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }

            //stars
            for(int j=1; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


    //  ===========  hello rhombus patteran =========  //

    
    public static void hollo_rhombus(int n){
      for(int i=1; i<=n; i++){
        //space
        for(int j=1; j<=(n-i);j++){
            System.out.print(" " );
        }
        // hellow rectangle
        for(int j=1; j<=n; j++){
            if(i == 1 || i== n || j == 1 || j == n){
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
        }
        System.out.println();
      }
    }

    public static void Dimand(int n) {
        // 1st half
        for(int i=1; i<=n; i++){
            //space
            for(int j=1; j<=(n-i); j++){
                System.out.println(" ");
            }
            for(int j=1; j<=(2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        // 2st half
        for(int i=n; i>=1; i--){
            //space
            for(int j=1; j<=(n-i); j++){
                System.out.println(" ");
            }
            for(int j=1; j<=(2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        //solid_rohambus(6);
         //hollo_rhombus(6);
        Dimand(3);
    }
     
}
