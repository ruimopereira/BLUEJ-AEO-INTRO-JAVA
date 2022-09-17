package JavaBasico;
/**
 * Faça um programa que receba o preço de custo de um produto e mostre o valor de venda. 
 * Sabe-se que o preço de custo receberá um acréscimo de acordo com um percentual informado pelo utilizador.
 * 
 * @author (Rui Pereira) 
 * @version (v1.0 - 14/09/2022)
 */
import java.util.Scanner; 
public class Exerc11{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        double precoDeCusto, acrescimo, valorVenda;

        System.out.print("Digite o preço de custo do produto: "); 
        precoDeCusto = input.nextDouble();

        System.out.print("Digite a percentagem de acrescimo: "); 
        acrescimo = input.nextDouble();

        valorVenda = (precoDeCusto * acrescimo) / 100 + precoDeCusto; 
        System.out.printf("O valor de venda do produto é: "+ valorVenda + "€");
    }
}