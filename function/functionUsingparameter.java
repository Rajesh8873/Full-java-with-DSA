package function;

public class functionUsingparameter {
    // public static int sum(int a, int b) {
    //     return a + b;
        
    // }
    // public static int sum(int a, int b, int c){
    //     return a + b + c ;

    // }

    // // using float

    public static int  sum(int a ,int b){
        return a+b;
    }
    public static float sum(float a, float b){
        return a+b;
    }
     ///  chekeing or prime number
     public static boolean isPrime(int n){
        boolean isPrime = true;
        for(int i=2; i<=n-1; i++){
            if(n%i==0){
                isPrime = false;
                break;
            }
        }
       return isPrime;
     }

    public static void main(String[] args) {
        // System.out.println(sum(3,5));
        // System.out.println(sum(3.2f, 5.81f ));
        System.out.println(isPrime(9));

    }
}
