package cafe;

import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author emili
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
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        labelTerminar.setText("Concluir Pedido");

        vasitoCafe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cafe_Vaso.png"))); // NOI18N

        labelCafe.setText("Cafe: ...");

        labelTamanio.setText("Tamaño: ...");

        labelJarabe.setText("Jarabe: ...");

        labelNumShot.setText("Num Shots: ...");

        jButton1.setText("Comprar");

        jButton2.setText("Seguir comprando");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(162, 162, 162)
                .addComponent(labelTerminar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(vasitoCafe)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelCafe, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelTamanio)
                    .addComponent(labelJarabe)
                    .addComponent(labelNumShot))
                .addGap(0, 113, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(labelTerminar)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(vasitoCafe))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(labelCafe, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelTamanio)
                        .addGap(18, 18, 18)
                        .addComponent(labelJarabe)
                        .addGap(18, 18, 18)
                        .addComponent(labelNumShot)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(27, 27, 27))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel labelCafe;
    private javax.swing.JLabel labelJarabe;
    private javax.swing.JLabel labelNumShot;
    private javax.swing.JLabel labelTamanio;
    private javax.swing.JLabel labelTerminar;
    private javax.swing.JLabel vasitoCafe;
    // End of variables declaration//GEN-END:variables

private void cambiarMetodo() {
        ClaseYellow cf = new ClaseYellow("Cream Cake.ttf");
        ClaseYellow st  = new ClaseYellow("Sweety Strawberry.ttf");
        ClaseYellow yt  = new ClaseYellow("DK Lemon Yellow Sun.otf");
        
        labelTerminar.setFont(st.MyFont(1, 30));
        labelCafe.setFont(st.MyFont(1, 30));
        labelJarabe.setFont(st.MyFont(1, 30));
        labelNumShot.setFont(st.MyFont(1, 30));
        labelTamanio.setFont(st.MyFont(1, 30));
        
//        Latte.setFont(cf.MyFont(0, 30));
//        precioAmericano.setFont(yt.MyFont(1, 20));
        
    }
}