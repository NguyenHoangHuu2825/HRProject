/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view.component;

import java.awt.Container;
import java.awt.Dimension;
import javax.swing.JPanel;

/**
 *
 * @author user
 */
public class PersonalInformation extends JPanel {

    /**
     * Creates new form PersonalInformation
     */
    public PersonalInformation() {
        initComponents();
        myAdd();
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
        title = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        sdt = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        status = new javax.swing.JLabel();
        cccd = new javax.swing.JLabel();
        input_SoDienThoai = new javax.swing.JLabel();
        input_NgaySInh = new javax.swing.JLabel();
        input_Email = new javax.swing.JLabel();
        input_CCCD = new javax.swing.JLabel();
        input_TinhTrangHonNhan = new javax.swing.JLabel();
        input_MaNhanVien = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(970, 340));
        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(975, 340));
        jPanel1.setPreferredSize(new java.awt.Dimension(975, 340));
        jPanel1.setLayout(null);

        title.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        title.setForeground(new java.awt.Color(51, 51, 255));
        title.setText("LÝ LỊCH CÁ NHÂN");
        jPanel1.add(title);
        title.setBounds(450, 19, 168, 19);

        id.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        id.setText("Mã Nhân Viên");
        jPanel1.add(id);
        id.setBounds(40, 70, 99, 27);

        date.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        date.setText("Ngày Sinh");
        jPanel1.add(date);
        date.setBounds(40, 160, 56, 16);

        sdt.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        sdt.setText("Số Điện Thoại");
        jPanel1.add(sdt);
        sdt.setBounds(360, 70, 99, 27);

        email.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        email.setText("Email");
        jPanel1.add(email);
        email.setBounds(360, 160, 77, 27);

        status.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        status.setText("Tình Trạng Hôn Nhân");
        jPanel1.add(status);
        status.setBounds(680, 160, 148, 27);

        cccd.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        cccd.setText("Căn Cước Công Dân");
        jPanel1.add(cccd);
        cccd.setBounds(680, 70, 131, 27);

        input_SoDienThoai.setText("jLabel1");
        jPanel1.add(input_SoDienThoai);
        input_SoDienThoai.setBounds(360, 110, 210, 16);

        input_NgaySInh.setText("jLabel1");
        jPanel1.add(input_NgaySInh);
        input_NgaySInh.setBounds(40, 200, 210, 16);

        input_Email.setText("jLabel1");
        jPanel1.add(input_Email);
        input_Email.setBounds(360, 200, 210, 16);

        input_CCCD.setText("jLabel1");
        jPanel1.add(input_CCCD);
        input_CCCD.setBounds(680, 110, 210, 16);

        input_TinhTrangHonNhan.setText("jLabel1");
        jPanel1.add(input_TinhTrangHonNhan);
        input_TinhTrangHonNhan.setBounds(690, 200, 210, 16);

        input_MaNhanVien.setText("jLabel1");
        jPanel1.add(input_MaNhanVien);
        input_MaNhanVien.setBounds(40, 110, 210, 16);

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    public void myAdd() {
        jPanel1.add(id);
        jPanel1.add(date);
        jPanel1.add(email);
        jPanel1.add(sdt);
        jPanel1.add(status);
        jPanel1.add(input_MaNhanVien);
        jPanel1.add(input_SoDienThoai);
        jPanel1.add(input_CCCD);
        jPanel1.add(input_NgaySInh);
        jPanel1.add(input_TinhTrangHonNhan);
        jPanel1.add(input_SoDienThoai);
        add(jPanel1);

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
            java.util.logging.Logger.getLogger(PersonalInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PersonalInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PersonalInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PersonalInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PersonalInformation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cccd;
    private javax.swing.JLabel date;
    private javax.swing.JLabel email;
    private javax.swing.JLabel id;
    private javax.swing.JLabel input_CCCD;
    private javax.swing.JLabel input_Email;
    private javax.swing.JLabel input_MaNhanVien;
    private javax.swing.JLabel input_NgaySInh;
    private javax.swing.JLabel input_SoDienThoai;
    private javax.swing.JLabel input_TinhTrangHonNhan;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel sdt;
    private javax.swing.JLabel status;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables

    private Object getContentPane() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void pack() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void setDefaultCloseOperation(int EXIT_ON_CLOSE) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
