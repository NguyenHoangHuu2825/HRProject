/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view.form.Home;

import controller.Function.Function;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Image;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import view.component.Home_Component.Home_Component;
import view.ui_custom.CircleLabel;

/**
 *
 * @author LENOVO
 */
public class Home_Form extends javax.swing.JFrame {

    /**
     * Creates new form Home_Form
     */
    public Home_Form() {
        initComponents();
        setLayout();
        setImg();
        initCustomComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        homePanel = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        backBtn = new javax.swing.JLabel();
        menuBtn = new javax.swing.JLabel();
        personalImg = new javax.swing.JLabel();
        notiBtn = new javax.swing.JLabel();
        contentPanel = new javax.swing.JPanel();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(207, 207, 207));
        setMinimumSize(new java.awt.Dimension(1200, 600));
        setName("frame"); // NOI18N
        setResizable(false);

        homePanel.setBackground(new java.awt.Color(255, 255, 255));

        logo.setBackground(new java.awt.Color(255, 51, 51));
        logo.setForeground(new java.awt.Color(255, 51, 51));
        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setText("logo");
        logo.setSize(25,25);
        logo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        backBtn.setToolTipText("");
        backBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backBtn.setMaximumSize(new java.awt.Dimension(25, 25));
        backBtn.setMinimumSize(new java.awt.Dimension(0, 0));
        backBtn.setPreferredSize(new java.awt.Dimension(25, 25));
        backBtn.setSize(15,15);

        menuBtn.setText(" ");
        menuBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuBtn.setMaximumSize(new java.awt.Dimension(25, 25));
        menuBtn.setMinimumSize(new java.awt.Dimension(0, 0));
        menuBtn.setSize(15,15);

        personalImg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        personalImg.setText("img");
        personalImg.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        notiBtn.setText("jLabel1");
        notiBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        notiBtn.setSize(25, 25);

        javax.swing.GroupLayout homePanelLayout = new javax.swing.GroupLayout(homePanel);
        homePanel.setLayout(homePanelLayout);
        homePanelLayout.setHorizontalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homePanelLayout.createSequentialGroup()
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(menuBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 982, Short.MAX_VALUE)
                .addComponent(notiBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(personalImg, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        homePanelLayout.setVerticalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homePanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(menuBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(notiBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
            .addComponent(personalImg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout contentPanelLayout = new javax.swing.GroupLayout(contentPanel);
        contentPanel.setLayout(contentPanelLayout);
        contentPanelLayout.setHorizontalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        contentPanelLayout.setVerticalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 558, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(homePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(contentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(homePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        homePanel.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Home_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home_Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backBtn;
    private javax.swing.JPanel contentPanel;
    private javax.swing.JPanel homePanel;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel menuBtn;
    private javax.swing.JLabel notiBtn;
    private javax.swing.JLabel personalImg;
    // End of variables declaration//GEN-END:variables

    private void setImg() {
        String urlLogo = "/img/vng.jpg";
        String urlBack = "/img/back-button.png";
        String urlMenu = "/img/menu.png";
        String urlNoti = "/img/bell.png";

        ImageIcon iconLogo = Function.scaleImg(logo, urlLogo);
        ImageIcon iconBack = Function.scaleImg(backBtn, urlBack);
        ImageIcon iconMenu = Function.scaleImg(menuBtn, urlMenu);
        ImageIcon iconNoti = Function.scaleImg(notiBtn, urlNoti);

        logo.setIcon(iconLogo);
        backBtn.setIcon(iconBack);
        menuBtn.setIcon(iconMenu);
        notiBtn.setIcon(iconNoti);

    }

    private void initCustomComponents() {
        ImageIcon imageIcon = new ImageIcon(getClass().getResource("/img/bell.png"));
        for (int i = 0; i < 7; i++) {
            contentPanel.add(new Home_Component("1", "Nguyen Tran Thanh Duy Oc Cac", new Color(150, 150, 150), imageIcon));
        }
    }

    private void setLayout() {
        this.getContentPane().setLayout(new BorderLayout());
        this.getContentPane().add(homePanel, BorderLayout.NORTH);
        contentPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));
        this.getContentPane().add(contentPanel, BorderLayout.CENTER);
    }

}
