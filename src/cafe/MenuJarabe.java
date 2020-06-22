/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafe;

import javax.swing.ImageIcon;

/**
 * Este panel forma parte del proceso de selección de un producto u orden. Se especifica el jarabe y el numero extra de shots.
 * @author Aguilar Ceja Luis Angel (2020640029)
 * @author Cabello Vargas Victor Manuel(2020640111)
 * @author Gallegos Salinas Emilio (2020640198)
 * @author Martin Moreno Cesar Sadrack (2020640287)
 */
public class MenuJarabe extends javax.swing.JPanel {

    /**
     * Creates new form MenuJarabe
     */
    public MenuJarabe() {
        initComponents();
        cambiarLetra();
        comprobarJarabeInicial();
        mantenerShots();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupJarabes = new javax.swing.ButtonGroup();
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
        numDeShots = new javax.swing.JLabel();
        jarabes = new javax.swing.JLabel();
        shots = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        jarabe = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(0, 0, 0));
        setOpaque(false);
        setLayout(null);

        amareto.setForeground(new java.awt.Color(255, 255, 255));
        amareto.setText("Esencia de almendra");
        add(amareto);
        amareto.setBounds(20, 60, 240, 30);

        irlandesa.setForeground(new java.awt.Color(255, 255, 255));
        irlandesa.setText("Esencia de banana");
        add(irlandesa);
        irlandesa.setBounds(20, 90, 220, 30);

        menta.setForeground(new java.awt.Color(255, 255, 255));
        menta.setText("Esencia de cereza");
        add(menta);
        menta.setBounds(20, 130, 180, 30);

        caramelo.setForeground(new java.awt.Color(255, 255, 255));
        caramelo.setText("Esencia de chocolate");
        add(caramelo);
        caramelo.setBounds(18, 165, 230, 30);

        cajeta.setForeground(new java.awt.Color(255, 255, 255));
        cajeta.setText("Esencia de fresa");
        add(cajeta);
        cajeta.setBounds(20, 200, 170, 30);

        miel.setForeground(new java.awt.Color(255, 255, 255));
        miel.setText("Esencia de mora azul");
        add(miel);
        miel.setBounds(18, 241, 230, 30);

        maple.setForeground(new java.awt.Color(255, 255, 255));
        maple.setText("Esencia de kiwi");
        add(maple);
        maple.setBounds(18, 269, 180, 40);
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

        numDeShots.setForeground(new java.awt.Color(255, 255, 255));
        numDeShots.setText("Numero de Shots De Espresso");
        numDeShots.setFocusable(false);
        numDeShots.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(numDeShots);
        numDeShots.setBounds(54, 331, 310, 37);

        jarabes.setForeground(new java.awt.Color(255, 255, 255));
        jarabes.setText("Jarabes");
        jarabes.setFocusable(false);
        jarabes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(jarabes);
        jarabes.setBounds(116, 0, 114, 43);

        shots.setForeground(new java.awt.Color(255, 255, 255));
        shots.setText("Shots:");
        add(shots);
        shots.setBounds(90, 390, 50, 30);

        buttonGroupJarabes.add(jCheckBox1);
        jCheckBox1.setContentAreaFilled(false);
        jCheckBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckBox1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/checkbox blanco.png"))); // NOI18N
        jCheckBox1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/checkbox blanco.png"))); // NOI18N
        jCheckBox1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/checkbox seleccionado.png"))); // NOI18N
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        add(jCheckBox1);
        jCheckBox1.setBounds(200, 49, 40, 40);

        buttonGroupJarabes.add(jCheckBox2);
        jCheckBox2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckBox2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/checkbox blanco.png"))); // NOI18N
        jCheckBox2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/checkbox blanco.png"))); // NOI18N
        jCheckBox2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/checkbox seleccionado.png"))); // NOI18N
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });
        add(jCheckBox2);
        jCheckBox2.setBounds(200, 265, 40, 40);

        buttonGroupJarabes.add(jCheckBox3);
        jCheckBox3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckBox3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/checkbox blanco.png"))); // NOI18N
        jCheckBox3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/checkbox blanco.png"))); // NOI18N
        jCheckBox3.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/checkbox seleccionado.png"))); // NOI18N
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });
        add(jCheckBox3);
        jCheckBox3.setBounds(200, 85, 40, 40);

        buttonGroupJarabes.add(jCheckBox4);
        jCheckBox4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckBox4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/checkbox blanco.png"))); // NOI18N
        jCheckBox4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/checkbox blanco.png"))); // NOI18N
        jCheckBox4.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/checkbox seleccionado.png"))); // NOI18N
        jCheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox4ActionPerformed(evt);
            }
        });
        add(jCheckBox4);
        jCheckBox4.setBounds(200, 120, 40, 40);

        buttonGroupJarabes.add(jCheckBox5);
        jCheckBox5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckBox5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/checkbox blanco.png"))); // NOI18N
        jCheckBox5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/checkbox blanco.png"))); // NOI18N
        jCheckBox5.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/checkbox seleccionado.png"))); // NOI18N
        jCheckBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox5ActionPerformed(evt);
            }
        });
        add(jCheckBox5);
        jCheckBox5.setBounds(200, 156, 40, 40);

        buttonGroupJarabes.add(jCheckBox6);
        jCheckBox6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckBox6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/checkbox blanco.png"))); // NOI18N
        jCheckBox6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/checkbox blanco.png"))); // NOI18N
        jCheckBox6.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/checkbox seleccionado.png"))); // NOI18N
        jCheckBox6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox6ActionPerformed(evt);
            }
        });
        add(jCheckBox6);
        jCheckBox6.setBounds(200, 193, 40, 40);

        buttonGroupJarabes.add(jCheckBox7);
        jCheckBox7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckBox7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/checkbox blanco.png"))); // NOI18N
        jCheckBox7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/checkbox blanco.png"))); // NOI18N
        jCheckBox7.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/checkbox seleccionado.png"))); // NOI18N
        jCheckBox7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox7ActionPerformed(evt);
            }
        });
        add(jCheckBox7);
        jCheckBox7.setBounds(200, 228, 40, 40);
        add(jarabe);
        jarabe.setBounds(250, 80, 160, 220);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        add(jComboBox1);
        jComboBox1.setBounds(140, 390, 40, 26);
    }// </editor-fold>//GEN-END:initComponents
    
    /**
     * Los métodos “jCheckBoxActionPerformed()” va a cambiar el icono del jLabel “jarabe” con una imagen PNG.
     * Tambien cambiara el jarabe de nuestro objeto Cafeteria, por ejemplo “Cafeteria.getCuenta().getCafe().setNombreJarabe("Esencia de almendra");” 
     * @param evt 
     */
    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        jarabe.setIcon(new ImageIcon(getClass().getResource("/Jarabes/JarabeDeAlmandra.png")));
        Cafeteria.getCuenta().getCafe().setNombreJarabe("Esencia de almendra");
   
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        jarabe.setIcon(new ImageIcon(getClass().getResource("/Jarabes/JarabeDeKiwi.png")));
        Cafeteria.getCuenta().getCafe().setNombreJarabe("Esencia de kiwi");
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
        jarabe.setIcon(new ImageIcon(getClass().getResource("/Jarabes/JarabeDeBanana.png")));
        Cafeteria.getCuenta().getCafe().setNombreJarabe("Esencia de banana");
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox4ActionPerformed
        jarabe.setIcon(new ImageIcon(getClass().getResource("/Jarabes/JarabeDeCereza.png")));
        Cafeteria.getCuenta().getCafe().setNombreJarabe("Esencia de cereza");
    }//GEN-LAST:event_jCheckBox4ActionPerformed

    private void jCheckBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox5ActionPerformed
        jarabe.setIcon(new ImageIcon(getClass().getResource("/Jarabes/JarabeDeChocolate.png")));
        Cafeteria.getCuenta().getCafe().setNombreJarabe("Esencia de chocolate");
    }//GEN-LAST:event_jCheckBox5ActionPerformed

    private void jCheckBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox6ActionPerformed
        jarabe.setIcon(new ImageIcon(getClass().getResource("/Jarabes/JarabeDeFresa.png")));
        Cafeteria.getCuenta().getCafe().setNombreJarabe("Esencia de fresa");
    }//GEN-LAST:event_jCheckBox6ActionPerformed

    private void jCheckBox7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox7ActionPerformed
        jarabe.setIcon(new ImageIcon(getClass().getResource("/Jarabes/JarabeDeMora.png")));
        Cafeteria.getCuenta().getCafe().setNombreJarabe("Esencia de mora azul");
    }//GEN-LAST:event_jCheckBox7ActionPerformed

    /**
     * El método jComboBox1ActionPerformed es el que asignara el número de shot al producto que está haciendo el cliente “Cafeteria.getCuenta().getCafe().setNumShots(jComboBox1.getSelectedIndex()+1);”
     * @param evt 
     */
    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        Cafeteria.getCuenta().getCafe().setNumShots(jComboBox1.getSelectedIndex()+1);
    }//GEN-LAST:event_jComboBox1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel amareto;
    private javax.swing.ButtonGroup buttonGroupJarabes;
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
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JLabel jarabe;
    private javax.swing.JLabel jarabes;
    private javax.swing.JLabel maple;
    private javax.swing.JLabel menta;
    private javax.swing.JLabel miel;
    private javax.swing.JLabel numDeShots;
    private javax.swing.JLabel shots;
    // End of variables declaration//GEN-END:variables

    /**
     * El método “cambiarLetra” es el que en este panel cambiara la fuente de los Label
     */
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
        
        numDeShots.setFont(st.MyFont(0, 30));
        shots.setFont(cf.MyFont(0, 30));
        
    }

    /**
     * El método “comprobarJarabeInicial” es el que de manera similar a “comprobarCafeInicial” será el que guardará la opción seleccionada de jarabe aun cuando se cambie de panel.
     * También se tiene que volver a cambiar el icono del label “jarabe”, ya que esta imagen al regresar de panel también se borrara
     */
    private void comprobarJarabeInicial() {
        if(Cafeteria.getCuenta().getCafe().getNombreJarabe()!=null){
            if(Cafeteria.getCuenta().getCafe().getNombreJarabe().equals("Esencia de almendra")){
                jCheckBox1.setSelected(true);
                jarabe.setIcon(new ImageIcon(getClass().getResource("/Jarabes/JarabeDeAlmandra.png")));
            }else if(Cafeteria.getCuenta().getCafe().getNombreJarabe().equals("Esencia de banana")){
                jCheckBox3.setSelected(true);
                jarabe.setIcon(new ImageIcon(getClass().getResource("/Jarabes/JarabeDeBanana.png")));
            }else if(Cafeteria.getCuenta().getCafe().getNombreJarabe().equals("Esencia de cereza")){
                jCheckBox4.setSelected(true);
                jarabe.setIcon(new ImageIcon(getClass().getResource("/Jarabes/JarabeDeCereza.png")));
            }else if(Cafeteria.getCuenta().getCafe().getNombreJarabe().equals("Esencia de chocolate")){
                jCheckBox5.setSelected(true);
                jarabe.setIcon(new ImageIcon(getClass().getResource("/Jarabes/JarabeDeChocolate.png")));
            }else if(Cafeteria.getCuenta().getCafe().getNombreJarabe().equals("Esencia de fresa")){
                jCheckBox6.setSelected(true);
                jarabe.setIcon(new ImageIcon(getClass().getResource("/Jarabes/JarabeDeFresa.png")));
            }else if(Cafeteria.getCuenta().getCafe().getNombreJarabe().equals("Esencia de mora azul")){
                jCheckBox7.setSelected(true);
                jarabe.setIcon(new ImageIcon(getClass().getResource("/Jarabes/JarabeDeMora.png")));
            }else{
                jCheckBox2.setSelected(true);
                jarabe.setIcon(new ImageIcon(getClass().getResource("/Jarabes/JarabeDeKiwi.png")));
            }
        }
    }

    /**
     * El método “mantenerShots” es el que una vez seleccionado algún extra de Shots cambiara el atributo de numero de shots extras, ya que este valor puede o no ser modificación según el cliente
     */
    private void mantenerShots() {
        
        if(Cafeteria.getCuenta().getCafe().getNumShots() != 0){
            jComboBox1.setSelectedIndex(Cafeteria.getCuenta().getCafe().getNumShots()-1);
        }
    }
}
