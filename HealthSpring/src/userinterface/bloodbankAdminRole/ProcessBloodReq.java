/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.bloodbankAdminRole;

import Business.Blood.BloodGroup;
import Business.BloodBankWorkQueue.BloodbankWorkRequest;
import Business.Organization.BloodBankStaffOrganization;
import Business.WorkQueue.LabTestWorkRequest;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
//import org.jfree.data.category.DefaultCategoryDataset;

import userinterface.LabAssistantRole.LabAssistantWorkAreaJPanel;

/**
 *
 * @author mihir
 */
public class ProcessBloodReq extends javax.swing.JPanel {
 private JPanel userProcessContainer;
 private BloodbankWorkRequest request;
 private BloodBankStaffOrganization bldorg;
 private  Boolean w;
    /**
    /**
     * Creates new form ProcessBloodReq
     */
    public ProcessBloodReq(JPanel userProcessContainer,BloodbankWorkRequest request,BloodBankStaffOrganization bldorg) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.request=request;
        this.bldorg=bldorg;
        jTextField1.setText(request.getBloodGroup());
        jTextField2.setText(String.valueOf(request.getVolume()));
        this.w=true;
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        MsgLbl = new javax.swing.JLabel();
        volLbl = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Respond to Blood Request ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Volume");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Blood Group");

        jTextField1.setColumns(7);
        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField1.setEnabled(false);

        jTextField2.setColumns(7);
        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField2FocusLost(evt);
            }
        });
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField2KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField2KeyReleased(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton3.setText("Show Stocks");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTextField3.setColumns(7);
        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField3KeyPressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Messege");

        MsgLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        volLbl.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        volLbl.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5))
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton3)
                                        .addGap(18, 18, 18)
                                        .addComponent(volLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(35, 35, 35)
                                        .addComponent(MsgLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(146, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jButton3)))
                    .addComponent(volLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(MsgLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(249, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         w=true;
      int vol=0;
        if(jTextField2.getText().isEmpty()){volLbl.setText("Volume field is empty"); w=false;}
          
          
          
        String bg=jTextField1.getText();
        
               try{int q=Integer.parseInt(jTextField2.getText());
         }
         catch(NumberFormatException e){
             volLbl.setText("Enter valid number");
             w=false;
         }
      
        
        String msg=jTextField3.getText();
        if(bg.equals("A+ve")){
            int v= Integer.parseInt(jTextField2.getText());
            vol=v;
            if(v<=bldorg.getBldgrp().getApositive())
                {
                 int a=  bldorg.getBldgrp().getApositive();
                 a=a-v;
                 bldorg.getBldgrp().setApositive(a);
                 request.setStatus(" Approved");
                 w=true;
                }
            else{JOptionPane.showMessageDialog(null,"Insufficient Stocks");
            jTextField3.setText("Value updated due to insufficient stock");w=false;
            }
        }
         if(bg.equals("A-ve")){
             int v= Integer.parseInt(jTextField2.getText());
             vol=v;
            if(v<=bldorg.getBldgrp().getAnegative())
                {
                 int a=  bldorg.getBldgrp().getAnegative();
                 a=a-v;
                 bldorg.getBldgrp().setAnegative(a);
                 request.setStatus(" Approved");
                 w=true;
                 
                }
           else{JOptionPane.showMessageDialog(null,"Insufficient Stocks");
            jTextField3.setText("Value updated due to insufficient stock");w=false;}
        }
        if(bg.equals("B+ve")){
            int v= Integer.parseInt(jTextField2.getText());
            vol=v;
            if(v<=bldorg.getBldgrp().getBpositive())
                {
                 int a=  bldorg.getBldgrp().getBpositive();
                 a=a-v;
                 bldorg.getBldgrp().setBpositive(a);
                 request.setStatus(" Approved");
                 w=true;
               
                }
           else{JOptionPane.showMessageDialog(null,"Insufficient Stocks");
            jTextField3.setText("Value updated due to insufficient stock");w=false;}
        }
        if(bg.equals("B-ve")){
            int v= Integer.parseInt(jTextField2.getText());
            vol=v;
            if(v<=bldorg.getBldgrp().getBnegative())
                {
                 int a=  bldorg.getBldgrp().getBnegative();
                 a=a-v;
                 bldorg.getBldgrp().setBnegative(a);
                 request.setStatus(" Approved");
                 w=true;
                
                }
            else{JOptionPane.showMessageDialog(null,"Insufficient Stocks");
            jTextField3.setText("Value updated due to insufficient stock");w=false;}
        }
        if(bg.equals("AB+ve")){
            int v= Integer.parseInt(jTextField2.getText());
            vol=v;
            if(v<=bldorg.getBldgrp().getABpositive())
                {
                 int a=  bldorg.getBldgrp().getABpositive();
                 a=a-v;
                 bldorg.getBldgrp().setABpositive(a);
                 request.setStatus(" Approved");
                 w=true;
                
                }
       else{JOptionPane.showMessageDialog(null,"Insufficient Stocks");
            jTextField3.setText("Value updated due to insufficient stock");w=false;}
        }
         if(bg.equals("AB-ve")){
             int v= Integer.parseInt(jTextField2.getText());
             vol=v;
            if(v<=bldorg.getBldgrp().getAbnegative())
                {
                 int a=  bldorg.getBldgrp().getAbnegative();
                 a=a-v;
                 bldorg.getBldgrp().setAbnegative(a);
                 request.setStatus(" Approved");
                 w=true;
               
                }
             else{JOptionPane.showMessageDialog(null,"Insufficient Stocks");
            jTextField3.setText("Value updated due to insufficient stock");w=false;}
        }
       
         if(bg.equals("O-ve")){
             int v= Integer.parseInt(jTextField2.getText());
             vol=v;
            if(v<=bldorg.getBldgrp().getOnegative())
                {
                 int a=  bldorg.getBldgrp().getOnegative();
                 a=a-v;
                 bldorg.getBldgrp().setOnegative(a);
                 request.setStatus(" Approved");
                 w=true;
                }
            else{JOptionPane.showMessageDialog(null,"Insufficient Stocks");
            jTextField3.setText("Value updated due to insufficient stock");w=false;
            }
        }
          if(bg.equals("O+ve")){
              int v= Integer.parseInt(jTextField2.getText());
              vol=v;
            if(v<=bldorg.getBldgrp().getOpositive())
                {
                 int a=  bldorg.getBldgrp().getOpositive();
                 a=a-v;
                 bldorg.getBldgrp().setOpositive(a);
                 request.setStatus(" Approved");
                 w=true;
                 
                }
           else{JOptionPane.showMessageDialog(null,"Insufficient Stocks");
               jTextField3.setText("Value updated due to insufficient stock");
               w=false;   
            }
            
        }
        if(w){
            request.setMessage(msg);
            request.setVolume(vol);
            JOptionPane.showMessageDialog(null,"Successful!");
             jButton1.setEnabled(false);
            
            }  
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        userProcessContainer.remove(this);
          Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        BloodbankadminWorkArea dwjp = (BloodbankadminWorkArea) component;
        dwjp.populateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        DefaultCategoryDataset dataset=new DefaultCategoryDataset();
        dataset.setValue(bldorg.getBldgrp().getApositive(),"Volume","A+ve");
         dataset.setValue(bldorg.getBldgrp().getAnegative(),"Volume","A-ve");
          dataset.setValue(bldorg.getBldgrp().getBpositive(),"Volume","B+ve");
           dataset.setValue(bldorg.getBldgrp().getBnegative(),"Volume","B-ve");
        dataset.setValue(bldorg.getBldgrp().getABpositive(),"Volume","AB+ve");
        dataset.setValue(bldorg.getBldgrp().getAbnegative(),"Volume","AB-ve");
         dataset.setValue(bldorg.getBldgrp().getOpositive(),"Volume","O+ve");
          dataset.setValue(bldorg.getBldgrp().getOnegative(),"Volume","O-ve");

        

        JFreeChart jchart= ChartFactory.createBarChart("Blood Stock", "Blood Groups", "Volume", dataset, PlotOrientation.VERTICAL, true, true, false);
        CategoryPlot plot = jchart.getCategoryPlot();
        plot.setRangeGridlinePaint(Color.BLACK);
        ChartFrame chtfrm=new ChartFrame("Blood Stock",jchart,true);
        chtfrm.setVisible(true);
        chtfrm.setSize(500,400);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyPressed
      volLbl.setText(""); 
      jButton1.setEnabled(true);
        try{int x=Integer.parseInt(jTextField2.getText());
         }
         catch(NumberFormatException e){
             volLbl.setText("Enter valid number");
             w=false;
             jButton1.setEnabled(false);
         }
             if(jTextField2.getText().trim().isEmpty()){
           volLbl.setText("Volume field is empty");
         w=false;
             jButton1.setEnabled(false);} 
    }//GEN-LAST:event_jTextField2KeyPressed

    private void jTextField3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3KeyPressed

    private void jTextField2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyReleased
           volLbl.setText(""); 
      jButton1.setEnabled(true);
        try{int x=Integer.parseInt(jTextField2.getText());
         }
         catch(NumberFormatException e){
             volLbl.setText("Enter valid number");
             w=false;
             jButton1.setEnabled(false);
         }
             if(jTextField2.getText().trim().isEmpty()){
           volLbl.setText("Volume field is empty");
         w=false;
             jButton1.setEnabled(false);} // TODO   // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2KeyReleased

    private void jTextField2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField2FocusLost
            volLbl.setText(""); 
      jButton1.setEnabled(true);
        try{int x=Integer.parseInt(jTextField2.getText());
         }
         catch(NumberFormatException e){
             volLbl.setText("Enter valid number");
             w=false;
             jButton1.setEnabled(false);
         }
             if(jTextField2.getText().trim().isEmpty()){
           volLbl.setText("Volume field is empty");
         w=false;
             jButton1.setEnabled(false);}   // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2FocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel MsgLbl;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel volLbl;
    // End of variables declaration//GEN-END:variables
}
