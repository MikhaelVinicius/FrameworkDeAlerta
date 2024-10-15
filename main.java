public class main {
    public static void main(String[] args) {
      
        SistemaAlerta sistema = SistemaAlerta.getInstancia();

        
        sistema.definirEstrategia(new AlertaTerremoto());
        sistema.emitirAlerta();
     
     
        sistema.definirEstrategia(new AlertaFuracao());
        sistema.emitirAlerta();

        sistema.definirEstrategia(new AlertaMeteoro());
        sistema.emitirAlerta();
        
        sistema.recomedacao();
        sistema.isTest(false);
    }
}
