/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import Business.AirlinerDirectory;
import Business.AirplaneDirectory;
import Business.Customer;
import Business.CustomerDirectory;
import Business.MasterTravelSchedule;
import Business.Reservation;
import Business.ReservationDirectory;
import UserInterface.ManageAirliner.ManageAirliners;
import UserInterface.ManageTravelAgency.ManageTravelAgency;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author shivibhatt
 */
public class TravelAgencyMain extends javax.swing.JFrame {
    
    private AirlinerDirectory airlineDirectory;
    private AirplaneDirectory airplaneDirectory;
    private ReservationDirectory reservationDirectory;
    private MasterTravelSchedule masterTravelSchedule;
    private Reservation reservation;
    private CustomerDirectory custDir;
    private Customer cust;
    
    /**
     * Creates new form MainJFrame
     */
    public TravelAgencyMain() {
        initComponents();
        airlineDirectory = new AirlinerDirectory();
        airplaneDirectory = new AirplaneDirectory();
        masterTravelSchedule = new MasterTravelSchedule();
        reservationDirectory = new ReservationDirectory();
        custDir = new CustomerDirectory();
        cust = new Customer();
        reservation = new Reservation();
        defaultCenterJFrame();
    }
    
    private void defaultCenterJFrame() {
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        leftPanel = new javax.swing.JPanel();
        btnManageAirlinerMainButton = new javax.swing.JButton();
        btnManageTravelAgencyMainButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        rightPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1295, 1020));
        setResizable(false);

        jSplitPane1.setDividerLocation(255);

        leftPanel.setBackground(new java.awt.Color(174, 195, 195));

        btnManageAirlinerMainButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/global .png"))); // NOI18N
        btnManageAirlinerMainButton.setText("Manage Airliner");
        btnManageAirlinerMainButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageAirlinerMainButtonActionPerformed(evt);
            }
        });

        btnManageTravelAgencyMainButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-traveler-64.png"))); // NOI18N
        btnManageTravelAgencyMainButton.setText("Manage Travel Agency");
        btnManageTravelAgencyMainButton.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnManageTravelAgencyMainButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageTravelAgencyMainButtonActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-airport-100.png"))); // NOI18N

        javax.swing.GroupLayout leftPanelLayout = new javax.swing.GroupLayout(leftPanel);
        leftPanel.setLayout(leftPanelLayout);
        leftPanelLayout.setHorizontalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPanelLayout.createSequentialGroup()
                .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, leftPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnManageAirlinerMainButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, leftPanelLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel2))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, leftPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnManageTravelAgencyMainButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        leftPanelLayout.setVerticalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btnManageTravelAgencyMainButton)
                .addGap(27, 27, 27)
                .addComponent(btnManageAirlinerMainButton)
                .addContainerGap(721, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(leftPanel);

        rightPanel.setLayout(new java.awt.CardLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Biplane-Vol-3-Vector - Copy.jpg"))); // NOI18N
        rightPanel.add(jLabel1, "card2");

        jSplitPane1.setRightComponent(rightPanel);

        getContentPane().add(jSplitPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageTravelAgencyMainButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageTravelAgencyMainButtonActionPerformed
        ManageTravelAgency travelAgencyPanel = new ManageTravelAgency(this.rightPanel, airlineDirectory,airplaneDirectory, masterTravelSchedule, custDir, cust, reservationDirectory, reservation);
        this.rightPanel.add(travelAgencyPanel, "ManageTravelAgency");
        CardLayout layout = (CardLayout)this.rightPanel.getLayout();
        layout.next(rightPanel);
    }//GEN-LAST:event_btnManageTravelAgencyMainButtonActionPerformed

    private void btnManageAirlinerMainButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageAirlinerMainButtonActionPerformed
        ManageAirliners airlinerPanel = new ManageAirliners(this.rightPanel, airlineDirectory, airplaneDirectory, masterTravelSchedule, reservationDirectory);
        this.rightPanel.add(airlinerPanel, "ManageAirliners");
        CardLayout layout = (CardLayout)this.rightPanel.getLayout();
        layout.next(rightPanel);
    }//GEN-LAST:event_btnManageAirlinerMainButtonActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TravelAgencyMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TravelAgencyMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TravelAgencyMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TravelAgencyMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TravelAgencyMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageAirlinerMainButton;
    private javax.swing.JButton btnManageTravelAgencyMainButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JPanel leftPanel;
    private javax.swing.JPanel rightPanel;
    // End of variables declaration//GEN-END:variables
}
