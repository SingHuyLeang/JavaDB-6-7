package Views.Home;

import Component.MSG;
import Controller.ProductController;
import Model.ProductModel;
import Model.ProductReport;
import com.formdev.flatlaf.*;
import java.awt.Image;
import java.io.File;
import java.util.HashMap;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;

public class Home extends javax.swing.JFrame {

    ProductController controller = new ProductController();

    private void getData(String FindBy,String data) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
        controller.getData(FindBy,data).forEach((product) -> {
            Object[] row = {
                product.getId(),
                product.getName(),
                product.getQty(),
                product.getPrice(),
                product.getTotal(),
                product.getDiscount(),
                product.getPayment(),
                product.getImage(),
                product.getDate()
            };
            model.addRow(row);
        });
    }

    public Home() {
        initComponents();
        getData(null,"");
    }

    public void clearAllField() {
        txtName.setText("");
        txtQty.setText("");
        txtPrice.setText("");
        cbDiscount.setSelectedIndex(0);
        txtImage.setText("");
        lbImage.setIcon(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtQty = new javax.swing.JTextField();
        lbImage = new javax.swing.JLabel();
        txtImage = new javax.swing.JTextField();
        btnImage = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnPrintReport = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cbDiscount = new javax.swing.JComboBox<>();
        txtPrice = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        btnClear = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        cbFind = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 600));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Barlow", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SHOP");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 0, 110, 78));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Name", "Quantity", "Price", "Total", "Discount", "Payment", "Image", "Date"
            }
        ));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 910, 260));

        jLabel2.setFont(new java.awt.Font("Barlow", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Name         :");
        jLabel2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(100, 100, 100)));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 90, 30));

        txtName.setFont(new java.awt.Font("Barlow", 0, 18)); // NOI18N
        txtName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(100, 100, 100)));
        jPanel1.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 370, 180, 30));

        jLabel3.setFont(new java.awt.Font("Barlow", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Quantity    :");
        jLabel3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(100, 100, 100)));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 90, 30));

        txtQty.setFont(new java.awt.Font("Barlow", 0, 18)); // NOI18N
        txtQty.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(100, 100, 100)));
        jPanel1.add(txtQty, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 420, 180, 30));

        lbImage.setFont(new java.awt.Font("Barlow", 0, 18)); // NOI18N
        lbImage.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbImage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(lbImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 360, 130, 140));

        txtImage.setFont(new java.awt.Font("Barlow", 0, 18)); // NOI18N
        txtImage.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(100, 100, 100)));
        jPanel1.add(txtImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 557, 0, 0));

        btnImage.setBackground(new java.awt.Color(204, 255, 204));
        btnImage.setFont(new java.awt.Font("Barlow", 0, 18)); // NOI18N
        btnImage.setText("Image");
        btnImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImageActionPerformed(evt);
            }
        });
        jPanel1.add(btnImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 530, 130, -1));

        btnAdd.setBackground(new java.awt.Color(204, 255, 204));
        btnAdd.setFont(new java.awt.Font("Barlow", 0, 18)); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jPanel1.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 530, 130, -1));

        btnUpdate.setBackground(new java.awt.Color(255, 255, 204));
        btnUpdate.setFont(new java.awt.Font("Barlow", 0, 18)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel1.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 530, 130, -1));

        btnDelete.setBackground(new java.awt.Color(255, 153, 153));
        btnDelete.setFont(new java.awt.Font("Barlow", 0, 18)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel1.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 530, 130, -1));

        btnPrintReport.setBackground(new java.awt.Color(255, 204, 255));
        btnPrintReport.setFont(new java.awt.Font("Barlow", 0, 18)); // NOI18N
        btnPrintReport.setText("Print");
        btnPrintReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintReportActionPerformed(evt);
            }
        });
        jPanel1.add(btnPrintReport, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 530, 130, -1));

        jLabel5.setFont(new java.awt.Font("Barlow", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Price          :");
        jLabel5.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(100, 100, 100)));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 370, 90, 30));

        jLabel6.setFont(new java.awt.Font("Barlow", 0, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Discount  :");
        jLabel6.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(100, 100, 100)));
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 420, 90, 30));

        cbDiscount.setFont(new java.awt.Font("Barlow", 0, 18)); // NOI18N
        cbDiscount.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0 %", "10 %", "20 %", "30 %", "40 %", "50 %" }));
        cbDiscount.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(100, 100, 100)));
        jPanel1.add(cbDiscount, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 420, 180, 30));

        txtPrice.setFont(new java.awt.Font("Barlow", 0, 18)); // NOI18N
        txtPrice.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(100, 100, 100)));
        jPanel1.add(txtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 370, 180, 30));

        txtId.setFont(new java.awt.Font("Barlow", 0, 18)); // NOI18N
        txtId.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(100, 100, 100)));
        jPanel1.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 557, 0, 0));

        btnClear.setBackground(new java.awt.Color(255, 204, 204));
        btnClear.setFont(new java.awt.Font("Barlow", 0, 18)); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        jPanel1.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 530, 130, -1));

        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });
        jPanel1.add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 280, 40));

        cbFind.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Id", "Name", " " }));
        jPanel1.add(cbFind, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, 110, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1006, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImageActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(this);
        File path = chooser.getSelectedFile();
        String fileName = path.getAbsolutePath();
        ImageIcon imgIcon = new ImageIcon(fileName);
        Image image = imgIcon.getImage().getScaledInstance(lbImage.getWidth(), lbImage.getHeight(), Image.SCALE_SMOOTH);
        lbImage.setIcon(new ImageIcon(image));
        txtImage.setText(fileName);
    }//GEN-LAST:event_btnImageActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        String name = txtName.getText();
        String qty1 = txtQty.getText();
        String price1 = txtPrice.getText();
        String discount1 = cbDiscount.getSelectedItem().toString();
        String image = txtImage.getText();

        if (!name.isEmpty() && !qty1.isEmpty() && !price1.isEmpty() && !discount1.isEmpty() && !image.isEmpty()) {
            int qty = Integer.parseInt(qty1);
            double price = Double.parseDouble(price1);
            int discount = Integer.parseInt(discount1.substring(0, discount1.length() - 2));

            double total = qty * price;
            double payment = total - (total * discount) / 100;

            controller.addProduct(new ProductModel(name, qty, price, total, discount, payment, image));
            clearAllField();
            getData(null,null);
        } else {
            MSG.warning("Please enter all field");
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnPrintReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintReportActionPerformed
        try {
            System.out.println(controller.getDataForReport());
            double amountdollar = 0;
            double amountrial = 0;
            
            for (ProductReport product : controller.getDataForReport()) {
                amountdollar+= product.getPayment();
            }
            amountrial = amountdollar*4100;
            
            System.out.println("Amount $ "+amountdollar);
            System.out.println("Amount $ "+(amountdollar*4100));
            
            JasperReport report = JasperCompileManager.compileReport("src/Views/Home/report.jrxml");
            HashMap<String,Object> map = new HashMap();
            map.put("amountdollar", amountdollar);
            map.put("amountrial", amountrial);
            JRBeanCollectionDataSource source = new JRBeanCollectionDataSource(controller.getDataForReport());
            JasperPrint print = JasperFillManager.fillReport(report, map, source);
            JasperViewer.viewReport(print);
            
        } catch (JRException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnPrintReportActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        int row = table.getSelectedRow();
        txtId.setText(model.getValueAt(row, 0).toString());
        txtName.setText(model.getValueAt(row, 1).toString());
        txtQty.setText(model.getValueAt(row, 2).toString());
        txtPrice.setText(model.getValueAt(row, 3).toString());
        cbDiscount.setSelectedIndex(
                model.getValueAt(row, 5).toString().equals("0") ? 0
                : model.getValueAt(row, 5).toString().equals("10") ? 1
                : model.getValueAt(row, 5).toString().equals("20") ? 2
                : model.getValueAt(row, 5).toString().equals("30") ? 3
                : model.getValueAt(row, 5).toString().equals("40") ? 4
                : 5
        );
        txtImage.setText(model.getValueAt(row, 7).toString());
        ImageIcon imgIcon = new ImageIcon(txtImage.getText());
        Image image = imgIcon.getImage().getScaledInstance(lbImage.getWidth(), lbImage.getHeight(), Image.SCALE_SMOOTH);
        lbImage.setIcon(new ImageIcon(image));
    }//GEN-LAST:event_tableMouseClicked

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        String name = txtName.getText();
        String qty1 = txtQty.getText();
        String price1 = txtPrice.getText();
        String discount1 = cbDiscount.getSelectedItem().toString();
        String image = txtImage.getText();

        if (!name.isEmpty() && !qty1.isEmpty() && !price1.isEmpty() && !discount1.isEmpty() && !image.isEmpty()) {
            int qty = Integer.parseInt(qty1);
            double price = Double.parseDouble(price1);
            int discount = Integer.parseInt(discount1.substring(0, discount1.length() - 2));
            int id = Integer.parseInt(txtId.getText());
            double total = qty * price;
            double payment = total - (total * discount) / 100;

            controller.updateProduct(new ProductModel(id,name, qty, price, total, discount, payment, image));
            clearAllField();
            getData(null,null);
        } else {
            MSG.warning("Please enter all field");
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        if (!txtId.getText().isEmpty()) {
            controller.deleteProduct(Integer.parseInt(txtId.getText()));
            getData(null,null);
            clearAllField();
        } else {
            MSG.warning("Please Select");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        clearAllField();
    }//GEN-LAST:event_btnClearActionPerformed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        String findBy = cbFind.getSelectedItem().toString();
        getData(findBy,txtSearch.getText());
    }//GEN-LAST:event_txtSearchActionPerformed
    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (UnsupportedLookAndFeelException ex) {
            ex.printStackTrace();
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnImage;
    private javax.swing.JButton btnPrintReport;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cbDiscount;
    private javax.swing.JComboBox<String> cbFind;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbImage;
    private javax.swing.JTable table;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtImage;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtQty;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
