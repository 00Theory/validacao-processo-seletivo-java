package candidatura;

public class Case3 {
    public static void main(String[] args) {
        String [] candidatosEscolhidos = {"FELIPE","MÁRCIA","FABRÍCIO","MIRELA","DANIELA"};

        for (int i = 0; i < candidatosEscolhidos.length; i++){
        System.out.println("O candidato nº " + (i+1) + " é o(a) " + candidatosEscolhidos[i]);
        }

        for (String candidato:candidatosEscolhidos){
            System.out.println(candidato);
        }
    }
}
