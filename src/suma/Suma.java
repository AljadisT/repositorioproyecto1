
package suma;

import java.util.Scanner;


public class Suma {

    
    
    public static void main(String[] args) {
        Scanner tech = new Scanner(System.in);
        Sum S = new Sum();
        
        System.out.println("Número 1");
        S.N1 = tech.nextInt();
        System.out.println("Número 2");
        S.N2 = tech.nextInt();
        
        S.SUMA = S.N1 + S.N2;
        System.out.println(S.N1+" + "+S.N2+" = "+S.SUMA);
        
        
        
    }
    
}
