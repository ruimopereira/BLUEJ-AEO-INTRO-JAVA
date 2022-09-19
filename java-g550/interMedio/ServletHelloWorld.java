/**
 * 
 */
package packj2;
import java.io.IOException;
import java.io.PrintWriter;
//Bibliotecas da classe Servlet
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * @author Rui Pereira
 *
 */
public class ServletHelloWorld extends HttpServlet {
      public void doGet(HttpServletRequest pedido, HttpServletResponse resposta) throws ServletException, IOException {
        try {
          PrintWriter saidaHTML = resposta.getWriter();
            saidaHTML.println("<html>\n" +
                        "<head><title>Hello WORLD</title></head>\n" +
                        "<body>\n" + "<h1>Hello WORLD</h1>\n" + "</body></html>");
        }
        catch(ServletException errServidor) {
            System.out.printf("\n %s " , errServidor.getMessage() );
            errServidor.printStackTrace();
          }
        catch(IOException errEntradaSaida) {
            System.out.printf("\n %s " , errEntradaSaida.getMessage() );
            errEntradaSaida.printStackTrace();
          }
        finally {
            System.out.print("\n final ");
            }
        }

    /**
     * 
     */
    public ServletHelloWorld() {
        // TODO Auto-generated constructor stub
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}
