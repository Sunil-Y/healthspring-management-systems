/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.bloodbankAdminRole;

import Business.Blood.BloodDirectory;
import Business.Blood.BloodGroup;
import Business.Blood.BloodSpecs;
import Business.Organization.BloodBankStaffOrganization;
import java.awt.CardLayout;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author mihir
 */
public class BloodDonation extends javax.swing.JPanel {
 private ButtonGroup bg1= new ButtonGroup();
 private int opt;
 private String Bloodgroup;
  JPanel userProcessContainer;
  private BloodBankStaffOrganization organization;
 /* private BloodGroup bldgrp;
  private BloodSpecs bldsps;
  private BloodDirectory BldDir;*/
    /**
     * Creates new form BloodDonation
     */
    public BloodDonation(JPanel userProcessContainer, BloodBankStaffOrganization organization) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.organization=organization;
        /*this.bldgrp=bg ;
        bldsps=new BloodSpecs();
       this.BldDir=blooddir;*/
        groupbutton();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        _AjRadioButton1 = new javax.swing.JRadioButton();
        AjRadioButton2 = new javax.swing.JRadioButton();
        _BjRadioButton3 = new javax.swing.JRadioButton();
        BjRadioButton4 = new javax.swing.JRadioButton();
        _OjRadioButton5 = new javax.swing.JRadioButton();
        OjRadioButton6 = new javax.swing.JRadioButton();
        _ABjRadioButton7 = new javax.swing.JRadioButton();
        ABjRadioButton8 = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        nametxt = new javax.swing.JTextField();
        volTxt = new javax.swing.JTextField();
        submitBtn = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        bl = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Blood Donation");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Donor Name:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Select Blood Group:");

        _AjRadioButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        _AjRadioButton1.setText("-A");
        _AjRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _AjRadioButton1ActionPerformed(evt);
            }
        });

        AjRadioButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        AjRadioButton2.setText("+A");
        AjRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AjRadioButton2ActionPerformed(evt);
            }
        });

        _BjRadioButton3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        _BjRadioButton3.setText("-B");

        BjRadioButton4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BjRadioButton4.setText("+B");

        _OjRadioButton5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        _OjRadioButton5.setText("-O");

        OjRadioButton6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        OjRadioButton6.setText("+O");

        _ABjRadioButton7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        _ABjRadioButton7.setText("-AB");

        ABjRadioButton8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ABjRadioButton8.setText("+AB");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Volume:");

        nametxt.setColumns(15);
        nametxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        volTxt.setColumns(7);
        volTxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        submitBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        submitBtn.setText("Submit");
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel5.setText("1 Unit=(350ml)");

        jLabel6.setForeground(new java.awt.Color(255, 51, 51));

        bl.setForeground(new java.awt.Color(255, 51, 51));

        jLabel8.setForeground(new java.awt.Color(255, 51, 51));

        jLabel9.setForeground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton2)
                                        .addGap(87, 87, 87)
                                        .addComponent(submitBtn))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addGap(35, 35, 35)
                                                .addComponent(volTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(39, 39, 39)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(nametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel3))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(bl, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(_AjRadioButton1)
                                    .addComponent(_OjRadioButton5))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(OjRadioButton6)
                                        .addGap(18, 18, 18)
                                        .addComponent(_ABjRadioButton7))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(AjRadioButton2)
                                        .addGap(18, 18, 18)
                                        .addComponent(_BjRadioButton3)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BjRadioButton4)
                                    .addComponent(ABjRadioButton8))))))
                .addGap(108, 255, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(nametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(_AjRadioButton1)
                            .addComponent(AjRadioButton2)
                            .addComponent(_BjRadioButton3)
                            .addComponent(BjRadioButton4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(OjRadioButton6)
                            .addComponent(_ABjRadioButton7)
                            .addComponent(ABjRadioButton8)
                            .addComponent(_OjRadioButton5)))
                    .addComponent(bl, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(volTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitBtn)
                    .addComponent(jButton2))
                .addContainerGap(110, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void AjRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AjRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AjRadioButton2ActionPerformed

    private void _AjRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__AjRadioButton1ActionPerformed
    opt=1;
    
// TODO add your handling code here:
    }//GEN-LAST:event__AjRadioButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
     jLabel8.setText("");
     bl.setText("");
     jLabel6.setText("");
     jLabel9.setText("");
   
        Boolean b=true;
          if(bg1.getSelection()==null){bl.setText("Select a bloodgroup");
          b=false;
     }
        
        if(nametxt.getText().trim().isEmpty()){
       jLabel9.setText(" Name field is empty");
        b=false;;}
         if(volTxt.getText().trim().isEmpty()){
           jLabel8.setText("Volume field is empty");
         b=false;}
         try{int x=Integer.parseInt(volTxt.getText());
         }
         catch(NumberFormatException e){
             jLabel6.setText("Enter valid number");
             b=false;
         }
       if(b){
        int vol=Integer.parseInt(volTxt.getText());
        
        //..............adding blood to stocks..................
             
        if(AjRadioButton2.isSelected()){
           
            int a=organization.getBldgrp().getApositive();
            a=a+vol;
            organization.getBldgrp().setApositive(a);
            Bloodgroup="A+ve";
          
           }
         if(_AjRadioButton1.isSelected()){
           
            int a=organization.getBldgrp().getAnegative();
            a=a+vol;
            organization.getBldgrp().setAnegative(a);
             Bloodgroup="A-ve";
             
           }
         if(_BjRadioButton3.isSelected()){
           
            int a=organization.getBldgrp().getBnegative();
            a=a+vol;
            organization.getBldgrp().setBnegative(a);
            Bloodgroup="B-ve";
          
           }
         if(BjRadioButton4.isSelected()){
           
            int a=organization.getBldgrp().getBpositive();
            a=a+vol;
            organization.getBldgrp().setBpositive(a);
         Bloodgroup="B+ve";
        
           }
        if(_OjRadioButton5.isSelected()){
           
            int a=organization.getBldgrp().getOnegative();
            a=a+vol;
            organization.getBldgrp().setOnegative(a);
             Bloodgroup="O-ve";
            
           }
        if(OjRadioButton6.isSelected()){
           
            int a=organization.getBldgrp().getOpositive();
            a=a+vol;
            organization.getBldgrp().setOpositive(a);
             Bloodgroup="O-ve";
           
           }
          if(_ABjRadioButton7.isSelected()){
           
            int a=organization.getBldgrp().getAbnegative();
            a=a+vol;
            organization.getBldgrp().setAbnegative(a);
             Bloodgroup="AB-ve";
             
           }
          if(ABjRadioButton8.isSelected()){
           
            int a=organization.getBldgrp().getABpositive();
            a=a+vol;
            organization.getBldgrp().setABpositive(a);
             Bloodgroup="AB+ve";
            
            }
          
          
        
           
        
            String Name=nametxt.getText();
            BloodSpecs blood=organization.getBlddir().CreateBloodSpec(Name, Bloodgroup, vol);
            JOptionPane.showMessageDialog(null,"Successfully added to records!");
     
       }
         
        
        
    //    CreateBloodSpec(Name, BloodGroup,vol);
        // TODO add your handling code here:
    }//GEN-LAST:event_submitBtnActionPerformed
public void groupbutton(){
   // ButtonGroup bg1= new ButtonGroup();
        ABjRadioButton8.setActionCommand("ABjRadioButton8");
    bg1.add(ABjRadioButton8);
   AjRadioButton2.setActionCommand("AjRadioButton2");
    bg1.add(AjRadioButton2);
    
    BjRadioButton4.setActionCommand("BjRadioButton4");
    bg1.add(BjRadioButton4);
    
    OjRadioButton6.setActionCommand("OjRadioButton6");
    bg1.add(OjRadioButton6);
    
    _ABjRadioButton7.setActionCommand("_ABjRadioButton7");
    bg1.add(_ABjRadioButton7);
    
    _AjRadioButton1.setActionCommand("_AjRadioButton1");
    bg1.add(_AjRadioButton1);
    
    _BjRadioButton3.setActionCommand("_BjRadioButton3");
    bg1.add(_BjRadioButton3);
    
    _OjRadioButton5.setActionCommand("_OjRadioButton5");
    bg1.add(_OjRadioButton5);
   // btnsel = String.valueOf(bg1.getSelection());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton ABjRadioButton8;
    private javax.swing.JRadioButton AjRadioButton2;
    private javax.swing.JRadioButton BjRadioButton4;
    private javax.swing.JRadioButton OjRadioButton6;
    private javax.swing.JRadioButton _ABjRadioButton7;
    private javax.swing.JRadioButton _AjRadioButton1;
    private javax.swing.JRadioButton _BjRadioButton3;
    private javax.swing.JRadioButton _OjRadioButton5;
    private javax.swing.JLabel bl;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField nametxt;
    private javax.swing.JButton submitBtn;
    private javax.swing.JTextField volTxt;
    // End of variables declaration//GEN-END:variables
}
