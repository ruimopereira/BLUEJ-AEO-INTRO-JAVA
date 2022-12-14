package JavaBasico;
/**
 * Escrever um programa para determinar o consumo medio de um automóvel 
 * sendo fornecida a distância total percorrida pelo automóvel e o total de combustível gasto. 
 * 
 * @author (Rui Pereira) 
 * @version (v1.0 - 14/09/2022)
 */
import java.util.Scanner; 
public class Exerc3 {
    public static void main (String args[]){
    
    Scanner input = new Scanner(System.in);

    double TaxaDeConsumo;   // media de combustivel por km 
    double kml;             // km inicial
    double km2;             // km final
    double kmtotal;         // km percorridos 
    double litros;          // combustivel gasto

    System.out.print(" Informe o KM inicial: "); 
    kml= input.nextDouble();
    System.out.print(" Informe o KM final: "); 
    km2 = input.nextDouble();
    System.out.print(" Informe a quantidade de litros consumidos:"); 
    litros = input.nextDouble();
    kmtotal = km2 - kml;

    TaxaDeConsumo = kmtotal / litros;

    System.out.println("O  total  percorrido  foi  de: "  + kmtotal +  " Kms"); 
    System.out.println("A Taxa media de consumo e de: " + TaxaDeConsumo + " litros por km percorrido ");
    }
}