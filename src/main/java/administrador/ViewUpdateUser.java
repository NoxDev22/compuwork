/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package administrador;

import java.awt.Color;

/**
 *
 * @author Jose Felipe
 */
public class ViewUpdateUser extends javax.swing.JFrame {

    private Administrator admin;
    private String oldName = "";
    
    public ViewUpdateUser() {
        initComponents();
        
        this.setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtTitle = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        fieldUserName = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        fieldPassword = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        boxRole = new javax.swing.JComboBox<>();
        btnUpdate = new javax.swing.JPanel();
        txtUpdate = new javax.swing.JLabel();
        btnBack = new javax.swing.JPanel();
        txtBack = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtTitle.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        txtTitle.setForeground(new java.awt.Color(255, 65, 65));
        txtTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtTitle.setText("Actualizar usuario ");
        jPanel1.add(txtTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 540, -1));

        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Ingrese el nombre de usuario");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 200, -1));

        fieldUserName.setBackground(new java.awt.Color(255, 255, 255));
        fieldUserName.setBorder(null);
        jPanel1.add(fieldUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 230, 30));

        jSeparator1.setBackground(new java.awt.Color(255, 65, 65));
        jSeparator1.setForeground(new java.awt.Color(255, 65, 65));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 230, -1));

        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Ingrese la contraseña:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        fieldPassword.setBackground(new java.awt.Color(255, 255, 255));
        fieldPassword.setBorder(null);
        jPanel1.add(fieldPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 230, 30));

        jSeparator2.setBackground(new java.awt.Color(255, 65, 65));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 230, -1));

        boxRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No", "Administrador", "Gerente", "Empleado" }));
        boxRole.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxRoleActionPerformed(evt);
            }
        });
        jPanel1.add(boxRole, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        btnUpdate.setBackground(new java.awt.Color(255, 65, 65));

        txtUpdate.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtUpdate.setForeground(new java.awt.Color(255, 255, 255));
        txtUpdate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtUpdate.setText("Actualizar");
        txtUpdate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtUpdateMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtUpdateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtUpdateMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnUpdateLayout = new javax.swing.GroupLayout(btnUpdate);
        btnUpdate.setLayout(btnUpdateLayout);
        btnUpdateLayout.setHorizontalGroup(
            btnUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtUpdate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
        );
        btnUpdateLayout.setVerticalGroup(
            btnUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        jPanel1.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 130, 35));

        btnBack.setBackground(new java.awt.Color(255, 65, 65));

        txtBack.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtBack.setForeground(new java.awt.Color(255, 255, 255));
        txtBack.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtBack.setText("Regresar");
        txtBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtBackMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtBackMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtBackMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnBackLayout = new javax.swing.GroupLayout(btnBack);
        btnBack.setLayout(btnBackLayout);
        btnBackLayout.setHorizontalGroup(
            btnBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtBack, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
        );
        btnBackLayout.setVerticalGroup(
            btnBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtBack, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, 130, 35));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo_small.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, 170, 180));

        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Seleccione el rol:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBackMouseClicked
        this.admin.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_txtBackMouseClicked

    private void txtUpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUpdateMouseClicked
        String newName = fieldUserName.getText();
        String pass = fieldPassword.getText();
        String role = boxRole.getSelectedItem().toString();
        
        this.admin.updateUser(oldName,newName, pass, role);
    }//GEN-LAST:event_txtUpdateMouseClicked

    private void txtBackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBackMouseEntered
        txtBack.setBackground(new Color(200,50,50));
    }//GEN-LAST:event_txtBackMouseEntered

    private void txtBackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBackMouseExited
       txtBack.setBackground(new Color(255,65,65));
    }//GEN-LAST:event_txtBackMouseExited

    private void txtUpdateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUpdateMouseEntered
        txtUpdate.setBackground(new Color(200,50,50));
    }//GEN-LAST:event_txtUpdateMouseEntered

    private void txtUpdateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUpdateMouseExited
        txtUpdate.setBackground(new Color(255,65,65));
    }//GEN-LAST:event_txtUpdateMouseExited

    private void boxRoleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxRoleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxRoleActionPerformed

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
            java.util.logging.Logger.getLogger(ViewUpdateUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewUpdateUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewUpdateUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewUpdateUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewUpdateUser().setVisible(true);
            }
        });
    }
    
    public void resetFields(){
        this.fieldUserName.setText("");
        this.fieldUserName.setText("");
        this.boxRole.setSelectedItem("No");
    }
    
    public void setTitle(String oldName){
        this.oldName = oldName;
        this.txtTitle.setText("Actualizar usuario "+oldName);
    }
    
    public void setAdministrator(Administrator admin){
        this.admin = admin;
    }
    
    public void showError(String error){
        javax.swing.JOptionPane.showMessageDialog(this, error);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxRole;
    private javax.swing.JPanel btnBack;
    private javax.swing.JPanel btnUpdate;
    private javax.swing.JTextField fieldPassword;
    private javax.swing.JTextField fieldUserName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel txtBack;
    private javax.swing.JLabel txtTitle;
    private javax.swing.JLabel txtUpdate;
    // End of variables declaration//GEN-END:variables
}
