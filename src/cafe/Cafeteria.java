package cafe;

import AppPackage.AnimationClass;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;

/**
 * @author Cesar Martin 
 * Para añadir los cafes de una cuenta se usa un array auxiliar aparte
 * del  final para que se use para escribir los cafes nuevos en el pdf
 * y una vez que se escribe se resetea todo ese array auxiliar 
 */
public class Cafeteria extends javax.swing.JFrame {

    private Audio audio;
    private static Cuenta cuentaAuxiliar;
    private FrameDeMenu frameDelMenu;
    private static ArrayList<Cuenta> cuentasDelRestaurante;
    
    
    public Cafeteria() {
        audio = new Audio();
        audio.sonido("Jazz");
        cuentasDelRestaurante = new ArrayList<>();
        initComponents();
        letrerosBotones();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelMenu = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnMesa4 = new javax.swing.JButton();
        btnMesa2 = new javax.swing.JButton();
        btnMesa3 = new javax.swing.JButton();
        btnMesa1 = new javax.swing.JButton();
        LbMesa3 = new javax.swing.JLabel();
        LbMesa1 = new javax.swing.JLabel();
        LbMesa4 = new javax.swing.JLabel();
        LbMesa2 = new javax.swing.JLabel();
        mover = new javax.swing.JToggleButton();
        whats = new javax.swing.JButton();
        facebook = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(648, 448));
        setPreferredSize(new java.awt.Dimension(648, 448));

        PanelMenu.setLayout(null);

        jLabel2.setText("jLabel2");
        PanelMenu.add(jLabel2);
        jLabel2.setBounds(170, 70, 41, 16);

        btnMesa4.setToolTipText("");
        btnMesa4.setContentAreaFilled(false);
        btnMesa4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMesa4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/mesa4.png"))); // NOI18N
        btnMesa4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMesa4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMesa4MouseExited(evt);
            }
        });
        btnMesa4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMesa4ActionPerformed(evt);
            }
        });
        PanelMenu.add(btnMesa4);
        btnMesa4.setBounds(488, 250, 163, 165);

        btnMesa2.setContentAreaFilled(false);
        btnMesa2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMesa2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/mesa2.png"))); // NOI18N
        btnMesa2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMesa2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMesa2MouseExited(evt);
            }
        });
        btnMesa2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMesa2ActionPerformed(evt);
            }
        });
        PanelMenu.add(btnMesa2);
        btnMesa2.setBounds(147, 250, 190, 160);

        btnMesa3.setContentAreaFilled(false);
        btnMesa3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMesa3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/mesa3.png"))); // NOI18N
        btnMesa3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMesa3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMesa3MouseExited(evt);
            }
        });
        btnMesa3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMesa3ActionPerformed(evt);
            }
        });
        PanelMenu.add(btnMesa3);
        btnMesa3.setBounds(330, 250, 165, 160);

        btnMesa1.setContentAreaFilled(false);
        btnMesa1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMesa1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/mesa1.png"))); // NOI18N
        btnMesa1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMesa1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMesa1MouseExited(evt);
            }
        });
        btnMesa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMesa1ActionPerformed(evt);
            }
        });
        PanelMenu.add(btnMesa1);
        btnMesa1.setBounds(-10, 250, 170, 170);

        LbMesa3.setBackground(null);
        LbMesa3.setForeground(new java.awt.Color(0, 204, 0));
        LbMesa3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LbMesa3.setText("Mesa 3");
        PanelMenu.add(LbMesa3);
        LbMesa3.setBounds(360, 180, 120, 60);

        LbMesa1.setBackground(null);
        LbMesa1.setForeground(new java.awt.Color(255, 255, 255));
        LbMesa1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LbMesa1.setText("Mesa 1");
        PanelMenu.add(LbMesa1);
        LbMesa1.setBounds(10, 180, 120, 60);

        LbMesa4.setBackground(null);
        LbMesa4.setForeground(new java.awt.Color(204, 0, 0));
        LbMesa4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LbMesa4.setText("Mesa 4");
        PanelMenu.add(LbMesa4);
        LbMesa4.setBounds(510, 180, 120, 60);

        LbMesa2.setBackground(null);
        LbMesa2.setForeground(new java.awt.Color(153, 0, 153));
        LbMesa2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LbMesa2.setText("Mesa 2");
        PanelMenu.add(LbMesa2);
        LbMesa2.setBounds(190, 180, 120, 60);

        mover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jarabes/menu.png"))); // NOI18N
        mover.setBorderPainted(false);
        mover.setContentAreaFilled(false);
        mover.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moverActionPerformed(evt);
            }
        });
        PanelMenu.add(mover);
        mover.setBounds(570, 10, 50, 45);

        whats.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/whats.png"))); // NOI18N
        whats.setBorderPainted(false);
        whats.setContentAreaFilled(false);
        whats.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        whats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                whatsActionPerformed(evt);
            }
        });
        PanelMenu.add(whats);
        whats.setBounds(660, 70, 50, 45);

        facebook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/facebook.png"))); // NOI18N
        facebook.setBorderPainted(false);
        facebook.setContentAreaFilled(false);
        facebook.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        facebook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facebookActionPerformed(evt);
            }
        });
        PanelMenu.add(facebook);
        facebook.setBounds(660, 120, 50, 45);

        jLabel3.setForeground(new java.awt.Color(51, 51, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Siguenos En Nuestras Redes");
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        PanelMenu.add(jLabel3);
        jLabel3.setBounds(330, 10, 250, 60);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/imagen cafeteria reducida.jpg"))); // NOI18N
        PanelMenu.add(jLabel1);
        jLabel1.setBounds(0, 0, 650, 410);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 648, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelMenu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void btnMesa2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMesa2ActionPerformed
        asignacionDeMesa(2);
    }//GEN-LAST:event_btnMesa2ActionPerformed

    private void btnMesa3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMesa3ActionPerformed
        asignacionDeMesa(3);
    }//GEN-LAST:event_btnMesa3ActionPerformed

    private void btnMesa4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMesa4ActionPerformed
        asignacionDeMesa(4);
    }//GEN-LAST:event_btnMesa4ActionPerformed

    private void btnMesa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMesa1ActionPerformed
        asignacionDeMesa(1);
    }//GEN-LAST:event_btnMesa1ActionPerformed

    private void btnMesa1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMesa1MouseEntered
        LbMesa1.setVisible(true);
    }//GEN-LAST:event_btnMesa1MouseEntered

    private void btnMesa1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMesa1MouseExited
        LbMesa1.setVisible(false);
    }//GEN-LAST:event_btnMesa1MouseExited

    private void btnMesa2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMesa2MouseEntered
        LbMesa2.setVisible(true);
    }//GEN-LAST:event_btnMesa2MouseEntered

    private void btnMesa2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMesa2MouseExited
        LbMesa2.setVisible(false);
    }//GEN-LAST:event_btnMesa2MouseExited

    private void btnMesa3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMesa3MouseEntered
        LbMesa3.setVisible(true);
    }//GEN-LAST:event_btnMesa3MouseEntered

    private void btnMesa3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMesa3MouseExited
        LbMesa3.setVisible(false);
    }//GEN-LAST:event_btnMesa3MouseExited

    private void btnMesa4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMesa4MouseEntered
        LbMesa4.setVisible(true);
    }//GEN-LAST:event_btnMesa4MouseEntered

    private void btnMesa4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMesa4MouseExited
        LbMesa4.setVisible(false);
    }//GEN-LAST:event_btnMesa4MouseExited

    private void moverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moverActionPerformed
        AnimationClass face = new AnimationClass();
        AnimationClass wha = new AnimationClass();
        if(mover.isSelected()){
            face.jButtonXLeft(660, 570, 20, 5, facebook);
            wha.jButtonXLeft(660, 570, 20, 5, whats);
        }else{
            face.jButtonXRight(570, 660, 20, 5, facebook);
            wha.jButtonXRight(570, 660, 20, 5, whats);
        }
    }//GEN-LAST:event_moverActionPerformed

    private void whatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_whatsActionPerformed
       if(java.awt.Desktop.isDesktopSupported()){
           java.awt.Desktop desktop = java.awt.Desktop.getDesktop();
           
           if(desktop.isSupported(java.awt.Desktop.Action.BROWSE)){
               try{
                   java.net.URI uri = new java.net.URI("https://api.whatsapp.com/send?phone=525525419918");
                   desktop.browse(uri);
               } catch(URISyntaxException | IOException ex){
                   
               }
           }
       }
    }//GEN-LAST:event_whatsActionPerformed

    private void facebookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facebookActionPerformed
       if(java.awt.Desktop.isDesktopSupported()){
           java.awt.Desktop desktop = java.awt.Desktop.getDesktop();
           
           if(desktop.isSupported(java.awt.Desktop.Action.BROWSE)){
               try{
                   java.net.URI uri = new java.net.URI("https://www.facebook.com/Cafe-Java-110684760689198/");
                   desktop.browse(uri);
               } catch(URISyntaxException | IOException ex){
                   
               }
           }
       }
    }//GEN-LAST:event_facebookActionPerformed

    public static ArrayList<Cuenta> getCuentasDelRestaurante() {
        return cuentasDelRestaurante;
    }

    public static void setCuentaAuxiliar(Cuenta cuentaAuxiliar) {
        Cafeteria.cuentaAuxiliar = cuentaAuxiliar;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Cafeteria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cafeteria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cafeteria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cafeteria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            
            new Cafeteria().setVisible(true);
            
        });
    }
    
    void asignacionDeMesa(int mesa){
      cuentaAuxiliar = new Cuenta(mesa);
      frameDelMenu = new FrameDeMenu();
      frameDelMenu.setVisible(true);
      frameDelMenu.setBounds(0,0,588, 709);
    }
    
    public static Cuenta getCuenta(){
        return cuentaAuxiliar;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LbMesa1;
    private javax.swing.JLabel LbMesa2;
    private javax.swing.JLabel LbMesa3;
    private javax.swing.JLabel LbMesa4;
    private javax.swing.JPanel PanelMenu;
    private javax.swing.JButton btnMesa1;
    private javax.swing.JButton btnMesa2;
    private javax.swing.JButton btnMesa3;
    private javax.swing.JButton btnMesa4;
    private javax.swing.JButton facebook;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JToggleButton mover;
    private javax.swing.JButton whats;
    // End of variables declaration//GEN-END:variables

private void letrerosBotones() {

        ClaseYellow st  = new ClaseYellow("Sweety Strawberry.ttf");
        LbMesa1.setVisible(false);
        LbMesa1.setFont(st.MyFont(1, 30));
        LbMesa2.setVisible(false);
        LbMesa2.setFont(st.MyFont(1, 30));
        LbMesa3.setVisible(false);
        LbMesa3.setFont(st.MyFont(1, 30));
        LbMesa4.setVisible(false);
        LbMesa4.setFont(st.MyFont(1, 30));
        jLabel3.setFont(st.MyFont(0,24 ));
    }

}
