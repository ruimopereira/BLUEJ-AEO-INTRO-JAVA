/**

 * 
 */
package packj2;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
/**
 * @author Ruin Prier

 *
 */
//////////////////////////////////////////////////////////////////////////////////////////////////
public class HelloWorld {
    private String hw; 
    private Long mil1,mil2; 

    public Long getMil1() {
        return mil1;
    }

    public void setMil1(Long mil1) {
        this.mil1 = mil1;
    }

    public void setMil1() {
        this.mil1 = this.miliSegundos();
    }

    public Long getMil2() {
        return mil2;
    }

    public void setMil2(Long mil2) {
        this.mil2 = mil2;
    }    

    public void setMil2() {
        this.mil2 = this.miliSegundos();
    }

    /**
     * @deprecated
     * 
     */
    //////////////////////////////////////////////////////////////////////////////////////////////////
    @Deprecated
    public void finalize() {
        System.out.printf("HW Destruído");
    } 
    //////////////////////////////////////////////////////////////////////////////////////////////////
    public HelloWorld(String[] param) {
        // TODO Auto-generated constructor stub

        hw = new String(" Hello World ");

        System.out.printf("\t Número: %s \n ", hw );    
        try {
            System.out.printf("\n %d \n", param.length );
            for( int i = 0; i < param.length ; i++ )
                System.out.printf("\n %d \t %s ", i , param[i]);

            List<String> p = Arrays.asList(param);
            p.forEach(System.out::println);
        }
        catch(IndexOutOfBoundsException fora) {
            System.out.printf("\t %s \n" , fora.getMessage() );
            fora.printStackTrace();
        }
        finally {
            System.out.printf(" final ");
        }
    }

    /**
     * @param args
     */
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    public void VarsLocais() {
        System.out.println("\n Display \t" + Locale.getDefault(Locale.Category.DISPLAY));
        System.out.println("\n Format \t" + Locale.getDefault(Locale.Category.FORMAT));
        System.out.println("\n Default \t" + Locale.getDefault() ) ;
        //String[] cx  = Locale.getISOLanguages();
        //List<String> it = Arrays.asList(cx);
        //it.forEach(System.out::println );
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    public Long miliSegundos() {
        Long l = System.currentTimeMillis();
        return l;
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    public void impData() {
        ZonedDateTime agora = ZonedDateTime.now();
        System.out.println(" Raw:\t" + agora);
        DateTimeFormatter formaDeData1 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss ");
        String dataformatada1 = agora.format(formaDeData1);
        System.out.println(dataformatada1);
        DateTimeFormatter formaDeData2 = DateTimeFormatter.ofPattern("E, dd/MMMM/yyyy HH:mm:ss ");
        //String dataformatada2 = agora.format(formaDeData2);
        System.out.println(agora.format(formaDeData2));
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        HelloWorld prog;
        JavaPainel jp;
        JavaMoldura jm;
        Aluno al;
        interfaceGrafica ig;
        
        prog = new HelloWorld(args);
        prog.setMil1();
        prog.VarsLocais();
        prog.impData();
        prog.finalize();
        jp = new JavaPainel();
        jm = new JavaMoldura();
        ig = new interfaceGrafica();
        al = new Aluno("Ruy","PHI");
        System.gc();
        prog.setMil2();
    } 
}