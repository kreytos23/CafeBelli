package cafe;
import java.awt.Font;
import java.io.InputStream;

/**
 * @author Aguilar Ceja Luis Angel (2020640029)
 * @author Cabello Vargas Victor Manuel(2020640111)
 * @author Gallegos Salinas Emilio (2020640198)
 * @author Martin Moreno Cesar Sadrack (2020640287)
 */
public class ClaseYellow {
    /*Atributos*/
    private Font font = null;
     
    /*Constructor*/
    public ClaseYellow(String fontName) {
        try {
            //Se carga la fuente
            InputStream is =  getClass().getResourceAsStream(fontName);
            font = Font.createFont(Font.TRUETYPE_FONT, is);
        } catch (Exception ex) {
            //Si existe un error se carga fuente por defecto ARIAL
            System.err.println(fontName + " No se cargo la fuente");
            font = new Font("Arial", Font.PLAIN, 14);            
        }
}
    
    /*Métodos*/
    public Font MyFont( int estilo, float tamanio)
    {
        Font tfont = font.deriveFont(estilo, tamanio);
        return tfont;
    }
}
