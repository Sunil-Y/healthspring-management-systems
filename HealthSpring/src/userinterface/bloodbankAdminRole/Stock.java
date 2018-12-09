/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.bloodbankAdminRole;

import Business.Blood.BloodGroup;
import Business.Blood.BloodSpecs;
import Business.Organization.BloodBankStaffOrganization;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author mihir
 */
public class Stock extends javax.swing.JPanel {
     private JPanel userProcessContainer;
     private  BloodBankStaffOrganization org;
    /**
     * Creates new form BloodBankProcessWorkRequest
     */
    public Stock(  JPanel userProcessContainer,  BloodBankStaffOrganization org) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.org=org;
    populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"A+", null},
                {"A-", null},
                {"B+", null},
                {"B-", null},
                {"O+", null},
                {"O-", null},
                {"AB+", null},
                {"AB-", null}
            },
            new String [] {
                "Blood Group", "Volume"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Blood Bank Stock");

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton3.setText("View Bar Graph");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(96, 96, 96)
                                .addComponent(jButton3))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1)
                .addGap(47, 47, 47)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton3))
                .addContainerGap(82, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
 private void populateTable(){
     
     DefaultTableModel tm = (DefaultTableModel) jTable1.getModel();
   /*
     Object col[] = new Object[4];
            col[0] = String.valueOf(bg.getApositive());
            col[1] = String.valueOf(bg.getBpositive());
            col[2] =String.valueOf( bg.getABpositive());
            col[3] = String.valueOf(bg.getOpositive());
            tm.addColumn(col);      */
            
            

            tm.setValueAt( String.valueOf(org.getBldgrp().getApositive()), 0, 1);
            tm.setValueAt( String.valueOf(org.getBldgrp().getAnegative()), 1, 1);
            tm.setValueAt( String.valueOf(org.getBldgrp().getBpositive()), 2, 1);
            tm.setValueAt( String.valueOf(org.getBldgrp().getBnegative()), 3, 1);
            tm.setValueAt( String.valueOf(org.getBldgrp().getOpositive()), 4, 1);
            tm.setValueAt( String.valueOf(org.getBldgrp().getOnegative()), 5, 1);
            tm.setValueAt( String.valueOf(org.getBldgrp().getABpositive()), 6, 1);
            tm.setValueAt( String.valueOf(org.getBldgrp().getAbnegative()), 7, 1);
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        DefaultCategoryDataset dataset=new DefaultCategoryDataset();
        dataset.setValue(org.getBldgrp().getApositive(),"Volume","A+ve");
         dataset.setValue(org.getBldgrp().getAnegative(),"Volume","A-ve");
          dataset.setValue(org.getBldgrp().getBpositive(),"Volume","B+ve");
           dataset.setValue(org.getBldgrp().getBnegative(),"Volume","B-ve");
        dataset.setValue(org.getBldgrp().getABpositive(),"Volume","AB+ve");
        dataset.setValue(org.getBldgrp().getAbnegative(),"Volume","AB-ve");
         dataset.setValue(org.getBldgrp().getOpositive(),"Volume","O+ve");
          dataset.setValue(org.getBldgrp().getOnegative(),"Volume","O-ve");

        

        JFreeChart jchart= ChartFactory.createBarChart("Blood Stock", "Blood Groups", "Volume", dataset, PlotOrientation.VERTICAL, true, true, false);
        CategoryPlot plot = jchart.getCategoryPlot();
        plot.setRangeGridlinePaint(Color.BLACK);
        ChartFrame chtfrm=new ChartFrame("Blood Stock",jchart,true);
        chtfrm.setVisible(true);
        chtfrm.setSize(1000,600);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
