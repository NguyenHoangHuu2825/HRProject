/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view.component.EmployeeAndDepartmentInfo;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.border.Border;

/**
 *
 * @author LENOVO
 */
public class PersonalBasicInfo_Container extends javax.swing.JPanel {

    /**
     * Creates new form NewJPanel
     */
    public PersonalBasicInfo_Container() {
        initComponents();
        this.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
        this.setBackground(Color.WHITE);
        this.setBorder(BorderFactory.createEmptyBorder());
        addComponent();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 840, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 445, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addComponent() {
//        String name = "Lâm Quốc Nhân";
//        String id = "LQN2005";
//        String job = "Web Developer";
//        ImageIcon img = new ImageIcon(getClass().getResource("/img/avatar.jpg"));
//        String dateOfBirth = "20/09/2005";
//        String place = "Thành phố Hồ Chí Minh";
//        String gender = "Nam";
        String startDate = "15/10/2024";
        String seniority = "10/10/2012";
        String status = "Chinh thuc";
        for (int i = 1; i <= 4; i++) {
            this.add(new Status_Component(startDate, seniority, status));
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
