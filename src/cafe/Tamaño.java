package cafe;
/**
 * @author Aguilar Ceja Luis Angel (2020640029)
 * @author Cabello Vargas Victor Manuel(2020640111)
 * @author Gallegos Salinas Emilio (2020640198)
 * @author Martin Moreno Cesar Sadrack (2020640287)
 */
public enum Tamaño {
    /**
     * En el parametro se encuentra el costo adicional
     */
    Chico(0),
    Mediano(4),
    Grande(8);
    
    //campos de instancia
    public final double precioPorTamanio;
    
    private Tamaño(double precioPorTamanio){
        this.precioPorTamanio = precioPorTamanio;
    }
    
    public double getPrecioPorTamanio(){
        return precioPorTamanio;
    }
}
