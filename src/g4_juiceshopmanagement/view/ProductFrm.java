/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g4_juiceshopmanagement.view;

import g4_juiceshopmanagement.controller.CategoryDAO;
import g4_juiceshopmanagement.controller.ProductDAO;
import g4_juiceshopmanagement.model.Category;
import g4_juiceshopmanagement.model.Product;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author ahuy96
 */
public class ProductFrm extends javax.swing.JFrame {

    /**
     * Creates new form ProductFrm
     */
    public ProductFrm() {
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

        imageChooser = new javax.swing.JFileChooser();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txt_product_name = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_product_ingredients = new javax.swing.JTextArea();
        lbl_product_image = new javax.swing.JLabel();
        txt_product_price = new javax.swing.JTextField();
        btn_product_add = new javax.swing.JButton();
        btn_product_update = new javax.swing.JButton();
        btn_product_save = new javax.swing.JButton();
        btn_product_delete = new javax.swing.JButton();
        btn_product_exit = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        txt_product_description = new javax.swing.JTextArea();
        cb_product_category = new javax.swing.JComboBox<>();
        lbl = new javax.swing.JLabel();
        txt_product_id = new javax.swing.JTextField();
        btn_product_choseImage = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_product = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("Products Management");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("Products: ")));

        jLabel2.setText("Product name: ");

        jLabel3.setText("Category: ");

        jLabel4.setText("Description: ");

        jLabel5.setText("Ingredients: ");

        txt_product_ingredients.setColumns(20);
        txt_product_ingredients.setLineWrap(true);
        txt_product_ingredients.setRows(5);
        jScrollPane2.setViewportView(txt_product_ingredients);

        lbl_product_image.setToolTipText("");
        lbl_product_image.setBorder(javax.swing.BorderFactory.createTitledBorder("Image"));
        lbl_product_image.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbl_product_image.setMaximumSize(new java.awt.Dimension(12, 40));
        lbl_product_image.setMinimumSize(new java.awt.Dimension(12, 40));

        txt_product_price.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_product_price.setForeground(new java.awt.Color(51, 51, 255));
        txt_product_price.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_product_price.setText("$0 ");

        btn_product_add.setText("Add");
        btn_product_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_product_addActionPerformed(evt);
            }
        });

        btn_product_update.setText("Update");
        btn_product_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_product_updateActionPerformed(evt);
            }
        });

        btn_product_save.setText("Save");
        btn_product_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_product_saveActionPerformed(evt);
            }
        });

        btn_product_delete.setText("Delete");
        btn_product_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_product_deleteActionPerformed(evt);
            }
        });

        btn_product_exit.setText("Exit");
        btn_product_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_product_exitActionPerformed(evt);
            }
        });

        txt_product_description.setColumns(20);
        txt_product_description.setLineWrap(true);
        txt_product_description.setRows(5);
        jScrollPane4.setViewportView(txt_product_description);

        lbl.setText("ID:");

        btn_product_choseImage.setText("Choose image");
        btn_product_choseImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_product_choseImageActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(lbl))
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_product_name)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                    .addComponent(jScrollPane4)
                    .addComponent(cb_product_category, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_product_id))
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_product_choseImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_product_image, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_product_price))
                .addGap(74, 74, 74)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_product_add, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_product_update, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_product_save, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_product_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_product_exit, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_product_add)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_product_update)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_product_save)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_product_delete))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lbl)
                                .addComponent(txt_product_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(txt_product_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(cb_product_category, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(lbl_product_image, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_product_choseImage)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txt_product_price, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn_product_exit)))))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Products list: "));

        tbl_product.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Image", "Product name", "Category", "Description", "Ingredients", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_product.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tbl_product.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_productMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbl_product);
        if (tbl_product.getColumnModel().getColumnCount() > 0) {
            tbl_product.getColumnModel().getColumn(0).setResizable(false);
            tbl_product.getColumnModel().getColumn(0).setPreferredWidth(2);
            tbl_product.getColumnModel().getColumn(6).setResizable(false);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 748, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 11, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(258, 258, 258))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private static boolean typeAction;

    private void loadData() {
        DefaultTableModel model = (DefaultTableModel) tbl_product.getModel();
        ProductDAO productDAO = new ProductDAO();
        ArrayList<Product> list = productDAO.getAll();
        int count = model.getRowCount();
        while (count > 0) {
            model.removeRow(count - 1);
            count--;
        }
        for (Product item : list) {
            Object[] row = {
                item.getiD(),
                item.getImage(),
                item.getName(),
                item.getCategory().getName(),
                item.getDescription(),
                item.getIngredient(),
                item.getPrice()
            };
            model.addRow(row);
        }
    }

    private void loadCategory() {
        CategoryDAO cateDAO = new CategoryDAO();
        ArrayList<Category> cateList = cateDAO.getAll();

        for (Category item : cateList) {
            cb_product_category.addItem(item.getName());
        }
    }

    private void resetForm() {
        txt_product_name.setText("");
        txt_product_description.setText("");
        txt_product_ingredients.setText("");
        txt_product_price.setText("");
    }

    public void changeStatusButton(boolean value) {
        btn_product_add.setEnabled(value);
        btn_product_update.setEnabled(value);
        btn_product_delete.setEnabled(value);
        btn_product_save.setEnabled(!value);
    }
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        loadData();
        loadCategory();
    }//GEN-LAST:event_formWindowOpened

    private void btn_product_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_product_addActionPerformed
        // TODO add your handling code here:
        typeAction = true;
        resetForm();
        changeStatusButton(false);
    }//GEN-LAST:event_btn_product_addActionPerformed

    private void btn_product_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_product_updateActionPerformed
        typeAction = false;
        changeStatusButton(false);
    }//GEN-LAST:event_btn_product_updateActionPerformed

    private void btn_product_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_product_saveActionPerformed
        // TODO add your handling code here:
        ProductDAO productDAO = new ProductDAO();
        String productName = txt_product_name.getText();
        String productDescription = txt_product_description.getText();
        String productIngredient = txt_product_ingredients.getText();
        Float productPrice = Float.parseFloat(txt_product_price.getText());
        
        //get CategoryID
        CategoryDAO categoryDAO = new CategoryDAO();
        ArrayList<Category> cateList = categoryDAO.getAll();
        int index = cb_product_category.getSelectedIndex();

        int productCateID = cateList.get(index).getiD();
        if (typeAction) {
            if (productName.length() == 0 || productDescription.length() == 0 || productPrice == 0) {
                JOptionPane.showMessageDialog(this, "Please enter full info!!!");
            } else {
                Product product = new Product();
//                product.setiD(productID);
                product.setName(productName);
                product.setDescription(productDescription);
                product.setIngredient(productIngredient);
                product.setPrice(productPrice);
                if (lbl_product_image.getIcon() != null) {
                    saveImage();
                    product.setImage(productName + ".png");
                }
                product.setCategoryID(productCateID);
                if (productDAO.addNew(product)) {
                    loadData();
                } else {
                    JOptionPane.showMessageDialog(this, "Add failed!!!");
                }
            }
            changeStatusButton(true);
        } else {
            int productID = Integer.parseInt(txt_product_id.getText());
            if (productName.length() == 0 || productDescription.length() == 0 || productPrice == 0) {
                JOptionPane.showMessageDialog(this, "Please enter full info!!!");
            } else {
                Product product = new Product();
                product.setiD(productID);
                product.setName(productName);
                product.setDescription(productDescription);
                product.setIngredient(productIngredient);
                product.setPrice(productPrice);
                if (lbl_product_image.getIcon() != null) {
                    saveImage();
                    product.setImage(productName + ".png");
                }
                product.setCategoryID(productCateID);
                if (productDAO.update(product)) {
                    loadData();
                } else {
                    JOptionPane.showMessageDialog(this, "Update failed!!!");
                }
            }
            changeStatusButton(true);
        }
        txt_product_name.setText("");
        txt_product_description.setText("");
        txt_product_ingredients.setText("");
        txt_product_price.setText("$0");
    }//GEN-LAST:event_btn_product_saveActionPerformed

    private void btn_product_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_product_exitActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btn_product_exitActionPerformed

    private void tbl_productMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_productMouseClicked
        // TODO add your handling code here:
        int index = tbl_product.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) tbl_product.getModel();
        txt_product_name.setText(String.valueOf(model.getValueAt(index, 2)));
        txt_product_description.setText(String.valueOf(model.getValueAt(index, 4)));
        txt_product_ingredients.setText(String.valueOf(model.getValueAt(index, 5)));
        txt_product_price.setText(String.valueOf(model.getValueAt(index, 6)));
        cb_product_category.setSelectedItem(model.getValueAt(index, 3));
        txt_product_id.setText(String.valueOf(model.getValueAt(index, 0)));
        try {
            BufferedImage img = ImageIO.read(new File(System.getProperty("user.dir") + "\\Images\\" + txt_product_name.getText() + ".png"));
            lbl_product_image.setIcon(new ImageIcon(img));
        } catch (Exception e) {
        }
        
    }//GEN-LAST:event_tbl_productMouseClicked

    private void btn_product_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_product_deleteActionPerformed
        // TODO add your handling code here:
        if (JOptionPane.showConfirmDialog(this, "Confirm delete?", "Warning", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
            int productID = Integer.parseInt(txt_product_id.getText());
            ProductDAO productDAO = new ProductDAO();
            if (productDAO.delete(productID)) {
                loadData();
                resetForm();
            } else {
                JOptionPane.showMessageDialog(this, "Delete failed!!!");
            }
        }
    }//GEN-LAST:event_btn_product_deleteActionPerformed

    private void btn_product_choseImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_product_choseImageActionPerformed
        // TODO add your handling code here:

        // Ben netbeans khong co khung hien thi image rieng nen ta hien thi image bang cach set ICON cho LABEL
        // Tao Label gom co border nhu binh thuong.
        
        //Filter de chi chon duoc file hinh anh
        FileNameExtensionFilter filter = new FileNameExtensionFilter(
                "JPG, GIF, and PNG Images", "jpg", "gif", "png");
        imageChooser.setFileFilter(filter);
               
        //lay hinh anh tu file va gan len label
        if (imageChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) { // JFileChooser.APPROVE_OPTION == khi bam OK
            File file = imageChooser.getSelectedFile(); //Lay ra file vua chon
                        
            //Convert file thanh icon
            String filename = file.getAbsolutePath();
            ImageIcon icon = new ImageIcon(filename);
            
            //Scale hinh anh vua voi khung LABEL
            Image image = icon.getImage().getScaledInstance(lbl_product_image.getWidth(), lbl_product_image.getHeight(), Image.SCALE_SMOOTH);
            icon = new ImageIcon(image);//Gan lai hinh anh vua scale vao lai bien Icon
            
            // set icon cho label
            lbl_product_image.setIcon(icon);
        }
    }//GEN-LAST:event_btn_product_choseImageActionPerformed

    private void saveImage() {
        //Tao bien img - kiểu biến là BufferedImage
        BufferedImage img = new BufferedImage(lbl_product_image.getIcon().getIconWidth(),  //Chú ý là ta lấy chiều dài + rộng của ICON trên label
                                              lbl_product_image.getIcon().getIconHeight(), 
                                              BufferedImage.TYPE_INT_ARGB);
        
        //Tao bien graphic de ve lai hinh anh vao bien img
        //Do tính chất của netbeans nên ta phải làm cách thủ công như vậy
        Graphics2D g2d = img.createGraphics();
        lbl_product_image.getIcon().paintIcon(null, g2d, 0, 0);
        g2d.dispose();

        //Tạo đường dẫn để lưu
        //System.getProperty("user.dir") là địa chỉ đến project 
        //sau đó + thêm tùy vào địa chỉ thư mục lưu hình ảnh.
        //cuối cùng + tên file hình. Vd tên.png - txt_product_name.getText() + ".png"
        String location = System.getProperty("user.dir") + "\\Images\\" + txt_product_name.getText() + ".png";

        try {
            //Lưu hình.
            //chú ý: Nên lưu dưới dạng png bởi vì nếu chọn file png mà muốn lưu dưới dạng jpg sẽ bị lỗi. Còn lưu dưới dạng png thì chọn file nào cũng được.
            ImageIO.write(img, "png", new File(location));
        } catch (Exception e) {
            System.out.println("failed");
        }
    }

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
            java.util.logging.Logger.getLogger(ProductFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProductFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProductFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProductFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProductFrm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_product_add;
    private javax.swing.JButton btn_product_choseImage;
    private javax.swing.JButton btn_product_delete;
    private javax.swing.JButton btn_product_exit;
    private javax.swing.JButton btn_product_save;
    private javax.swing.JButton btn_product_update;
    private javax.swing.JComboBox<String> cb_product_category;
    private javax.swing.JFileChooser imageChooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbl;
    private javax.swing.JLabel lbl_product_image;
    private javax.swing.JTable tbl_product;
    private javax.swing.JTextArea txt_product_description;
    private javax.swing.JTextField txt_product_id;
    private javax.swing.JTextArea txt_product_ingredients;
    private javax.swing.JTextField txt_product_name;
    private javax.swing.JTextField txt_product_price;
    // End of variables declaration//GEN-END:variables
}
