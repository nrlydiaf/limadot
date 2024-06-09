
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
//LAMA PUNYA
package ds_projectreal;

import java.awt.Color;
import static java.awt.Font.BOLD;
import static java.awt.Font.TRUETYPE_FONT;
import javax.swing.JButton;
import javax.swing.JLabel;


public class HomePage extends javax.swing.JFrame {

    /**
     * Creates new form HomePage
     */
    public HomePage() {
        initComponents();
        this.setSize(780,500);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

       jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        JLabel titleLabel = new javax.swing.JLabel();
        JLabel homepageLabel = new javax.swing.JLabel();
        Group_Formation = new javax.swing.JButton();
        Search_player = new javax.swing.JButton();
        Maps = new javax.swing.JButton();
        injuryReserveButton = new javax.swing.JButton();
        contractRenewal = new javax.swing.JButton();
        playerRanking = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new Color(0x0A1E1E));
        jPanel1.setPreferredSize(new java.awt.Dimension(780, 500));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ds_projectreal/nbawall4.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");

        titleLabel.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", BOLD, 35)); // NOI18N
        titleLabel.setForeground(new Color(0xE6FF2B));
        titleLabel.setText("NBA GENERAL MANAGER: ");
        titleLabel.setPreferredSize(new java.awt.Dimension(380, 48));
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        homepageLabel.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 30)); // NOI18N
        homepageLabel.setForeground(new Color(0xE6FF2B));
        homepageLabel.setText("HOMEPAGE");
        homepageLabel.setPreferredSize(new java.awt.Dimension(380, 35));
        homepageLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jPanel2.setBackground(new Color(0x0A1E1E));
        jPanel2.setPreferredSize(new java.awt.Dimension(400, 500));

        Group_Formation.setBackground(new Color(0x898A8D));
        Group_Formation.setFont(new java.awt.Font("Courier New", BOLD, 20)); // NOI18N
        Group_Formation.setForeground(new Color(0x0000));
        Group_Formation.setText("Form Group");
        Group_Formation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Group_FormationActionPerformed(evt);
            }
        });

        Search_player.setBackground(new Color(0xC0D8D7));
        Search_player.setFont(new java.awt.Font("Courier New", BOLD, 20)); // NOI18N
        Search_player.setText("Search Player");
        Search_player.setForeground(new Color(0x0000));
        Search_player.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Search_playerActionPerformed(evt);
            }
        });

        Maps.setBackground(new Color(0x898A8D));
        Maps.setFont(new java.awt.Font("Courier New", BOLD, 20)); // NOI18N
        Maps.setText("Maps");
        Maps.setForeground(new Color(0x00000));
        Maps.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MapsActionPerformed(evt);
            }
        });

        injuryReserveButton.setBackground(new Color(0xC0D8D7));
        injuryReserveButton.setFont(new java.awt.Font("Courier New", BOLD, 20)); // NOI18N
        injuryReserveButton.setText("Injury Reserve");
        injuryReserveButton.setForeground(new Color(0x0000));
        injuryReserveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                injuryReserveButtonActionPerformed(evt);
            }
        });

        contractRenewal.setBackground(new Color(0x898A8D));
        contractRenewal.setFont(new java.awt.Font("Courier New", BOLD, 20)); // NOI18N
        contractRenewal.setText("Contract Extension Queue");
        contractRenewal.setForeground(new Color(0x0000));
        contractRenewal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contractRenewalButtonActionPerformed(evt);
            }
        });

        playerRanking.setBackground(new Color(0xC0D8D7));
        playerRanking.setFont(new java.awt.Font("Courier New", BOLD, 20)); // NOI18N
        playerRanking.setText("Player Ranking");
        playerRanking.setForeground(new Color(0x0000));
        playerRanking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playerRankingButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE)
                                        .addComponent(homepageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE)
                                        .addComponent(Group_Formation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Search_player, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Maps, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(injuryReserveButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(contractRenewal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(playerRanking, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGap(35, 35, 35)
                                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(homepageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)
                                .addComponent(Group_Formation)
                                .addGap(10, 10, 10)
                                .addComponent(Search_player)
                                .addGap(10, 10, 10)
                                .addComponent(Maps)
                                .addGap(10, 10, 10)
                                .addComponent(injuryReserveButton)
                                .addGap(10, 10, 10)
                                .addComponent(contractRenewal)
                                .addGap(10, 10, 10)
                                .addComponent(playerRanking)
                                .addContainerGap(70, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 0, Short.MAX_VALUE)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, 0)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, 0)
        );



        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Group_FormationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Group_FormationActionPerformed
        Player1 player1info=new Player1();
        player1info.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_Group_FormationActionPerformed

    private void Search_playerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Search_playerActionPerformed
        DynamicSearching search = new DynamicSearching();
        search.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_Search_playerActionPerformed

    private void MapsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MapsActionPerformed
        
        Graph<String,Integer> nbaGraph=new Graph<>();
        String A="San Antonio(Spurs)";
        String B="Golden State(Warriors)";
        String C="Boston(Celtics)";
        String D="Miami(Heat)";
        String E="Los Angeles(Lakers)";
        String F="Phoenix(Suns)";
        String G="Orlando(Magic)";
        String H="Denver(Nuggets)";
        String I="Oklahoma City(Thunder)";
        String J="Houston(Rockets)";
        
        String[] cities={A, B, C, D, E, F, G, H, I, J};
        //String[] teamNames={"Spurs", "Warriors", "Celtics", "Heat", "Lakers", "Suns", "Magic", "Nuggets", "Thunder", "Rockets"};
        for(String i:cities)
            nbaGraph.addVertex(i);
//        for(String j:teamNames)
//            nbaGraph.addVertex(j);
        
        System.out.println("Cities and their vertices: ");
        for(int i=0;i<nbaGraph.getSize();i++)
            System.out.println(i+" : "+nbaGraph.getVertex(i));
        
        System.out.println("");
        System.out.println("Creating graph: ");
        nbaGraph.addUndirectedEdge(A, F, 500);
        nbaGraph.addUndirectedEdge(A, G, 1137);
        nbaGraph.addUndirectedEdge(A, I, 678);
        nbaGraph.addUndirectedEdge(A, J, 1137);
        nbaGraph.addUndirectedEdge(B,E,554);
        nbaGraph.addUndirectedEdge(B,H,1507);
        nbaGraph.addUndirectedEdge(B,I,2214);
        nbaGraph.addUndirectedEdge(C,D,3045);
        nbaGraph.addUndirectedEdge(C,H,2845);
        nbaGraph.addUndirectedEdge(C,J,2584);
        nbaGraph.addUndirectedEdge(D,G,268);
        nbaGraph.addUndirectedEdge(E,F,577);
        nbaGraph.addUndirectedEdge(E,I,1901);
        nbaGraph.addUndirectedEdge(G,J,458);
        nbaGraph.addUndirectedEdge(H,I,942);
        nbaGraph.addUndirectedEdge(I,J,778);
        

        nbaGraph.printEdges();
        
        System.out.println("");
        //System.out.println(nbaGraph.getNeighbours(A));
        System.out.println("Depth-First-Search Algorithm: ");
        nbaGraph.DFS(A);
//        
        System.out.println("");
        System.out.println("Breadth-First-Search Algorithm: ");
        nbaGraph.BFS(A);
        
        new NBAMapCity(nbaGraph).setVisible(true);
        //new NBAMapCity().setVisible(true);
        
        NBAMapCity map = new NBAMapCity(nbaGraph);
        map.setVisible(true);
        this.setVisible(false);

    }

    
    private void injuryReserveButtonActionPerformed(java.awt.event.ActionEvent evt) { 
    // Open the Injury Reserve management window when the button is clicked
    InjuredPlayerTable injuryReserve = new InjuredPlayerTable();
    injuryReserve.setVisible(true);
    this.setVisible(false);
    }
    
    private void contractRenewalButtonActionPerformed(java.awt.event.ActionEvent evt) { 
    // Open the Injury Reserve management window when the button is clicked
    RenewContractManager contractRenew = new RenewContractManager();
    contractRenew.setVisible(true);
    this.setVisible(false);
    }
    
     private void playerRankingButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // Open the Player Ranking window when the button is clicked
        PlayerRanking PlayerRanking = new PlayerRanking();
        PlayerRanking.setVisible(true);
        this.setVisible(false);
       
    }




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
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Group_Formation;
    private javax.swing.JButton Maps;
    private javax.swing.JButton Search_player;
    private javax.swing.JButton injuryReserveButton;
    private javax.swing.JButton contractRenewal;
    private javax.swing.JButton playerRanking;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel homepageLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;

    // End of variables declaration//GEN-END:variables
}
