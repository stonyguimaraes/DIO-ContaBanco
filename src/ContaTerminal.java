import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        // Cria o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        
        System.out.println("Por favor, digite o Número da conta!");
        Integer Numero = scanner.nextInt();

        System.out.println("Por favor, digite a Agência!");
        String Agencia = scanner.next();

        System.out.println("Por favor, digite o Nome!");
        String Nome = scanner.next();

        System.out.println("Por favor, digite o Saldo da conta!");
        Double Saldo = scanner.nextDouble();

        System.out.println("");
        System.out.println("===== STATUS DA CONTA =================================");
        System.out.println("");
        System.out.println("Olá " + Nome + ", ");
        System.out.println("obrigado por criar uma conta em nosso banco, ");
        System.out.println("sua Agência é " + Agencia + ", " + "Conta " + Numero );
        System.out.println("e seu Saldo " + Saldo + " já disponível para saque.");
        System.out.println("");
        System.out.println("=======================================================");
        scanner.close();
    }
}
