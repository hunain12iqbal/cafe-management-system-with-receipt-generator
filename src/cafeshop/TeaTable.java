/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafeshop;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Hp
 */
public class TeaTable extends javax.swing.JFrame {

    /**
     * Creates new form TeaTable
     */
     MyConnection m;
    DefaultTableModel model;
    public TeaTable() {
        initComponents();
         m = new MyConnection();
         
          try{
       String query = "select *from shop4 ";
           
           ResultSet rs  = m.st.executeQuery(query);
            
            while(rs.next()){
                
                String id = rs.getString("id");
                String price = rs.getString("price");
                String date1 = rs.getString("date");
      ArrayList<user> list1 = new ArrayList();
            model = (DefaultTableModel) tbldata.getModel();
    Object[] row = new Object[3];
             
            row[0] = id;
            row[1] = price;    
            row[2] = date1;    
                model.addRow(row);
            }
   }
        catch(Exception e){
            System.out.println(e);
        }

      
    
        
   
    }
    
 
    
    
   
   void showrecod(){
          try{
       String query = "select *from shop4 ";
           
           ResultSet rs  = m.st.executeQuery(query);
            
            while(rs.next()){
                
                String id = rs.getString("id");
                String price = rs.getString("price");
                String date1 = rs.getString("date");
      ArrayList<user> list1 = new ArrayList();
            model = (DefaultTableModel) tbldata.getModel();
    Object[] row = new Object[3];
             
            row[0] = id;
            row[1] = price;    
            row[2] = date1;    
                model.addRow(row);
            }
   }
        catch(Exception e){
            System.out.println(e);
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

        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        txtsearch = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbldata = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        dele = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        txtsearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtsearchMouseReleased(evt);
            }
        });
        txtsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsearchActionPerformed(evt);
            }
        });

        tbldata.setBackground(new java.awt.Color(102, 102, 255));
        tbldata.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        tbldata.setForeground(new java.awt.Color(0, 0, 0));
        tbldata.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Receipt No", "Total Amount", "Date"
            }
        ));
        tbldata.getTableHeader().setReorderingAllowed(false);
        tbldata.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbldataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbldata);

        jButton3.setText("Show Record");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        dele.setIcon(new javax.swing.ImageIcon("C:\\Users\\Hunain\\Downloads\\button (1).png")); // NOI18N
        dele.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleMouseClicked(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setForeground(new java.awt.Color(0, 0, 255));
        jButton1.setText("Search");
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addGap(122, 122, 122)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(205, 205, 205)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 252, Short.MAX_VALUE)
                .addComponent(dele)
                .addGap(223, 223, 223))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(21, 21, 21)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3)
                        .addGap(44, 44, 44))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dele)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        setSize(new java.awt.Dimension(1016, 680));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tbldataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbldataMouseClicked
        // TODO add your handling code here:
      
    }//GEN-LAST:event_tbldataMouseClicked

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        tbldata.clearSelection();
    }//GEN-LAST:event_formMouseClicked

    private void txtsearchMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtsearchMouseReleased
        // TODO add your handling code here:
       
      
    }//GEN-LAST:event_txtsearchMouseReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        //String search = txtsearch.getText().toString();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
        tbldata.setRowSorter(tr);
        //tr.setRowFilter(RowFilter.regexFilter(search));
       
        String id = txtsearch.getText();
         try{
       String query = "select *from shop4 where id = ? ";
           PreparedStatement pst = m.cc.prepareStatement(query);
           pst.setString(1, id);
           ResultSet rs  = pst.executeQuery();
          while(rs.next()){
                
                 String id1 = rs.getString("id");
                 String price = rs.getString("price");
                 String da = rs.getString("date");
                 
                 ArrayList<user> list1 = new ArrayList();
            model = (DefaultTableModel) tbldata.getModel();
    Object[] row = new Object[3];
             
            row[0] = id1;
            row[1] = price;    
            row[2] = da;    
               
                
                DefaultTableModel model = ( DefaultTableModel)tbldata.getModel();
             model.setRowCount(0); 
                      
            model.addRow(row);
            
            
          }
           
         }
         catch(Exception e){
             JOptionPane.showMessageDialog(this, "invalid number");
         }
        
    }//GEN-LAST:event_jButton1ActionPerformed
 PreparedStatement pst ;
    private void deleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleMouseClicked
        
        int row = tbldata.getSelectedRow();
        String values = tbldata.getModel().getValueAt(row, 0).toString();
        String query = "DELETE FROM SHOP4 WHERE id  = '"+ values+"'";
         try {
             pst = m.cc.prepareStatement(query);
             pst.executeUpdate();
             DefaultTableModel model = ( DefaultTableModel)tbldata.getModel();
             model.setRowCount(0);
             showrecod();
             
             
             
         } catch (SQLException ex) {
             System.out.println(ex);
         }
    }//GEN-LAST:event_deleMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
         DefaultTableModel model = ( DefaultTableModel)tbldata.getModel();
             model.setRowCount(0);
             showrecod();
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsearchActionPerformed

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
            java.util.logging.Logger.getLogger(TeaTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TeaTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TeaTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TeaTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TeaTable().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel dele;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tbldata;
    private javax.swing.JTextField txtsearch;
    // End of variables declaration//GEN-END:variables
}
