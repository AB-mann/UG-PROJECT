
package Gui;

import SocketPrmg.AtkSuckFileFrmCloudlet;
import java.io.*;
import javax.swing.JOptionPane;

public class Pnl_Attaker extends javax.swing.JPanel {
   Main_frm mainFramee;
  
    public Pnl_Attaker(Main_frm mainFrame) {
        initComponents();
        this.mainFramee = mainFrame;
        mainFrame.setSize(800, 600);
             mainFrame.setLocationRelativeTo(null);    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_atk = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btnDownload = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setLayout(new java.awt.BorderLayout());

        txt_atk.setColumns(20);
        txt_atk.setRows(5);
        jScrollPane1.setViewportView(txt_atk);

        jPanel2.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel2, java.awt.BorderLayout.CENTER);

        jPanel3.setPreferredSize(new java.awt.Dimension(769, 70));
        jPanel3.setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Bitstream Charter", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(1, 1, 1));
        jLabel1.setText("Attacker");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(22, 382, 23, 383);
        jPanel3.add(jLabel1, gridBagConstraints);

        jPanel1.add(jPanel3, java.awt.BorderLayout.PAGE_START);

        jPanel4.setPreferredSize(new java.awt.Dimension(769, 80));

        btnDownload.setBackground(new java.awt.Color(0, 51, 102));
        btnDownload.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnDownload.setForeground(new java.awt.Color(242, 115, 37));
        btnDownload.setText("Man In Middle Atk");
        btnDownload.setMaximumSize(new java.awt.Dimension(155, 36));
        btnDownload.setMinimumSize(new java.awt.Dimension(155, 36));
        btnDownload.setPreferredSize(new java.awt.Dimension(155, 36));
        btnDownload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDownloadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(btnDownload, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(551, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(btnDownload, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        jPanel1.add(jPanel4, java.awt.BorderLayout.PAGE_END);

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDownloadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDownloadActionPerformed
        //        FileReader readerr = null;
        BufferedReader reader = null;
        try {
            

          
                String fileName = System.getProperty("user.dir")+File.separator+"AttackFile";                
                File f=new File(fileName);

                
                AtkSuckFileFrmCloudlet atk = new AtkSuckFileFrmCloudlet();
                String FilePath = atk.CatchCloudletFile();

                reader = new BufferedReader(new FileReader(FilePath));
                String line = "";
                StringBuilder sb = new StringBuilder();
                while ((line = reader.readLine()) != null) {
                    sb.append(line).append("\n");

                }
                System.out.println("hhhhhhhhhhhh" + sb);
                txt_atk.setText(sb.toString());
                JOptionPane.showMessageDialog(this, "Atk On Clodlet File  successfully.");
//                pnlMainHome.txtOutputScreenClient.setText("File downloaded successfully.");
//            
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnDownloadActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDownload;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txt_atk;
    // End of variables declaration//GEN-END:variables
}
