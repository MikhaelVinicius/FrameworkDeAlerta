public class SistemaAlerta {
    private static SistemaAlerta instancia;
    private EstrategiaAlerta estrategiaAtual;

   
    private SistemaAlerta() {}

 
    public static SistemaAlerta getInstancia() {
        if (instancia == null) {
            instancia = new SistemaAlerta();
        }
        return instancia;
    }

  
    public void definirEstrategia(EstrategiaAlerta estrategia) {
        this.estrategiaAtual = estrategia;
    }


    public void emitirAlerta() {
        if (estrategiaAtual != null) {
            estrategiaAtual.emitirAlerta();
        } else {
            System.out.println("Nenhuma estratégia de alerta definida.");
        }
    }
}
