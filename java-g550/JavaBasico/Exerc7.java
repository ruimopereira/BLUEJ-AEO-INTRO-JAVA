package JavaBasico;

/**
 * Ler uma temperatura em graus Celsius e apresenta-la convertida em graus Fahrenheit. A fórmula de conversão é:
 * F = (9*C+160) / 5, sendo F a temperatura em Fahrenheit e C a temperatura em Celsius.
 * 
 * @author (Rui Pereira) 
 * @version (v1.0 - 14/09/2022)
 */
import java.util.Scanner; 
public class Exerc7{
    public static void main (String args[]){
        Scanner input = new Scanner(System.in); 
        double c,f;

        System.out.print("Digite a temperatura em Graus Celsius:" ); 
        c = input.nextDouble();

        f = (9 * c + 160) / 5;

        System.out.printf(" A temperatura convertida para Fahrenheit é:" + f);
    }
}