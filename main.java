public class main {  public static void main(String[] args) {

    SistemaAlerta sistema = SistemaAlerta.getInstancia();


    StrategyAlerta alertaFuracao = new AlertaFuracao();
    sistema.definirEstrategia(alertaFuracao);


    sistema.emitirAlerta(new Object[]{"Furacão se aproximando!", 5});


    sistema.recomedacao();

    sistema.isTest();


    StrategyAlerta alertaTerremoto = new AlertaTerremoto();
    sistema.definirEstrategia(alertaTerremoto);
    sistema.emitirAlerta(new Object[]{"Risco de terremoto", 5.5});



}}