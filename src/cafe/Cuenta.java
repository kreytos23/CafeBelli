package cafe;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * @author Cesar Martin
 */
public class Cuenta {
    
    private int mesa;
    private Date fecha;
    private static ArrayList<Cafe> cafeDeLaCuenta;
    private Cafe cafeAux;
    
    SimpleDateFormat format = new SimpleDateFormat("dd/mm/aaaa");
    
    Cuenta(int mesa){
      this.mesa = mesa;
      cafeAux = new Cafe();
      cafeDeLaCuenta = new ArrayList<>();
    }

    public int getMesa() {
        return mesa;
    }

    public void setMesa(int mesa) {
        this.mesa = mesa;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public static ArrayList<Cafe> getCafeDeLaCuenta() {
        return cafeDeLaCuenta;
    }

    public static void setCafeDeLaCuenta(ArrayList<Cafe> cafeDeLaCuenta) {
        Cuenta.cafeDeLaCuenta = cafeDeLaCuenta;
    }

    public void setCafeAux(Cafe cafeAux) {
        this.cafeAux = cafeAux;
    }

    public SimpleDateFormat getFormat() {
        return format;
    }

    public void setFormat(SimpleDateFormat format) {
        this.format = format;
    }
    
    public Cafe getCafe(){
        return cafeAux;
    }
    
    public ArrayList<Cafe> getListaCafe(){
        return cafeDeLaCuenta;
    }
    
    
}
