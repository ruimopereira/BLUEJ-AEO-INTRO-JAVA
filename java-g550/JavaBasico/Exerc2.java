package JavaBasico;
/**
 * 2.Escrever um programa que receba dois números e ao final mostre a soma, subtração, multiplicação e a divisão 
 *     dos números lidos 
 * 
 * @author (Rui Pereira) 
 * @version (v1.0 - 14/09/2022)
 */
import java.util.Scanner; 
public class Exerc2{
    
    public static void main(String args[]){
        
        Scanner input = new Scanner(System.in);

        int x,y; //primeiro numero e segundo numero 
        int soma, subt, div, mult, remainder; // operações

        System.out.print("Digite  o primeiro numero:" ); 
        x = input.nextInt ();
        System.out.print("Digite o segundo numero:" ); 
        y = input.nextInt();

        soma      = x + y; 
        subt      = x - y;
        div       = x / y;
        mult      = x * y;
        remainder = x % y;

        System.out.println("A soma é:" +soma ); 
        System.out.println("A subtracção é:" + subt ); 
        System.out.println("A divisao é:" + div ); 
        System.out.println("A multiplicação e:" + mult );
        System.out.println("O resto é:" + remainder );

        System.gc();
    }
}

