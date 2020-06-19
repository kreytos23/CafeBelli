package cafe;

import java.util.ArrayList;

/**
 * @author Cesar Martin 
 * Para añadir los cafes de una cuenta se usa un array auxiliar aparte
 * del  final para que se use para escribir los cafes nuevos en el pdf
 * y una vez que se escribe se resetea todo ese array auxiliar 
 */
public class Cafeteria extends javax.swing.JFrame {

    private Menu panelDeMenu;
    private ArrayList<Cuenta> cuentasDeLaCafeteria;
    
    public Cafeteria() {
        cuentasDeLaCafeteria = new ArrayList<>();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelMenu = new javax.swing.JPanel();
        btnMesa3 = new javax.swing.JButton();
        btnMesa2 = new javax.swing.JButton();
        btnMesa4 = new javax.swing.JButton();
        btnMesa1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(648, 448));
        setPreferredSize(new java.awt.Dimension(648, 448));

        PanelMenu.setLayout(null);

        btnMesa3.setToolTipText("");
        btnMesa3.setContentAreaFilled(false);
        btnMesa3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/mesa4.png"))); // NOI18N
        btnMesa3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMesa3ActionPerformed(evt);
            }
        });
        PanelMenu.add(btnMesa3);
        btnMesa3.setBounds(488, 250, 163, 165);

        btnMesa2.setContentAreaFilled(false);
        btnMesa2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/mesa2.png"))); // NOI18N
        btnMesa2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMesa2ActionPerformed(evt);
            }
        });
        PanelMenu.add(btnMesa2);
        btnMesa2.setBounds(147, 250, 190, 160);

        btnMesa4.setContentAreaFilled(false);
        btnMesa4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/mesa3.png"))); // NOI18N
        btnMesa4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMesa4ActionPerformed(evt);
            }
        });
        PanelMenu.add(btnMesa4);
        btnMesa4.setBounds(330, 250, 165, 160);

        btnMesa1.setContentAreaFilled(false);
        btnMesa1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/mesa1.png"))); // NOI18N
        btnMesa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMesa1ActionPerformed(evt);
            }
        });
        PanelMenu.add(btnMesa1);
        btnMesa1.setBounds(-10, 250, 170, 170);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/imagen cafeteria reducida.jpg"))); // NOI18N
        PanelMenu.add(jLabel1);
        jLabel1.setBounds(0, 0, 650, 410);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 648, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void btnMesa4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMesa4ActionPerformed
        asignacionDeMesa(4);
    }//GEN-LAST:event_btnMesa4ActionPerformed

    private void btnMesa3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMesa3ActionPerformed
        asignacionDeMesa(3);
    }//GEN-LAST:event_btnMesa3ActionPerformed

    private void btnMesa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMesa1ActionPerformed
        asignacionDeMesa(1);
    }//GEN-LAST:event_btnMesa1ActionPerformed

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
       Cuenta cuentaDeMesa = new Cuenta(mesa);
       cuentasDeLaCafeteria.add(cuentaDeMesa);
       panelDeMenu = new Menu();
       this.setBounds(0, 0, 446, 650);
       panelDeMenu.setBounds(this.getBounds());
       PanelMenu.removeAll();
       PanelMenu.add(panelDeMenu);
       PanelMenu.updateUI();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelMenu;
    private javax.swing.JButton btnMesa1;
    private javax.swing.JButton btnMesa2;
    private javax.swing.JButton btnMesa3;
    private javax.swing.JButton btnMesa4;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
