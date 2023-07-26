package candidatura;
public class Case1 {
    public static void main(String[] args) throws Exception {
        analisarSalarioPretendido(2500.00);
        analisarSalarioPretendido(2000.00);
        analisarSalarioPretendido(1950.00);
    }

    static void analisarSalarioPretendido(double salarioPretendido){
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO");
        }
        else if (salarioBase == salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO, COM CONTRA PROPOSTA");
        }
        else{
            System.out.println("AGUARDANDO RESULTADO DOS PRÓXIMOS CANDIDATOS");
        }
    }
}
