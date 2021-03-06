/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ManageAirliner;

import Business.AirlinerDirectory;
import Business.Airliner;
import Business.Airplane;
import Business.AirplaneDirectory;
import Business.MasterTravelSchedule;
import Business.ReservationDirectory;
import UserInterface.ManageTravelAgency.ManageTravelAgency;
import java.awt.CardLayout;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Mayank
 */
public class ManageAirliners extends javax.swing.JPanel {
    
    private AirlinerDirectory airlineDirectory;
    private AirplaneDirectory airplaneDirectory;
    private Airliner airliner;
    private JPanel panel;
    private MasterTravelSchedule masterTravelSchedule;
    private ReservationDirectory reservationDirectory;
    /**
     * Creates new form ManageAirliners
     */
    public ManageAirliners(JPanel panel, AirlinerDirectory airlineDirectory, AirplaneDirectory airplaneDirectory, MasterTravelSchedule masterTravelSchedule, ReservationDirectory reservationDirectory) {
        initComponents();
        this.panel = panel;
        this.airlineDirectory = airlineDirectory;
        this.airplaneDirectory = airplaneDirectory;
        this.masterTravelSchedule = masterTravelSchedule;
        this.reservationDirectory = reservationDirectory;
        populateAirlinersList(airlineDirectory);
    }
    
    public void populateAirlinersList(AirlinerDirectory airlineDirectory){
        System.out.println("===>> " + airlineDirectory.getAirlinerList());
        for(Airliner a : airlineDirectory.getAirlinerList()) {
            if(a.isIsActive()) {
                airlinerComboBox.addItem(a);
            }
            //jComboBox1.addItem(a.getAirlinerName());
            //System.out.println("===>> " + a.getAirlinerName());
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

        airlinerComboBox = new javax.swing.JComboBox<>();
        continueBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(174, 195, 195));
        setPreferredSize(new java.awt.Dimension(1040, 1020));
        setRequestFocusEnabled(false);

        airlinerComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                airlinerComboBoxActionPerformed(evt);
            }
        });

        continueBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-next-page-30.png"))); // NOI18N
        continueBtn.setText("Continue");
        continueBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                continueBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Select an Airline to continue:");

        jLabel2.setFont(new java.awt.Font("Segoe Script", 1, 36)); // NOI18N
        jLabel2.setText("Welcome to Airline Management");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(218, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(191, 191, 191))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(airlinerComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(401, 401, 401))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(358, 358, 358)))))
            .addGroup(layout.createSequentialGroup()
                .addGap(461, 461, 461)
                .addComponent(continueBtn)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jLabel2)
                .addGap(76, 76, 76)
                .addComponent(jLabel1)
                .addGap(49, 49, 49)
                .addComponent(airlinerComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(continueBtn)
                .addContainerGap(601, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void continueBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_continueBtnActionPerformed
        airliner = (Airliner)airlinerComboBox.getSelectedItem();
        
        if(airliner == null) {
            JOptionPane.showMessageDialog(null, "Please select an airline to continue.");
        }else {
            AirlinerFunction airlinerFuncPanel = new AirlinerFunction(this.panel, airlineDirectory, airplaneDirectory, airliner, masterTravelSchedule, reservationDirectory);
            this.panel.add(airlinerFuncPanel, "AirlinerFunction");
            CardLayout layout = (CardLayout)this.panel.getLayout();
            layout.next(panel);
        }        
    }//GEN-LAST:event_continueBtnActionPerformed

    private void airlinerComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_airlinerComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_airlinerComboBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Airliner> airlinerComboBox;
    private javax.swing.JButton continueBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
