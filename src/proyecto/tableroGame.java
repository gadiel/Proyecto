/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author JoXhe
 */
public class tableroGame extends java.awt.Frame {
    private JLabel[][] piezaLab;
    private JLabel[][] piezaHP;
    Tablero tb = new Tablero("Jose","Carlos");
    /**
     * Creates new form tableroGame
     */
    public tableroGame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        zombieX = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        zombieY = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        if1P = new javax.swing.JComboBox();

        jTextField1.setText("jTextField1");

        setBounds(new java.awt.Rectangle(0, 22, 1000, 650));
        setMinimumSize(new java.awt.Dimension(1000, 650));
        setPreferredSize(new java.awt.Dimension(1000, 650));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
        });
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Debug Menu", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Abadi MT Condensed Light", 0, 14))); // NOI18N
        jPanel1.setToolTipText("Debug Menu");
        jPanel1.setName("Debug Menu");

        jLabel1.setText("ZOMBIE");

        jLabel2.setText("X : ");

        zombieX.setText("--");

        jLabel3.setText("Y : ");

        zombieY.setText("--");

        jButton1.setText("Invocar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        if1P.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1P", "2P" }));

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(13, 13, 13)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel1)
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(jLabel2)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(zombieX, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                .add(jLabel3)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(zombieY, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(7, 7, 7)
                                .add(if1P, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                        .add(0, 4, Short.MAX_VALUE))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .add(jButton1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel1)
                .add(10, 10, 10)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel2)
                    .add(zombieX, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel3)
                    .add(zombieY, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(if1P, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jButton1)
                .addContainerGap())
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 40, 230, 330));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Exit the Application
     */
    private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm
        System.exit(0);
    }//GEN-LAST:event_exitForm

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        int x = Integer.parseInt(zombieX.getText());
        int y = Integer.parseInt(zombieY.getText());
        if(tb.Piezas[x][y]==null){
            boolean player = (((String)if1P.getSelectedItem()).equals("1P")? true : false);
            tb.Piezas[x][y] = new piezaZombie(x,y,player);
            setHPtxt(x,y);
            setIconPos(x,y);
        }else{
            JOptionPane.showMessageDialog(null, "Esta posicion esta ocupada!" , "Alerta", y);
        }
    }//GEN-LAST:event_jButton1MouseClicked

    
    public void tableroNewGame() {
        // TODO add your handling code here:
        piezaLab = new javax.swing.JLabel[6][6];
        piezaHP = new javax.swing.JLabel[6][6];
        int xpos = 30;
        int ypos = 30;
        for(int x=0;x<6;x++){
            for(int y=0;y<6;y++){
                tableroPieza(x,y,xpos,ypos);
                xpos = xpos+100;
            }
            xpos = 30;
            ypos = ypos+100;
        }
    }
    public void tableroPieza(int x,int y,int xpos,int ypos) {
        
        piezaHP[x][y] = new javax.swing.JLabel();
        piezaHP[x][y].setFont(new java.awt.Font("Bauhaus 93", 0, 18));
        piezaHP[x][y].setPreferredSize(new java.awt.Dimension(30, 30));
        piezaHP[x][y].setSize(new java.awt.Dimension(30, 30));
        piezaHP[x][y].setText("");
        piezaHP[x][y].setForeground(new java.awt.Color(255, 255, 255));
        add(piezaHP[x][y], new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        piezaHP[x][y].setLocation(xpos+8, ypos+70);
        setHPtxt(x,y);

        piezaLab[x][y] = new javax.swing.JLabel();
        piezaLab[x][y].setPreferredSize(new java.awt.Dimension(100, 100));
        piezaLab[x][y].setSize(new java.awt.Dimension(100, 100));
        piezaLab[x][y].setText(null);
        add(piezaLab[x][y], new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        piezaLab[x][y].setLocation(xpos, ypos);
        setIconPos(x,y);

    }
    
    public void setHPtxt(int x,int y){
        if(tb.Piezas[x][y]!=null){
            piezaHP[x][y].setText(""+((tb.Piezas[x][y].getLP()<10)?"0":"")+tb.Piezas[x][y].getLP());
        }else{
            piezaHP[x][y].setText("");
        }
    }
    
    public void setIconPos(int x,int y){
        if(tb.Piezas[x][y]!=null){
            if(tb.Piezas[x][y].nPlayer){
                if(tb.Piezas[x][y].tipo == piezaTipo.WOLF)
                    piezaLab[x][y].setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/wolfBlack.png")));
                if(tb.Piezas[x][y].tipo == piezaTipo.VAMPIRE)
                    piezaLab[x][y].setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/vampireBlack.png")));
                if(tb.Piezas[x][y].tipo == piezaTipo.DEATH)
                    piezaLab[x][y].setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/deathBlack.png")));
                if(tb.Piezas[x][y].tipo == piezaTipo.ZOMBIE)
                    piezaLab[x][y].setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/zombieBlack.png")));
            }else{
                if(tb.Piezas[x][y].tipo == piezaTipo.WOLF)
                    piezaLab[x][y].setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/wolfWithe.png")));
                if(tb.Piezas[x][y].tipo == piezaTipo.VAMPIRE)
                    piezaLab[x][y].setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/vampireWithe.png")));
                if(tb.Piezas[x][y].tipo == piezaTipo.DEATH)
                    piezaLab[x][y].setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/deathWithe.png")));
                if(tb.Piezas[x][y].tipo == piezaTipo.ZOMBIE)
                    piezaLab[x][y].setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/zombieWithe.png")));
            }
        }else{
            piezaLab[x][y].setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/piece.png")));
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                tableroGame newT = new tableroGame();
                newT.setVisible(true);
                newT.tableroNewGame();
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox if1P;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField zombieX;
    private javax.swing.JTextField zombieY;
    // End of variables declaration//GEN-END:variables
}
