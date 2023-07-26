package candidatura;

public class Case3 {
    public static void main(String[] args) {
        MandarParaRH();
    }

    static void MandarParaRH(){
        String [] candidatosEscolhidos = {"FELIPE","MÁRCIA","FABRÍCIO","MIRELA","DANIELA"};

        System.out.println("Lista com índice numérico: ");
        for (int i = 0; i < candidatosEscolhidos.length; i++){
        System.out.println("O candidato nº " + (i+1) + " é o(a) " + candidatosEscolhidos[i]);
        }

        System.out.println("Lista sem índice:");
        for (String candidato:candidatosEscolhidos){
            System.out.println(candidato);
        }
    }
}
