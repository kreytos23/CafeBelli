package cafe;
/**
 * import AppPackage.AnimationClass; es la línea que nos agregara a la clase AnimationClass, pero esto es otra librería que ya esta incluida en el proyecto
 */
import AppPackage.AnimationClass;
import javax.swing.SwingConstants;


/**
 * @author Aguilar Ceja Luis Angel (2020640029)
 * @author Cabello Vargas Victor Manuel(2020640111)
 * @author Gallegos Salinas Emilio (2020640198)
 * @author Martin Moreno Cesar Sadrack (2020640287)
 * En esta clase se moverá el usuario a través de los diferentes paneles que conforman la selección de un producto (podrá cambiar por los paneles MenuDeCafe, MenuJarabe, PanelTamaño y TerminarPedido). Pero ofrecerá una mejor experiencia de usuario ya que este panel desliza los botones que realizan estas tareas
 */
public class Menu extends javax.swing.JPanel {

    private MenuDeCafes menuDeCafes;
    private PanelTamaño panelTamaño;
    private MenuJarabe panelJarabe;
    private TerminarPedido terminarPedido;
    private DatosDeCuentas panelCuentas;
   
    public Menu() {
        initComponents();
        menuDeCafes = new MenuDeCafes();
        menuDeCafes.setBounds(0,0,base.getWidth(),base.getHeight());
        base.removeAll();
        base.add(menuDeCafes);
        base.updateUI();
        letrerosBotones();
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
        jlTerminarPedido = new javax.swing.JLabel();
        jlTamaño = new javax.swing.JLabel();
        jlJarabes = new javax.swing.JLabel();
        jlCafe = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setLayout(null);

        base.setOpaque(false);
        base.setPreferredSize(new java.awt.Dimension(200, 200));
        base.setLayout(null);
        add(base);
        base.setBounds(140, 90, 428, 500);

        btnJarabes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jarabes/jarabe.png"))); // NOI18N
        btnJarabes.setBorderPainted(false);
        btnJarabes.setContentAreaFilled(false);
        btnJarabes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnJarabes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnJarabes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnJarabesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnJarabesMouseExited(evt);
            }
        });
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
        btnTamanioLeche.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnTamanioLecheMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnTamanioLecheMouseExited(evt);
            }
        });
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
        btnCafes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCafesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCafesMouseExited(evt);
            }
        });
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

        jlTerminarPedido.setForeground(new java.awt.Color(255, 255, 255));
        jlTerminarPedido.setText("Terminar Pedido");
        add(jlTerminarPedido);
        jlTerminarPedido.setBounds(420, 581, 100, 30);

        jlTamaño.setForeground(new java.awt.Color(255, 255, 255));
        jlTamaño.setText("Tamaño");
        add(jlTamaño);
        jlTamaño.setBounds(380, 580, 100, 30);

        jlJarabes.setForeground(new java.awt.Color(255, 255, 255));
        jlJarabes.setText("Jarabes");
        add(jlJarabes);
        jlJarabes.setBounds(320, 581, 100, 30);

        jlCafe.setForeground(new java.awt.Color(255, 255, 255));
        jlCafe.setText("Escoger Café");
        add(jlCafe);
        jlCafe.setBounds(242, 581, 100, 30);

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(90, 590, 77, 32);

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/menuW.jpg"))); // NOI18N
        add(Fondo);
        Fondo.setBounds(0, 0, 590, 670);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Los Eventos "btnActionPerformed" son los que cambian de panel por la seleccion del producto
     * @param evt 
     */
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

    /**
     * El método moverActionPerformed() es un evento del botón “Menu”
     * Este evento va a crear un objeto de AnimationClass café, leche, jarabe y terminar, los cuales se usarán para mover los paneles de selección respectivamente
     * Los botones se encontrara fuera de la visibilidad del panel, por ejemplo” cafe.jButtonYDown(610, 680, 20, 5, btnCafes);”. Para esto cuando “mover.isSelected()” los botones se moverán para arriba, por ejemplo “cafe.jButtonYUp(680, 610, 20, 5, btnCafes);”
     * @param evt 
     */
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
        menuDeCafes.setBounds(0,0,428, 500);
        base.removeAll();
        base.add(menuDeCafes);
        base.updateUI();
    }//GEN-LAST:event_btnCafesActionPerformed

    private void btnTerminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTerminarActionPerformed
        terminarPedido = new TerminarPedido();
        terminarPedido.setBounds(0,0,base.getWidth(),base.getHeight());
        base.removeAll();
        base.add(terminarPedido);
        base.updateUI();
    }//GEN-LAST:event_btnTerminarActionPerformed

    private void btnTerminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTerminarMouseEntered
        jlTerminarPedido.setVisible(true);
    }//GEN-LAST:event_btnTerminarMouseEntered

    private void btnTerminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTerminarMouseExited
        jlTerminarPedido.setVisible(false);
    }//GEN-LAST:event_btnTerminarMouseExited

    private void btnTamanioLecheMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTamanioLecheMouseEntered
        jlTamaño.setVisible(true);
    }//GEN-LAST:event_btnTamanioLecheMouseEntered

    private void btnTamanioLecheMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTamanioLecheMouseExited
        jlTamaño.setVisible(false);
    }//GEN-LAST:event_btnTamanioLecheMouseExited

    private void btnJarabesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnJarabesMouseEntered
        jlJarabes.setVisible(true);
    }//GEN-LAST:event_btnJarabesMouseEntered

    private void btnJarabesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnJarabesMouseExited
        jlJarabes.setVisible(false);
    }//GEN-LAST:event_btnJarabesMouseExited

    private void btnCafesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCafesMouseEntered
        jlCafe.setVisible(true);
    }//GEN-LAST:event_btnCafesMouseEntered

    private void btnCafesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCafesMouseExited
        jlCafe.setVisible(false);
    }//GEN-LAST:event_btnCafesMouseExited

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        panelCuentas = new DatosDeCuentas();
        panelCuentas.setBounds(0,0,base.getWidth(),base.getHeight());
        base.removeAll();
        base.add(panelCuentas);
        base.updateUI();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JPanel base;
    private javax.swing.JButton btnCafes;
    private javax.swing.JButton btnJarabes;
    private javax.swing.JButton btnTamanioLeche;
    private javax.swing.JButton btnTerminar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jlCafe;
    private javax.swing.JLabel jlJarabes;
    private javax.swing.JLabel jlTamaño;
    private javax.swing.JLabel jlTerminarPedido;
    private javax.swing.JToggleButton mover;
    // End of variables declaration//GEN-END:variables

    /**
     * Al igual que los metodos anteriores de "letrerosBotones" este es el encargado de cambiar la fuente de los labels
     */
    private void letrerosBotones() {

        ClaseYellow st  = new ClaseYellow("Sweety Strawberry.ttf");
        jlTerminarPedido.setVisible(false);
        jlTerminarPedido.setFont(st.MyFont(0, 20));
        
        jlCafe.setVisible(false);
        jlCafe.setFont(st.MyFont(0, 20));
        
        jlJarabes.setVisible(false);
        jlJarabes.setFont(st.MyFont(0, 20));
        
        jlTamaño.setVisible(false);
        jlTamaño.setFont(st.MyFont(0, 20));
    }

    
}
