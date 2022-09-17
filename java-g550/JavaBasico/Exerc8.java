package JavaBasico;

/**
 * Elaborar um programa que efetue a apresentção do valor da conversao em euros (€) de um valor lido em dólar {US$).
 * O algoritmo deverá solicitar o valor da cotação do dólar e também a quantidade de dólares disponíveis. 
 * 
 * @author (Rui Pereira) 
 * @version (v1.0 - 14/09/2022)
 */
import java.util.Scanner; 
public class Exerc8{
    public static void main(String args[]){

        Scanner input = new Scanner(System .in);

        double euro; // valor da conversão de dólar para euro
        double dolar;  //quantidade em dólares do utilizador 
        double cotacao; //cotação do dólar

        System.out .print(" Digite a quantidade em dolares:" ); 
        dolar = input.nextDouble();
        System.out .print("Digite a cotação do dolar em relação ao euro:" ); 
        cotacao = input .nextDouble();
        euro = dolar * cotacao;
        System.out .printf("Quantia em Euros: " + euro + " €");
    }
}