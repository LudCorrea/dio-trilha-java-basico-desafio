import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // next() lê até o primeiro espaço enquanto nextLine() lê até encontrar uma
        // quebra de linha.
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o seu nome completo:");
        String nomeCompleto = scanner.nextLine();

        System.out.println("Por favor, digite o número da sua conta:");
        int numeroDaConta = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Por favor, digite o número da sua Agência:");
        String numeroDaAgencia = scanner.next();
        scanner.nextLine();

        System.out.println("Por favor, digite o valor do depósito:");
        double valorDoDeposito = scanner.nextDouble();
        scanner.nextLine();

        scanner.close();

        System.out.println("Olá " + nomeCompleto + ", obrigado por criar uma conta em nosso banco. Sua agência é "
                + numeroDaAgencia + ", sua conta é " + numeroDaConta + " e o seu saldo é R$" + valorDoDeposito
                + " e já está disponível para saque. Conte conosco, muito obrigado.");

    }
}
