
package project;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;
import pack.Etudiant;

public class Table extends javax.swing.JFrame {

    List <Etudiant> students = new ArrayList<>();
  
    public Table() {
        initComponents();
        
       
    }
    
    // Methodes Fonctionnelles : 
    
    public void Fill(){
    
    Object [][] data = new Object [students.size()][6];
    
    for ( int i = 0 ; i < students.size() ; i++ ){
        
        data [i][0] = students.get(i).getCode() ; 
        data [i][1] = students.get(i).getNom() ; 
        data [i][2] = students.get(i).getEmail() ; 
        data [i][3] = students.get(i).getVille() ; 
        data [i][4] = students.get(i).isMale() == true ? "Male" : "Femelle" ; 
        data [i][5] = Arrays.toString( students.get(i).getLangues()); 
        
    }
    
    jTable.setModel(new javax.swing.table.DefaultTableModel(
            
            data,
            new String [] {
                "Code", "Nom", "Email", "Ville", "Genre", "Langues Parlées"
            }
                
        ));    
    
    
}
    public void Clear(){
        
        txtCode.setText(null);
        txtCode.requestFocus();
        txtMdp.setText(null);
        txtNom.setText(null);
        txtEmail.setText(null);
        ComboBoxVille.setSelectedIndex(0);
        radioMale.setSelected(true);
        CheckBoxEN.setSelected(false);
        CheckBoxFr.setSelected(false);
        CheckBoxEs.setSelected(false);
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtMdp = new javax.swing.JTextField();
        txtNom = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtCode = new javax.swing.JTextField();
        ComboBoxVille = new javax.swing.JComboBox<>();
        radioMale = new javax.swing.JRadioButton();
        radioFemelle = new javax.swing.JRadioButton();
        CheckBoxEs = new javax.swing.JCheckBox();
        CheckBoxFr = new javax.swing.JCheckBox();
        CheckBoxEN = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        btnAdd = new javax.swing.JButton();
        btnFind = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Exercice ");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Code Etudiant ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        jLabel2.setText("Mot de passe");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, -1, -1));

        jLabel3.setText("Nom ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, -1, -1));

        jLabel4.setText("Email ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, -1, -1));

        jLabel5.setText("Ville  ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, -1));

        jLabel6.setText("Genre ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, -1));

        jLabel7.setText("Langues parlées");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, -1, -1));

        txtMdp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMdpActionPerformed(evt);
            }
        });
        getContentPane().add(txtMdp, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 130, -1));

        txtNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomActionPerformed(evt);
            }
        });
        getContentPane().add(txtNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 130, -1));

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        getContentPane().add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 130, -1));

        txtCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodeActionPerformed(evt);
            }
        });
        getContentPane().add(txtCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 130, -1));

        ComboBoxVille.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Agadir", "Marrakech", "Casablanca", "Rabat", "Tanger" }));
        getContentPane().add(ComboBoxVille, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 130, -1));

        buttonGroup1.add(radioMale);
        radioMale.setText("Male");
        getContentPane().add(radioMale, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, -1, -1));

        buttonGroup1.add(radioFemelle);
        radioFemelle.setText("Femelle");
        getContentPane().add(radioFemelle, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, -1, -1));

        CheckBoxEs.setText("Espagnol");
        getContentPane().add(CheckBoxEs, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, -1, -1));

        CheckBoxFr.setText("Français");
        getContentPane().add(CheckBoxFr, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 230, -1, -1));

        CheckBoxEN.setText("Anglais");
        getContentPane().add(CheckBoxEN, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, -1, -1));

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Code", "Nom", "Email", "Ville", "Genre", "Langues P"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable);
        if (jTable.getColumnModel().getColumnCount() > 0) {
            jTable.getColumnModel().getColumn(0).setResizable(false);
            jTable.getColumnModel().getColumn(1).setResizable(false);
            jTable.getColumnModel().getColumn(2).setResizable(false);
            jTable.getColumnModel().getColumn(3).setResizable(false);
            jTable.getColumnModel().getColumn(4).setResizable(false);
            jTable.getColumnModel().getColumn(5).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 720, 90));

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, 100, -1));

        btnFind.setText("Find");
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });
        getContentPane().add(btnFind, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 60, 100, -1));

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 100, 100, -1));

        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        getContentPane().add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 140, 100, -1));

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 180, 100, -1));

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 220, 100, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtMdpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMdpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMdpActionPerformed

    private void txtNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodeActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed

    Etudiant e = new Etudiant();
    
    e.setCode(txtCode.getText());
    e.setMdp(txtMdp.getText());
    e.setNom(txtNom.getText());
    e.setEmail(txtEmail.getText());
    e.setVille(ComboBoxVille.getSelectedItem().toString());
    e.setMale(radioMale.isSelected());
    
    //Langues :
    
    ArrayList<String> Langues = new ArrayList<>();
    if(CheckBoxEN.isSelected() == true)
        Langues.add(CheckBoxEN.getText());
    if(CheckBoxFr.isSelected() == true)
        Langues.add(CheckBoxFr.getText());
    if(CheckBoxEs.isSelected() == true)
        Langues.add(CheckBoxEs.getText());
    
    // Affichage Langues dans la table :
    
    String[] options = new String[Langues.size()];
    for ( int i = 0 ; i < Langues.size() ; i++ ){
        options[i] = Langues.get(i) ;
    }
    e.setLangues(options);
    
    students.add(e);
    Clear();
    Fill();


        
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed

        String code = JOptionPane.showInputDialog( this , "Entrez le code Etudiant" , "Recherche" , 1 );
        
         students.forEach(student ->
                        {
                                 if (student.getCode().equalsIgnoreCase(code))
                                 {
                                     txtCode.setText(student.getCode());
                                     txtMdp.setText(student.getMdp());
                                     txtNom.setText(student.getNom());
                                     txtEmail.setText(student.getEmail());
                                     ComboBoxVille.setSelectedItem(student.getVille());
                                     radioMale.setSelected(student.isMale());
                                     for(String langue : student.getLangues())
                                     {
                                         if(langue.equalsIgnoreCase(CheckBoxEN.getText()))
                                             CheckBoxEN.setSelected(true);
                                         if(langue.equalsIgnoreCase(CheckBoxFr.getText()))
                                             CheckBoxFr.setSelected(true);
                                         if(langue.equalsIgnoreCase(CheckBoxEs.getText()))
                                             CheckBoxEs.setSelected(true);
                                     }
                                     //rendre le bouton update actif
                                     btnUpdate.setEnabled(true);
                                     
                                 }
                        }
               );

    }//GEN-LAST:event_btnFindActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed

        String code = JOptionPane.showInputDialog(this, "Entrez le code Etudiant", "Delete", JOptionPane.OK_CANCEL_OPTION);
        
        Iterator <Etudiant> it = students.iterator();
        while(it.hasNext()){
            Etudiant student = it.next();
            if( student.getCode().equalsIgnoreCase(code)){
                students.remove(student);
                break;
                
            }
        }
        
        Fill();
        
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed

        Clear();

    }//GEN-LAST:event_btnResetActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed

        //String code = JOptionPane.showInputDialog(this, "Are you sure you want to exit", "Exit", JOptionPane.OK_CANCEL_OPTION);
        int code = JOptionPane.showConfirmDialog(this, "Are you sure you want to exit", "Exit", JOptionPane.OK_CANCEL_OPTION);

        System.exit(0);
        

    }//GEN-LAST:event_btnExitActionPerformed

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
            java.util.logging.Logger.getLogger(Table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Table().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox CheckBoxEN;
    private javax.swing.JCheckBox CheckBoxEs;
    private javax.swing.JCheckBox CheckBoxFr;
    private javax.swing.JComboBox<String> ComboBoxVille;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnFind;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnUpdate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JRadioButton radioFemelle;
    private javax.swing.JRadioButton radioMale;
    private javax.swing.JTextField txtCode;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtMdp;
    private javax.swing.JTextField txtNom;
    // End of variables declaration//GEN-END:variables
}
