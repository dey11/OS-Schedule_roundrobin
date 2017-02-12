/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ospck;

/**
 *
 * @author QWERTYnfinity
 */
public class Main extends javax.swing.JFrame {
    int posX;
    int posY;
    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        this.setLocation(100,100);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        minB = new javax.swing.JLabel();
        closeB = new javax.swing.JLabel();
        memB = new javax.swing.JLabel();
        startB = new javax.swing.JLabel();
        handle = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setUndecorated(true);
        setSize(new java.awt.Dimension(400, 400));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        minB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ospck/assets/minB.png"))); // NOI18N
        minB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minBMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                minBMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                minBMouseExited(evt);
            }
        });
        getContentPane().add(minB, new org.netbeans.lib.awtextra.AbsoluteConstraints(335, 2, -1, -1));

        closeB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ospck/assets/closeB.png"))); // NOI18N
        closeB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        closeB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeBMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closeBMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                closeBMouseExited(evt);
            }
        });
        getContentPane().add(closeB, new org.netbeans.lib.awtextra.AbsoluteConstraints(365, 2, 26, 23));

        memB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ospck/assets/memberB.png"))); // NOI18N
        memB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        memB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                memBMouseClicked(evt);
            }
        });
        getContentPane().add(memB, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, 140, 50));

        startB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ospck/assets/startB.png"))); // NOI18N
        startB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        startB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                startBMouseClicked(evt);
            }
        });
        getContentPane().add(startB, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, 140, 50));

        handle.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        handle.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                handleMouseDragged(evt);
            }
        });
        handle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                handleMousePressed(evt);
            }
        });
        getContentPane().add(handle, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 13));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ospck/assets/bg.png"))); // NOI18N
        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeBMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeBMouseEntered
        closeB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ospck/assets/closeB-H.png")));
    }//GEN-LAST:event_closeBMouseEntered

    private void closeBMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeBMouseExited
        closeB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ospck/assets/closeB.png")));
    }//GEN-LAST:event_closeBMouseExited

    private void minBMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minBMouseEntered
        minB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ospck/assets/minB-H.png")));
    }//GEN-LAST:event_minBMouseEntered

    private void minBMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minBMouseExited
        minB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ospck/assets/minB.png")));
    }//GEN-LAST:event_minBMouseExited

    private void minBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minBMouseClicked
        this.setState(Main.ICONIFIED);
    }//GEN-LAST:event_minBMouseClicked

    private void closeBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeBMouseClicked
        System.exit(0);
    }//GEN-LAST:event_closeBMouseClicked

    private void handleMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_handleMouseDragged
        int movx = evt.getXOnScreen();
        int movy = evt.getYOnScreen();
        this.setLocation(movx - posX, movy - posY);
    }//GEN-LAST:event_handleMouseDragged

    private void handleMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_handleMousePressed
        posX = evt.getX();
        posY = evt.getY();
    }//GEN-LAST:event_handleMousePressed

    private void startBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_startBMouseClicked
        Schedule sched = new Schedule();
        sched.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_startBMouseClicked

    private void memBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_memBMouseClicked
        Member mem = new Member();
        mem.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_memBMouseClicked

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JLabel closeB;
    private javax.swing.JLabel handle;
    private javax.swing.JLabel memB;
    private javax.swing.JLabel minB;
    private javax.swing.JLabel startB;
    // End of variables declaration//GEN-END:variables
}
