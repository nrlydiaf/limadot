/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projectds;

import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.PreparedStatement;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
/**
 *
 * @author Asus
 */
public class PlayerList extends javax.swing.JFrame {
    
    private Team team;

    /**
     * Creates new form PlayerList
     */
    public PlayerList() {
        initComponents();
        this.setSize(780,500);
        this.team = new Team();
        populateTable();
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Remove = new javax.swing.JButton();
        HomePage = new javax.swing.JButton();
        Add = new javax.swing.JButton();
        Renew = new javax.swing.JButton();
        

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setPreferredSize(new java.awt.Dimension(780, 500));

        jTable1.setBackground(new java.awt.Color(204, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Age", "Height", "Weight", "Position", "Salary", "Points", "Rebounds", "Assists"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        Remove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectds/Delete button.jpg"))); // NOI18N
        Remove.setText("Remove");
        Remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveActionPerformed(evt);
            }
        });

        HomePage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectds/Homepageimage.jpg"))); // NOI18N
        HomePage.setText("Home Page");
        HomePage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomePageActionPerformed(evt);
            }
        });
        
        Add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectds/Addbuttonimage.png"))); // NOI18N
        Add.setText("Add To Injury Reserve");
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });
        
        Renew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectds/Addbuttonimage.png"))); // NOI18N
        Renew.setText("Renew Contract");
        Renew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RenewContractActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);

        jPanel1Layout.setHorizontalGroup(
    jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 760, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(Add, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(Remove, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(HomePage, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(Renew, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addContainerGap())
);

        
jPanel1Layout.setVerticalGroup(
    jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(Add)
                .addComponent(Remove)
                .addComponent(HomePage)
                .addComponent(Renew))
            .addGap(17, 17, 17))
);

javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
getContentPane().setLayout(layout);

layout.setHorizontalGroup(
    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
);

layout.setVerticalGroup(
    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE)
            .addContainerGap())
);


        pack();
    }// </editor-fold>  
    
    private void AddActionPerformed(java.awt.event.ActionEvent evt) {
    int selectedRow = jTable1.getSelectedRow();
    
    if (selectedRow != -1) {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        String playerId = model.getValueAt(selectedRow, 0).toString();
        
        InjuredPlayerManager.transferPlayers(playerId);
        JOptionPane.showMessageDialog(this, "Player successfully added to Injury Reserve Table.");
    } else {
        JOptionPane.showMessageDialog(this, "Please select a player to add to Injury Table.", "No Selection", JOptionPane.WARNING_MESSAGE);
    }
}
    
    private void RenewContractActionPerformed(java.awt.event.ActionEvent evt) 
    {
        int selectedRow = jTable1.getSelectedRow();
    
    if (selectedRow != -1) {
        
    
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        String playerId = model.getValueAt(selectedRow, 0).toString();
        
        RenewContractManager.transferPlayers(playerId);
        JOptionPane.showMessageDialog(this, "Player successfully added to Contract Renewal Queue.");
        populateTable();
        
        RenewContractManager renewContract = new RenewContractManager();
        renewContract.setVisible(true);
        this.setVisible(false);
        
    } else {
        JOptionPane.showMessageDialog(this, "Please select a player to renew cotract.", "No Selection", JOptionPane.WARNING_MESSAGE);
    }
    } 
    
    private void RemoveActionPerformed(java.awt.event.ActionEvent evt) {                                       
    int selectedRow = jTable1.getSelectedRow();
    if (selectedRow != -1 && team.getTotalPlayers()>=10 && team.getForwardCount()>=2 && team.getGuardCount()>=2 && team.getCenterCount()>=2) {
        // Get the player ID from the selected row
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        String playerId = model.getValueAt(selectedRow, 0).toString();

        // Confirm deletion
        int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to remove this player?", "Confirm Removal", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            try {
                // Connect to the MySQL databases
                Connection basketballTeamConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/basketball_team", "root", "Rosni_tam@79");
                Connection injuryReserveConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/injury_reserve", "root", "Rosni_tam@79");
                Connection renewContractConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/renew_contract", "root", "Rosni_tam@79");

                // Delete from basketball_team database
                String deleteFromBasketballTeamSql = "DELETE FROM players WHERE id = ?";
                PreparedStatement deleteFromBasketballTeamStmt = basketballTeamConn.prepareStatement(deleteFromBasketballTeamSql);
                deleteFromBasketballTeamStmt.setString(1, playerId);
                deleteFromBasketballTeamStmt.executeUpdate();
                deleteFromBasketballTeamStmt.close();

                // Delete from injury_reserve database
                String deleteFromInjuryReserveSql = "DELETE FROM players WHERE id = ?";
                PreparedStatement deleteFromInjuryReserveStmt = injuryReserveConn.prepareStatement(deleteFromInjuryReserveSql);
                deleteFromInjuryReserveStmt.setString(1, playerId);
                deleteFromInjuryReserveStmt.executeUpdate();
                deleteFromInjuryReserveStmt.close();

                // Delete from renew_contract database
                String deleteFromRenewContractSql = "DELETE FROM players WHERE id = ?";
                PreparedStatement deleteFromRenewContractStmt = renewContractConn.prepareStatement(deleteFromRenewContractSql);
                deleteFromRenewContractStmt.setString(1, playerId);
                deleteFromRenewContractStmt.executeUpdate();
                deleteFromRenewContractStmt.close();

                // Close connections
                basketballTeamConn.close();
                injuryReserveConn.close();
                renewContractConn.close();

                // Remove the row from the table model
                model.removeRow(selectedRow);

                // Show success message
                JOptionPane.showMessageDialog(this, "Player removed successfully.");
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "An error occurred while removing the player.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    else{
        JOptionPane.showMessageDialog(this, "Cannot remove player because each team must consists of 10 players.");
    }
}

    private void HomePageActionPerformed(java.awt.event.ActionEvent evt) {                                         
        HomePage home=new HomePage();
        home.setVisible(true);
        this.setVisible(false);
    }                                        

    public void setTeam(Team team) {
        this.team = team;
    }
    
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
            java.util.logging.Logger.getLogger(PlayerList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlayerList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlayerList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlayerList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PlayerList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton HomePage;
    private javax.swing.JButton Remove;
    private javax.swing.JButton Add;
    private javax.swing.JButton Renew;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration                   

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0); // Clear existing rows
        
        try {
            // Connect to the MySQL database
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/basketball_team", "root", "Rosni_tam@79");
            Statement statement = connection.createStatement();
            
            // Execute a query to retrieve all player data
            ResultSet resultSet = statement.executeQuery("SELECT * FROM players");
            
            // Populate the table with the data
            while (resultSet.next()) {
                String id = resultSet.getString("ID");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");
                double height = resultSet.getDouble("height");
                double weight = resultSet.getDouble("weight");
                String position = resultSet.getString("position");
                double salary = resultSet.getDouble("salary");
                double points = resultSet.getDouble("points");
                double rebounds = resultSet.getDouble("rebounds");
                double assists = resultSet.getDouble("assists");
                
                // Add the player data to the table model
                model.addRow(new Object[] { id, name, age, height, weight, position, salary, points, rebounds, assists });
            }
            
            // Close resources
            resultSet.close();
            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
    
}