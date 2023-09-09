import java.util.Scanner;

public class Contador {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Digite o primeiro parâmetro: ");
            int parametroUm = scanner.nextInt();
            System.out.println("Digite o segundo parâmetro: ");
            int parametroDois = scanner.nextInt();

            scanner.close();

            contar(parametroUm, parametroDois);
        } catch (Exception e) {
            System.out.println(" O segundo parâmetro deve ser maior que o primeiro!");

        }
    }

    public static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();

        } else {
            int quantidadeNumeros = parametroDois - parametroUm;
            // realizar o for para imprimir os números com base na variável contagem
            for (int i = 0; i <= quantidadeNumeros; i++) {
                System.out.println("Imprimindo o número " + (i + 1) + " : " + parametroUm++);

            }

        }
    }
}
