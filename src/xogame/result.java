/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package xogame;

import static xogame.chose1OR2.chose;
import static xogame.game.drow;
import static xogame.game.restart;
import static xogame.game.winplayer;

/**
 *
 * @author amine
 */
public class result extends javax.swing.JFrame {

    /**
     * Creates new form result
     */
    public result() {
        initComponents();
        restart();
        if (!drow)   
        {
            if (chose == 1)
            {
            if (winplayer == 'x')
            {
                massege.setText("مبروك يا شطور انت كسبت");
                sadPhoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/hapy.jpeg")));
            }
            else 
            {
                massege.setText("معلش انت خسرت! جرب مره تانيه");
                sadPhoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sad.jpeg")));
            } 
            }
            else if (chose == 2)
            {
                if (winplayer == 'x')
            {
                massege.setText("مبروك يا          انت كسبت");
                sadPhoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/hapy.jpeg")));
                winer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/x2.jpeg")));
            }
            else 
            {
                massege.setText("مبروك يا          انت كسبت");
                sadPhoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/hapy.jpeg")));
                winer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/o2.jpeg")));
            } 
            }
        }
        else
        {
            massege.setText("محدش كسب! جرب مره تانيه");
            sadPhoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/nemo.jpeg"))); 
            drow = false;
        } 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        massege = new javax.swing.JLabel();
        sadPhoto = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        winer = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1550, 878));
        setPreferredSize(new java.awt.Dimension(1560, 818));
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 199, 31));
        jPanel2.setLayout(null);

        massege.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jPanel2.add(massege);
        massege.setBounds(470, 160, 810, 120);
        jPanel2.add(sadPhoto);
        sadPhoto.setBounds(1180, 150, 410, 450);

        jButton1.setBackground(new java.awt.Color(240, 157, 87));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("العب مره تانية");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(640, 410, 320, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back.jpeg"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel1);
        jLabel1.setBounds(1330, 30, 170, 120);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit.jpeg"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel2);
        jLabel2.setBounds(20, 0, 170, 200);
        jPanel2.add(winer);
        winer.setBounds(740, 170, 100, 110);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 1770, 880);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       this.setVisible(false);
       new game().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
      
        this.setVisible(false);
        new chose1OR2().setVisible(true);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel2MouseClicked

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
            java.util.logging.Logger.getLogger(result.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(result.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(result.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(result.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new result().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel massege;
    private javax.swing.JLabel sadPhoto;
    private javax.swing.JLabel winer;
    // End of variables declaration//GEN-END:variables
}
