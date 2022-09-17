package JavaBasico;
/**
 * A Loja Mamao com Açúcar esta vendendo seus produtos em 5 (cinco) prestações sem juros. 
 * Faça um programa que receba um valor de uma compra e mostre o valor das prestações.
 * 
 * @author (Rui Pereira) 
 * @version (v1.0 - 14/09/2022)
 */
import java.util.Scanner;
public class Exerc10{
    public static void main (String args[]){
        Scanner input = new Scanner (System.in);

        double valorProduto,valorPrestacao; 
        int parcelas = 5;
        System.out.print(" Digite o valor da compra: ");
        valorProduto = input.nextDouble();
        valorPrestacao = valorProduto / parcelas;
        System.out.print("O valor de cada parcela é de :" + valorPrestacao + "  €" );
    }
}