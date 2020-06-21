package cafe;
import java.awt.Font;
import javax.swing.ImageIcon;
/**
 * @author serpi
 */
public class MenuDeCafes extends javax.swing.JPanel {
    
    private int num;
    public MenuDeCafes() {
        initComponents();
        cambiarMetodo();
       imagen1.setIcon(new ImageIcon(getClass().getResource("/Cafes/"+0+".PNG")));
       imagen2.setIcon(new ImageIcon(getClass().getResource("/Cafes/"+1+".PNG")));
       imagen3.setIcon(new ImageIcon(getClass().getResource("/Cafes/"+2+".PNG")));
       num=0;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        bebidas = new javax.swing.JLabel();
        Latte = new javax.swing.JLabel();
        Machiatto = new javax.swing.JLabel();
        Frapuccino = new javax.swing.JLabel();
        vanilla = new javax.swing.JLabel();
        Espresso = new javax.swing.JLabel();
        Mocha = new javax.swing.JLabel();
        Machiatto1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        precioCaramel = new javax.swing.JLabel();
        precioFrapuccino = new javax.swing.JLabel();
        precioLatte = new javax.swing.JLabel();
        precioEspresso = new javax.swing.JLabel();
        precioVanilla = new javax.swing.JLabel();
        precioMocha = new javax.swing.JLabel();
        precioMachiatto = new javax.swing.JLabel();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox8 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        imagen3 = new javax.swing.JLabel();
        imagen1 = new javax.swing.JLabel();
        imagen2 = new javax.swing.JLabel();
        btnAtras = new javax.swing.JToggleButton();
        btnSiguiente = new javax.swing.JToggleButton();

        setBackground(new java.awt.Color(0, 0, 0));
        setOpaque(false);
        setLayout(null);

        bebidas.setFont(new Font("DK Lemon Yellow Sun.otf",Font.PLAIN,14)
        );
        bebidas.setForeground(new java.awt.Color(255, 255, 255));
        bebidas.setText("CAFÉS");
        bebidas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(bebidas);
        bebidas.setBounds(140, 20, 100, 40);

        Latte.setForeground(new java.awt.Color(255, 255, 255));
        Latte.setText("*Latte");
        add(Latte);
        Latte.setBounds(70, 110, 200, 30);

        Machiatto.setForeground(new java.awt.Color(255, 255, 255));
        Machiatto.setText("*Caramel Machiatto");
        add(Machiatto);
        Machiatto.setBounds(70, 295, 170, 30);

        Frapuccino.setForeground(new java.awt.Color(255, 255, 255));
        Frapuccino.setText("*Frapuccino ");
        add(Frapuccino);
        Frapuccino.setBounds(70, 70, 100, 30);

        vanilla.setForeground(new java.awt.Color(255, 255, 255));
        vanilla.setText("*Vanilla");
        add(vanilla);
        vanilla.setBounds(70, 152, 130, 30);

        Espresso.setForeground(new java.awt.Color(255, 255, 255));
        Espresso.setText("*Espresso");
        add(Espresso);
        Espresso.setBounds(70, 188, 120, 30);

        Mocha.setForeground(new java.awt.Color(255, 255, 255));
        Mocha.setText("*Mocha");
        add(Mocha);
        Mocha.setBounds(70, 224, 110, 30);

        Machiatto1.setForeground(new java.awt.Color(255, 255, 255));
        Machiatto1.setText("*Machiatto");
        add(Machiatto1);
        Machiatto1.setBounds(70, 260, 130, 30);
        add(jSeparator1);
        jSeparator1.setBounds(70, 213, 270, 10);
        add(jSeparator2);
        jSeparator2.setBounds(70, 100, 270, 10);
        add(jSeparator3);
        jSeparator3.setBounds(70, 141, 270, 10);
        add(jSeparator4);
        jSeparator4.setBounds(70, 249, 270, 10);
        add(jSeparator5);
        jSeparator5.setBounds(70, 285, 270, 10);
        add(jSeparator6);
        jSeparator6.setBounds(70, 321, 270, 10);
        add(jSeparator7);
        jSeparator7.setBounds(70, 177, 270, 10);

        precioCaramel.setForeground(new java.awt.Color(255, 255, 255));
        precioCaramel.setText("$35");
        add(precioCaramel);
        precioCaramel.setBounds(270, 290, 30, 30);

        precioFrapuccino.setForeground(new java.awt.Color(255, 255, 255));
        precioFrapuccino.setText("$20");
        add(precioFrapuccino);
        precioFrapuccino.setBounds(270, 70, 30, 30);

        precioLatte.setForeground(new java.awt.Color(255, 255, 255));
        precioLatte.setText("$25");
        add(precioLatte);
        precioLatte.setBounds(270, 106, 30, 30);

        precioEspresso.setForeground(new java.awt.Color(255, 255, 255));
        precioEspresso.setText("$20");
        add(precioEspresso);
        precioEspresso.setBounds(270, 180, 30, 30);

        precioVanilla.setForeground(new java.awt.Color(255, 255, 255));
        precioVanilla.setText("$20");
        add(precioVanilla);
        precioVanilla.setBounds(270, 145, 30, 30);

        precioMocha.setForeground(new java.awt.Color(255, 255, 255));
        precioMocha.setText("$30");
        add(precioMocha);
        precioMocha.setBounds(270, 220, 30, 30);

        precioMachiatto.setForeground(new java.awt.Color(255, 255, 255));
        precioMachiatto.setText("$30");
        add(precioMachiatto);
        precioMachiatto.setBounds(270, 255, 30, 30);

        buttonGroup1.add(jCheckBox2);
        jCheckBox2.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        jCheckBox2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jCheckBox2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/checkbox blanco.png"))); // NOI18N
        jCheckBox2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/checkbox blanco.png"))); // NOI18N
        jCheckBox2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/checkbox seleccionado.png"))); // NOI18N
        jCheckBox2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jCheckBox2.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });
        add(jCheckBox2);
        jCheckBox2.setBounds(300, 288, 40, 40);

        buttonGroup1.add(jCheckBox8);
        jCheckBox8.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        jCheckBox8.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jCheckBox8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/checkbox blanco.png"))); // NOI18N
        jCheckBox8.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/checkbox blanco.png"))); // NOI18N
        jCheckBox8.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/checkbox seleccionado.png"))); // NOI18N
        jCheckBox8.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jCheckBox8.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jCheckBox8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox8ActionPerformed(evt);
            }
        });
        add(jCheckBox8);
        jCheckBox8.setBounds(300, 65, 40, 40);

        buttonGroup1.add(jCheckBox3);
        jCheckBox3.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        jCheckBox3.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jCheckBox3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/checkbox blanco.png"))); // NOI18N
        jCheckBox3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/checkbox blanco.png"))); // NOI18N
        jCheckBox3.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/checkbox seleccionado.png"))); // NOI18N
        jCheckBox3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jCheckBox3.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });
        add(jCheckBox3);
        jCheckBox3.setBounds(300, 105, 40, 40);

        buttonGroup1.add(jCheckBox4);
        jCheckBox4.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        jCheckBox4.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jCheckBox4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/checkbox blanco.png"))); // NOI18N
        jCheckBox4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/checkbox blanco.png"))); // NOI18N
        jCheckBox4.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/checkbox seleccionado.png"))); // NOI18N
        jCheckBox4.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jCheckBox4.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jCheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox4ActionPerformed(evt);
            }
        });
        add(jCheckBox4);
        jCheckBox4.setBounds(300, 180, 40, 40);

        buttonGroup1.add(jCheckBox5);
        jCheckBox5.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        jCheckBox5.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jCheckBox5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/checkbox blanco.png"))); // NOI18N
        jCheckBox5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/checkbox blanco.png"))); // NOI18N
        jCheckBox5.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/checkbox seleccionado.png"))); // NOI18N
        jCheckBox5.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jCheckBox5.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jCheckBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox5ActionPerformed(evt);
            }
        });
        add(jCheckBox5);
        jCheckBox5.setBounds(300, 145, 40, 40);

        buttonGroup1.add(jCheckBox6);
        jCheckBox6.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        jCheckBox6.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jCheckBox6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/checkbox blanco.png"))); // NOI18N
        jCheckBox6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/checkbox blanco.png"))); // NOI18N
        jCheckBox6.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/checkbox seleccionado.png"))); // NOI18N
        jCheckBox6.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jCheckBox6.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jCheckBox6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox6ActionPerformed(evt);
            }
        });
        add(jCheckBox6);
        jCheckBox6.setBounds(300, 216, 40, 40);

        buttonGroup1.add(jCheckBox7);
        jCheckBox7.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        jCheckBox7.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jCheckBox7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/checkbox blanco.png"))); // NOI18N
        jCheckBox7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/checkbox blanco.png"))); // NOI18N
        jCheckBox7.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/checkbox seleccionado.png"))); // NOI18N
        jCheckBox7.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jCheckBox7.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jCheckBox7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox7ActionPerformed(evt);
            }
        });
        add(jCheckBox7);
        jCheckBox7.setBounds(300, 252, 40, 40);
        add(imagen3);
        imagen3.setBounds(260, 360, 90, 80);
        add(imagen1);
        imagen1.setBounds(80, 360, 90, 80);
        add(imagen2);
        imagen2.setBounds(170, 360, 90, 80);

        btnAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jarabes/izquierda.png"))); // NOI18N
        btnAtras.setBorderPainted(false);
        btnAtras.setContentAreaFilled(false);
        btnAtras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAtras.setEnabled(false);
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        add(btnAtras);
        btnAtras.setBounds(32, 372, 50, 50);

        btnSiguiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jarabes/Derecha.png"))); // NOI18N
        btnSiguiente.setBorderPainted(false);
        btnSiguiente.setContentAreaFilled(false);
        btnSiguiente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSiguiente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });
        add(btnSiguiente);
        btnSiguiente.setBounds(350, 372, 50, 50);
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jCheckBox8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox8ActionPerformed

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

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed

        int aux = num;
         try{
             //activa el boton para retroceder
             btnAtras.setEnabled(true);         
             
             imagen1.setIcon(new ImageIcon(getClass().getResource("/Cafes/"+(aux++)+".PNG")));
             imagen2.setIcon(new ImageIcon(getClass().getResource("/Cafes/"+(aux++)+".PNG")));
             imagen3.setIcon(new ImageIcon(getClass().getResource("/Cafes/"+(aux)+".PNG")));
             if(num==4){
                 //se desactiva el boton siguiente para evitar errores xd
                btnSiguiente.setEnabled(false);
             //   System.out.println("se deshabilito el boton +");
             }
             num++;
            
             } catch (Exception e) {
              // System.out.println(e);   
             }
    }//GEN-LAST:event_btnSiguienteActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        
        int aux = num;
         try{
             btnSiguiente.setEnabled(true);      
             imagen3.setIcon(new ImageIcon(getClass().getResource("/Cafes/"+(aux+1)+".PNG")));
             imagen2.setIcon(new ImageIcon(getClass().getResource("/Cafes/"+(aux)+".PNG")));
             imagen1.setIcon(new ImageIcon(getClass().getResource("/Cafes/"+(aux-1)+".PNG")));
             if(num==1){
                btnAtras.setEnabled(false);
                System.out.println("se deshabilito el boton -");
             }     
             num--;
                   
            }
         catch (Exception e) {}
    }//GEN-LAST:event_btnAtrasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Espresso;
    private javax.swing.JLabel Frapuccino;
    private javax.swing.JLabel Latte;
    private javax.swing.JLabel Machiatto;
    private javax.swing.JLabel Machiatto1;
    private javax.swing.JLabel Mocha;
    private javax.swing.JLabel bebidas;
    private javax.swing.JToggleButton btnAtras;
    private javax.swing.JToggleButton btnSiguiente;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel imagen1;
    private javax.swing.JLabel imagen2;
    private javax.swing.JLabel imagen3;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JLabel precioCaramel;
    private javax.swing.JLabel precioEspresso;
    private javax.swing.JLabel precioFrapuccino;
    private javax.swing.JLabel precioLatte;
    private javax.swing.JLabel precioMachiatto;
    private javax.swing.JLabel precioMocha;
    private javax.swing.JLabel precioVanilla;
    private javax.swing.JLabel vanilla;
    // End of variables declaration//GEN-END:variables

private void cambiarMetodo() {
        ClaseYellow cf = new ClaseYellow("Cream Cake.ttf");
        ClaseYellow st  = new ClaseYellow("Sweety Strawberry.ttf");
        ClaseYellow yt  = new ClaseYellow("DK Lemon Yellow Sun.otf");
        
        bebidas.setFont(st.MyFont(1, 30));
        Latte.setFont(cf.MyFont(0, 30));
        Frapuccino.setFont(cf.MyFont(0, 30));
        vanilla.setFont(cf.MyFont(0, 30));
        Espresso.setFont(cf.MyFont(0, 30));
        Mocha.setFont(cf.MyFont(0, 30));
        Machiatto.setFont(cf.MyFont(0, 30));
        Machiatto1.setFont(cf.MyFont(0, 30));
        
        precioFrapuccino.setFont(yt.MyFont(1, 20));
        precioLatte.setFont(yt.MyFont(1, 20));
        precioCaramel.setFont(yt.MyFont(1, 20));
        precioEspresso.setFont(yt.MyFont(1, 20));
        precioMachiatto.setFont(yt.MyFont(1, 20));
        precioMocha.setFont(yt.MyFont(1, 20));
        precioVanilla.setFont(yt.MyFont(1, 20));
        
    }

}
