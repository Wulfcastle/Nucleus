/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author Shimal
 */
public class Transactions extends javax.swing.JFrame {

    /**
     * Creates new form Dashboard
     */
    public Transactions() {
        initComponents();
    }
    
    
    Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NavBar = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
        Message = new javax.swing.JLabel();
        Avatar = new javax.swing.JLabel();
        Menu = new javax.swing.JPanel();
        Dashboard = new javax.swing.JLabel();
        Contacts = new javax.swing.JLabel();
        Transactions = new javax.swing.JLabel();
        Profile = new javax.swing.JLabel();
        SignOut = new javax.swing.JLabel();
        ActionBar = new javax.swing.JPanel();
        PageName = new javax.swing.JLabel();
        txtAbsoluteBalance = new javax.swing.JLabel();
        Balance = new javax.swing.JLabel();
        Send = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(241, 241, 241));
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setMinimumSize(new java.awt.Dimension(1600, 900));
        setName("Dashboard"); // NOI18N
        setResizable(false);

        NavBar.setBackground(new java.awt.Color(38, 50, 56));
        NavBar.setMaximumSize(new java.awt.Dimension(240, 810));
        NavBar.setMinimumSize(new java.awt.Dimension(240, 810));
        NavBar.setPreferredSize(new java.awt.Dimension(240, 810));

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/Logo.png"))); // NOI18N

        Message.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Message.setForeground(new java.awt.Color(255, 255, 255));
        Message.setText("Welcome Shimal");

        Avatar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/UI/menu/Avatar.png"))); // NOI18N

        Menu.setBackground(new java.awt.Color(38, 50, 56));
        Menu.setMaximumSize(new java.awt.Dimension(240, 810));
        Menu.setMinimumSize(new java.awt.Dimension(240, 810));

        Dashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/UI/menu/Dashboard-Unselected.png"))); // NOI18N
        Dashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DashboardMouseClicked(evt);
            }
        });

        Contacts.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/UI/menu/Contacts-Unselected.png"))); // NOI18N
        Contacts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ContactsMouseClicked(evt);
            }
        });

        Transactions.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/UI/menu/Transactions-Selected.png"))); // NOI18N

        Profile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/UI/menu/Profile-Unselected.png"))); // NOI18N
        Profile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProfileMouseClicked(evt);
            }
        });

        SignOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/UI/menu/Logout.png"))); // NOI18N
        SignOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SignOutMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout MenuLayout = new javax.swing.GroupLayout(Menu);
        Menu.setLayout(MenuLayout);
        MenuLayout.setHorizontalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuLayout.createSequentialGroup()
                .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Contacts)
                    .addComponent(Dashboard)
                    .addComponent(Transactions)
                    .addComponent(Profile)
                    .addComponent(SignOut))
                .addGap(86, 86, 86))
        );
        MenuLayout.setVerticalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(Dashboard)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Contacts, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Transactions)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Profile)
                .addGap(201, 201, 201)
                .addComponent(SignOut)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout NavBarLayout = new javax.swing.GroupLayout(NavBar);
        NavBar.setLayout(NavBarLayout);
        NavBarLayout.setHorizontalGroup(
            NavBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NavBarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(NavBarLayout.createSequentialGroup()
                .addGroup(NavBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(NavBarLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(Logo))
                    .addGroup(NavBarLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(NavBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Message)
                            .addGroup(NavBarLayout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(Avatar)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        NavBarLayout.setVerticalGroup(
            NavBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NavBarLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(Logo)
                .addGap(47, 47, 47)
                .addComponent(Avatar)
                .addGap(32, 32, 32)
                .addComponent(Message)
                .addGap(51, 51, 51)
                .addComponent(Menu, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(157, Short.MAX_VALUE))
        );

        ActionBar.setMaximumSize(new java.awt.Dimension(1240, 185));
        ActionBar.setMinimumSize(new java.awt.Dimension(1240, 185));
        ActionBar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PageName.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        PageName.setForeground(new java.awt.Color(170, 163, 163));
        PageName.setText("TRANSACTIONS");
        ActionBar.add(PageName, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 17, -1, -1));

        txtAbsoluteBalance.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        txtAbsoluteBalance.setForeground(new java.awt.Color(255, 255, 255));
        txtAbsoluteBalance.setText("0 ZAR");
        ActionBar.add(txtAbsoluteBalance, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 20, -1, 30));

        Balance.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/UI/Balance.png"))); // NOI18N
        ActionBar.add(Balance, new org.netbeans.lib.awtextra.AbsoluteConstraints(949, 17, -1, 34));

        Send.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/UI/Send-Button.png"))); // NOI18N
        Send.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SendMouseClicked(evt);
            }
        });
        ActionBar.add(Send, new org.netbeans.lib.awtextra.AbsoluteConstraints(1111, 17, -1, -1));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/Raw.gif"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(NavBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(ActionBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE, 1362, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ActionBar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(432, 432, 432)
                        .addComponent(Background))
                    .addComponent(NavBar, javax.swing.GroupLayout.PREFERRED_SIZE, 895, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SendMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SendMouseClicked
        JOptionPane.showMessageDialog(null, "Heya");
    }//GEN-LAST:event_SendMouseClicked

    private void SignOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignOutMouseClicked
        new Login().setVisible(true);
        this.setVisible(false); 
    }//GEN-LAST:event_SignOutMouseClicked

    private void DashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DashboardMouseClicked
        new Dashboard().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_DashboardMouseClicked

    private void ContactsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ContactsMouseClicked
        new Contacts().setVisible(true);
        this.setVisible(false); 
    }//GEN-LAST:event_ContactsMouseClicked

    private void ProfileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProfileMouseClicked
        new Profile().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ProfileMouseClicked

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
            java.util.logging.Logger.getLogger(Transactions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Transactions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Transactions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Transactions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Transactions().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ActionBar;
    private javax.swing.JLabel Avatar;
    private javax.swing.JLabel Background;
    private javax.swing.JLabel Balance;
    private javax.swing.JLabel Contacts;
    private javax.swing.JLabel Dashboard;
    private javax.swing.JLabel Logo;
    private javax.swing.JPanel Menu;
    private javax.swing.JLabel Message;
    private javax.swing.JPanel NavBar;
    private javax.swing.JLabel PageName;
    private javax.swing.JLabel Profile;
    private javax.swing.JLabel Send;
    private javax.swing.JLabel SignOut;
    private javax.swing.JLabel Transactions;
    private javax.swing.JLabel txtAbsoluteBalance;
    // End of variables declaration//GEN-END:variables
}
