public class floyd_conter {
    public static void floyds_tringalle(int n){
      int counter = 1;
        for (int i=1; i<=n; i++){
         // inner - how many times will counter br printed
          for(int j=1; j<=i; j++){
            System.out.print(counter+"");
            counter++;
          }
          System.out.println();
        }

    }
    public static void main(String[] args) {
       floyds_tringalle(5); 
    }
    
}
