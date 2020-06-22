package cafe;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
/**
 * @author Aguilar Ceja Luis Angel (2020640029)
 * @author Cabello Vargas Victor Manuel(2020640111)
 * @author Gallegos Salinas Emilio (2020640198)
 * @author Martin Moreno Cesar Sadrack (2020640287)
 */
public class PanelTamaño extends javax.swing.JPanel {
    /*Atributos*/
    private DefaultComboBoxModel tipoDeLeche;
    private DefaultComboBoxModel tamanios;
    private TipoDeLeche tiposDeLeche;
    
    /*Constructor*/
    public PanelTamaño() {
        tipoDeLeche = new DefaultComboBoxModel(TipoDeLeche.values());
        tamanios = new DefaultComboBoxModel(Tamaño.values());
        initComponents();
        cambiarLetra();
        mantenerComboLeche();
        mantenerComboTam();
        
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
        tamañoDelCafeTex.setBounds(40, 270, 180, 30);

        comboTipoDeLeche.setModel(tipoDeLeche);
        comboTipoDeLeche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboTipoDeLecheActionPerformed(evt);
            }
        });
        add(comboTipoDeLeche);
        comboTipoDeLeche.setBounds(50, 170, 130, 26);

        comboTamanio.setModel(tamanios);
        comboTamanio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboTamanioActionPerformed(evt);
            }
        });
        add(comboTamanio);
        comboTamanio.setBounds(240, 270, 100, 26);

        letreroTitulo.setForeground(new java.awt.Color(255, 255, 255));
        letreroTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        letreroTitulo.setText("Tamaño y Tipo De Leche");
        add(letreroTitulo);
        letreroTitulo.setBounds(140, 0, 230, 50);

        tipoDeLecheJL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TiposLeches/Entera.png"))); // NOI18N
        add(tipoDeLecheJL);
        tipoDeLecheJL.setBounds(210, 90, 170, 160);

        tamañoDelCafeJL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jarabes/Chico.png"))); // NOI18N
        add(tamañoDelCafeJL);
        tamañoDelCafeJL.setBounds(40, 310, 290, 150);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * El ComboBox de tamaño empezara a comparar la opción seleccionada para identificar que imagen proyectar con el Label, esta imagen solo resaltara el tamanio del café a comprar.
     * Posteriormente tendrá un for each el cual recorrerá el enum Tamaño comparando los elementos con la selección del comboBox para asignar el tamaño al objeto Cafeteria
     * @param evt 
     */
    private void comboTamanioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboTamanioActionPerformed

        if(comboTamanio.getSelectedItem().toString().equals("Chico")){
            tamañoDelCafeJL.setIcon(new ImageIcon(getClass().getResource("/Jarabes/Chico.png")));
        }else if(comboTamanio.getSelectedItem().toString().equals("Mediano")){
            tamañoDelCafeJL.setIcon(new ImageIcon(getClass().getResource("/Jarabes/Mediano.png")));
        }else{
            tamañoDelCafeJL.setIcon(new ImageIcon(getClass().getResource("/Jarabes/Grande.png")));
        }  
        for(Tamaño z : Tamaño.values()){
            if(comboTamanio.getSelectedItem().equals(z)){
                Cafeteria.getCuenta().getCafe().setVaso(z);    
            }
        }
        
    }//GEN-LAST:event_comboTamanioActionPerformed

    /**
     * De manera similar al combo box de tamaño el evento de “comboTipoDeLecheActionPerformed” asignara una imagen PNG sobre la leche que selecciono el usuario y comparara el enum de TipoDeLeche con la selección para poder asignarlo al objeto Cafetería
     * @param evt 
     */
    private void comboTipoDeLecheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboTipoDeLecheActionPerformed
        tipoDeLecheJL.setIcon(new ImageIcon(getClass().getResource("/TiposLeches/"+comboTipoDeLeche.getSelectedItem().toString()+".png")));
       
        for(TipoDeLeche z : tiposDeLeche.values()){
            if(comboTipoDeLeche.getSelectedItem().equals(z)){
                Cafeteria.getCuenta().getCafe().setLeche(z);
            }
        }
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
    
    /**
     * Los métodos “mantenerComboLeche” y “mantenerComboTam” mantendrán los cambios hechos por el usuario para los comboBoxs de Tamaño y Leche al igual que las imágenes, sin importar el que cambie de panel y posteriormente regrese
     */
    private void mantenerComboLeche(){
        if(Cafeteria.getCuenta().getCafe().getLeche() != null){
            for(int x = 0; x < comboTipoDeLeche.getItemCount();x++){
                if(String.valueOf(comboTipoDeLeche.getItemAt(x)) == Cafeteria.getCuenta().getCafe().getLeche().toString()){
                    comboTipoDeLeche.setSelectedIndex(x);
                    tipoDeLecheJL.setIcon(new ImageIcon(getClass().getResource("/TiposLeches/"+comboTipoDeLeche.getSelectedItem().toString()+".png")));
                }
            }
        }
    }
    
    private void mantenerComboTam(){
        if(Cafeteria.getCuenta().getCafe().getVaso() != null){
            for(int x = 0; x < comboTamanio.getItemCount();x++){
                if(String.valueOf(comboTamanio.getItemAt(x)) == Cafeteria.getCuenta().getCafe().getVaso().toString()){
                    comboTamanio.setSelectedIndex(x);
                    tamañoDelCafeJL.setIcon(new ImageIcon(getClass().getResource("/Jarabes/"+comboTamanio.getSelectedItem().toString()+".png")));
                }
            }
        }
    }
}
