import java.util.Scanner;

public class contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            
            System.out.println("Digite o primeiro número:");
            int primeiroNumero = scanner.nextInt();

            System.out.println("Digite o segundo número:");
            int segundoNumero = scanner.nextInt();

            if (primeiroNumero >= segundoNumero) {
                throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
            }
            for (int i = primeiroNumero; i <= segundoNumero; i++) {
                System.out.println("Imprimindo número " + i);
            }

        } catch (ParametrosInvalidosException e) {
            
            System.err.println(e.getMessage());
        } finally {
            
            scanner.close();
        }
    }
}
