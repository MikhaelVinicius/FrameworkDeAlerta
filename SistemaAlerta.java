public class SistemaAlerta {
    private static SistemaAlerta instancia;
    private StrategyAlerta estrategiaAtual;

   
    private SistemaAlerta() {}

 
    public static SistemaAlerta getInstancia() {
        if (instancia == null) {
            instancia = new SistemaAlerta();
        }
        return instancia;
    }

  
    public void definirEstrategia(StrategyAlerta estrategia) {
        this.estrategiaAtual = estrategia;
    }


    public void emitirAlerta() {
        if (estrategiaAtual != null) {
            estrategiaAtual.emitirAlerta();
        } else {
            System.out.println("Nenhuma estratégia de alerta definida.");
        }
    }

    public void recomedacao(){
        if (estrategiaAtual != null){
            estrategiaAtual.recomedacao();
        } else {
            System.out.println("Nenhuma recomedação disponivel");
        }
    }

    public void isTest(boolean isTest){
        if (estrategiaAtual != null) {
            estrategiaAtual.isTest(isTest);
        } else {
            System.out.println("Isso não é um teste!");
        }
    }
}
