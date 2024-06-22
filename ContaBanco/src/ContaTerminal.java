import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);


        System.out.println("Por favor, informe o seu nome completo: ");
        String nomeCliente = entrada.nextLine();

        System.out.println("Informe o número de sua Agência: ");
        int agencia = entrada.nextInt();

        System.out.println("Informe o número de sua conta: ");
        int numConta = entrada.nextInt();

        System.out.print("Informe o seu saldo:\nR$ ");
        double saldo = entrada.nextDouble();

        System.out.println("\n-----------------------------\n");


        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, o número de sua agência é " + agencia + ", com conta de número " + numConta + ", e seu saldo de R$" + saldo + " encontra-se disponível para saque.\n\n" );

        System.out.println("-----------------------------");
    }
}
