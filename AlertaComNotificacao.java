public class AlertaComNotificacao extends DecoratorAlerta {

    public AlertaComNotificacao(StrategyAlerta decorated) {
        super(decorated);
    }

    @Override
    public void emitirAlerta(Object[] parametros) {
        super.emitirAlerta(parametros);
        System.out.println("Enviando notificações de alerta...");
    }

    @Override
    public void recomedacao() {
        super.recomedacao();
        System.out.println("Enviando notificações de recomendação...");
    }
}