/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafe;

/**
 *
 * @author serpi
 */
public class MenuJarabe extends javax.swing.JPanel {

    /**
     * Creates new form MenuJarabe
     */
    public MenuJarabe() {
        initComponents();
        cambiarLetra();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        amareto = new javax.swing.JLabel();
        irlandesa = new javax.swing.JLabel();
        menta = new javax.swing.JLabel();
        caramelo = new javax.swing.JLabel();
        cajeta = new javax.swing.JLabel();
        miel = new javax.swing.JLabel();
        maple = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jarabes = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 0));
        setLayout(null);

        amareto.setForeground(new java.awt.Color(255, 255, 255));
        amareto.setText("Amareto");
        add(amareto);
        amareto.setBounds(20, 60, 90, 30);

        irlandesa.setForeground(new java.awt.Color(255, 255, 255));
        irlandesa.setText("Crema Irlandesa");
        add(irlandesa);
        irlandesa.setBounds(20, 90, 120, 30);

        menta.setForeground(new java.awt.Color(255, 255, 255));
        menta.setText("Menta ");
        add(menta);
        menta.setBounds(20, 130, 70, 30);

        caramelo.setForeground(new java.awt.Color(255, 255, 255));
        caramelo.setText("Caramelo");
        add(caramelo);
        caramelo.setBounds(18, 165, 60, 30);

        cajeta.setForeground(new java.awt.Color(255, 255, 255));
        cajeta.setText("Cajeta");
        add(cajeta);
        cajeta.setBounds(20, 200, 60, 30);

        miel.setForeground(new java.awt.Color(255, 255, 255));
        miel.setText("Miel ");
        add(miel);
        miel.setBounds(18, 241, 60, 30);

        maple.setForeground(new java.awt.Color(255, 255, 255));
        maple.setText("Maple");
        add(maple);
        maple.setBounds(18, 279, 70, 30);
        add(jSeparator1);
        jSeparator1.setBounds(20, 85, 200, 10);
        add(jSeparator2);
        jSeparator2.setBounds(20, 121, 200, 10);
        add(jSeparator3);
        jSeparator3.setBounds(18, 157, 200, 10);
        add(jSeparator4);
        jSeparator4.setBounds(18, 193, 200, 10);
        add(jSeparator5);
        jSeparator5.setBounds(18, 229, 200, 10);
        add(jSeparator6);
        jSeparator6.setBounds(18, 265, 200, 10);
        add(jSeparator7);
        jSeparator7.setBounds(18, 301, 200, 10);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Numero de Shots De Espresso");
        jLabel1.setFocusable(false);
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(jLabel1);
        jLabel1.setBounds(54, 331, 182, 37);

        jarabes.setForeground(new java.awt.Color(255, 255, 255));
        jarabes.setText("Jarabes");
        jarabes.setFocusable(false);
        jarabes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(jarabes);
        jarabes.setBounds(116, 0, 114, 43);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Shots:");
        add(jLabel3);
        jLabel3.setBounds(45, 378, 36, 16);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        add(jTextField1);
        jTextField1.setBounds(93, 374, 155, 24);

        buttonGroup1.add(jCheckBox1);
        jCheckBox1.setContentAreaFilled(false);
        jCheckBox1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/checkbox blanco.png"))); // NOI18N
        jCheckBox1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/checkbox blanco.png"))); // NOI18N
        jCheckBox1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/checkbox seleccionado.png"))); // NOI18N
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        add(jCheckBox1);
        jCheckBox1.setBounds(180, 49, 40, 40);

        buttonGroup1.add(jCheckBox2);
        jCheckBox2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/checkbox blanco.png"))); // NOI18N
        jCheckBox2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/checkbox blanco.png"))); // NOI18N
        jCheckBox2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/checkbox seleccionado.png"))); // NOI18N
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });
        add(jCheckBox2);
        jCheckBox2.setBounds(180, 265, 40, 40);

        buttonGroup1.add(jCheckBox3);
        jCheckBox3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/checkbox blanco.png"))); // NOI18N
        jCheckBox3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/checkbox blanco.png"))); // NOI18N
        jCheckBox3.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/checkbox seleccionado.png"))); // NOI18N
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });
        add(jCheckBox3);
        jCheckBox3.setBounds(180, 85, 40, 40);

        buttonGroup1.add(jCheckBox4);
        jCheckBox4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/checkbox blanco.png"))); // NOI18N
        jCheckBox4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/checkbox blanco.png"))); // NOI18N
        jCheckBox4.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/checkbox seleccionado.png"))); // NOI18N
        jCheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox4ActionPerformed(evt);
            }
        });
        add(jCheckBox4);
        jCheckBox4.setBounds(180, 120, 40, 40);

        buttonGroup1.add(jCheckBox5);
        jCheckBox5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/checkbox blanco.png"))); // NOI18N
        jCheckBox5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/checkbox blanco.png"))); // NOI18N
        jCheckBox5.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/checkbox seleccionado.png"))); // NOI18N
        jCheckBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox5ActionPerformed(evt);
            }
        });
        add(jCheckBox5);
        jCheckBox5.setBounds(180, 156, 40, 40);

        buttonGroup1.add(jCheckBox6);
        jCheckBox6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/checkbox blanco.png"))); // NOI18N
        jCheckBox6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/checkbox blanco.png"))); // NOI18N
        jCheckBox6.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/checkbox seleccionado.png"))); // NOI18N
        jCheckBox6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox6ActionPerformed(evt);
            }
        });
        add(jCheckBox6);
        jCheckBox6.setBounds(180, 193, 40, 40);

        buttonGroup1.add(jCheckBox7);
        jCheckBox7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/checkbox blanco.png"))); // NOI18N
        jCheckBox7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/checkbox blanco.png"))); // NOI18N
        jCheckBox7.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/checkbox seleccionado.png"))); // NOI18N
        jCheckBox7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox7ActionPerformed(evt);
            }
        });
        add(jCheckBox7);
        jCheckBox7.setBounds(180, 228, 40, 40);
        add(jLabel2);
        jLabel2.setBounds(250, 90, 160, 210);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox4ActionPerformed

    private void jCheckBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox5ActionPerformed

    private void jCheckBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox6ActionPerformed

    private void jCheckBox7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox7ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel amareto;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel cajeta;
    private javax.swing.JLabel caramelo;
    private javax.swing.JLabel irlandesa;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel jarabes;
    private javax.swing.JLabel maple;
    private javax.swing.JLabel menta;
    private javax.swing.JLabel miel;
    // End of variables declaration//GEN-END:variables

    private void cambiarLetra() {
        
        ClaseYellow cf = new ClaseYellow("Cream Cake.ttf");
        ClaseYellow st  = new ClaseYellow("Sweety Strawberry.ttf");
        
        jarabes.setFont(st.MyFont(0, 30));
        amareto.setFont(cf.MyFont(0, 30));
        irlandesa.setFont(cf.MyFont(0, 30));
        menta.setFont(cf.MyFont(0, 30));
        caramelo.setFont(cf.MyFont(0, 30));
        cajeta.setFont(cf.MyFont(0, 30));
        miel.setFont(cf.MyFont(0, 30));
        maple.setFont(cf.MyFont(0, 30));
        
    }
}
