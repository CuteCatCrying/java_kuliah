/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.*;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author LABSIKOMP02
 */
public class FromVCD extends javax.swing.JFrame {
    List<String> aktorList = new ArrayList<String>();
    List<String> kategoriList = new ArrayList<String>();
    List<String> sutradaraList = new ArrayList<String>();
    List<String> publisherList = new ArrayList<String>();
    List<String> vcdList = new ArrayList<String>();
    
    
    /**
     * Creates new form FromVCD
     */
    public FromVCD() {
        initComponents();
        initData();
        isiDataCombo();
        initText();
    }
    
    void initText(){
        txtJudul.setText("");
        txtStok.setText("");
    }
    
    void initData(){
        aktorList.add("Udin");
        aktorList.add("Ucup");
        aktorList.add("Mamang");
        
        kategoriList.add("SU");
        kategoriList.add("BO");
        kategoriList.add("A");
        kategoriList.add("R");
        
        sutradaraList.add("Suradang");
        sutradaraList.add("Dadang");
        sutradaraList.add("Jarwo");
        
        publisherList.add("EA");
        publisherList.add("Konami");
        publisherList.add("Ubisoft");
        publisherList.add("Rokstar");
        ///////////////////////////////////////////////
    }
    
    void isiDataCombo(){
        /// Isi combo box aktor
        String[] aktorList = {"Udin", "Ucup", "Mamang"};
        cboAktor.removeAllItems();
        for(int i=0; i<aktorList.length; i++){
            cboAktor.addItem(aktorList[i]);
        }
        
        /// Isi combo box sutradara
        cboSutradara.removeAllItems();
        for(String s : sutradaraList){
            cboSutradara.addItem(s);
        }
        
        /// Isi combo box publisher
        cboPublisher.removeAllItems();
        for(String p : publisherList){
            cboPublisher.addItem(p);
        }
        
        /// Isi combo box kategori
        cboKategori.removeAllItems();
        for(String k : kategoriList){
            cboKategori.addItem(k);
        }
    }
    
    void insert(String data){
        vcdList.add(data);
    }
    
    void update(int index, String data){
        vcdList.add(index, data);
    }
    
    void delete(int index){
        vcdList.remove(index);
    }
    
    String getVcd(int index){
        return vcdList.get(index);
    }
    
    void showData(){
        javax.swing.table.DefaultTableModel model = 
                (javax.swing.table.DefaultTableModel) tblData.getModel();
        model.setRowCount(0);
        for(VCD vcd : vcdList){
            Object data[]={
                vcd.getJudul(),
                vcd.getAktor().getName(),
                vcd.getSutradara().getName(),
                vcd.getPublisher().getName(),
                vcd.getKategori().getName(),
                vcd.getStok()
            };
            model.addRow(data);
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

        jScrollBar1 = new javax.swing.JScrollBar();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        cboAktor = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cboSutradara = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        cboKategori = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        cboPublisher = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        txtStok = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtJudul = new javax.swing.JTextField();
        btnInsert = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblData = new javax.swing.JTable();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        cboAktor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboAktor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboAktorActionPerformed(evt);
            }
        });
        getContentPane().add(cboAktor);
        cboAktor.setBounds(90, 60, 290, 20);

        jLabel1.setText("Aktor");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 60, 70, 14);

        jLabel2.setText("Sutradara");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 90, 70, 14);

        cboSutradara.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(cboSutradara);
        cboSutradara.setBounds(90, 90, 290, 20);

        jLabel3.setText("Publisher");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 120, 70, 14);

        cboKategori.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboKategori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboKategoriActionPerformed(evt);
            }
        });
        getContentPane().add(cboKategori);
        cboKategori.setBounds(90, 150, 290, 20);

        jLabel4.setText("Kategori");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 150, 70, 14);

        cboPublisher.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(cboPublisher);
        cboPublisher.setBounds(90, 120, 290, 20);

        jLabel5.setText("Stok");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(10, 180, 70, 14);

        txtStok.setText("jTextField1");
        getContentPane().add(txtStok);
        txtStok.setBounds(90, 180, 290, 25);

        jLabel6.setText("Judul");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(10, 30, 70, 14);

        txtJudul.setText("jTextField2");
        getContentPane().add(txtJudul);
        txtJudul.setBounds(90, 30, 290, 25);

        btnInsert.setText("Insert");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });
        getContentPane().add(btnInsert);
        btnInsert.setBounds(10, 220, 70, 23);

        tblData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Judul", "Aktor", "Sutradara", "Publisher", "Kategori", "Stok"
            }
        ));
        tblData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDataMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblData);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(10, 250, 600, 230);

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate);
        btnUpdate.setBounds(80, 220, 70, 23);

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDelete);
        btnDelete.setBounds(150, 220, 70, 23);

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancel);
        btnCancel.setBounds(220, 220, 70, 23);

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit);
        btnExit.setBounds(290, 220, 70, 23);

        setSize(new java.awt.Dimension(636, 545));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cboAktorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboAktorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboAktorActionPerformed

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        // TODO add your handling code here:
        VCD vcd = new VCD();
        vcd.setJudul(txtJudul.getText());
        vcd.setAktor(aktorList.get(cboAktor.getSelectedIndex()));
        vcd.setSutradara(sutradaraList.get(cboSutradara.getSelectedIndex()));
        vcd.setPublisher(publisherList.get(cboPublisher.getSelectedIndex()));
        vcd.setKategori(kategoriList.get(cboKategori.getSelectedIndex()));
        vcd.setStock(Integer.parseInt(txtStok.getText()));
        
        insert(vcd);
        showData();
    }//GEN-LAST:event_btnInsertActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        VCD vcd = new VCD();
        vcd.setJudul(txtJudul.getText());
        vcd.setAktor(aktorList.get(cboAktor.getSelectedIndex()));
        vcd.setSutradara(sutradaraList.get(cboSutradara.getSelectedIndex()));
        vcd.setPublisher(publisherList.get(cboPublisher.getSelectedIndex()));
        vcd.setKategori(kategoriList.get(cboKategori.getSelectedIndex()));
        vcd.setStock(Integer.parseInt(txtStok.getText()));
        
        update(tblData.getSelectedRow(),vcd);
        showData();
        
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExitActionPerformed

    private void cboKategoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboKategoriActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboKategoriActionPerformed

    private void tblDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDataMouseClicked
        // TODO add your handling code here:
        VCD vcd = getVcd(tblData.getSelectedRow());
        txtJudul.setText(vcd.getJudul());
        cboAktor.setSelectedIndex(aktorList.indexOf(vcd.getAktor));
        cboKategori.setSelectedIndex(kategoriList.indexOf(vcd.getKategori));
        cboSutradara.setSelectedIndex(sutradaraList.indexOf(vcd.getSutradara));
        cboPublisher.setSelectedIndex(publisherList.indexOf(vcd.getPublisher));
        txtStok.setText(vcd.getStok()+"");
        
    }//GEN-LAST:event_tblDataMouseClicked

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        delete(tblData.getSelectedRow());
        showData();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        initText();        
    }//GEN-LAST:event_btnCancelActionPerformed

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
            java.util.logging.Logger.getLogger(FromVCD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FromVCD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FromVCD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FromVCD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FromVCD().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox cboAktor;
    private javax.swing.JComboBox cboKategori;
    private javax.swing.JComboBox cboPublisher;
    private javax.swing.JComboBox cboSutradara;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTable tblData;
    private javax.swing.JTextField txtJudul;
    private javax.swing.JTextField txtStok;
    // End of variables declaration//GEN-END:variables
}
