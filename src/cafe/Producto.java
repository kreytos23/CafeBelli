package cafe;

import java.util.ArrayList;

/**
 * @author Aguilar Ceja Luis Angel (2020640029)
 * @author Cabello Vargas Victor Manuel(2020640111)
 * @author Gallegos Salinas Emilio (2020640198)
 * @author Martin Moreno Cesar Sadrack (2020640287)
 */
public abstract class Producto {
    /*Atributos*/
    private String descripcion;
    private double costoBase;
    
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getCostoBase() {
        return costoBase;
    }

    public void setCostoBase(double costoBase) {
        this.costoBase = costoBase;
    }
        
    
    
}
