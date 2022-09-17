package JavaBasico;
/**
 * Escrever um programa em que leia dais valores para as variáveis A e B, 
 * e efetuar as trocas dos valores de forma que a variável A passe a possuir o valor da variável B 
 * e a variável B passe a possuir o valor da variável A. Apresentar os valores trocados.
 * Lembrando que temos de ter 3 variáveis para que uma haja uma como a variável de armazenamento, 
 * ou seja, para evitar que o valor original de A se perca é necessário associar a uma outra variável 
 * (denominada usualmente de variável auxiliar) tal valor, estabelecer uma associa ao de a com o valor em b e, 
 * por ultimo, associar b ao valor "salvo" na variável auxiliar.
 * 
 * @author (Ruin-Prier) 
 * @version (v1.0 -14/09/2022)
 */
import java.util.Scanner; 

public class Exerc6{
    public static void main (String args[]){
        Scanner input = new Scanner(System.in ); 
        int a, b, c;
        System.out.print("Digite o valor de A:" );
        a = input.nextInt();

        System.out.print("Digite o valor de B:" ); 
        b = input.nextInt();

        c = a; 
        a = b; 
        b = c;

        System.out.println (" 0 valor de A e:" + a); 
        System.out.println (" O valor de B e:" + b);
    }
}