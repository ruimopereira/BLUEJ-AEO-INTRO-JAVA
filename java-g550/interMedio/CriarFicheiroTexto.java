package interMedio;

/**
 * Escreva uma descrição da classe criar aqui.
 * 
 * @author (Ruin Prier) 
 * @version (v1.0 - 14/09/2022)
 */
import java.io.FileNotFoundException;
import java.lang.SecurityException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CriarFicheiroTexto {
    private static Formatter saida; // envia texto para um arquivo

    public static void main(String[] args) {
        abrirArquivo();
        adicionarDados();
        fecharArquivo();
    }
    // Método para abrir (ou criar) o arquivo arquivo.txt
    public static void abrirArquivo() {
        try {
            saida = new Formatter("Ficheiro.txt"); // Abrir o Ficheiro
        }
        catch (SecurityException ErroSegurancaPermissao) {
            ErroSegurancaPermissao.printStackTrace();
            System.err.println("Não é possível escrever no Ficheiro. A Finalizar. ");
            System.exit(1); // terminar o programa
        }
        catch (FileNotFoundException ErroFichNaoEncontrado) {
            ErroFichNaoEncontrado.printStackTrace();
            System.err.println("Erro ao abrir o Ficheiro. A Finalizar. ");
            System.exit(1); // Finalizar o programa
        }
        /* finally{
            saida.close();
        } */
    }

    // Método para adicionar registos no arquivo
    public static void adicionarDados() {
        Scanner entrada = new Scanner(System.in);
        System.out.printf("%s%n","Insira o código do produto e nome do item para registar:");
        System.out.printf("%s%n","Para guardar os dados inseridos pressione Ctrl+Z:");
        while (entrada.hasNext()) { // iterar até que seja encontrado o marcador de fim-de-arquivo
            try {
                // Gravar novo registro no arquivo; não verifica se entrada é válida.
                saida.format("%d %s %n", entrada.nextInt(),entrada.next());
            }
            catch (FormatterClosedException formatterClosedException) {
                System.err.println("Erro ao escrever no ficheiro. Finalizando.");
                break;
            }
            catch (NoSuchElementException elementException) {
                System.err.println("Entrada inválida. Tente novamente.");
                entrada.nextLine(); // Descartar a entrada para que o usuário possa tentar de novo
            }
            System.out.print("Entre com o próximo código e item:\n");
        } // Fim do laço while
    } // Fim do método adicionarDados

    // Método para fechar o arquivo
    public static void fecharArquivo() {
        if (saida != null)
            saida.close();
    }
} // Fim da classe CriarArquivoTexto
