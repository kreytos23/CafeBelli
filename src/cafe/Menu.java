/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafe;
import java.awt.Font;

/**
 *
 * @author serpi
 */
public class Menu extends javax.swing.JPanel {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        cambiarMetodo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        Fondo = new javax.swing.JLabel();

        setLayout(null);

        bebidas.setFont(new Font("DK Lemon Yellow Sun.otf",Font.PLAIN,14)
        );
        bebidas.setForeground(new java.awt.Color(255, 255, 255));
        bebidas.setText("CAFÉS");
        add(bebidas);
        bebidas.setBounds(240, 70, 60, 20);

        Latte.setForeground(new java.awt.Color(255, 255, 255));
        Latte.setText("Latte");
        add(Latte);
        Latte.setBounds(140, 130, 70, 16);

        Machiatto.setText("Caramel Machiatto");
        add(Machiatto);
        Machiatto.setBounds(140, 280, 110, 16);

        Frapuccino.setText("Frapuccino");
        add(Frapuccino);
        Frapuccino.setBounds(140, 100, 70, 16);

        vanilla.setText("Vanilla");
        add(vanilla);
        vanilla.setBounds(140, 160, 70, 16);

        Espresso.setText("Espresso");
        add(Espresso);
        Espresso.setBounds(140, 190, 70, 16);

        Mocha.setText("Mocha");
        add(Mocha);
        Mocha.setBounds(140, 220, 70, 16);

        Machiatto1.setText("Machiatto");
        add(Machiatto1);
        Machiatto1.setBounds(140, 250, 70, 16);
        add(jSeparator1);
        jSeparator1.setBounds(140, 210, 230, 10);
        add(jSeparator2);
        jSeparator2.setBounds(140, 120, 230, 10);
        add(jSeparator3);
        jSeparator3.setBounds(140, 150, 230, 10);
        add(jSeparator4);
        jSeparator4.setBounds(140, 240, 230, 10);
        add(jSeparator5);
        jSeparator5.setBounds(140, 270, 230, 10);
        add(jSeparator6);
        jSeparator6.setBounds(140, 300, 230, 10);
        add(jSeparator7);
        jSeparator7.setBounds(140, 180, 230, 10);

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/menu.jpg"))); // NOI18N
        add(Fondo);
        Fondo.setBounds(0, 0, 430, 610);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Espresso;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel Frapuccino;
    private javax.swing.JLabel Latte;
    private javax.swing.JLabel Machiatto;
    private javax.swing.JLabel Machiatto1;
    private javax.swing.JLabel Mocha;
    private javax.swing.JLabel bebidas;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JLabel vanilla;
    // End of variables declaration//GEN-END:variables

    private void cambiarMetodo() {
        ClaseYellow cf = new ClaseYellow("DK Lemon Yellow Sun.otf");
        bebidas.setFont(cf.MyFont(1, 12));
        Latte.setFont(cf.MyFont(1, 12));
        Frapuccino.setFont(cf.MyFont(1, 12));
        vanilla.setFont(cf.MyFont(1, 12));
        Espresso.setFont(cf.MyFont(1, 12));
        Mocha.setFont(cf.MyFont(1, 12));
        Machiatto.setFont(cf.MyFont(1, 12));
        Machiatto1.setFont(cf.MyFont(1, 12));
        
    }
}
