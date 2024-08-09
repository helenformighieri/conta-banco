import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner write = new Scanner(System.in);

        int senha = 1922;
        int conta = 1021;
        String agencia = "067-8";
        String nomeCliente = "Joana Medeiros";
        float saldo = 237.48f;

        if (agencia == "067-8") {
            System.out.println("Por favor, digite o número da Agência:");
            agencia = write.nextLine();

            System.out.println("Por favor, digite o numero da sua conta:");
            conta = write.nextInt();

            System.out.println("Por favor, digite sua senha:");
            senha = write.nextInt();

            System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo de R$" + saldo + " já esta disponivel para saque.");
        }else {
            System.out.println("Conta não encontrada.");
        }

    }
}