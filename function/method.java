package function;
import java.util.*;

public class method {
       
    public static int calculatesum(int num1, int num2){    // perameters or formal parameters
        int sum = num1 +num2;
        return sum;
        
    }

     public static void swap(int a, int b){
        int temp =a;
        a=b;
        b=temp;
        // System.out.println("a="+a);
        // System.out.println("b="+b);
     }
    

     

    public static void main(String[] args) {
        // Scanner sc =new Scanner(System.in);
        // int a = sc.nextInt(); 
        // int b = sc.nextInt();
        // int sum = calculatesum( a,b);  //argument or actual parameters
        // System.out.println("sum is :"+sum);
        

        //=========== swap - value exchange ================
         int a=5;
         int b =10;
         swap(a, b);
          int temp =a;
         System.out.println("a="+a);
        System.out.println("b="+b);

        //  //show//
        //  int temp =a;
        //  a=b;
        //  b=temp;
        //  System.out.println("a="+a);
        //           System.out.println("b="+b);



    }
}
