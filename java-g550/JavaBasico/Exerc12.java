package JavaBasico;
/**
 * Escreva um programa para ler o raio de um circulo, calcular e escrever a sua area. (  pR2 )
 * Calculo:   area= PI*(raio2)
 * 
 * @author (Ruin Prier) 
 * @version (v1.0 - 14/09/2022)
 */

import java.util.Scanner;
public class Exerc12{
    public static final double PI = 3.14159265359;
    public static void main (String args[]){
        Scanner input = new Scanner (System.in);
        double raio, area;
        System.out.print("Digite o raio do círculo: ");
        raio = input.nextDouble();
        area = PI * (raio * raio);
        System.out.print("A Area do círculo é: " + area);
    }
}