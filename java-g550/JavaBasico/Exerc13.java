package JavaBasico;
/**
 * 11.	Entrar com dois números e imprimir o menor numero (suponha números diferentes).
 * 
 * @author (Ruin Prier) 
 * @version (v1.0 - 14/09/2022)
 */
import  java.util.Scanner; 
public class Exerc13{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int num;
        System.out.print(" digite um numero: "); 
        num  =  input.nextInt();
        if (num >= 20 )
            System.out.print(" numero " + num + " e maior que 20");
        else if( num < 20 )
                System.out.print( "numero " + num + " e menor que 20");
    }
}