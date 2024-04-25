import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro:");
        int parametroUm = scanner.nextInt();

        System.out.println("Digite o segundo parâmetro:");
        int parametroDois = scanner.nextInt();

        scanner.close();

        try {
            contar(parametroUm, parametroDois);
        } catch (Exception e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
    }

    public static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();
        } else {
            int contagem = parametroDois - parametroUm;
            // for para imprimir os numeros com base na variavel contagem
            for (int i = 0; i < contagem; i++) {
                System.out.println("Imprimindo o número " + (i + 1));
            }
        }
    }
}
