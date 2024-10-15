 public class AlertaTerremoto implements EstrategiaAlerta {

    @Override
    public void isTest(){
        System.err.println("Isso não é um teste!");
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
