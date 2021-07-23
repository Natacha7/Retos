package src;

public class OpcionInversion {
       
    public static String compararGanancia(int pTiempo, double pCapital, double pTasaInteres){
        
        double inversionX = pCapital * ((pTasaInteres/100) * pTiempo);
        double inversionY = pCapital * (Math.pow((1+pTasaInteres /100),pTiempo) -1);
        double diferenciaInversion = inversionY - inversionX;
    
    
        return "La diferencia en dinero entre los intereses ganados con la inversión X " + "y la inversión Y es de $" + Math.round(diferenciaInversion);
    }
}
    

