package cafe;
import AppPackage.AnimationClass;
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
        btnCafes = new javax.swing.JButton();
        btnTerminar = new javax.swing.JButton();
        mover = new javax.swing.JToggleButton();
        Fondo = new javax.swing.JLabel();

        setLayout(null);

        base.setOpaque(false);
        base.setPreferredSize(new java.awt.Dimension(200, 200));
        base.setLayout(null);
        add(base);
        base.setBounds(120, 90, 428, 460);

        btnJarabes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jarabes/jarabe.png"))); // NOI18N
        btnJarabes.setBorderPainted(false);
        btnJarabes.setContentAreaFilled(false);
        btnJarabes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnJarabes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJarabesActionPerformed(evt);
            }
        });
        add(btnJarabes);
        btnJarabes.setBounds(340, 610, 50, 45);

        btnTamanioLeche.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jarabes/tam.png"))); // NOI18N
        btnTamanioLeche.setBorderPainted(false);
        btnTamanioLeche.setContentAreaFilled(false);
        btnTamanioLeche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTamanioLecheActionPerformed(evt);
            }
        });
        add(btnTamanioLeche);
        btnTamanioLeche.setBounds(400, 610, 50, 45);

        btnCafes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jarabes/cafe.png"))); // NOI18N
        btnCafes.setBorderPainted(false);
        btnCafes.setContentAreaFilled(false);
        btnCafes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCafes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCafesActionPerformed(evt);
            }
        });
        add(btnCafes);
        btnCafes.setBounds(280, 610, 50, 45);

        btnTerminar.setBorderPainted(false);
        btnTerminar.setContentAreaFilled(false);
        btnTerminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(btnTerminar);
        btnTerminar.setBounds(460, 610, 50, 45);

        mover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jarabes/menu.png"))); // NOI18N
        mover.setBorderPainted(false);
        mover.setContentAreaFilled(false);
        mover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moverActionPerformed(evt);
            }
        });
        add(mover);
        mover.setBounds(210, 610, 50, 45);

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

    private void moverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moverActionPerformed
         AnimationClass cafe = new AnimationClass();
          AnimationClass leche = new AnimationClass();
          AnimationClass terminar = new AnimationClass();
          AnimationClass jarabe = new AnimationClass();
        if(mover.isSelected()){
          cafe.jButtonYUp(680, 610, 20, 5, btnCafes);
          leche.jButtonYUp(680, 610, 20, 5, btnTamanioLeche);
          terminar.jButtonYUp(680, 610, 20, 5, btnTerminar);
          jarabe.jButtonYUp(680, 610, 20, 5, btnJarabes);
       }else{
           cafe.jButtonYDown(610, 680, 20, 5, btnCafes);
           leche.jButtonYDown(610, 680, 20, 5, btnTamanioLeche);
           terminar.jButtonYDown(610, 680, 20, 5, btnTerminar);
           jarabe.jButtonYDown(610, 680, 20, 5, btnJarabes);
       }
    }//GEN-LAST:event_moverActionPerformed

    private void btnCafesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCafesActionPerformed
        menuDeCafes = new MenuDeCafes();
        menuDeCafes.setBounds(0,0,base.getWidth(),base.getHeight());
        base.removeAll();
        base.add(menuDeCafes);
        base.updateUI();
    }//GEN-LAST:event_btnCafesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JPanel base;
    private javax.swing.JButton btnCafes;
    private javax.swing.JButton btnJarabes;
    private javax.swing.JButton btnTamanioLeche;
    private javax.swing.JButton btnTerminar;
    private javax.swing.JToggleButton mover;
    // End of variables declaration//GEN-END:variables

    
}
