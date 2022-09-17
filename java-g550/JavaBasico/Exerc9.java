package JavaBasico;
/**
 * Faça um programa que receba um valor que foi depositado e exiba o valor com rendimento após um mês. 
 * Considere fixo o juro da poupança em 0.70% a.m.
 * 
 * @author (Rui Pereira) 
 * @version (v1.0 - 14/09/2022)
 */
import  java.util.Scanner;
public class Exerc9{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        double deposito; //valor depositado 
        double juros;  //juros de 0,70% ao mês
        double rendimento; // rendimento apos um mês

        System.out.print("Digite o valor do deposito:"); 
        deposito = input.nextDouble();

        juros = ( deposito * 0.70 ) / 100; //calculando a porcentagem de juros 
        rendimento  = juros  + deposito;
        System.out.print("O rendimento da poupança no mes foi de " + rendimento + "  € ");
    }
}