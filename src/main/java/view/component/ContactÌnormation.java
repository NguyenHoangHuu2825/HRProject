/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view.component;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author user
 */
public class ContactÌnormation extends javax.swing.JPanel {

    /**
     * Creates new form Contact
     */
    public ContactÌnormation() {
        initComponents();
        setImg();
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
        emailCongTy = new javax.swing.JLabel();
        icon_Phone = new javax.swing.JLabel();
        diaChiCongTy = new javax.swing.JLabel();
        lienHe = new javax.swing.JLabel();
        emailCaNhan = new javax.swing.JLabel();
        dienThoaiCaNhan = new javax.swing.JLabel();
        diaChiThuongTru = new javax.swing.JLabel();
        dienThoaiCongTy = new javax.swing.JLabel();
        input_EmailCongTy = new javax.swing.JLabel();
        input_DienThoaiCongTy = new javax.swing.JLabel();
        input_DienThoaiCaNhan = new javax.swing.JLabel();
        input_DiaChiThuongTru = new javax.swing.JLabel();
        input_DiaChiCongTy = new javax.swing.JLabel();
        input_EmailCaNhan = new javax.swing.JLabel();

        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(940, 240));
        jPanel1.setLayout(null);

        emailCongTy.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        emailCongTy.setText("Email công ty");
        jPanel1.add(emailCongTy);
        emailCongTy.setBounds(50, 60, 120, 30);

        icon_Phone.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        icon_Phone.setForeground(new java.awt.Color(51, 51, 255));
        icon_Phone.setText("icon phone");
        jPanel1.add(icon_Phone);
        icon_Phone.setBounds(50, 30, 20, 20);

        diaChiCongTy.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        diaChiCongTy.setText("Địa chỉ công ty");
        jPanel1.add(diaChiCongTy);
        diaChiCongTy.setBounds(600, 60, 120, 30);

        lienHe.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lienHe.setForeground(new java.awt.Color(51, 51, 255));
        lienHe.setText("Liên Hệ");
        jPanel1.add(lienHe);
        lienHe.setBounds(80, 20, 90, 40);

        emailCaNhan.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        emailCaNhan.setText("Email cá nhân");
        jPanel1.add(emailCaNhan);
        emailCaNhan.setBounds(50, 160, 120, 30);

        dienThoaiCaNhan.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        dienThoaiCaNhan.setText("Điện thoại cá nhân");
        jPanel1.add(dienThoaiCaNhan);
        dienThoaiCaNhan.setBounds(320, 160, 120, 30);

        diaChiThuongTru.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        diaChiThuongTru.setText("Địa chỉ thường trú");
        jPanel1.add(diaChiThuongTru);
        diaChiThuongTru.setBounds(600, 160, 120, 30);

        dienThoaiCongTy.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        dienThoaiCongTy.setText("Điện thoại công ty");
        jPanel1.add(dienThoaiCongTy);
        dienThoaiCongTy.setBounds(320, 60, 120, 30);

        input_EmailCongTy.setText("jLabel1");
        jPanel1.add(input_EmailCongTy);
        input_EmailCongTy.setBounds(50, 90, 210, 20);

        input_DienThoaiCongTy.setText("jLabel1");
        jPanel1.add(input_DienThoaiCongTy);
        input_DienThoaiCongTy.setBounds(320, 90, 210, 20);

        input_DienThoaiCaNhan.setText("jLabel1");
        jPanel1.add(input_DienThoaiCaNhan);
        input_DienThoaiCaNhan.setBounds(320, 190, 210, 20);

        input_DiaChiThuongTru.setText("jLabel1");
        jPanel1.add(input_DiaChiThuongTru);
        input_DiaChiThuongTru.setBounds(600, 190, 210, 20);

        input_DiaChiCongTy.setText("jLabel1");
        jPanel1.add(input_DiaChiCongTy);
        input_DiaChiCongTy.setBounds(600, 90, 210, 20);

        input_EmailCaNhan.setText("jLabel1");
        jPanel1.add(input_EmailCaNhan);
        input_EmailCaNhan.setBounds(50, 190, 210, 20);

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

        private ImageIcon scaleImg(JLabel jLabel, String url) {
        ImageIcon imageIcon = new ImageIcon(getClass().getResource(url));
        Image image = imageIcon.getImage();
        Image scaleImage = image.getScaledInstance(jLabel.getWidth(), jLabel.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(scaleImage);

        return scaledIcon;
    }

    private void setImg() {
        String urlPhone = "/img/Phone-icon.png";
        ImageIcon iconLogin = scaleImg(icon_Phone, urlPhone);
        icon_Phone.setIcon(iconLogin);
    }
    
    public void myAdd(){
        jPanel1.add(emailCongTy);
        jPanel1.add(input_EmailCongTy);
        jPanel1.add(dienThoaiCongTy);
        jPanel1.add(input_DienThoaiCongTy);
        jPanel1.add(diaChiCongTy);
        jPanel1.add(input_DiaChiCongTy);
        jPanel1.add(emailCaNhan);
        jPanel1.add(input_EmailCaNhan);
        jPanel1.add(dienThoaiCaNhan);
        jPanel1.add(input_DienThoaiCaNhan);
        jPanel1.add(diaChiThuongTru);
        jPanel1.add(input_DiaChiThuongTru);
        this.add(jPanel1);
    }
     

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel diaChiCongTy;
    private javax.swing.JLabel diaChiThuongTru;
    private javax.swing.JLabel dienThoaiCaNhan;
    private javax.swing.JLabel dienThoaiCongTy;
    private javax.swing.JLabel emailCaNhan;
    private javax.swing.JLabel emailCongTy;
    private javax.swing.JLabel icon_Phone;
    private javax.swing.JLabel input_DiaChiCongTy;
    private javax.swing.JLabel input_DiaChiThuongTru;
    private javax.swing.JLabel input_DienThoaiCaNhan;
    private javax.swing.JLabel input_DienThoaiCongTy;
    private javax.swing.JLabel input_EmailCaNhan;
    private javax.swing.JLabel input_EmailCongTy;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lienHe;
    // End of variables declaration//GEN-END:variables
}
