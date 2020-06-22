package cafe;

import com.itextpdf.io.IOException;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Image;
import com.itextpdf.layout.element.List;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.property.TextAlignment;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;

/**
 * @author Aguilar Ceja Luis Angel (2020640029)
 * @author Cabello Vargas Victor Manuel(2020640111)
 * @author Gallegos Salinas Emilio (2020640198)
 * @author Martin Moreno Cesar Sadrack (2020640287)
 */
public class Ticket {
       
    /**
     * Este metodo es el que se utiliza en "TerminarPedido" para crear el ticket en PDF de las compras del cliente
     * @throws IOException
     * @throws FileNotFoundException
     * @throws MalformedURLException 
     */
    public static void crearPdf() throws IOException, FileNotFoundException, MalformedURLException{
        PdfWriter writer= new PdfWriter("Ticket.pdf");
        PdfDocument pdf = new PdfDocument(writer);
        //creamos un documento,aqui se da el formato
        Document document=new Document(pdf);
        //para imagenes C:\\Users\\super\\OneDrive\\Imágenes\\
        Image logo=new Image(ImageDataFactory.create("intento1.PNG"));
        Paragraph titulo=new Paragraph();
        titulo.setTextAlignment(TextAlignment.CENTER);
        titulo.add(logo);
        //creamos la lista de productos
        List productos = new List();
        productos.setSymbolIndent(12);
        //agregamos a la lista los productos que consumio y su precio
        for(int i=0; i<Cafeteria.getCuenta().getListaCafe().size();i++){
            productos.add("Cafe : " + Cafeteria.getCuenta().getListaCafe().get(i).getNombreCafe());
            productos.add("Jarabe : " + Cafeteria.getCuenta().getListaCafe().get(i).getNombreJarabe());
            productos.add("Leche : " + Cafeteria.getCuenta().getListaCafe().get(i).getLeche().toString());
            productos.add("Tamaño : " + Cafeteria.getCuenta().getListaCafe().get(i).getVaso().toString());
            productos.add("Num shots : " + Cafeteria.getCuenta().getListaCafe().get(i).getNumShots());
            productos.add("Precio: $ : " + Cafeteria.getCuenta().getListaCafe().get(i).getCostoTotal()+"\n\n\n");
        }
     
        productos.add("\n\n\n Precio total de la cuenta: $ " + String.valueOf(Cafeteria.getCuenta().getPagoDeLaCuenta()));
        //creas un parrafo con la direccion
        Paragraph direccion=new Paragraph("Avenida Instituto Politécnico Nacional No. 2580, Col Barrio la Laguna Ticomán, Gustavo A. Madero, Ciudad de México, C.P. 07340.\n" +
"Teléfono: 57296000, extensión 56806");
       //hacemos el parrafo direccion en cursiva,asi como le cambiamos el tamaño y la alineacion
        direccion.setItalic();
        direccion.setFontSize(9);
        direccion.setTextAlignment(TextAlignment.CENTER);
        //agregamos al documento 
        document.add(titulo);
        document.add(direccion);
        document.add(productos);
        
        //cerramos el documento
        document.close();
    }
    
}
