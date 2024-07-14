import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class processoSeletivo {

    public static void main(String[] args) {
        String [] candidatos = {"Rodrigo", "Cleonice", "Lúcia", "Cleide", "Mary",};
        for(String candidato: candidatos){
            entrandoEmContato(candidato);
        }
    }
    static void entrandoEmContato(String candidato){

        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if (continuarTentando)
                tentativasRealizadas++;

                else 
                System.out.println("CONTATO REALIZADO COM SUCESSO!!!");
            
            //elas precisão sofrer alterações

        }while(continuarTentando && tentativasRealizadas <3);

        if (atendeu) 
            System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " NA " + tentativasRealizadas + " TENTATIVA");

            else
                System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato + ", NÚMERO MÁXIMO TENTATIVAS " + tentativasRealizadas);
            
        
    }

    //Método auxiliar

    static boolean atender() {
        return new Random().nextInt(3)==1;
    }

    static void imprimirSelecionados(){

        String [] candidatos = {"Rodrigo", "Cleonice", "Lúcia", "Cleide", "Mary",};
        System.out.println("Imprimindo a lista de candidatos informando o índice do elemento.");

        for ( int indice = 0; indice < candidatos.length; indice ++){
            System.out.println("O candidato de n°: " + (indice+1) + " é o " + candidatos[indice]);
        }

        System.out.println("\nForma abreviada de interação (for each)\n");

        for (String candidato: candidatos){

            System.out.println("O candidato selecionado foi " + candidato);
        }
    }

    static void selecaoCndidato(){

        String [] candidatos = {"Rodrigo", "Cleonice", "Lúcia", "Cleide", "Mary", "Felipe", "Gustavo", "Fernando", "Rafaela", "Pedro"};

        int candidatosSelecionados = 0;
        int candidatosAtual =0;
        double salarioBase = 2000.0;

        while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou este valor de salário " + salarioPretendido);

            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga.");
                candidatosSelecionados++;
            }
            candidatosAtual ++;
        }
    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800.0, 2000.0);
    }

    static void analisarCandidato(double salarioPretendido){

        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido){
            System.out.println("Entrar em contato com o candidato.");
        }
        else if (salarioBase == salarioPretendido){
            System.out.println("Entrar em contato com o candidato para oferecer contra proposta.");
        }
        else
        System.out.println("Aguardar os demais candidatos.");
    }
}