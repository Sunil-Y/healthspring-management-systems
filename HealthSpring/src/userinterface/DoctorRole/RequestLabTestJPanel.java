/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DoctorRole;

import Business.CrowdFundingWorkQueue.CFRCaseWorkRequest;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.LabOrganization;
import Business.Organization.Organization;
import Business.Organization.SocialCrowdFunding.TerminalCasesOrganization;
import Business.Patient.Patient;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.LabTestRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public class RequestLabTestJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private EcoSystem business;
    private Patient objPatient;
    
    public RequestLabTestJPanel(JPanel userProcessContainer, UserAccount account, Enterprise enterprise, Patient objPatient) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.business = business;
        this.objPatient = objPatient;
        valueLabel.setText(enterprise.getName());
        PopulateData();
    }
    
    // populate patient details.
    public void PopulateData(){
        txtPatientName.setText(objPatient.getName());
        txtAge.setText(String.valueOf(objPatient.getAge()));
        PopulateLabComboBox();
    }
    
    // Populate Lab organization list into combobox
    public void PopulateLabComboBox(){
        drpdnLabOranisation.removeAllItems();
        for(Organization objOrganization : enterprise.getOrganizationDirectory().getOrganizationList()){
            if(objOrganization instanceof LabOrganization){
                drpdnLabOranisation.addItem(objOrganization);
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backJButton = new javax.swing.JButton();
        valueLabel = new javax.swing.JLabel();
        enterpriseLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtPatientName = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        txtTestName = new javax.swing.JTextField();
        drpdnLabOranisation = new javax.swing.JComboBox();
        btnRequestTest = new javax.swing.JButton();
        errorTestName = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backJButton.setText("<<Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        valueLabel.setText("<value>");
        add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 130, -1));

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("EnterPrise :");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 120, 30));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Request Lab Test");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, 220, -1));

        jLabel2.setText("Patient Name:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 120, -1));

        jLabel3.setText("Age:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, -1, -1));

        jLabel4.setText("Test Name:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, -1, -1));

        jLabel5.setText("Lab Name:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, -1, -1));

        txtPatientName.setEditable(false);
        txtPatientName.setEnabled(false);
        add(txtPatientName, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, 220, -1));

        txtAge.setEditable(false);
        txtAge.setEnabled(false);
        add(txtAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, 220, -1));
        add(txtTestName, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, 220, -1));

        drpdnLabOranisation.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(drpdnLabOranisation, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 290, 220, 30));

        btnRequestTest.setText("Request For Test");
        btnRequestTest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequestTestActionPerformed(evt);
            }
        });
        add(btnRequestTest, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 380, 200, -1));

        errorTestName.setBackground(new java.awt.Color(204, 204, 204));
        errorTestName.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        errorTestName.setForeground(new java.awt.Color(255, 0, 0));
        add(errorTestName, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 250, 170, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        DoctorWorkAreaJPanel dwjp = (DoctorWorkAreaJPanel) component;
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        
    }//GEN-LAST:event_backJButtonActionPerformed

    private void btnRequestTestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequestTestActionPerformed
        try {
              if(Validate()){
                    errorTestName.setText("");
                    LabOrganization objLabOrganization = (LabOrganization)drpdnLabOranisation.getSelectedItem();
                    
                    LabTestRequest objLabTestRequest = new LabTestRequest();
                    objLabTestRequest.setDoctorName(userAccount.getUsername());
                    objLabTestRequest.setObjPatient(objPatient);
                    objLabTestRequest.setReportGenerated(false);
                    objLabTestRequest.setTestName(txtTestName.getText());
                    objLabTestRequest.setRequestedDate(new Date());
                    
                    objLabOrganization.getObjLabTestRequestList().add(objLabTestRequest);
                    
                    JOptionPane.showMessageDialog(null,"Lab request submitted successfully");
              }
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Something went wrong. Please try again !!");
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnRequestTestActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton btnRequestTest;
    private javax.swing.JComboBox drpdnLabOranisation;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel errorTestName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtPatientName;
    private javax.swing.JTextField txtTestName;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables

    // Validate fields
    public boolean Validate(){
        boolean isValid = false;
        if(txtTestName.getText().trim().equals("")){
            errorTestName.setText("Please enter Test Name");
        }
        else{
            isValid = true;
        }
        return isValid;
    }
}
