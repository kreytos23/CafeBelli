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
    private ArrayList<Cafe> cafeDeLaCuenta;
    private Cafe cafeAux;
    
    SimpleDateFormat format = new SimpleDateFormat("dd/mm/aaaa");
    
    Cuenta(int mesa){
      this.mesa = mesa;
      cafeAux = new Cafe();
      cafeDeLaCuenta = new ArrayList<>();
    }
    
    public Cafe getCafe(){
        return cafeAux;
    }
    
    public ArrayList<Cafe> getListaCafe(){
        return cafeDeLaCuenta;
    }
    
    
}
