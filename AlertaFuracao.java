public class AlertaFuracao implements StrategyAlerta {
    @Override
    public void emitirAlerta() {
        System.out.println("Alerta: Furacão se aproximando! Evacue a área.");
    }

    @Override
    public void recomedacao(){
       System.out.println("Não saia de casa em nenhuma circustancia, se abrige no subsolo se possível!"); 
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