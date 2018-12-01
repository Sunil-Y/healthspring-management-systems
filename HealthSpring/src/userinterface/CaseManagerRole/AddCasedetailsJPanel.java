/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CaseManagerRole;

import Business.CrowdFunding.CFRCaseDirectory;
import Business.CrowdFundingWorkQueue.CFRCaseWorkRequest;
import Business.CrowdFundingWorkQueue.CFRFinanceFellowWorkRequest;
import Business.Enterprise.Enterprise;
import Business.Organization.LabOrganization;
import Business.Organization.Organization;
import Business.Organization.SocialCrowdFunding.FinanceFellowOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.LabTestWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.Locale.Category;
import javax.swing.JPanel;
import userinterface.LabAssistantRole.LabAssistantWorkAreaJPanel;

/**
 *
 * @author nikhi
 */
public class AddCasedetailsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AddCasedetailsJPanel
     */
    CFRCaseWorkRequest request;
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private CFRCaseDirectory cfrCaseDir;
  
    
    public AddCasedetailsJPanel(JPanel userProcessContainer, CFRCaseWorkRequest request, UserAccount account, Enterprise enterprise,CFRCaseDirectory cfrCaseDir) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.request = request;
        this.cfrCaseDir = cfrCaseDir;
        patienttxt.setText(request.getPatient());
        categorytxt.setText(request.getCategory());
        costtxt.setText(String.valueOf(request.getCost()));
        caseidtxt.setText(String.valueOf(request.getCaseId()));
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        submitbtn = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        caseidtxt = new javax.swing.JTextField();
        costtxt = new javax.swing.JTextField();
        acctxt = new javax.swing.JTextField();
        patienttxt = new javax.swing.JTextField();
        categorytxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        bnametxt = new javax.swing.JTextField();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        submitbtn.setText("CREATE CFR CASE & SEND REQUEST");
        submitbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitbtnActionPerformed(evt);
            }
        });
        add(submitbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 320, -1, -1));

        jButton2.setText("BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 102));
        jLabel1.setText("ADD CASE DETAILS");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 190, 30));

        jLabel2.setText("PATIENT NAME");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 90, -1, -1));

        jLabel3.setText("CATEGORY");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 145, -1, -1));

        jLabel4.setText("COST OF TREATMENT");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        jLabel5.setText("BANK NAME");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 150, 100, 20));

        jLabel6.setText("BANK ACC NUMBER");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 210, -1, -1));
        add(caseidtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 90, 160, 20));
        add(costtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 140, 20));
        add(acctxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 200, 160, 20));
        add(patienttxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 140, 20));
        add(categorytxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 140, 20));

        jLabel7.setText("CASE ID");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 90, 90, 20));
        add(bnametxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 150, 160, 20));
    }// </editor-fold>//GEN-END:initComponents

    private void submitbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitbtnActionPerformed
        request.setCaseId(Integer.parseInt(caseidtxt.getText()));
        request.setAcc_num(Long.parseLong(acctxt.getText()));
        request.setB_name(bnametxt.getText());
        request.setCategory(categorytxt.getText());
        request.setCost(Integer.parseInt(costtxt.getText()));
        request.setPatient(patienttxt.getText());
        
        request.setStatus("Awaiting for Funding");
        
       int caseid =  Integer.parseInt(caseidtxt.getText());
       String Patient_name = patienttxt.getText();
        String  category = categorytxt.getText();
        String bName = bnametxt.getText();
         int cost = Integer.parseInt(costtxt.getText());
         long acc_num = Long.parseLong(acctxt.getText());
      //  String message = messageJTextField.getText();
       // Added for saving details of cases in entity class
        cfrCaseDir.CreateCaseSpec(caseid, Patient_name,  category,  bName, cost,  acc_num);
        //populateTable(organization);
       
        
        CFRFinanceFellowWorkRequest request_sec = new CFRFinanceFellowWorkRequest();
        //request.setMessage(message);
        request_sec.setCaseId(request.getCaseId());
        request_sec.setAcc_num(request.getAcc_num());
         request_sec.setB_name(request.getB_name());
         request_sec.setCategory(request.getCategory());
         request_sec.setCost(request.getCost());
         request_sec.setPatient(request.getPatient());
        request_sec.setSender(userAccount);
        request_sec.setStatus("Sent for Funding");
        
        Organization org = null;
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
            if (organization instanceof FinanceFellowOrganization){
                org = organization;
                break;
            }
        }
        if (org!=null){
            org.getWorkQueue().getWorkRequestList().add(request_sec);
            userAccount.getWorkQueue().getWorkRequestList().add(request_sec);
        }
     
            }//GEN-LAST:event_submitbtnActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        CaseManagerWorkAreaJPanel cmwjp = (CaseManagerWorkAreaJPanel) component;
        cmwjp.populateRequestTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField acctxt;
    private javax.swing.JTextField bnametxt;
    private javax.swing.JTextField caseidtxt;
    private javax.swing.JTextField categorytxt;
    private javax.swing.JTextField costtxt;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField patienttxt;
    private javax.swing.JButton submitbtn;
    // End of variables declaration//GEN-END:variables
}
