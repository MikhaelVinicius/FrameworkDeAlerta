public class AlertaMissil implements EstrategiaAlerta {
    
@Override
public void emitirAlerta(){
    System.out.println("Missil balistico a caminho, se projeta no subtteraneo!");
}

public void recomedacao(){
    System.err.println("Procure um abrigo imediato, não olhe para a explosão!");
}

@Override
public void isTest(){
    System.err.println("Isso não é um teste!");
}



}
