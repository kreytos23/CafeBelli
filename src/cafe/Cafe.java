package cafe;

import java.awt.Image;
/**
 * @author Cesar Martin
 */
public class Cafe extends Producto{
    
    private Image imagen;
    private String nombreCafe;
    private String nombreJarabe;
    private double costoTotal;
    private int numShots;
    private TipoDeLeche leche;
    private Tamaño vaso;

    
    public Cafe(){
        numShots=1;
        leche= leche.Entera;
        vaso = vaso.Chico;
    }
    public TipoDeLeche getLeche() {
        return leche;
    }

    public void setLeche(TipoDeLeche leche) {
        this.leche = leche;
    }

    public Tamaño getVaso() {
        return vaso;
    }

    public void setVaso(Tamaño vaso) {
        this.vaso = vaso;
    }

    
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
    
    public void calcularPrecio(){
        
        double precioTotal = 0;
        //Se agrega el precio base del cafe
        precioTotal += this.getCostoBase();
        if(nombreJarabe != null){
            //Se agrega el extra del jarabe
            precioTotal += 5;
        }
        //Se suman los shots
        if(numShots>1)
        precioTotal += 7*(numShots-1);
        
        precioTotal +=  vaso.getPrecioPorTamanio();
        
        costoTotal = precioTotal;
        
    }
    
}
