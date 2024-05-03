import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {

        Scanner scanner= new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o número da conta:");
        int numeroConta = scanner.nextInt();

        System.out.println("Digite o número da agência");
        String agencia = scanner.next();
        scanner.nextLine();


        System.out.println("Digite seu nome completo:");
        String nomeCliente = scanner.nextLine();


        System.out.println("Digite seu saldo:");
        Double saldoCliente = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + ", e seu saldo " + saldoCliente + " já está disponível.");



        
    }
}
