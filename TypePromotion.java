import java.util.*;
public class TypePromotion {
    public static void main(String args[]) {

        // java first  automaticcally promotes//

        char a = 'a';
        char b = 'b';
        // System.out.println(b-a);
        System.out.println((int)(b));
        System.out.println((int)(a));
        System.out.println(b-a); 

        // Second automaticcally promotes//
        int a = 10;
        float b=20.25f;
        long c = 25;
        double d = 30;
        double ans = a + b + c + d;
        System.out.println(ans);


    }
    
}
