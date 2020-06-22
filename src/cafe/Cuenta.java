package cafe;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * @author Aguilar Ceja Luis Angel (2020640029)
 * @author Cabello Vargas Victor Manuel(2020640111)
 * @author Gallegos Salinas Emilio (2020640198)
 * @author Martin Moreno Cesar Sadrack (2020640287)
 */
public class Cuenta {
    /*Atributos*/
    private int mesa;
    private Date fecha;
    private static ArrayList<Cafe> cafeDeLaCuenta;
    private Cafe cafeAux;
    private double pagoDeLaCuenta;
    
    SimpleDateFormat format = new SimpleDateFormat("dd/mm/aaaa");
    
    /*Constructor*/
    Cuenta(int mesa){
      this.mesa = mesa;
      cafeAux = new Cafe();
      cafeDeLaCuenta = new ArrayList<>();
      pagoDeLaCuenta =0;
    }

    public double getPagoDeLaCuenta() {
        return pagoDeLaCuenta;
    }

    public void setPagoDeLaCuenta(double pagoDeLaCuenta) {
        this.pagoDeLaCuenta += pagoDeLaCuenta;
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
