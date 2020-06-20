package cafe;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;

/**
 *
 * @author serpi
 */
public class PanelTamaño extends javax.swing.JPanel {

    private DefaultComboBoxModel tipoDeLeche;
    private DefaultComboBoxModel tamanios;
    private TipoDeLeche tiposDeLeche;
    
    
    public PanelTamaño() {
        tipoDeLeche = new DefaultComboBoxModel(TipoDeLeche.values());
        tamanios = new DefaultComboBoxModel(Tamaño.values());
        initComponents();
        cambiarLetra();
       
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tipoDeLecheTex = new javax.swing.JLabel();
        tamañoDelCafeTex = new javax.swing.JLabel();
        comboTipoDeLeche = new javax.swing.JComboBox<>();
        comboTamanio = new javax.swing.JComboBox<>();
        letreroTitulo = new javax.swing.JLabel();
        tipoDeLecheJL = new javax.swing.JLabel();
        tamañoDelCafeJL = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 0));
        setOpaque(false);
        setLayout(null);

        tipoDeLecheTex.setForeground(new java.awt.Color(255, 255, 255));
        tipoDeLecheTex.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tipoDeLecheTex.setText("Tipo De Leche:");
        tipoDeLecheTex.setFocusable(false);
        tipoDeLecheTex.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        add(tipoDeLecheTex);
        tipoDeLecheTex.setBounds(50, 120, 130, 50);

        tamañoDelCafeTex.setForeground(new java.awt.Color(255, 255, 255));
        tamañoDelCafeTex.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tamañoDelCafeTex.setText("Tamaño Del Cafe:");
        tamañoDelCafeTex.setFocusable(false);
        tamañoDelCafeTex.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        add(tamañoDelCafeTex);
        tamañoDelCafeTex.setBounds(40, 260, 160, 50);

        comboTipoDeLeche.setModel(tipoDeLeche);
        comboTipoDeLeche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboTipoDeLecheActionPerformed(evt);
            }
        });
        add(comboTipoDeLeche);
        comboTipoDeLeche.setBounds(60, 170, 130, 26);

        comboTamanio.setModel(tamanios);
        comboTamanio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboTamanioActionPerformed(evt);
            }
        });
        add(comboTamanio);
        comboTamanio.setBounds(210, 270, 100, 26);

        letreroTitulo.setForeground(new java.awt.Color(255, 255, 255));
        letreroTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        letreroTitulo.setText("Tamaño y Tipo De Leche");
        add(letreroTitulo);
        letreroTitulo.setBounds(80, 0, 230, 50);
        add(tipoDeLecheJL);
        tipoDeLecheJL.setBounds(210, 90, 170, 160);

        tamañoDelCafeJL.setText("jLabel5");
        add(tamañoDelCafeJL);
        tamañoDelCafeJL.setBounds(80, 320, 290, 140);
    }// </editor-fold>//GEN-END:initComponents

    private void comboTamanioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboTamanioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboTamanioActionPerformed

    private void comboTipoDeLecheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboTipoDeLecheActionPerformed
        
        tipoDeLecheJL.setIcon(new ImageIcon(getClass().getResource("/TiposLeches/"+comboTipoDeLeche.getSelectedItem().toString()+".png")));
    }//GEN-LAST:event_comboTipoDeLecheActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboTamanio;
    private javax.swing.JComboBox<String> comboTipoDeLeche;
    private javax.swing.JLabel letreroTitulo;
    private javax.swing.JLabel tamañoDelCafeJL;
    private javax.swing.JLabel tamañoDelCafeTex;
    private javax.swing.JLabel tipoDeLecheJL;
    private javax.swing.JLabel tipoDeLecheTex;
    // End of variables declaration//GEN-END:variables

    private void cambiarLetra() {
        
        ClaseYellow cf = new ClaseYellow("Cream Cake.ttf");
        ClaseYellow st  = new ClaseYellow("Sweety Strawberry.ttf");
        
        letreroTitulo.setFont(st.MyFont(0, 30));
        tipoDeLecheTex.setFont(cf.MyFont(0, 30));
        tamañoDelCafeTex.setFont(cf.MyFont(0, 30));
    }
}
