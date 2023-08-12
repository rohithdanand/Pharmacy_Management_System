/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pharmacy;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;
import java.text.MessageFormat;
import javax.swing.JTable;
import java.util.Random;

/**
 *
 * @author rajat
 */
public class Billing extends javax.swing.JFrame {

    /**
     * Creates new form Billing
     */
    public Billing() {
        initComponents();
        //bid=rand.nextInt(1000, 9999);
        //BillId.setText(String.valueOf(bid));
//        TotalBtn.setText(String.valueOf(pur.sum));
        SelectMed();
        
    }
    //Purchase pur=new Purchase();
    int Qt;//bid;
    //int Billid;//=Integer.parseInt(BillId.getText());
    Random rand=new Random();
    String Id=null;
    Connection Con=null;
    Statement St=null;
    ResultSet Rs=null;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BillPanel = new javax.swing.JPanel();
        PlaceOrderBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        ViewMedicineBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        BillTbl = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        TotalBtn = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);

        BillPanel.setBackground(new java.awt.Color(102, 102, 102));

        PlaceOrderBtn.setFont(new java.awt.Font("Trajan Pro", 1, 24)); // NOI18N
        PlaceOrderBtn.setForeground(new java.awt.Color(0, 153, 51));
        PlaceOrderBtn.setText("PLACE ORDER");
        PlaceOrderBtn.setAlignmentY(0.0F);
        PlaceOrderBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        PlaceOrderBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PlaceOrderBtnMouseClicked(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Trajan Pro", 3, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("CART");

        ViewMedicineBtn.setFont(new java.awt.Font("Trajan Pro", 1, 20)); // NOI18N
        ViewMedicineBtn.setForeground(new java.awt.Color(0, 153, 51));
        ViewMedicineBtn.setText("VIEW MEDICINE");
        ViewMedicineBtn.setAlignmentY(0.0F);
        ViewMedicineBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ViewMedicineBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ViewMedicineBtnMouseClicked(evt);
            }
        });

        BillTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Medicine ID", "Pharmacist ID", "NAME", "PRICE", "QUANTITY", "COMPANY", "MFD DATE", "EXP DATE", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        BillTbl.setRowHeight(25);
        BillTbl.getTableHeader().setReorderingAllowed(false);
        BillTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BillTblMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(BillTbl);

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Yu Gothic Medium", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("TOTAL :");

        TotalBtn.setEditable(false);

        javax.swing.GroupLayout BillPanelLayout = new javax.swing.GroupLayout(BillPanel);
        BillPanel.setLayout(BillPanelLayout);
        BillPanelLayout.setHorizontalGroup(
            BillPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BillPanelLayout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addGroup(BillPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BillPanelLayout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(370, 370, 370))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BillPanelLayout.createSequentialGroup()
                        .addGroup(BillPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(BillPanelLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(28, 28, 28)
                                .addComponent(TotalBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(BillPanelLayout.createSequentialGroup()
                                .addComponent(ViewMedicineBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(348, 348, 348)
                                .addComponent(PlaceOrderBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(47, 47, 47))))
            .addGroup(BillPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(BillPanelLayout.createSequentialGroup()
                    .addGap(17, 17, 17)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 841, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(17, Short.MAX_VALUE)))
        );
        BillPanelLayout.setVerticalGroup(
            BillPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BillPanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 321, Short.MAX_VALUE)
                .addGroup(BillPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(TotalBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(BillPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PlaceOrderBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ViewMedicineBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
            .addGroup(BillPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(BillPanelLayout.createSequentialGroup()
                    .addGap(79, 79, 79)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(146, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BillPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BillPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(875, 500));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
public void SelectMed()
{
    try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmadb","root","Raj2002");
        St=Con.createStatement();
        Rs=St.executeQuery("Select * from pharmadb.billtable");
        BillTbl.setModel(DbUtils.resultSetToTableModel(Rs));
        
        String query="select sum(Total) from pharmadb.billtable";
        PreparedStatement Ps=Con.prepareStatement(query);
        ResultSet Rs1=Ps.executeQuery();
        if(Rs1.next()){
        String total=Rs1.getString("sum(Total)");
        TotalBtn.setText(String.valueOf(total));
        }
    }catch(SQLException e)
    {
        e.printStackTrace();
    }
    catch(Exception e)
    {
        e.printStackTrace();
    }
}
    private void PlaceOrderBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PlaceOrderBtnMouseClicked
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmadb","root","Raj2002");
            String newQuery = "insert into pharmadb.printtable select * from pharmadb.billtable";
            Statement Add1 = Con.createStatement();
            Add1.executeUpdate(newQuery);
            JOptionPane.showMessageDialog(this,"Order Placed");
            
            new Customer().setVisible(true);
            this.dispose();
        }catch(SQLException e){
            e.printStackTrace();
        }catch(Exception e)
        {
        e.printStackTrace();
        }

            
    }//GEN-LAST:event_PlaceOrderBtnMouseClicked

    private void ViewMedicineBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ViewMedicineBtnMouseClicked
        new Customer().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ViewMedicineBtnMouseClicked

    private void BillTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BillTblMouseClicked
        TableModel model = BillTbl.getModel();
        int MyIndex = BillTbl.getSelectedRow();
        Id=model.getValueAt(MyIndex, 0).toString();
    }//GEN-LAST:event_BillTblMouseClicked

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
            java.util.logging.Logger.getLogger(Billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Billing().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BillPanel;
    public javax.swing.JTable BillTbl;
    private javax.swing.JButton PlaceOrderBtn;
    public javax.swing.JTextField TotalBtn;
    private javax.swing.JButton ViewMedicineBtn;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
    
//    private void printRecord(JPanel panel)
//    {
//        PrinterJob printerJob=PrinterJob.getPrinterJob();
//        printerJob.setJobName("Print Record");
//        printerJob.setPrintable(new Printable() {
//            @Override
//            public int print(Graphics graphics,PageFormat pageFormat,int pageIndex) throws PrinterException
//            {
//                if(pageIndex<0){
//                    return Printable.NO_SUCH_PAGE;
//                }
//                Graphics2D graphics2D=(Graphics2D)graphics;
//                graphics2D.translate(pageFormat.getImageableX(), pageFormat.getImageableY());
//                graphics2D.scale(0.24, 0.24);
//                panel.print(graphics2D);
//                return Printable.PAGE_EXISTS;
//            }
//        });
//        boolean returningResult=printerJob.printDialog();
//        if(returningResult)
//        {
//            try{
//                printerJob.print();
//            }catch(PrinterException e){
//                e.printStackTrace();
//            }
//        }
//    }

}
