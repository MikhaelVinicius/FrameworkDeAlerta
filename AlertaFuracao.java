public class AlertaFuracao implements StrategyAlerta {

    @Override
    public void emitirAlerta(Object[] parametros) {
        String alerta = (String) parametros[0];
        int categoria = (int) parametros[1];
        System.out.println("Alerta de Furacão: " + alerta);
        System.out.println("Categoria: " + categoria);
    }

    @Override
    public void recomedacao() {
        System.out.println("Recomendação: Se afaste das áreas de risco.");
    }

    @Override
    public void isTest() {
        System.out.println("Isso não é um teste!");
    }

    // Método opcional para testes
    public void isTest(boolean isTest) {
        if (isTest) {
            System.err.println("Isso é um teste! Não leve em consideração.");
        } else {
            System.out.println("AVISO: ISSO NÃO É UM TESTE!");
        }
    }
}