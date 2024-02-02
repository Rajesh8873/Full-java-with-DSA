import java.util.*;
package function;
public class function {
    public static void printHelloworld(){
        System.out.println("hello would");
    }

     
    public static void calculatesum(){
        Scanner sc =new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println("sum is :"+sum);

    }
    public static void main(String[] args) {
        calculatesum();
    }
}
