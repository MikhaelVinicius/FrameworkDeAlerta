 public class AlertaTerremoto implements StrategyAlerta {
  
    @Override
    public void emitirAlerta(Object[] parametros) {
        String alerta = (String) parametros[0];
        double escala = (double) parametros[1];
        System.out.println("Risco eminente de terremoto: " + alerta);
        System.out.println("Escala: " + escala);
    }

    @Override
    public void recomedacao() {
        System.out.println("Recomendação: Va para a rua..");
    }

    @Override
    public void isTest() {
        System.out.println("Isso não é um teste!");
    }

    public void isTest(boolean isTest) {
        if (isTest) {
            System.err.println("Isso é um teste! Não leve em consideração.");
        } else {
            System.out.println("AVISO: ISSO NÃO É UM TESTE!");
        }
    }
}
