package cafe;
/**
 * @author Cesar Martin
 */
public enum Tamaño {
    //En el parametro se encuentra el costo adicional
    CHICO(0),
    MEDIANO(4),
    GRANDE(8);
    //campos de instancia
    public final double precioPorTamanio;
    
    private final double costoBase;
    
    private Tamaño(double precioPorTamanio){
        this.precioPorTamanio = precioPorTamanio;
        costoBase = 20;
    }
    
    public double getPrecioPorTamanio(){
        return precioPorTamanio;
    }

    public double getCostoBase() {
        return costoBase;
    }
}
