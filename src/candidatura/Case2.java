package candidatura;

import java.util.concurrent.ThreadLocalRandom;

public class Case2 {
    public static void main(String[] args) {
        escolherCandidatos();
    }

    static void escolherCandidatos(){
        double salarioBase = 2000.0;
        String[] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};
        int totalSelecionados = 0, proximoCandidato = 0;
        while (totalSelecionados < 5 && proximoCandidato < candidatos.length){
            String candidato = candidatos[proximoCandidato++];
            double valorPretendido = ValorPretendido();
            System.out.println("O(a) candidato(a) " + candidato + " está pedindo " + valorPretendido);

            if (salarioBase < valorPretendido){
                System.out.println("O(a) candidado(a) " + candidato + " não foi selecionado(a)");
            }
            else{
                System.out.println("O(a) candidato(a) " + candidato + " foi selecionado(a)");
                totalSelecionados++;
            }
        }
        System.out.println("Total de selecionados: " + totalSelecionados);
		System.out.println("Total de consultados: " + proximoCandidato);
    }

    static double ValorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
}
