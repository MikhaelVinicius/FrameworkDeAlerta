public class AlertaMissil implements StrategyAlerta {
   
    @Override
    public void emitirAlerta(Object[] parametros) {
        String alerta = (String) parametros[0];
        String origem = (String) parametros[1];
        System.out.println("Alerta de Furacão: " + alerta);
        System.out.println("Origem: " + origem);
    }

    @Override
    public void recomedacao() {
        System.out.println("Recomendação: Se afaste das áreas de risco.");
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
