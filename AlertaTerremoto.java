 public class AlertaTerremoto implements StrategyAlerta {

    @Override
    public void isTest(boolean isTest){
        if(isTest == true){
            System.err.println("Isso é um teste! Não leve em consideração");
        } else{
            System.out.println("AVISO: ISSO NÃO É UM TESTE!");
        }
    }


    @Override
    public void emitirAlerta() {
        System.out.println("Alerta: Terremoto detectado! Procure abrigo.");
    }
    @Override
    public void recomedacao(){
       System.out.println("Permanceça fora de sua casa de possível ou procure se abrigar debaixo da mesa!"); 
    }
}
