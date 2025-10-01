/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package administrador;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import sesion.Login;
import sesion.User;

/**
 *
 * @author Jose Felipe
 */
public class Administrator extends javax.swing.JFrame {

    /**
     * Creates new form ViewAdministrator
     */
    private Login login;
    private ViewAddUser addUser;
    private ViewUpdateUser updateUser;
    
    private ArrayList<User> users;
    ControllerAdmin controller;
    
    public Administrator() {
        initComponents();
        this.setLocationRelativeTo(null); 
        
        
    }
    
    public void addUserToList(Login login){
        this.users = login.getUsers();
        showUsersToTable();
        
        
        ModelAdmin model = new ModelAdmin(this);
        this.addUser = new ViewAddUser();
        this.updateUser = new ViewUpdateUser();
        this.controller = new ControllerAdmin(this,model,addUser, updateUser);

    }
    
    public ArrayList<User> getUsers(){
       return this.users;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        btn_exit = new javax.swing.JPanel();
        txt_exit = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txt_welcome = new javax.swing.JLabel();
        txt_userName = new javax.swing.JLabel();
        btn_addUser = new javax.swing.JPanel();
        btnAddUser = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        field_searchUser = new javax.swing.JTextField();
        card = new javax.swing.JPanel();
        card_line = new javax.swing.JPanel();
        card_userName = new javax.swing.JLabel();
        card_pass = new javax.swing.JLabel();
        card_rol = new javax.swing.JLabel();
        card_btnUpdate = new javax.swing.JPanel();
        card_txtUpdate = new javax.swing.JLabel();
        card_btnDelet = new javax.swing.JPanel();
        card_txtDelet = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_logo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_users = new javax.swing.JTable();
        btn_search = new javax.swing.JPanel();
        txt_search = new javax.swing.JLabel();
        btnCloseSesion = new javax.swing.JPanel();
        txtCloseSesion = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(765, 460));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(220, 220, 220));
        jPanel1.setMinimumSize(new java.awt.Dimension(770, 470));
        jPanel1.setPreferredSize(new java.awt.Dimension(642, 450));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator1.setBackground(new java.awt.Color(255, 65, 65));
        jSeparator1.setForeground(new java.awt.Color(255, 65, 65));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 850, 10));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(100, 50));

        btn_exit.setBackground(new java.awt.Color(255, 255, 255));
        btn_exit.setPreferredSize(new java.awt.Dimension(35, 35));

        txt_exit.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txt_exit.setForeground(new java.awt.Color(0, 0, 0));
        txt_exit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_exit.setText("X");
        txt_exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txt_exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_exitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txt_exitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txt_exitMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btn_exitLayout = new javax.swing.GroupLayout(btn_exit);
        btn_exit.setLayout(btn_exitLayout);
        btn_exitLayout.setHorizontalGroup(
            btn_exitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_exitLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txt_exit, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        btn_exitLayout.setVerticalGroup(
            btn_exitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_exitLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txt_exit, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconUsers.png"))); // NOI18N

        txt_welcome.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txt_welcome.setForeground(new java.awt.Color(0, 0, 0));
        txt_welcome.setText("Sistema de gestion de usuarios CompuWork");

        txt_userName.setForeground(new java.awt.Color(0, 0, 0));
        txt_userName.setText("Bienvenido");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txt_userName)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txt_welcome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 278, Short.MAX_VALUE)
                        .addComponent(btn_exit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(txt_welcome, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_exit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_userName, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 60));

        btn_addUser.setBackground(new java.awt.Color(255, 65, 65));
        btn_addUser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_addUser.setPreferredSize(new java.awt.Dimension(137, 40));

        btnAddUser.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnAddUser.setForeground(new java.awt.Color(255, 255, 255));
        btnAddUser.setText("Agregar Usuario");
        btnAddUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddUserMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAddUserMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAddUserMouseExited(evt);
            }
        });

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon_add.png"))); // NOI18N

        javax.swing.GroupLayout btn_addUserLayout = new javax.swing.GroupLayout(btn_addUser);
        btn_addUser.setLayout(btn_addUserLayout);
        btn_addUserLayout.setHorizontalGroup(
            btn_addUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_addUserLayout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAddUser)
                .addContainerGap(9, Short.MAX_VALUE))
        );
        btn_addUserLayout.setVerticalGroup(
            btn_addUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_addUserLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(btn_addUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddUser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel1.add(btn_addUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, 30));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setPreferredSize(new java.awt.Dimension(320, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon_search.png"))); // NOI18N

        field_searchUser.setBackground(new java.awt.Color(255, 255, 255));
        field_searchUser.setForeground(new java.awt.Color(102, 102, 102));
        field_searchUser.setText("Buscar usuario por nombre..");
        field_searchUser.setBorder(null);
        field_searchUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                field_searchUserMousePressed(evt);
            }
        });
        field_searchUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field_searchUserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(field_searchUser, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
            .addComponent(field_searchUser)
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 260, 30));

        card.setBackground(new java.awt.Color(255, 255, 255));
        card.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        card_line.setBackground(new java.awt.Color(255, 65, 65));
        card_line.setPreferredSize(new java.awt.Dimension(5, 270));

        javax.swing.GroupLayout card_lineLayout = new javax.swing.GroupLayout(card_line);
        card_line.setLayout(card_lineLayout);
        card_lineLayout.setHorizontalGroup(
            card_lineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        card_lineLayout.setVerticalGroup(
            card_lineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 270, Short.MAX_VALUE)
        );

        card.add(card_line, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        card_userName.setBackground(new java.awt.Color(255, 255, 255));
        card_userName.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        card_userName.setForeground(new java.awt.Color(0, 0, 0));
        card_userName.setText("Usuario");
        card.add(card_userName, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        card_pass.setForeground(new java.awt.Color(102, 102, 102));
        card_pass.setText("Contraseña:");
        card.add(card_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, -1, -1));

        card_rol.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        card_rol.setForeground(new java.awt.Color(255, 65, 65));
        card_rol.setText("Rol");
        card.add(card_rol, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, -1, -1));

        card_btnUpdate.setBackground(new java.awt.Color(255, 65, 65));

        card_txtUpdate.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        card_txtUpdate.setForeground(new java.awt.Color(255, 255, 255));
        card_txtUpdate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        card_txtUpdate.setText("Actualizar");
        card_txtUpdate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        card_txtUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                card_txtUpdateMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                card_txtUpdateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                card_txtUpdateMouseExited(evt);
            }
        });

        javax.swing.GroupLayout card_btnUpdateLayout = new javax.swing.GroupLayout(card_btnUpdate);
        card_btnUpdate.setLayout(card_btnUpdateLayout);
        card_btnUpdateLayout.setHorizontalGroup(
            card_btnUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, card_btnUpdateLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(card_txtUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        card_btnUpdateLayout.setVerticalGroup(
            card_btnUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, card_btnUpdateLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(card_txtUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        card.add(card_btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 128, 32));

        card_btnDelet.setBackground(new java.awt.Color(255, 65, 65));

        card_txtDelet.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        card_txtDelet.setForeground(new java.awt.Color(255, 255, 255));
        card_txtDelet.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        card_txtDelet.setText("Eliminar");
        card_txtDelet.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        card_txtDelet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                card_txtDeletMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                card_txtDeletMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                card_txtDeletMouseExited(evt);
            }
        });

        javax.swing.GroupLayout card_btnDeletLayout = new javax.swing.GroupLayout(card_btnDelet);
        card_btnDelet.setLayout(card_btnDeletLayout);
        card_btnDeletLayout.setHorizontalGroup(
            card_btnDeletLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(card_btnDeletLayout.createSequentialGroup()
                .addComponent(card_txtDelet, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        card_btnDeletLayout.setVerticalGroup(
            card_btnDeletLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, card_btnDeletLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(card_txtDelet, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        card.add(card_btnDelet, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 128, 32));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cardUser1.png"))); // NOI18N
        card.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 40));

        jPanel1.add(card, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 320, 150));

        txt_logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo_small.png"))); // NOI18N
        jPanel1.add(txt_logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 90, 200, 170));

        jScrollPane1.setFocusable(false);

        table_users.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(table_users);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 210, 350, 170));

        btn_search.setBackground(new java.awt.Color(255, 65, 65));
        btn_search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_searchMouseClicked(evt);
            }
        });

        txt_search.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_search.setForeground(new java.awt.Color(255, 255, 255));
        txt_search.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_search.setText("Consultar");
        txt_search.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txt_search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_searchMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txt_searchMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txt_searchMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btn_searchLayout = new javax.swing.GroupLayout(btn_search);
        btn_search.setLayout(btn_searchLayout);
        btn_searchLayout.setHorizontalGroup(
            btn_searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_searchLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        btn_searchLayout.setVerticalGroup(
            btn_searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_searchLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(btn_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, -1, 30));

        btnCloseSesion.setBackground(new java.awt.Color(255, 65, 65));

        txtCloseSesion.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtCloseSesion.setForeground(new java.awt.Color(255, 255, 255));
        txtCloseSesion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtCloseSesion.setText("Cerrar sesión");
        txtCloseSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtCloseSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtCloseSesionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtCloseSesionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtCloseSesionMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnCloseSesionLayout = new javax.swing.GroupLayout(btnCloseSesion);
        btnCloseSesion.setLayout(btnCloseSesionLayout);
        btnCloseSesionLayout.setHorizontalGroup(
            btnCloseSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtCloseSesion, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );
        btnCloseSesionLayout.setVerticalGroup(
            btnCloseSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtCloseSesion, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );

        jPanel1.add(btnCloseSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 70, 110, 33));

        jLabel2.setForeground(new java.awt.Color(102, 0, 0));
        jLabel2.setText("Falta inabilitar botones si no se ha realizado una consulta");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 420, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 790, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_exitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_txt_exitMouseClicked

    private void txt_exitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_exitMouseEntered
        txt_exit.setForeground(Color.white);
        btn_exit.setBackground(new Color(255,49,49));
    }//GEN-LAST:event_txt_exitMouseEntered

    private void txt_exitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_exitMouseExited
        txt_exit.setForeground(Color.black);
        btn_exit.setBackground(Color.white);  
    }//GEN-LAST:event_txt_exitMouseExited

    private void txt_searchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_searchMouseClicked
        this.controller.searchUser();
    }//GEN-LAST:event_txt_searchMouseClicked

    private void btn_searchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_searchMouseClicked
        
    }//GEN-LAST:event_btn_searchMouseClicked

    private void field_searchUserMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_field_searchUserMousePressed
       this.field_searchUser.setText("");
       this.field_searchUser.setForeground(Color.black);
    }//GEN-LAST:event_field_searchUserMousePressed

    private void txt_searchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_searchMouseEntered
        btn_search.setBackground(new Color(200,50,50));
    }//GEN-LAST:event_txt_searchMouseEntered

    private void txt_searchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_searchMouseExited
        btn_search.setBackground(new Color(255,65,65));
    }//GEN-LAST:event_txt_searchMouseExited

    private void btnAddUserMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddUserMouseEntered
        btn_addUser.setBackground(new Color(200,50,50));
    }//GEN-LAST:event_btnAddUserMouseEntered

    private void btnAddUserMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddUserMouseExited
        btn_addUser.setBackground(new Color(255,65,65));
    }//GEN-LAST:event_btnAddUserMouseExited

    private void card_txtDeletMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_card_txtDeletMouseEntered
        card_btnDelet.setBackground(new Color(200,50,50));
    }//GEN-LAST:event_card_txtDeletMouseEntered

    private void card_txtDeletMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_card_txtDeletMouseExited
        card_btnDelet.setBackground(new Color(255,65,65));
    }//GEN-LAST:event_card_txtDeletMouseExited

    private void card_txtUpdateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_card_txtUpdateMouseEntered
        card_btnUpdate.setBackground(new Color(200,50,50));
    }//GEN-LAST:event_card_txtUpdateMouseEntered

    private void card_txtUpdateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_card_txtUpdateMouseExited
         card_btnUpdate.setBackground(new Color(255,65,65));
    }//GEN-LAST:event_card_txtUpdateMouseExited

    private void txtCloseSesionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCloseSesionMouseEntered
        btnCloseSesion.setBackground(new Color(200,50,50));
    }//GEN-LAST:event_txtCloseSesionMouseEntered

    private void txtCloseSesionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCloseSesionMouseExited
        btnCloseSesion.setBackground(new Color(255,65,65));
    }//GEN-LAST:event_txtCloseSesionMouseExited

    public void setLogin(Login login){
        this.login = login;
    }
     
    private void txtCloseSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCloseSesionMouseClicked

        this.login.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_txtCloseSesionMouseClicked

    private void btnAddUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddUserMouseClicked
        this.addUser.setAdministrator(this);
        this.addUser.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAddUserMouseClicked

    private void card_txtDeletMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_card_txtDeletMouseClicked
        this.controller.removeUser();
    }//GEN-LAST:event_card_txtDeletMouseClicked

    private void field_searchUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field_searchUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field_searchUserActionPerformed

    private void card_txtUpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_card_txtUpdateMouseClicked
        this.updateUser.setAdministrator(this);
        this.updateUser.setTitle(card_userName.getText());
        this.updateUser.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_card_txtUpdateMouseClicked

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
            java.util.logging.Logger.getLogger(Administrator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Administrator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Administrator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Administrator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Administrator().setVisible(true);
            }
        });
    }
    
    public void setUserName(String userName){
        this.txt_userName.setText("Bienvenido "+userName);
    }
    
    public void createUser(String userName,String pass, String role){
      this.controller.addUser(userName, pass, role);
      
    }
    
    public void updateUser(String oldName,String newName,String pass, String role){
        this.controller.updateUser(oldName,newName, pass, role);
    }
    
    public void showUsersToTable(){
        String[] colums = {"Usuario", "Contraseña", "Rol"};
        // Crear modelo vacío con columnas
        DefaultTableModel model = new DefaultTableModel(null, colums);
        
        // Recorrer arrayList y agregar filas
        for (User u : users) {
        Object[] row = {u.getUsuario(), u.getContrasena(), u.getRol()};
        model.addRow(row);
        }
        // Asignar modelo a la JTable
        table_users.setModel(model);
    }
    
    public String getUserName(){      
        return field_searchUser.getText();
    }
    
    public void setUserFound(User user){
        this.card_userName.setText(user.getUsuario());
        this.card_rol.setText(user.getRol());
        this.card_pass.setText("Contraseña: "+user.getContrasena());
    }
    
    public void setUserEmpty(){
        this.card_userName.setText("Usuario");
        this.card_rol.setText("Rol");
        this.card_pass.setText("Contraseña:");
    }
    
    public void resetFielSerach(){
       this.field_searchUser.setText("Buscar usuario por nombre..");
       this.field_searchUser.setForeground(Color.gray);
    }
    
    public String confirmRemove(String name){
        String [] buttons = {"Si","No"};
        String error = "Seguro que desea eliminar al usuario "+name;
        
       int option = javax.swing.JOptionPane.showOptionDialog(null,error,"Eliminar usuario",0,JOptionPane.QUESTION_MESSAGE,null,buttons,"No");
        
        return buttons[option];
    }
    
    public void showError(String error){
        javax.swing.JOptionPane.showMessageDialog(this, error);
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnAddUser;
    private javax.swing.JPanel btnCloseSesion;
    private javax.swing.JPanel btn_addUser;
    private javax.swing.JPanel btn_exit;
    private javax.swing.JPanel btn_search;
    private javax.swing.JPanel card;
    private javax.swing.JPanel card_btnDelet;
    private javax.swing.JPanel card_btnUpdate;
    private javax.swing.JPanel card_line;
    private javax.swing.JLabel card_pass;
    private javax.swing.JLabel card_rol;
    private javax.swing.JLabel card_txtDelet;
    private javax.swing.JLabel card_txtUpdate;
    private javax.swing.JLabel card_userName;
    private javax.swing.JTextField field_searchUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable table_users;
    private javax.swing.JLabel txtCloseSesion;
    private javax.swing.JLabel txt_exit;
    private javax.swing.JLabel txt_logo;
    private javax.swing.JLabel txt_search;
    private javax.swing.JLabel txt_userName;
    private javax.swing.JLabel txt_welcome;
    // End of variables declaration//GEN-END:variables
}
