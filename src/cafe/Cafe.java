package cafe;

import java.awt.Image;
/**
 * @author Cesar Martin
 */
public class Cafe extends Producto{
    
    private Image imagen;
    private String nombreCafe;
    private String nombreJarabe;
    private boolean costoBase;
    private double costoTotal;
    private int numShots;

    public String getNombreJarabe() {
        return nombreJarabe;
    }

    public void setNombreJarabe(String nombreJarabe) {
        this.nombreJarabe = nombreJarabe;
    }

    
    public String getNombreCafe() {
        return nombreCafe;
    }

    public void setNombreCafe(String nombreCafe) {
        this.nombreCafe = nombreCafe;
    }

    
    public Image getImagen() {
        return imagen;
    }

    public void setImagen(Image imagen) {
        this.imagen = imagen;
    }

    public boolean isCostoBase() {
        return costoBase;
    }

    public void setCostoBase(boolean costoBase) {
        this.costoBase = costoBase;
    }

    public double getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(double costoTotal) {
        this.costoTotal = costoTotal;
    }

    public int getNumShots() {
        return numShots;
    }

    public void setNumShots(int numShots) {
        this.numShots = numShots;
    }
    
    
}
