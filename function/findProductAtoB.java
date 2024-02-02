package function;

public class findProductAtoB {

    public static int multiplay(int a, int b) {
        int product = a*b;
        return product;

        
    }
    public static void main(String[] args) {
       int a=3;
       int b=5;
       int prod = multiplay(a,b);
    
      System.out.println("a*b="+prod);
      prod =multiplay(10, 20);
      System.out.println("a*b= "+ prod);
    }
}
