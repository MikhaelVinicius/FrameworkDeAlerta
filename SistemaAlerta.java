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

    public void emitirAlerta(Object[] parametros) {
        if (estrategiaAtual != null) {
            estrategiaAtual.emitirAlerta(parametros);
        } else {
            System.out.println("Nenhuma estratégia de alerta definida.");
        }
    }


    public void recomedacao() {
        if (estrategiaAtual != null) {
            estrategiaAtual.recomedacao();
        } else {
            System.out.println("Nenhuma recomendação disponível.");
        }
    }


    public void isTest() {
        if (estrategiaAtual != null) {
            estrategiaAtual.isTest();
        } else {
            System.out.println("Isso não é um teste!");
        }
    }
}