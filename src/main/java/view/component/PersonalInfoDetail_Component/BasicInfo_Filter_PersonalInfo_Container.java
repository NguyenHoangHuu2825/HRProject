/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view.component.PersonalInfoDetail_Component;

import java.awt.BorderLayout;

/**
 *
 * @author user
 */
public class BasicInfo_Filter_PersonalInfo_Container extends javax.swing.JPanel {

    /**
     * Creates new form BasicInfo_Filter_PersonalInfo_Container
     */
    public BasicInfo_Filter_PersonalInfo_Container() {
        initComponents();
        setLayout();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void setLayout() {
        this.setLayout(new BorderLayout());
        PersonInfor_Component personnalInfo = new PersonInfor_Component();
        BasicInfo_Filter_Container listPerson_Filter = new BasicInfo_Filter_Container();
        this.add(personnalInfo, BorderLayout.NORTH);
        this.add(listPerson_Filter, BorderLayout.CENTER);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
