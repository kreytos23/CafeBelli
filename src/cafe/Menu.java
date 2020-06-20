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
        prueba = new javax.swing.JLabel();
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
        btnJarabes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnJarabes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnJarabes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJarabesActionPerformed(evt);
            }
        });
        add(btnJarabes);
        btnJarabes.setBounds(320, 680, 50, 45);

        btnTamanioLeche.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jarabes/tam.png"))); // NOI18N
        btnTamanioLeche.setBorderPainted(false);
        btnTamanioLeche.setContentAreaFilled(false);
        btnTamanioLeche.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTamanioLeche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTamanioLecheActionPerformed(evt);
            }
        });
        add(btnTamanioLeche);
        btnTamanioLeche.setBounds(380, 680, 50, 45);

        btnCafes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jarabes/cafe.png"))); // NOI18N
        btnCafes.setBorderPainted(false);
        btnCafes.setContentAreaFilled(false);
        btnCafes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCafes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCafes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCafesActionPerformed(evt);
            }
        });
        add(btnCafes);
        btnCafes.setBounds(260, 680, 50, 45);

        btnTerminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jarabes/terminar.png"))); // NOI18N
        btnTerminar.setBorderPainted(false);
        btnTerminar.setContentAreaFilled(false);
        btnTerminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTerminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnTerminar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                btnTerminarMouseDragged(evt);
            }
        });
        btnTerminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnTerminarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnTerminarMouseExited(evt);
            }
        });
        btnTerminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTerminarActionPerformed(evt);
            }
        });
        add(btnTerminar);
        btnTerminar.setBounds(440, 680, 50, 45);

        mover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jarabes/menu.png"))); // NOI18N
        mover.setBorderPainted(false);
        mover.setContentAreaFilled(false);
        mover.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moverActionPerformed(evt);
            }
        });
        add(mover);
        mover.setBounds(520, 610, 50, 45);

        prueba.setForeground(new java.awt.Color(255, 255, 255));
        prueba.setText("jLabel1");
        add(prueba);
        prueba.setBounds(321, 560, 160, 16);

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

    private void btnTerminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTerminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTerminarActionPerformed

    private void btnTerminarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTerminarMouseDragged
        
    }//GEN-LAST:event_btnTerminarMouseDragged

    private void btnTerminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTerminarMouseEntered
        prueba.setVisible(true);
        prueba.setText("Funciona esta mierda");
    }//GEN-LAST:event_btnTerminarMouseEntered

    private void btnTerminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTerminarMouseExited
        prueba.setVisible(false);
    }//GEN-LAST:event_btnTerminarMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JPanel base;
    private javax.swing.JButton btnCafes;
    private javax.swing.JButton btnJarabes;
    private javax.swing.JButton btnTamanioLeche;
    private javax.swing.JButton btnTerminar;
    private javax.swing.JToggleButton mover;
    private javax.swing.JLabel prueba;
    // End of variables declaration//GEN-END:variables

    
}
