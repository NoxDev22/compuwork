/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package employees;

import java.awt.Color;
import performance.PerfEmployee;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Jose Felipe
 */
public class ViewPerformance extends javax.swing.JFrame {

    private ArrayList<PerfEmployee> performance;
    private Employees emp;
    
    public ViewPerformance() {
        initComponents();
        this.setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPerformance = new javax.swing.JTable();
        nameEmployee = new javax.swing.JLabel();
        btnExport = new javax.swing.JPanel();
        txtExport = new javax.swing.JLabel();
        btnBack = new javax.swing.JPanel();
        txtBack = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(220, 220, 220));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 65, 65));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Historial de desempeño  ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 1200, -1));

        tblPerformance.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblPerformance);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 1160, 290));

        nameEmployee.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        nameEmployee.setForeground(new java.awt.Color(200, 55, 55));
        nameEmployee.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nameEmployee.setText("Empleado");
        jPanel1.add(nameEmployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 1200, -1));

        btnExport.setBackground(new java.awt.Color(255, 65, 65));

        txtExport.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtExport.setForeground(new java.awt.Color(255, 255, 255));
        txtExport.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtExport.setText("Exportar");
        txtExport.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtExport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtExportMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtExportMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnExportLayout = new javax.swing.GroupLayout(btnExport);
        btnExport.setLayout(btnExportLayout);
        btnExportLayout.setHorizontalGroup(
            btnExportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnExportLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtExport, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        btnExportLayout.setVerticalGroup(
            btnExportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnExportLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtExport, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(btnExport, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 470, 130, 35));

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnBackLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtBack, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        btnBackLayout.setVerticalGroup(
            btnBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnBackLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtBack, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 470, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 537, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBackMouseEntered
        this.btnBack.setBackground(new Color(200,50,50));
    }//GEN-LAST:event_txtBackMouseEntered

    private void txtBackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBackMouseExited
        this.btnBack.setBackground(new Color(255,65,65));
    }//GEN-LAST:event_txtBackMouseExited

    private void txtExportMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtExportMouseEntered
        this.btnExport.setBackground(new Color(200,50,50));
    }//GEN-LAST:event_txtExportMouseEntered

    private void txtExportMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtExportMouseExited
        this.btnExport.setBackground(new Color(255,65,65));
    }//GEN-LAST:event_txtExportMouseExited

    private void txtBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBackMouseClicked
        this.emp.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_txtBackMouseClicked

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
            java.util.logging.Logger.getLogger(ViewPerformance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewPerformance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewPerformance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewPerformance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewPerformance().setVisible(true);
            }
        });
    }
    
    public void setEmployee(Employees emp){
        this.emp = emp;
    }
    
    public void setPerformance(ArrayList<PerfEmployee> desEmp){
        this.performance = desEmp;
        showPerformanceToTable();
    }
    
    public void setNameEmployee(String name){
        this.nameEmployee.setText(name);
    }
    
    public void showPerformanceToTable(){
        String[] colums = {"Fecha de evaluacion","Objetivos cumplidos", "Resultados", "Calidad-trabajo","Potencial-crecimiento","Habilidades tecnicas", "Conocimiento de puesto","Relaciones","Comunicacion"};
        // Crear modelo vacío con columnas
        DefaultTableModel model = new DefaultTableModel(null, colums);
        
        // Recorrer arrayList y agregar filas
        for (PerfEmployee u : performance) {
        Object[] row = {u.getPerformanceDate(),u.fulfilledObjetive, u.resultsObjetive, 
            u.qualityWork,u.potentialGrowth,u.skills,u.knowingPosition,u.personalRelationships,u.comunication};
        model.addRow(row);
        }
        // Asignar modelo a la JTable
        this.tblPerformance.setModel(model);
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnBack;
    private javax.swing.JPanel btnExport;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nameEmployee;
    private javax.swing.JTable tblPerformance;
    private javax.swing.JLabel txtBack;
    private javax.swing.JLabel txtExport;
    // End of variables declaration//GEN-END:variables
}
