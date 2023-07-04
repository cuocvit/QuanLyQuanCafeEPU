/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Connect.Connect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class QuanLyThongKe extends javax.swing.JFrame {

    /**
     * Creates new form QuanLyThongKe
     */
    DefaultTableModel tableModel;
    
    public QuanLyThongKe() {
        initComponents();
        tableModel = new DefaultTableModel();
        tableModel.addColumn("STT");
        //tableModel.addColumn("Nhân viên");
        tableModel.addColumn("Tên bàn");
        tableModel.addColumn("Tổng tiền");
        tableModel.addColumn("Ngày thanh toán");
        tblThongKe.setModel(tableModel);
        LoadTableThongKe();
        displayMaxRevenueMonth();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblThongKe = new javax.swing.JTable();
        btnHome = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtMonth = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnView = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtSumMoney = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtMaxMon = new javax.swing.JTextField();
        btnViewMax = new javax.swing.JButton();
        txtMaxMonth = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtMonthMax = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtDay = new javax.swing.JTextField();
        btnDay = new javax.swing.JButton();
        txtDayView = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 102, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Doanh thu ngày cao nhất trong tháng");

        tblThongKe.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblThongKe.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblThongKe);

        btnHome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnHome.setIcon(new javax.swing.ImageIcon("D:\\CODE\\Java\\QuanLyQuanCafe_EPU\\src\\main\\java\\View\\Icon\\Go Back_50px.png")); // NOI18N
        btnHome.setText("Quay lại");
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        jLabel2.setText("Nhập tháng:");

        jLabel3.setText("Doanh thu tháng:");

        btnView.setText("Xem");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 0, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon("D:\\CODE\\Java\\QuanLyQuanCafe_EPU\\src\\main\\java\\View\\Icon\\Statistics_50px.png")); // NOI18N
        jLabel4.setText("Thống kê hóa đơn");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 102, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Doanh thu theo ngày");

        jLabel6.setText("Nhập tháng:");

        btnViewMax.setText("Xem");
        btnViewMax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewMaxActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 102, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Doanh thu theo tháng");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 102, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Doanh thu tháng cao nhất");

        jLabel9.setText("Nhập ngày:");

        btnDay.setText("Xem");
        btnDay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDayActionPerformed(evt);
            }
        });

        txtDayView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDayViewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnHome)
                        .addGap(33, 33, 33)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 887, Short.MAX_VALUE)
                        .addGap(127, 127, 127))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(txtMaxMon, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(82, 82, 82))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtMaxMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(30, 30, 30)
                                        .addComponent(btnViewMax, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(txtMonthMax, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(65, 65, 65))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnView))
                                    .addComponent(txtSumMoney, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(19, 19, 19))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(txtDay, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(btnDay, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(txtDayView, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)))
                        .addGap(36, 36, 36))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnHome)
                    .addComponent(jLabel4))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 548, Short.MAX_VALUE)
                        .addGap(38, 38, 38))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(btnDay))
                        .addGap(19, 19, 19)
                        .addComponent(txtDayView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(jLabel7)
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(btnView))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(txtSumMoney, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMonthMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnViewMax)
                            .addComponent(txtMaxMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addComponent(txtMaxMon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        // TODO add your handling code here:

        dispose();
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        String month = txtMonth.getText();
        double sumMoney = calculateSumMoney(month);
        txtSumMoney.setText(String.valueOf(sumMoney));
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnViewMaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewMaxActionPerformed
        // TODO add your handling code here:
         String month = txtMaxMonth.getText();
        String maxRevenueDayOfMonth = findMaxRevenueDayOfMonth(month);
        txtMaxMon.setText(maxRevenueDayOfMonth);
    }//GEN-LAST:event_btnViewMaxActionPerformed

    private void btnDayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDayActionPerformed
        // TODO add your handling code here:
        String selectedDate = txtDay.getText(); // Lấy ngày từ trường văn bản txtDay

        // Chuyển định dạng ngày
        SimpleDateFormat inputDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = null;
        try {
            date = inputDateFormat.parse(selectedDate);
        } catch (ParseException ex) {
            Logger.getLogger(QuanLyThongKe.class.getName()).log(Level.SEVERE, null, ex);
        }

        // Chuyển định dạng ngày thành yyyy/MM/dd
        SimpleDateFormat outputDateFormat = new SimpleDateFormat("yyyy/MM/dd");
        String formattedDate = outputDateFormat.format(date);

        String query = "SELECT SUM(total_price) AS total_revenue FROM invoice WHERE CONVERT(date, invoice_date) = ?";
        Connection con = Connect.openConnection();
        try {
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setString(1, formattedDate);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                double totalRevenue = rs.getDouble("total_revenue");
                txtDayView.setText(Double.toString(totalRevenue)); // Hiển thị tổng doanh thu trong trường văn bản txtDayView
            } else {
                txtDayView.setText("Không có dữ liệu"); // Hiển thị thông báo khi không tìm thấy dữ liệu
            }
            rs.close();
            pstmt.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(QuanLyThongKe.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnDayActionPerformed

    private void txtDayViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDayViewActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDayViewActionPerformed

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
            java.util.logging.Logger.getLogger(QuanLyThongKe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLyThongKe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLyThongKe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLyThongKe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuanLyThongKe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDay;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnView;
    private javax.swing.JButton btnViewMax;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblThongKe;
    private javax.swing.JTextField txtDay;
    private javax.swing.JTextField txtDayView;
    private javax.swing.JTextField txtMaxMon;
    private javax.swing.JTextField txtMaxMonth;
    private javax.swing.JTextField txtMonth;
    private javax.swing.JTextField txtMonthMax;
    private javax.swing.JTextField txtSumMoney;
    // End of variables declaration//GEN-END:variables

private void LoadTableThongKe() {
    tableModel.setRowCount(0);
    Connection con = Connect.openConnection();
    try {
        PreparedStatement pstmt = con.prepareStatement("SELECT tables.table_name, invoice.total_price, CONVERT(varchar, invoice.invoice_date, 121) AS invoice_date FROM invoice, tables WHERE invoice.tables_id=tables.ID AND invoice.status=1");
        ResultSet rs = pstmt.executeQuery();
        int i = 1;
        while (rs.next()) {
            Object[] dt = {i++, rs.getString(1), rs.getString(2), rs.getString(3)};
            tableModel.addRow(dt);
        }
    } catch (SQLException ex) {
        Logger.getLogger(QuanLyThongKe.class.getName()).log(Level.SEVERE, null, ex);
    }
}

private double calculateSumMoney(String month) {
    double sumMoney = 0;
    Connection con = Connect.openConnection();
    try {
        PreparedStatement pstmt = con.prepareStatement("SELECT SUM(total_price) FROM invoice WHERE MONTH(invoice_date) = ?");
        pstmt.setString(1, month);
        ResultSet rs = pstmt.executeQuery();
        if (rs.next()) {
            sumMoney = rs.getDouble(1);
        }
    } catch (SQLException ex) {
        Logger.getLogger(QuanLyThongKe.class.getName()).log(Level.SEVERE, null, ex);
    }
    return sumMoney;
}

private String findMaxRevenueDayOfMonth(String month) {
    String maxRevenueInfo = ""; // Biến chứa thông tin ngày có doanh thu cao nhất và tổng doanh thu của ngày đó
    Connection con = Connect.openConnection();
    try {
        PreparedStatement pstmt = con.prepareStatement("SELECT CONVERT(varchar, invoice.invoice_date, 23) AS invoice_date, SUM(invoice.total_price) AS total_revenue FROM invoice WHERE MONTH(invoice.invoice_date) = ? GROUP BY CONVERT(varchar, invoice.invoice_date, 23) HAVING SUM(invoice.total_price) = (SELECT MAX(total_revenue) FROM (SELECT SUM(total_price) AS total_revenue FROM invoice WHERE MONTH(invoice.invoice_date) = ? GROUP BY CONVERT(varchar, invoice.invoice_date, 23)) AS revenue)");
        pstmt.setString(1, month);
        pstmt.setString(2, month);
        ResultSet rs = pstmt.executeQuery();
        if (rs.next()) {
            String date = rs.getString("invoice_date");
            double totalRevenue = rs.getDouble("total_revenue");
            maxRevenueInfo = date + " - " + totalRevenue;
        }
        rs.close();
        pstmt.close();
        con.close();
    } catch (SQLException ex) {
        Logger.getLogger(QuanLyThongKe.class.getName()).log(Level.SEVERE, null, ex);
    }
    return maxRevenueInfo;
}





private String calculateTotalRevenueOfDay(String date) {
    double totalRevenue = 0.0;
    Connection con = Connect.openConnection();
    try {
        PreparedStatement pstmt = con.prepareStatement("SELECT SUM(total_price) AS total_revenue FROM invoice WHERE CONVERT(varchar, invoice.invoice_date, 23) = ?");
        pstmt.setString(1, date);
        ResultSet rs = pstmt.executeQuery();
        if (rs.next()) {
            totalRevenue = rs.getDouble("total_revenue");
        }
        rs.close();
        pstmt.close();
        con.close();
    } catch (SQLException ex) {
        Logger.getLogger(QuanLyThongKe.class.getName()).log(Level.SEVERE, null, ex);
    }
    return String.valueOf(totalRevenue);
}

private void displayMaxRevenueMonth() {
    Connection con = Connect.openConnection();
    try {
        PreparedStatement pstmt = con.prepareStatement("SELECT TOP 1 CONVERT(varchar, DATEPART(YEAR, invoice.invoice_date)) + '-' + CONVERT(varchar, DATEPART(MONTH, invoice.invoice_date)) AS invoice_month, SUM(invoice.total_price) AS total_revenue FROM invoice GROUP BY CONVERT(varchar, DATEPART(YEAR, invoice.invoice_date)) + '-' + CONVERT(varchar, DATEPART(MONTH, invoice.invoice_date)) ORDER BY total_revenue DESC");
        ResultSet rs = pstmt.executeQuery();
        if (rs.next()) {
            String maxMonth = rs.getString("invoice_month");
            double maxRevenue = rs.getDouble("total_revenue");
            txtMonthMax.setText(maxMonth + " - Doanh thu: " + maxRevenue);
        }
        rs.close();
        pstmt.close();
        con.close();
    } catch (SQLException ex) {
        Logger.getLogger(QuanLyThongKe.class.getName()).log(Level.SEVERE, null, ex);
    }
}



}
