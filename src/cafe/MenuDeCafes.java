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
public class MenuDeCafes extends javax.swing.JPanel {

    /**
     * Creates new form MenuDeCafes
     */
    public MenuDeCafes() {
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

        setBackground(new java.awt.Color(0, 0, 0));
        setForeground(new java.awt.Color(0, 0, 0));
        setLayout(null);

        bebidas.setFont(new Font("DK Lemon Yellow Sun.otf",Font.PLAIN,14)
        );
        bebidas.setForeground(new java.awt.Color(255, 255, 255));
        bebidas.setText("CAFÉS");
        bebidas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(bebidas);
        bebidas.setBounds(100, 20, 100, 40);

        Latte.setForeground(new java.awt.Color(255, 255, 255));
        Latte.setText("*Latte");
        add(Latte);
        Latte.setBounds(20, 126, 120, 30);

        Machiatto.setForeground(new java.awt.Color(255, 255, 255));
        Machiatto.setText("*Caramel Machiatto");
        add(Machiatto);
        Machiatto.setBounds(20, 320, 170, 30);

        Frapuccino.setForeground(new java.awt.Color(255, 255, 255));
        Frapuccino.setText("*Frapuccino ........................... $20");
        add(Frapuccino);
        Frapuccino.setBounds(20, 86, 200, 30);

        vanilla.setForeground(new java.awt.Color(255, 255, 255));
        vanilla.setText("*Vanilla");
        add(vanilla);
        vanilla.setBounds(20, 170, 130, 30);

        Espresso.setForeground(new java.awt.Color(255, 255, 255));
        Espresso.setText("*Espresso");
        add(Espresso);
        Espresso.setBounds(20, 206, 120, 30);

        Mocha.setForeground(new java.awt.Color(255, 255, 255));
        Mocha.setText("*Mocha");
        add(Mocha);
        Mocha.setBounds(20, 240, 110, 30);

        Machiatto1.setForeground(new java.awt.Color(255, 255, 255));
        Machiatto1.setText("*Machiatto");
        add(Machiatto1);
        Machiatto1.setBounds(20, 280, 130, 30);
        add(jSeparator1);
        jSeparator1.setBounds(20, 240, 230, 10);
        add(jSeparator2);
        jSeparator2.setBounds(20, 120, 230, 10);
        add(jSeparator3);
        jSeparator3.setBounds(20, 160, 230, 10);
        add(jSeparator4);
        jSeparator4.setBounds(20, 270, 230, 10);
        add(jSeparator5);
        jSeparator5.setBounds(20, 310, 230, 10);
        add(jSeparator6);
        jSeparator6.setBounds(20, 350, 230, 10);
        add(jSeparator7);
        jSeparator7.setBounds(20, 200, 230, 10);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Espresso;
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
        ClaseYellow cf = new ClaseYellow("Cream Cake.ttf");
        ClaseYellow st  = new ClaseYellow("Sweety Strawberry.ttf");
        
        bebidas.setFont(st.MyFont(1, 30));
        Latte.setFont(cf.MyFont(0, 30));
        Frapuccino.setFont(cf.MyFont(0, 30));
        vanilla.setFont(cf.MyFont(0, 30));
        Espresso.setFont(cf.MyFont(0, 30));
        Mocha.setFont(cf.MyFont(0, 30));
        Machiatto.setFont(cf.MyFont(0, 30));
        Machiatto1.setFont(cf.MyFont(0, 30));
        
    }

}
