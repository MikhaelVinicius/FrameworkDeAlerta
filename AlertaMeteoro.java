public class AlertaMeteoro implements StrategyAlerta {
    @Override
    public void emitirAlerta() {
        System.out.println("Alerta: Meteoro em rota de colisão! Proteja-se.");
    }

    @Override
    public void recomedacao(){
       System.out.println("Recomendação: Se despeça!"); 
    }

    @Override
    public void isTest(boolean isTest){
        if(isTest == true){
            System.err.println("Isso é um teste! Não leve em consideração");
        } else{
            System.out.println("AVISO: ISSO NÃO É UM TESTE!");
        }
    }
}
