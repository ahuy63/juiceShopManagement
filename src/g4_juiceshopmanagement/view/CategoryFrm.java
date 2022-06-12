/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g4_juiceshopmanagement.view;

import g4_juiceshopmanagement.controller.CategoryDAO;
import g4_juiceshopmanagement.model.Category;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ahuy96
 */
public class CategoryFrm extends javax.swing.JFrame {

    /**
     * Creates new form CategoryFrm
     */
    public CategoryFrm() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txt_category_id = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_category_name = new javax.swing.JTextField();
        btn_category_add = new javax.swing.JButton();
        btn_category_save = new javax.swing.JButton();
        btn_category_update = new javax.swing.JButton();
        btn_category_delete = new javax.swing.JButton();
        btn_category_exit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_category = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 51));
        jLabel1.setText("Category Management");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Category: "));

        jLabel2.setText("ID: ");

        txt_category_id.setEditable(false);

        jLabel3.setText("Name: ");

        btn_category_add.setText("Add");
        btn_category_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_category_addActionPerformed(evt);
            }
        });

        btn_category_save.setText("Save");
        btn_category_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_category_saveActionPerformed(evt);
            }
        });

        btn_category_update.setText("Update");
        btn_category_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_category_updateActionPerformed(evt);
            }
        });

        btn_category_delete.setText("Delete");
        btn_category_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_category_deleteActionPerformed(evt);
            }
        });

        btn_category_exit.setText("Exit");
        btn_category_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_category_exitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(97, 97, 97)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_category_id, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
                            .addComponent(txt_category_name)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(btn_category_add, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_category_save, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_category_update, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_category_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_category_exit, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(186, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_category_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_category_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_category_add)
                    .addComponent(btn_category_save)
                    .addComponent(btn_category_update)
                    .addComponent(btn_category_delete)
                    .addComponent(btn_category_exit))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        tbl_category.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_category.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_categoryMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_category);
        if (tbl_category.getColumnModel().getColumnCount() > 0) {
            tbl_category.getColumnModel().getColumn(0).setPreferredWidth(50);
            tbl_category.getColumnModel().getColumn(0).setMaxWidth(50);
            tbl_category.getColumnModel().getColumn(1).setResizable(false);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(250, 250, 250))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public static boolean typeAction;

    public void loadData() {
        DefaultTableModel model = (DefaultTableModel) tbl_category.getModel();
        CategoryDAO cateDAO = new CategoryDAO();
        ArrayList<Category> list = cateDAO.getAll();
        int count = model.getRowCount();
        while (count > 0) {
            model.removeRow(count - 1);
            count--;
        }
        for (Category item : list) {
            Object[] row = {item.getiD(), item.getName()};
            model.addRow(row);
        }
    }

    public void changeStatusButton(boolean value) {
        btn_category_add.setEnabled(value);
        btn_category_update.setEnabled(value);
        btn_category_delete.setEnabled(value);
        btn_category_save.setEnabled(!value);
    }
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        loadData();
        changeStatusButton(true);
    }//GEN-LAST:event_formWindowOpened

    private void btn_category_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_category_addActionPerformed
        // TODO add your handling code here:
        typeAction = true;
        txt_category_id.setText("");
        txt_category_name.setText("");
        changeStatusButton(false);
    }//GEN-LAST:event_btn_category_addActionPerformed

    private void btn_category_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_category_updateActionPerformed
        // TODO add your handling code here:
        typeAction = false;
        changeStatusButton(false);
    }//GEN-LAST:event_btn_category_updateActionPerformed

    private void btn_category_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_category_saveActionPerformed
        // TODO add your handling code here:
        CategoryDAO cateDAO = new CategoryDAO();
        String cateName = txt_category_name.getText();
        if (typeAction) {
            if (cateName.length() == 0) {
                JOptionPane.showMessageDialog(this, "Please enter name!!!");
            } else {
                Category cate = new Category();
                cate.setName(cateName);
                if (cateDAO.addNewCategory(cate)) {
                    loadData();
                } else {
                    JOptionPane.showMessageDialog(this, "Add failed!!!");
                }
            }
            changeStatusButton(true);
        } else {
            if (cateName.length() == 0) {
                JOptionPane.showMessageDialog(this, "Please enter name!!!");
            } else {
                Category cate = new Category();
                cate.setiD(Integer.parseInt(txt_category_id.getText()));
                cate.setName(cateName);
                if (cateDAO.updateCategory(cate)) {
                    loadData();
                } else {
                    JOptionPane.showMessageDialog(this, "Update failed!!!");
                }
            }
            changeStatusButton(true);
        }
        txt_category_id.setText("");
        txt_category_name.setText("");
    }//GEN-LAST:event_btn_category_saveActionPerformed

    private void tbl_categoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_categoryMouseClicked
        // TODO add your handling code here:
        int index = tbl_category.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) tbl_category.getModel();
        txt_category_id.setText(String.valueOf(model.getValueAt(index, 0)));
        txt_category_name.setText(String.valueOf(model.getValueAt(index, 1)));
    }//GEN-LAST:event_tbl_categoryMouseClicked

    private void btn_category_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_category_exitActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btn_category_exitActionPerformed

    private void btn_category_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_category_deleteActionPerformed
        // TODO add your handling code here:
        if (JOptionPane.showConfirmDialog(this, "Confirm delete?", "Warning", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
            int index = tbl_category.getSelectedRow();
            Category cate = new Category();
            cate.setiD(Integer.parseInt(txt_category_id.getText()));
            cate.setName(txt_category_name.getText());
            CategoryDAO cateDAO = new CategoryDAO();
            if (cateDAO.deleteCategory(cate)) {
                loadData();
                txt_category_id.setText("");
                txt_category_name.setText("");
            } else {
                JOptionPane.showMessageDialog(this, "Delete failed!!!");
            }
        }
    }//GEN-LAST:event_btn_category_deleteActionPerformed

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
            java.util.logging.Logger.getLogger(CategoryFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CategoryFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CategoryFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CategoryFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CategoryFrm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_category_add;
    private javax.swing.JButton btn_category_delete;
    private javax.swing.JButton btn_category_exit;
    private javax.swing.JButton btn_category_save;
    private javax.swing.JButton btn_category_update;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tbl_category;
    private javax.swing.JTextField txt_category_id;
    private javax.swing.JTextField txt_category_name;
    // End of variables declaration//GEN-END:variables
}
