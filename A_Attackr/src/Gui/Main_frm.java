
package Gui;

import javax.swing.UIManager;

public class Main_frm extends javax.swing.JFrame {

    public Main_frm() {
        initComponents();
        try {
//            Receiver r = new Receiver();
//            r.start();
        } catch (Exception e) {
        }
    }

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
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new MainFrame().setVisible(true);
                Main_frm mainfrm = new Main_frm();

                try {
//                    UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
//                    UIManager.setLookAndFeel("com.jtattoo.plaf.fast.FastLookAndFeel");
//                    UIManager.setLookAndFeel("com.jtattoo.plaf.mint.MintLookAndFeel");
                    UIManager.setLookAndFeel("com.jtattoo.plaf.aero.AeroLookAndFeel");
                } catch (Exception ex) {
                    ex.printStackTrace();
                }

                mainfrm.setVisible(true);
                mainfrm.pnlMain.removeAll();
                mainfrm.pnlMain.add(new Pnl_Attaker(mainfrm));
                mainfrm.pnlMain.updateUI();

            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlMain = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("User");
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        pnlMain.setLayout(new java.awt.BorderLayout());
        getContentPane().add(pnlMain);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel pnlMain;
    // End of variables declaration//GEN-END:variables
}
