import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {

        DateFormat df = new SimpleDateFormat ("dd MM yy");
        Scanner scanner = new Scanner(System.in);
        System.out.println ("Infome o seu nome:");
        String nome = scanner.nextLine();
        System.out.println ("Informe a sua data de nascimento no estilo: ('dd MM yy')");
        String data = scanner.nextLine();
        Date date = df.parse(data);
        df.format(date);

       calcularDias(nome,date);
       scanner.close();

}
 public static void calcularDias(String nome, Date date){
    DateFormat df = new SimpleDateFormat ("dd MM yy");
    Date dateAtual = new Date( );
    df.format(date);
    df.format(dateAtual);

    System.out.println (date);
    System.out.println (dateAtual);
    long dt = (dateAtual.getTime() - date.getTime()) + 3600000; // 1 hora para compensar horário de verão
    System.out.println (nome + " viveu até hoje "+ dt / 86400000 +" dias.\n");
 }
}
