package cafe;

import java.util.ArrayList;

/**
 * @author Cesar Martin
 */
public abstract class Producto {

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
