package candidatura;

import java.util.Random;

public class Case4 {

    public static void main(String[] args) {
        String[] candidatosSelecionados = {"FELIPE","MÁRCIA","FABRÍCIO","MIRELA","DANIELA"};
        for (String candidato : candidatosSelecionados){
            Ligacao(candidato);
        }

        
    }

    static void Ligacao(String candidatoLigacao){

        int tentativasRealizadas = 0;
        boolean continuarTentando = false;
        boolean atendeu = false;
        do{
            atendeu = Atendimento();
            continuarTentando = !atendeu;
            if (continuarTentando){
            tentativasRealizadas++;
            }
            else{
                System.out.println("Ligação realizada!");
            }
        }
        while(continuarTentando && tentativasRealizadas < 3);
        if (atendeu){
            System.out.println("O candidato " + candidatoLigacao + " foi contatado!");
        }
        else{
            System.out.println("O candidato " + candidatoLigacao + " não foi contatado!");
        }
        
    }

    static boolean Atendimento(){
        return new Random().nextInt(3)==1;
    }
}
