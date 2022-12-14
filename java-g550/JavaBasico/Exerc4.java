package JavaBasico;
/**
 * Escrever um programa que leia o nome de um vendedor, 
 * o seu salario fixo e o total de vendas efetuadas por ele no mês (em dinheiro).
 * Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas, 
 * informar o seu nome, o salário fixo e salario no final do mês. 
 * 
 * @author (Rui Pereira) 
 * @version (v1.0 - 14/09/2022)
 */
import java.util.Scanner;
public class Exerc4
{
  //  public static void main(String args[])
    {
        Scanner input = new Scanner(System. in);

        String nomeVendedor;
        double salarioFixo;     // Salário Fixo do vendedor 
        double vendas;          //vendas efetuadas pelo vendedor
        double comissao;        //comissão de 15%  sobre as vendas
        double salarioFinal;    //salário final (fixo + comissão )

        System.out.print(" Digite o nome do vendedor:" ); 
        nomeVendedor = input.nextLine();
        System.out.print("Digite o salario fixo do vendedor: " ); 
        salarioFixo = input.nextDouble ();
        System.out.print(" Digite o total de vendas efetuadas pelo vendedor:" ); 
        vendas = input.nextDouble();

        comissao = ( vendas * 15 ) / 100; 
        salarioFinal = comissao + salarioFixo;
        System.out.println("Nome do Vendedor:" + nomeVendedor ); 
        System.out.println("Salario Fixo:" + salarioFixo + " Euros"); 
        System.out.println("Salario Final:" + salarioFinal + " Euros");
    }
}