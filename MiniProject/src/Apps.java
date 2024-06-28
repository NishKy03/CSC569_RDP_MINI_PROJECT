
import javax.swing.*;
import java.awt.event.*;

public class Apps extends javax.swing.JFrame {

    public Apps() {
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Based = new javax.swing.JPanel();
        InputFieldPanel = new javax.swing.JPanel();
        InputTextField = new javax.swing.JTextField();
        OutputFieldPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        OutputArea = new javax.swing.JTextArea();
        ResultLabel = new javax.swing.JLabel();
        EnterLabel = new javax.swing.JLabel();
        submitButton = new javax.swing.JButton();
        MenuBar = new javax.swing.JPanel();
        closeButton = new javax.swing.JButton();
        TITLELABEL = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(240, 255, 239));

        Based.setBackground(new java.awt.Color(153, 153, 255));
        Based.setToolTipText("");

        InputFieldPanel.setBackground(new java.awt.Color(255, 255, 255));
        InputFieldPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        InputTextField.setBackground(new java.awt.Color(255, 255, 204));
        InputTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        InputTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout InputFieldPanelLayout = new javax.swing.GroupLayout(InputFieldPanel);
        InputFieldPanel.setLayout(InputFieldPanelLayout);
        InputFieldPanelLayout.setHorizontalGroup(
            InputFieldPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(InputTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 381, Short.MAX_VALUE)
        );
        InputFieldPanelLayout.setVerticalGroup(
            InputFieldPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(InputTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        OutputFieldPanel.setBackground(new java.awt.Color(255, 255, 255));
        OutputFieldPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        OutputArea.setBackground(new java.awt.Color(255, 255, 204));
        OutputArea.setColumns(20);
        OutputArea.setRows(5);
        OutputArea.setText("Your Grammar Result is:\n");
        jScrollPane1.setViewportView(OutputArea);

        javax.swing.GroupLayout OutputFieldPanelLayout = new javax.swing.GroupLayout(OutputFieldPanel);
        OutputFieldPanel.setLayout(OutputFieldPanelLayout);
        OutputFieldPanelLayout.setHorizontalGroup(
            OutputFieldPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 381, Short.MAX_VALUE)
        );
        OutputFieldPanelLayout.setVerticalGroup(
            OutputFieldPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
        );

        ResultLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ResultLabel.setText("RESULT:");

        EnterLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        EnterLabel.setText("ENTER:");

        submitButton.setBackground(new java.awt.Color(153, 153, 255));
        submitButton.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        submitButton.setForeground(new java.awt.Color(51, 51, 51));
        submitButton.setText("SUBMIT");
        submitButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BasedLayout = new javax.swing.GroupLayout(Based);
        Based.setLayout(BasedLayout);
        BasedLayout.setHorizontalGroup(
            BasedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BasedLayout.createSequentialGroup()
                .addGap(265, 265, 265)
                .addGroup(BasedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EnterLabel)
                    .addComponent(ResultLabel))
                .addGap(27, 27, 27)
                .addGroup(BasedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BasedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(InputFieldPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(OutputFieldPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(295, Short.MAX_VALUE))
        );
        BasedLayout.setVerticalGroup(
            BasedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BasedLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(BasedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EnterLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(InputFieldPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(BasedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(OutputFieldPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ResultLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(85, Short.MAX_VALUE))
        );

        MenuBar.setBackground(new java.awt.Color(0, 0, 0));
        MenuBar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        closeButton.setBackground(new java.awt.Color(255, 153, 153));
        closeButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        closeButton.setText("X");
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });

        TITLELABEL.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        TITLELABEL.setForeground(new java.awt.Color(255, 255, 255));
        TITLELABEL.setText("PARSER PROJECT");

        javax.swing.GroupLayout MenuBarLayout = new javax.swing.GroupLayout(MenuBar);
        MenuBar.setLayout(MenuBarLayout);
        MenuBarLayout.setHorizontalGroup(
            MenuBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuBarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TITLELABEL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(closeButton)
                .addGap(22, 22, 22))
        );
        MenuBarLayout.setVerticalGroup(
            MenuBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(closeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TITLELABEL))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MenuBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Based, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(MenuBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Based, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_closeButtonActionPerformed

    private void InputTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InputTextFieldActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        String input = InputTextField.getText();
        try {
            RDP parser = new RDP(input); // Pass 'this' to RDP constructor for callback
            parser.parse();
        } catch (RuntimeException e) {
            OutputArea.append("Result: " + e.getMessage() + "\n"); // Handle rejection case
        }
    }//GEN-LAST:event_submitButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Apps.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Apps.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Apps.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Apps.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Apps().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Based;
    private javax.swing.JLabel EnterLabel;
    private javax.swing.JPanel InputFieldPanel;
    private javax.swing.JTextField InputTextField;
    private javax.swing.JPanel MenuBar;
    private javax.swing.JTextArea OutputArea;
    private javax.swing.JPanel OutputFieldPanel;
    private javax.swing.JLabel ResultLabel;
    private javax.swing.JLabel TITLELABEL;
    private javax.swing.JButton closeButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton submitButton;
    // End of variables declaration//GEN-END:variables
}
