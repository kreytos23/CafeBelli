package cafe;
import java.awt.Font;

/**
 * @author serpi
 */
public class Menu extends javax.swing.JPanel {

    private MenuDeCafes menuDeCafes;
    private PanelTamaño panelTamaño;
    private MenuJarabe panelJarabe;
   
    
    public Menu() {
        initComponents();
        menuDeCafes = new MenuDeCafes();
        menuDeCafes.setBounds(0,0,base.getWidth(),base.getHeight());
        base.removeAll();
        base.add(menuDeCafes);
        base.updateUI();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        base = new javax.swing.JPanel();
        btnJarabes = new javax.swing.JButton();
        btnTamanioLeche = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setLayout(null);

        base.setOpaque(false);
        base.setPreferredSize(new java.awt.Dimension(200, 200));
        base.setLayout(null);
        add(base);
        base.setBounds(120, 90, 428, 460);

        btnJarabes.setText("Jarabes");
        btnJarabes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJarabesActionPerformed(evt);
            }
        });
        add(btnJarabes);
        btnJarabes.setBounds(270, 580, 80, 40);

        btnTamanioLeche.setText("Tamaño");
        btnTamanioLeche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTamanioLecheActionPerformed(evt);
            }
        });
        add(btnTamanioLeche);
        btnTamanioLeche.setBounds(140, 580, 80, 40);

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/menuW.jpg"))); // NOI18N
        add(Fondo);
        Fondo.setBounds(0, 0, 590, 670);
    }// </editor-fold>//GEN-END:initComponents

    private void btnJarabesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJarabesActionPerformed
        panelJarabe = new MenuJarabe();
        panelJarabe.setBounds(0, 0, base.getWidth(), base.getHeight());
        base.removeAll();
        base.add(panelJarabe);
        base.updateUI();
    }//GEN-LAST:event_btnJarabesActionPerformed

    private void btnTamanioLecheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTamanioLecheActionPerformed
        panelTamaño = new PanelTamaño();
        panelTamaño.setBounds(0, 0, base.getWidth(), base.getHeight());
        base.removeAll();
        base.add(panelTamaño);
        base.updateUI();
    }//GEN-LAST:event_btnTamanioLecheActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JPanel base;
    private javax.swing.JButton btnJarabes;
    private javax.swing.JButton btnTamanioLeche;
    // End of variables declaration//GEN-END:variables

    
}
