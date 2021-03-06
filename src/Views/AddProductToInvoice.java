/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;


import Classes.Product;
import DataAccess.DataAccess;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author fernandocardoce
 */
public class AddProductToInvoice extends javax.swing.JFrame {

    /**
     * Creates new form AddProductToInovoice
     */
    public AddProductToInvoice() {
        initComponents();
        productList= dataAccess.getProducts();
        cmbProductsListener = false;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cmbType = new javax.swing.JComboBox<>();
        lblType = new javax.swing.JLabel();
        cmbProduct = new javax.swing.JComboBox<>();
        bttnAddToInvoice = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProducts = new javax.swing.JTable();
        lblProduct = new javax.swing.JLabel();
        lblCode = new javax.swing.JLabel();
        cmbCode = new javax.swing.JComboBox<>();
        lblCode1 = new javax.swing.JLabel();
        txtQuantity = new javax.swing.JTextField();
        bttnDone = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cmbType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "Electronic", "Software" }));
        cmbType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTypeActionPerformed(evt);
            }
        });

        lblType.setText("Tipo");

        cmbProduct.setEnabled(false);
        cmbProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbProductActionPerformed(evt);
            }
        });

        bttnAddToInvoice.setText("Agregar a Factura");
        bttnAddToInvoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnAddToInvoiceActionPerformed(evt);
            }
        });

        tblProducts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Precio", "Codigo", "Presentacion"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblProducts);

        lblProduct.setText("Producto");

        lblCode.setText("Codigo");

        cmbCode.setEnabled(false);

        lblCode1.setText("Cantidad");

        txtQuantity.setText("1");

        bttnDone.setText("Listo");
        bttnDone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnDoneActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(lblType))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(cmbType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblProduct)
                            .addComponent(cmbProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblCode)
                                .addGap(68, 68, 68)
                                .addComponent(lblCode1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cmbCode, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(bttnAddToInvoice)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(bttnDone))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(28, 28, 28)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblType)
                            .addComponent(lblProduct))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCode)
                            .addComponent(lblCode1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bttnAddToInvoice)
                    .addComponent(bttnDone))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bttnAddToInvoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnAddToInvoiceActionPerformed
       int [] selectedRows =  tblProducts.getSelectedRows();
       ArrayList<Product> selectedProductList = new ArrayList<>();
       for(int i=0; selectedRows.length>i;i++){
           String code = tblProducts.getValueAt(selectedRows[i], 2).toString();
           Product selectProduct = getProductFromList(productList, code);
           validateQuantityField();
           selectProduct.setQuantity(Integer.parseInt(txtQuantity.getText()));
           selectedProductList.add(selectProduct);
       }
          if(invoiceProductList.addAll(selectedProductList)){
              JOptionPane.showMessageDialog(jPanel1, "Producto Agregado");
          }
          
    }//GEN-LAST:event_bttnAddToInvoiceActionPerformed
    public Product getProductFromList(ArrayList<Product> productList, String code){
        Product selectProduct = new Product();
        for(Product product: productList){
            if(product.getCode().equals(code)){
                selectProduct = product;
            }
        }
        return selectProduct;
    }
    private void cmbTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTypeActionPerformed
        DefaultTableModel model = (DefaultTableModel) tblProducts.getModel();
        model.setRowCount(0);
        cmbProduct.removeAllItems();
        cmbCode.removeAllItems();
        for (int i = 0; productList.size() > i; i++) {
            Product product = productList.get(i);
            if (cmbType.getSelectedItem().equals("All")) {
               cmbProduct.enable(false);
                cmbCode.enable(false);
                model.addRow(new Object[]{product.getName(), product.getPrice(), product.getCode(), product.getPresentation()});
            } else if (product.getType().equals(cmbType.getSelectedItem())) {
                cmbProductsListener= false;
               cmbProduct.enable(true);
                cmbCode.enable(true);
                cmbProduct.addItem(product.getName());
                cmbCode.addItem(product.getCode());
                model.addRow(new Object[]{product.getName(), product.getPrice(), product.getCode(), product.getPresentation()});
                cmbProductsListener=true;
            }
        }

    }//GEN-LAST:event_cmbTypeActionPerformed

    private void cmbProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbProductActionPerformed
       if(cmbProductsListener){
            DefaultTableModel model = (DefaultTableModel) tblProducts.getModel();
            model.setRowCount(0);
            cmbCode.removeAllItems();
            for (int i = 0; productList.size() > i; i++) {
                Product product = productList.get(i);
               if (product.getName().equals(cmbProduct.getSelectedItem())) {
                    cmbCode.addItem(product.getCode());
                    model.addRow(new Object[]{product.getName(), product.getPrice(), product.getCode(), product.getPresentation()});
                }
            }
       }
    }//GEN-LAST:event_cmbProductActionPerformed

    private void bttnDoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnDoneActionPerformed
        InvoiceDashboard invoiceDashboard = new InvoiceDashboard(invoiceProductList);
        invoiceDashboard.show();
        this.dispose();
    }//GEN-LAST:event_bttnDoneActionPerformed

    public void validateQuantityField() {
        try {
            int quantity = Integer.parseInt(txtQuantity.getText());
            if (quantity < 1) {
                txtQuantity.setText("1");
            }
        } catch (NumberFormatException nfe) {
            txtQuantity.setText("1");
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
            java.util.logging.Logger.getLogger(AddProductToInvoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddProductToInvoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddProductToInvoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddProductToInvoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new AddProductToInvoice().setVisible(true);

            }
        });
    }

    ArrayList<Product> invoiceProductList = new ArrayList<>();
    ArrayList<Product> productList = new ArrayList<>();
    DataAccess dataAccess = new DataAccess();
    boolean cmbProductsListener;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttnAddToInvoice;
    private javax.swing.JButton bttnDone;
    private javax.swing.JComboBox<String> cmbCode;
    private javax.swing.JComboBox<String> cmbProduct;
    private javax.swing.JComboBox<String> cmbType;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCode;
    private javax.swing.JLabel lblCode1;
    private javax.swing.JLabel lblProduct;
    private javax.swing.JLabel lblType;
    private javax.swing.JTable tblProducts;
    private javax.swing.JTextField txtQuantity;
    // End of variables declaration//GEN-END:variables
}
