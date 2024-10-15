public abstract class DecoratorAlerta implements StrategyAlerta {
    protected StrategyAlerta decoratedAlerta;

    public DecoratorAlerta(StrategyAlerta decorated) {
        this.decoratedAlerta = decorated;
    }

    @Override
    public void emitirAlerta(Object[] parametros) {
        decoratedAlerta.emitirAlerta(parametros);
    }

    @Override
    public void recomedacao() {
        decoratedAlerta.recomedacao();
    }

    @Override
    public void isTest() {
        decoratedAlerta.isTest();
    }
}