package cafe;

import java.awt.Font;
import java.awt.HeadlessException;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
/**
 * @author Aguilar Ceja Luis Angel (2020640029)
 * @author Cabello Vargas Victor Manuel(2020640111)
 * @author Gallegos Salinas Emilio (2020640198)
 * @author Martin Moreno Cesar Sadrack (2020640287)
 */
public class TerminarPedido extends javax.swing.JPanel {

    //Para manipular la fecha 
    Date fechaActual = new Date ();
    SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/yyyy");
    
    /**
     * Creates new form TerminarPedido
     */
    public TerminarPedido() {
        
        initComponents();
        cambiarMetodo();
        fechas();
        datosIniciales();
    }

    private void fechas(){
        System.out.println(fechaActual);
        System.out.println(sdf.format(fechaActual));
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelTerminar = new javax.swing.JLabel();
        vasitoCafe = new javax.swing.JLabel();
        labelCafe = new javax.swing.JLabel();
        labelTamanio = new javax.swing.JLabel();
        labelJarabe = new javax.swing.JLabel();
        labelNumShot = new javax.swing.JLabel();
        btnFinalizarCompra = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        labelLeche = new javax.swing.JLabel();
        labelPrecio = new javax.swing.JLabel();
        terminar = new javax.swing.JLabel();
        otroCafe = new javax.swing.JLabel();

        setOpaque(false);
        setLayout(null);

        labelTerminar.setForeground(new java.awt.Color(255, 255, 255));
        labelTerminar.setText("Concluir Pedido");
        add(labelTerminar);
        labelTerminar.setBounds(150, 20, 150, 50);

        vasitoCafe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cafe_Vaso.png"))); // NOI18N
        add(vasitoCafe);
        vasitoCafe.setBounds(10, 100, 202, 258);

        labelCafe.setForeground(new java.awt.Color(255, 255, 255));
        labelCafe.setText("Cafe: ");
        add(labelCafe);
        labelCafe.setBounds(230, 80, 160, 40);

        labelTamanio.setForeground(new java.awt.Color(255, 255, 255));
        labelTamanio.setText("Tamaño: ");
        add(labelTamanio);
        labelTamanio.setBounds(230, 180, 170, 50);

        labelJarabe.setForeground(new java.awt.Color(255, 255, 255));
        labelJarabe.setText("Jarabe: ");
        add(labelJarabe);
        labelJarabe.setBounds(200, 230, 210, 60);

        labelNumShot.setForeground(new java.awt.Color(255, 255, 255));
        labelNumShot.setText("Num Shots: ");
        add(labelNumShot);
        labelNumShot.setBounds(230, 290, 160, 60);

        btnFinalizarCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/vender.png"))); // NOI18N
        btnFinalizarCompra.setBorderPainted(false);
        btnFinalizarCompra.setContentAreaFilled(false);
        btnFinalizarCompra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFinalizarCompra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnFinalizarCompraMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnFinalizarCompraMouseExited(evt);
            }
        });
        btnFinalizarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarCompraActionPerformed(evt);
            }
        });
        add(btnFinalizarCompra);
        btnFinalizarCompra.setBounds(290, 440, 50, 45);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/jarra.png"))); // NOI18N
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton2MouseExited(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2);
        jButton2.setBounds(200, 440, 50, 45);

        labelLeche.setForeground(new java.awt.Color(255, 255, 255));
        labelLeche.setText("Leche:");
        add(labelLeche);
        labelLeche.setBounds(230, 120, 160, 50);

        labelPrecio.setForeground(new java.awt.Color(255, 255, 255));
        labelPrecio.setText("Precio:$");
        add(labelPrecio);
        labelPrecio.setBounds(230, 350, 170, 70);

        terminar.setForeground(new java.awt.Color(255, 255, 255));
        terminar.setText("Terminar Orden");
        add(terminar);
        terminar.setBounds(250, 410, 150, 40);

        otroCafe.setForeground(new java.awt.Color(255, 255, 255));
        otroCafe.setText("Comprar Otro Cafe");
        add(otroCafe);
        otroCafe.setBounds(140, 410, 150, 40);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
        Cafeteria.getCuenta().getCafe().calcularPrecio();
        Cafeteria.getCuenta().getListaCafe().add(Cafeteria.getCuenta().getCafe());
        Cafeteria.getCuenta().setCafeAux(new Cafe()); 
        JOptionPane.showMessageDialog(null, "Compra exitosa");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Falto informacion");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * Este evento crea un PDF con todos los productos adquiridos por el cliente
     * @param evt 
     */
    private void btnFinalizarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarCompraActionPerformed
        Cafeteria.getCuenta().getCafe().calcularPrecio();
        Cafeteria.getCuenta().getListaCafe().add(Cafeteria.getCuenta().getCafe());
        
        for(int x=0; x<Cafeteria.getCuenta().getListaCafe().size();x++){ 
            Cafeteria.getCuenta().setPagoDeLaCuenta(Cafeteria.getCuenta().getListaCafe().get(x).getCostoTotal());
        }
        
        /* En este segmento Try-catch se genera el PDF */
        try {
            Ticket.crearPdf();
            JOptionPane.showMessageDialog(null, "Se ha generado su PDF");
            
        } catch (com.itextpdf.io.IOException ex) {
            Logger.getLogger(TerminarPedido.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TerminarPedido.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(TerminarPedido.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        Cafeteria.getCuentasDelRestaurante().add(Cafeteria.getCuenta());
        guardarElementos();
    }//GEN-LAST:event_btnFinalizarCompraActionPerformed

    private void btnFinalizarCompraMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFinalizarCompraMouseEntered
        terminar.setVisible(true);
    }//GEN-LAST:event_btnFinalizarCompraMouseEntered

    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered
        otroCafe.setVisible(true);
    }//GEN-LAST:event_jButton2MouseEntered

    private void btnFinalizarCompraMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFinalizarCompraMouseExited
        terminar.setVisible(false);
    }//GEN-LAST:event_btnFinalizarCompraMouseExited

    private void jButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseExited
        otroCafe.setVisible(false);
    }//GEN-LAST:event_jButton2MouseExited
                               

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFinalizarCompra;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel labelCafe;
    private javax.swing.JLabel labelJarabe;
    private javax.swing.JLabel labelLeche;
    private javax.swing.JLabel labelNumShot;
    private javax.swing.JLabel labelPrecio;
    private javax.swing.JLabel labelTamanio;
    private javax.swing.JLabel labelTerminar;
    private javax.swing.JLabel otroCafe;
    private javax.swing.JLabel terminar;
    private javax.swing.JLabel vasitoCafe;
    // End of variables declaration//GEN-END:variables

private void cambiarMetodo() {
        ClaseYellow cf = new ClaseYellow("Cream Cake.ttf");
        ClaseYellow st  = new ClaseYellow("Sweety Strawberry.ttf");
        ClaseYellow yt  = new ClaseYellow("DK Lemon Yellow Sun.otf");
        
        labelTerminar.setFont(st.MyFont(1, 20));
        labelCafe.setFont(st.MyFont(0, 20));
        labelJarabe.setFont(st.MyFont(0, 20));
        labelNumShot.setFont(st.MyFont(0, 20));
        labelTamanio.setFont(st.MyFont(0, 20));
        labelLeche.setFont(st.MyFont(0, 20));
        labelPrecio.setFont(st.MyFont(0, 30));
        terminar.setFont(st.MyFont(0, 20));
        terminar.setVisible(false);
        otroCafe.setFont(st.MyFont(0, 20));
        otroCafe.setVisible(false);
        
    }

/**
 * Este metodo cambia los Labels del panenl a la seleccion del usuario
 */
    private void datosIniciales() {

        if(Cafeteria.getCuenta().getCafe() != null){
            if(Cafeteria.getCuenta().getCafe().getNombreCafe()!=null){
                labelCafe.setText("Cafe: " + Cafeteria.getCuenta().getCafe().getNombreCafe());
                labelNumShot.setText("Num Shots: " + Cafeteria.getCuenta().getCafe().getNumShots());
        }
                 else{labelCafe.setText("Cafe:");}
            if(Cafeteria.getCuenta().getCafe().getVaso() != null){
                labelTamanio.setText("Tamaño: " + Cafeteria.getCuenta().getCafe().getVaso().toString() );
            }
            if(Cafeteria.getCuenta().getCafe().getNombreJarabe()!= null){
                labelJarabe.setText("Jarabe: "+ Cafeteria.getCuenta().getCafe().getNombreJarabe());
            }else{labelJarabe.setText("Jarabe: Ninguno");}
            
           if(Cafeteria.getCuenta().getCafe().getLeche()!=null){
                labelLeche.setText("Leche: " + Cafeteria.getCuenta().getCafe().getLeche().toString());
            }
    }
        try {
            Cafeteria.getCuenta().getCafe().calcularPrecio();
        labelPrecio.setText("Precio: $" + String.valueOf(Cafeteria.getCuenta().getCafe().getCostoTotal()));
        } catch (Exception e) {
            labelPrecio.setText("Precio: $");
        }
        
    }
    
    /**
     * Este metodo crea un archivo bina y guarda en el el producto que creo el cliente
     */
    public void guardarElementos(){
     int y = 0;
        try(DataOutputStream buffer = new DataOutputStream(new FileOutputStream("Cuentas.bin", true))){
            buffer.writeUTF("Mesa: " + String.valueOf(Cafeteria.getCuenta().getMesa()));
             buffer.writeInt(Cafeteria.getCuenta().getListaCafe().size());
           for(int x = 0; x < Cafeteria.getCuenta().getListaCafe().size();x++){
                y++;
            // buffer.writeUTF("Fecha: " + Cafeteria.getCuenta().getFecha());
            buffer.writeUTF("Cafe: " + Cafeteria.getCuenta().getListaCafe().get(x).getNombreCafe());
            buffer.writeUTF("Jarabe: " + Cafeteria.getCuenta().getListaCafe().get(x).getNombreJarabe());
            buffer.writeUTF("Leche: " + Cafeteria.getCuenta().getListaCafe().get(x).getLeche().name());
            buffer.writeUTF("Tamaño: " + Cafeteria.getCuenta().getListaCafe().get(x).getVaso().name());
            buffer.writeUTF("Shots: " + String.valueOf(Cafeteria.getCuenta().getListaCafe().get(x).getNumShots()));
            buffer.writeUTF("precio: " + String.valueOf(Cafeteria.getCuenta().getCafe().getCostoTotal()));

           }
          
            buffer.close();
            JOptionPane.showMessageDialog(null, "Guardado Exitosamente", "Listo", JOptionPane.INFORMATION_MESSAGE);
        }catch (NullPointerException | NumberFormatException err){
            JOptionPane.showMessageDialog(null, "Debe Llenar Todos Los Campos", "Incompleto",JOptionPane.ERROR_MESSAGE);
        }catch(IOException | HeadlessException err){
        }
    }
 
}