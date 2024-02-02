package function;

public class BinomialCoefficient {
    public static int bincoeff(int n, int r) {
        int fact_n=factorial(r);
        int fact_r=factorial(n);
        int fact_nmr=factorial(n-r); 
        int binCoeff = fact_n/(fact_f * fact_nmr);
        return biinCoeff;
        
    }

    public static void main(String[] args) {
        System.out.println(bincoeff(5,2));
        
    }
    
}
