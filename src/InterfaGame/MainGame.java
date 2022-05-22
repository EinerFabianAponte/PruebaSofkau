/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package InterfaGame;

;
import Dialogos.*;
import java.util.logging.Logger;
import javax.swing.JLabel;
import java.awt.geom.Point2D;
import java.awt.LinearGradientPaint;
import java.awt.Rectangle;
import java.awt.Color;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import javax.swing.plaf.basic.BasicProgressBarUI;
import javax.swing.JButton;
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author ASUS
 */


public class MainGame extends javax.swing.JFrame {

    /**
     * Creates new form MainGame
     */
    private ImagenFondo fond1 = new ImagenFondo();                          // Creando Objeto ImagenFondo Clase interna
    private RandomPregunta pregunta = new RandomPregunta();                // Creando objeto RandomPregunta para numero aleatoreo de pregunta
    private Niveles level = new Niveles();                                // Creando Objeto Niveles para seleccionar nivel
    private int cont, cont2;
    private String SelectLevel, Boton;
    private HiloAni2 h2 = new HiloAni2();

    public MainGame() {
        Default();
        initComponents();
        Default2();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                formMouseEntered(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("BubbleGum", 1, 130)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 251, 192));
        jLabel1.setText("ALAETERNA");

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/A.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/B.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/C.png"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(0, 0, 0));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/D.png"))); // NOI18N
        jButton4.setBorder(null);
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel6.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("¿Quién canta el siguiente fragmento de canción “mande mi cadillacal al mecánico hace días hace tanto tiempo que en verdad lo merecía,”?");
        jLabel6.setToolTipText("");

        jProgressBar1.setBorder(null);
        jProgressBar1.setBorderPainted(false);
        jProgressBar1.setOpaque(true);
        jProgressBar1.setPreferredSize(new java.awt.Dimension(146, 2));

        jLabel7.setFont(new java.awt.Font("Kristen ITC", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(8, 224, 224));
        jLabel7.setText("0%");

        jLabel8.setFont(new java.awt.Font("Showcard Gothic", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 153, 255));
        jLabel8.setText("Level 1");

        jLabel9.setForeground(new java.awt.Color(204, 255, 102));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InterfaGame/CateMusi.png"))); // NOI18N

        jLabel10.setFont(new java.awt.Font("Showcard Gothic", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 153, 255));
        jLabel10.setText("Categoria");

        jLabel11.setFont(new java.awt.Font("Showcard Gothic", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(153, 153, 255));
        jLabel11.setText("Acumulado:5000");
        jLabel11.setToolTipText("");
        jLabel11.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/coin2 (2).gif"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 756, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(125, 125, 125))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(83, 83, 83)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 189, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 338, Short.MAX_VALUE)
                                        .addComponent(jLabel10)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(219, 219, 219)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(229, 229, 229))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(8, 8, 8))
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(59, 59, 59))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // public void Respuestacorrecta(Niveles level, int contRC, RandomPreguntas){};
        Boton = "a";
        Respuestacorrecta(level, cont, pregunta, Boton);
        Modifi_Ventana(cont);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Boton = "b";
        Respuestacorrecta(level, cont, pregunta, Boton);
        Modifi_Ventana(cont);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Boton = "c";
        Respuestacorrecta(level, cont, pregunta, Boton);
        Modifi_Ventana(cont);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Boton = "d";
        Respuestacorrecta(level, cont, pregunta, Boton);
        Modifi_Ventana(cont);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void formMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseEntered

    }//GEN-LAST:event_formMouseEntered

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainGame().setVisible(true);
            }
        });

    }

    //Se inician los valores por defecto del JFRAME
    private void Default() {
        this.setContentPane(fond1);
        setSize(1023, 596);
        setLocationRelativeTo(null);
    }

    //Se inician los niveles y se crea una lista
    private void Default2() {
        jButton1.setRolloverIcon(setIconPresss("A.png", jButton1, 10, 10));
        jButton2.setRolloverIcon(setIconPresss("B.png", jButton2, 10, 10));
        jButton3.setRolloverIcon(setIconPresss("C.png", jButton3, 10, 10));
        jButton4.setRolloverIcon(setIconPresss("D.png", jButton4, 10, 10));
        jLabel11.setText("ACUMULADO=1000");
        level.LoadLevel1();
        level.LoadLevel2();
        level.LoadLevel3();
        level.LoadLevel4();
        level.LoadLevel5();
        jPanel1.setLayout(null);
        Level(0);
        cont = 0;
        runhilo();
        h2.start();
        jProgressBar1.setUI(new BasicProgressBarUI() {
            @Override
            protected void paintDeterminate(Graphics g, JComponent c) {
                jProgressBar1.setBackground(Color.BLACK);
                jProgressBar1.setSize(134, 47);
                Graphics2D g2d = (Graphics2D) g;  //[134, 20] tamaño barra de progreso
                int ancho = jProgressBar1.getWidth();
                int alto = jProgressBar1.getHeight();

                double progresarbarra = jProgressBar1.getPercentComplete();
                ancho = (int) (ancho * progresarbarra);
                Point2D inicio = new Point2D.Double(6, 6);
                Point2D fin = new Point2D.Double(6, 6 + alto);
                float[] posicion = {0.5f, 0.75f};
                Color[] color = {Color.ORANGE, Color.RED};

                LinearGradientPaint grad = new LinearGradientPaint(inicio, fin, posicion, color);
                g2d.setPaint(grad);
                Rectangle p = new Rectangle(1, 1, ancho, alto);
                g2d.fill(p);

                ImageIcon img = new ImageIcon(getClass().getResource("Avanzar (1).png"));
                g2d.drawImage(img.getImage(), ancho - 25, -20, null);
            }

        });

    }

    // CLase para aajustar imagen de fondo a JPANEL
    class ImagenFondo extends JPanel {

        private Image imagen;

        public void paint(Graphics g) {
            imagen = new ImageIcon(getClass().getResource("FONDOMAIN.jpg")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);
        }
    }

    //Meto para escoger el lugar de las respuestas en sus respectivos lugares
    public String LocationRes(int x, Niveles level, RandomPregunta pregunta, int Level) {
        List<Preguntas> lev = new ArrayList<>();
        switch (Level) {
            case 0 ->
                lev = level.getPre1();
            case 1 ->
                lev = level.getPre2();
            case 2 ->
                lev = level.getPre3();
            case 3 ->
                lev = level.getPre4();
            case 4 ->
                lev = level.getPre5();
            default ->
                throw new AssertionError();
        }

        String y = "";
        switch (x) {
            case 0 ->
                y = lev.get(pregunta.getRandomNum()).getOpt1();
            case 1 ->
                y = lev.get(pregunta.getRandomNum()).getOpt2();
            case 2 ->
                y = lev.get(pregunta.getRandomNum()).getOpt3();
            case 3 ->
                y = lev.get(pregunta.getRandomNum()).getRes();
            default ->
                throw new AssertionError();
        }
        return y;
    }

    //Meto para escoger la pregunta dependiendo el nivel
    public String LocationPre(Niveles level, RandomPregunta pregunta, int Level) {
        List<Preguntas> lev = new ArrayList<>();
        String y = "";

        switch (Level) {
            case 0 ->
                lev = level.getPre1();
            case 1 ->
                lev = level.getPre2();
            case 2 ->
                lev = level.getPre3();
            case 3 ->
                lev = level.getPre4();
            case 4 ->
                lev = level.getPre5();
            default ->
                throw new AssertionError();
        }
        y = lev.get(pregunta.getRandomNum()).getPregunta();
        return y;
    }

    //GETTER LEV (Saber el nivel actual)
    public List<Preguntas> SaberNivel(Niveles level, int x) {
        List<Preguntas> lev = new ArrayList<>();

        switch (x) {
            case 0 ->
                lev = level.getPre1();
            case 1 ->
                lev = level.getPre2();
            case 2 ->
                lev = level.getPre3();
            case 3 ->
                lev = level.getPre4();
            case 4 ->
                lev = level.getPre5();
            default ->
                throw new AssertionError();
        }
        return lev;
    }

    //Cargandor de niveles
    public void Level(int auxlev) {

        int AlaRes[] = new int[3];
        pregunta.AleatoreaPregunta();
        AlaRes = pregunta.BotonAleatoreo();

        pregunta.setA(AlaRes[0]);
        pregunta.setB(AlaRes[1]);
        pregunta.setC(AlaRes[2]);
        pregunta.setD(AlaRes[3]);

        String LevelPregunta = LocationPre(level, pregunta, auxlev);
        String Botona = LocationRes(pregunta.getA(), level, pregunta, auxlev);
        String Botonb = LocationRes(pregunta.getB(), level, pregunta, auxlev);
        String Botonc = LocationRes(pregunta.getC(), level, pregunta, auxlev);
        String Botond = LocationRes(pregunta.getD(), level, pregunta, auxlev);

        jLabel6.setText("<html>" + LevelPregunta + "<html>");
        jLabel2.setText("<html>" + Botona + "<html>");
        jLabel4.setText("<html>" + Botonb + "<html>");
        jLabel3.setText("<html>" + Botonc + "<html>");
        jLabel5.setText("<html>" + Botond + "<html>");
    }

    //Ajustar Imagen al boton presionado
    public Icon setIconPresss(String direccion, JButton btn, int ancho, int alto) {
        ImageIcon icon = new ImageIcon(getClass().getResource(direccion));
        int anchocopy = btn.getWidth() - ancho;
        int altocopy = btn.getHeight() - alto;
        ImageIcon finalyIcon = new ImageIcon(icon.getImage().getScaledInstance(anchocopy, altocopy, Image.SCALE_DEFAULT));
        return finalyIcon;
    }

    // Se ajusta la imagen al tamaño del jLabel
    private void SetImageLabel(JLabel labelName, String root) {
        ImageIcon image = new ImageIcon(root);
        Icon icon = new ImageIcon(
                image.getImage().getScaledInstance(labelName.getWidth(), labelName.getHeight(), Image.SCALE_DEFAULT)
        );
        labelName.setIcon(icon);
        this.repaint();
    }

    //Funcion para modificar JFRAME dependiendo el Nivel
    private void Modifi_Ventana(int constante) {
        switch (constante) {
            case 1:
                Level(1);
                jProgressBar1.setValue(20);
                jLabel7.setText("20%");
                jLabel8.setText("Level 2");
                jLabel9.setIcon(new ImageIcon(getClass().getResource("/InterfaGame/CateTV.png")));
                jLabel11.setText("ACUMULADO=2000");
                runhilo();
                h2.time =0;
                break;
            case 2:
                Level(2);
                jProgressBar1.setValue(40);
                jLabel7.setText("40%");
                jLabel8.setText("Level 3");
                SetImageLabel(jLabel9, "CateColombia.png");
                jLabel9.setIcon(new ImageIcon(getClass().getResource("/InterfaGame/CateColombia.png")));
                jLabel11.setText("ACUMULADO=3000");
                runhilo();
                h2.time =0;
                break;
            case 3:
                Level(3);
                jProgressBar1.setValue(60);
                jLabel7.setText("60%");
                jLabel8.setText("Level 4");
                jLabel9.setIcon(new ImageIcon(getClass().getResource("/InterfaGame/CateCiencia.png")));
                jLabel11.setText("ACUMULADO=4000");
                runhilo();
                h2.time =0;
                break;
            case 4:
                Level(4);
                jProgressBar1.setValue(80);
                jLabel7.setText("80%");
                jLabel8.setText("Level 5");
                jLabel9.setIcon(new ImageIcon(getClass().getResource("/InterfaGame/CateLibros.png")));
                jLabel11.setText("ACUMULADO=5000");
                runhilo();
                h2.time =0;
                break;
            case 5:
                jProgressBar1.setValue(10);
                jLabel7.setText("100%");
                WIN h6 = new WIN(this, true);
                h6.setVisible(true);
                break;
            default:
                throw new AssertionError();
        }
    }

    //Corre animacion
    public void runhilo() {
        HiloAni hilo1 = new HiloAni();
        hilo1.start();
        if (hilo1.time >= 10) {
            hilo1.stop();
            jLabel8.setVisible(true);
            jLabel11.setVisible(true);
        }
    }

    //Identifica si la respuesta seleccionada es la respuesta correcta
    public void Respuestacorrecta(Niveles levelRC, int contRC, RandomPregunta preRC, String BotonPress) {
        SelectLevel = "<html>" + SaberNivel(levelRC, contRC).get(preRC.getRandomNum()).getRes() + "<html>";
        String res = "";
        switch (BotonPress) {
            case "a":
                res = jLabel4.getText();
                break;
            case "b":
                res = jLabel2.getText();
                break;
            case "c":
                res = jLabel3.getText();
                break;
            case "d":
                res = jLabel5.getText();
                break;
            default:
                throw new AssertionError();
        }
        System.out.println(SelectLevel);
        System.out.println(res);

        if (res.equals(SelectLevel)) {
            if (cont != 4) {
                NextLevel h3 = new NextLevel(this, true);
                h3.setVisible(true);
                System.out.println(res);
                jLabel7.setText("100%");
                jProgressBar1.setValue(100);
            }
        } else {
            FINGAME h4 = new FINGAME(this, true);
            h4.setVisible(true);
        }
        cont++;
        Modifi_Ventana(cont);

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    // End of variables declaration//GEN-END:variables

    //Clases Internas
    // Clase interna HiloANi para el uso de hilos
    private class HiloAni extends Thread {

        private int time = 0;

        // Metodo run de nuestro hilo @Override fuerza al compilador a comprobar en tiempo de compilacion la sobrecarga del metodo
        @Override
        public void run() {

            while (time <= 10) {
                try {
                    Thread.sleep(500);
                    jLabel8.setVisible(false);
                    jLabel11.setVisible(false);
                    Thread.sleep(500);
                    jLabel8.setVisible(true);
                    jLabel11.setVisible(true);
                    time += 6;
                } catch (InterruptedException ex) {
                    Logger.getLogger(MainGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                }
            }
        }

    }

    private class HiloAni2 extends Thread {

        private int time = 0;

        // Metodo run de nuestro hilo @Override fuerza al compilador a comprobar en tiempo de compilacion la sobrecarga del metodo
        @Override
        public void run() {

            while (time <= 60) {
                try {
                    Thread.sleep(1000);
                    cont2 = time;
                    time++;
                    System.out.println(time);
                } catch (InterruptedException ex) {
                    Logger.getLogger(MainGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                }
            }
            System.exit(0);
            time = 0;

        }

    }
}
