public class AlertaMeteoro implements EstrategiaAlerta {
    @Override
    public void emitirAlerta() {
        System.out.println("Alerta: Meteoro em rota de colisão! Proteja-se.");
    }

    @Override
    public void recomedacao(){
       System.out.println("Recomendação: Se despeça!"); 
    }

    @Override
    public void isTest(){
        System.err.println("Isso é um teste!");
    }
}
