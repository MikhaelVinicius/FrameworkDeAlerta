public class AlertaMissil implements StrategyAlerta {
    
@Override
public void emitirAlerta(){
    System.out.println("Missil balistico a caminho, se projeta no subtteraneo!");
}

public void recomedacao(){
    System.err.println("Procure um abrigo imediato, não olhe para a explosão!");
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
