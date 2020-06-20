/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
 *
 * @author super
 */
public class Ticket {
    public void crearPdf() throws IOException, FileNotFoundException, MalformedURLException{
        PdfWriter writer= new PdfWriter("C:\\Users\\super\\OneDrive\\Documentos\\NetBeansProjects\\Pdf\\Prueba.pdf");
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
        /*for(Productos prod:productos){
            productos.add(prod.nombre+"\t"+prod.precio);
        }*/
        productos.add("aqui van los productos.........."+"$precio");
        productos.add("aqui van los productos 2.........."+"$precio");
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
