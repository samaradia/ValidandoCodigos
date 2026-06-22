import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o código de referência: ");
        String codigoReferencia = leitura.nextLine();

        Pattern pattern = Pattern.compile("^[A-Z]{3}-\\d{4}$");
        Matcher matcher = pattern.matcher(codigoReferencia);

        if(matcher.matches()){


            System.out.println("O código de referência está válido.");
        } else {
            System.out.println("O código de referência é inválido.");
        }
        leitura.close();
    }
}