/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author Shimal
 */
public class Dashboard extends javax.swing.JFrame {

    /**
     * Creates new form Dashboard
     */
    public Dashboard() {
        initComponents();
    }

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
        Header = new javax.swing.JPanel();
        infoBlockGreen = new javax.swing.JLabel();
        infoBlockBlue = new javax.swing.JLabel();
        infoBlockPurple = new javax.swing.JLabel();
        ActionBar = new javax.swing.JPanel();
        PageName = new javax.swing.JLabel();
        Balance = new javax.swing.JLabel();
        Send = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(241, 241, 241));
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setMaximumSize(new java.awt.Dimension(1600, 900));
        setMinimumSize(new java.awt.Dimension(1600, 900));
        setName("Dashboard"); // NOI18N
        setPreferredSize(new java.awt.Dimension(1600, 900));
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

        Dashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/UI/menu/Dashboard-Selected.png"))); // NOI18N

        Contacts.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/UI/menu/Contacts-Unselected.png"))); // NOI18N

        Transactions.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/UI/menu/Transactions-Unselected.png"))); // NOI18N

        Profile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/UI/menu/Profile-Unselected.png"))); // NOI18N

        javax.swing.GroupLayout MenuLayout = new javax.swing.GroupLayout(Menu);
        Menu.setLayout(MenuLayout);
        MenuLayout.setHorizontalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Contacts)
            .addComponent(Dashboard)
            .addComponent(Transactions)
            .addComponent(Profile)
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
                .addComponent(Menu, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(176, Short.MAX_VALUE))
        );

        Header.setForeground(new java.awt.Color(255, 51, 51));
        Header.setMaximumSize(new java.awt.Dimension(1240, 185));
        Header.setMinimumSize(new java.awt.Dimension(1240, 185));

        infoBlockGreen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/UI/Green-Header.png"))); // NOI18N

        infoBlockBlue.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/UI/Blue-Header.png"))); // NOI18N

        infoBlockPurple.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/UI/Purple-Header.png"))); // NOI18N

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(infoBlockGreen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(infoBlockBlue)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(infoBlockPurple)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(infoBlockGreen)
                    .addComponent(infoBlockBlue)
                    .addComponent(infoBlockPurple))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ActionBar.setMaximumSize(new java.awt.Dimension(1240, 185));
        ActionBar.setMinimumSize(new java.awt.Dimension(1240, 185));

        PageName.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        PageName.setForeground(new java.awt.Color(170, 163, 163));
        PageName.setText("DASHBOARD");

        Balance.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/UI/Balance.png"))); // NOI18N

        Send.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/UI/Send-Button.png"))); // NOI18N
        Send.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SendMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout ActionBarLayout = new javax.swing.GroupLayout(ActionBar);
        ActionBar.setLayout(ActionBarLayout);
        ActionBarLayout.setHorizontalGroup(
            ActionBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ActionBarLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(PageName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 807, Short.MAX_VALUE)
                .addComponent(Balance)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Send)
                .addGap(247, 247, 247))
        );
        ActionBarLayout.setVerticalGroup(
            ActionBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ActionBarLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(ActionBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PageName)
                    .addGroup(ActionBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(Send, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Balance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(NavBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ActionBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ActionBar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(NavBar, javax.swing.GroupLayout.PREFERRED_SIZE, 895, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SendMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SendMouseClicked
        JOptionPane.showMessageDialog(null, "Heya");
    }//GEN-LAST:event_SendMouseClicked

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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ActionBar;
    private javax.swing.JLabel Avatar;
    private javax.swing.JLabel Balance;
    private javax.swing.JLabel Contacts;
    private javax.swing.JLabel Dashboard;
    private javax.swing.JPanel Header;
    private javax.swing.JLabel Logo;
    private javax.swing.JPanel Menu;
    private javax.swing.JLabel Message;
    private javax.swing.JPanel NavBar;
    private javax.swing.JLabel PageName;
    private javax.swing.JLabel Profile;
    private javax.swing.JLabel Send;
    private javax.swing.JLabel Transactions;
    private javax.swing.JLabel infoBlockBlue;
    private javax.swing.JLabel infoBlockGreen;
    private javax.swing.JLabel infoBlockPurple;
    // End of variables declaration//GEN-END:variables
}
