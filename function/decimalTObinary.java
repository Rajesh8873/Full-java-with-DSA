public class decimalTObinary {
    public static void detchobin(int n){
        int mynum = n;
        int pow = 0;
         int binNum =0;

         while(n>0){
            int rem =n%2;
            binNum = binNum +(rem * (int)Math.pow(10,pow));

        }
        System.out.println("binary form of"+mynum+"="+ binNum);
    }
    
    public static void main(String[] args) {
    System.out.println(detchobin(7));
    }
    
}
