public class AlertaFuracao implements EstrategiaAlerta {
    @Override
    public void emitirAlerta() {
        System.out.println("Alerta: Furacão se aproximando! Evacue a área.");
    }

    @Override
    public void recomedacao(){
       System.out.println("Não saia de casa em nenhuma circustancia, se abrige no subsolo se possível!"); 
    }

    @Override
    public void isTest(){
        System.err.println("Isso não é um teste!");
    }
}
