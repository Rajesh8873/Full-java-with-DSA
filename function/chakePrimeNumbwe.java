package function;

public class chakePrimeNumbwe {
     public static boolean isprime(int n){
        if (n%2==0){
           return true;
        }
        else{
          return false;
        }
     }
     public static void main(String[] args) {
      System.out.println( isprime(8));

    }
   /*  public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter any number");
        int num=obj.nextInt();
        if(num/2==0){
            System.out.println("given number is even number: ");
        }
    }
    */
}
