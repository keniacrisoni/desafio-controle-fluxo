import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primeiro numero");
        int parametroUm = terminal.nextInt();

        System.out.println("Digite o segundo numero");
        int parametroDois = terminal.nextInt();

        try {
            contar(parametroUm, parametroDois);
            terminal.close();
        } catch (ParametrosInvalidosException e) {

            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {

        if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");

        }

        int contagem = parametroDois - parametroUm;

        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o numero " + (parametroUm + i));
        }
    }

}
