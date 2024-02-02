public class halfperamids {
    public static void inverted_half_paramed(int n) {
        // inner_ number
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i+1; j++){
            System.out.print(j+"");
            }
            System.out.println();
        }
        
    }
 public static void main(String[] args) {
    inverted_half_paramed(10); 
 } 
    
}
