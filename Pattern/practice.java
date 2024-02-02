package Pattern;

import java.util.Scanner;

public class practice {

    // public static void main(String[] args) {
    //     // int n = 4;
    //     for(int line = 1; line <=4; line++) {

    //         for(int star=1; star <=line; star++) {
    //             System.out.print("*");
    //         } 
    //         System.out.println();
    //     }         
    // }

    // =============== next program  =====================

   
    // public static void main(String[] args) {
    //     int n = 5;
    //     for(int line=1; line<=5; line++){
    //         for(int star=1; star<=(n-line+1); star++){
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    // }
    

    public static void main(String[] args) {
        

    // int n =100;
    // for(int line=1; line<=n; line++){
    //     for(int number=1; number<=line; number++){
    //         System.out.print(number);

    //     }
    //    System.out.println();
    // }

    // int n =7;
    // char ch ='A';
    // for(int line=1; line<=n; line++){
    //     for(int chars=1; chars<=line; chars++){
        
    //     System.out.print(ch);
    //     ch++;
    //     }
    //     System.out.println();
    // }
    // int list,star,row=6;
    // for(list=0; list<row; list++){
    //     for(star=row-1; star>1; star--){
    //         System.out.print("");
    //     }
    //     for(star=0; star<=list; star++){
    //         System.out.print("*");
    //     }
    //     System.out.println();
    // }
      
    // int i,j,row=6;
    // for(i=0; i<row; i++){
    //     for(j=row-i; j>1;j--){
    //         System.out.print("");
    //     }
    //     for(j=0; j<=i; j++){
    //         System.out.print("*");
    //     }
    //     System.out.println();
    // }

    
              int row, i, j, space=1;
              System.out.print("enter your");
              Scanner sc =new Scanner(System.in);
              row =sc.nextInt();
              space =row-1;
              for(j=1; j<=row; j++){
                for(i=1; i<=space; i++){
                    System.out.print("");
                }
                space--;
                for(i=1; i<=2*j-1; i++){
                    System.out.print("*");
                }
                System.out.println();
              }
              space=1;
              for(j=1; j<=row-1; j++){
                for(i=1; i<=space; i++){
                System.out.print("");
             }
             space++;
             for(i=1; i<=2*(row-j)-1;i++){
                System.out.print("*");
             }
             System.out.println();
            }
              
    }
}
