/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package dictionary;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author Thanh Tung Hoang
 */
public class DictionaryJFrame extends javax.swing.JFrame {

    private final DefaultListModel listModel;
    List<Dictionary> wordList = new ArrayList<>();
    int selectId = -1;

    /**
     * Creates new form DictionaryJFrame
     */
    public static int idEdit;
    public static String wordEdit;
    public static String translateEdit;
    public static String exampleEdit;
    public static String exampleTranslateEdit;
    public DictionaryJFrame() {
        this.listModel = new DefaultListModel();

        initComponents();
        showWord();
        setPaddingTextArea();
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
        searchTitle = new javax.swing.JLabel();
        searchInput = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listWord = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        translateField = new javax.swing.JTextArea();
        btnDelete = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dictionary");

        searchTitle.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        searchTitle.setText("Keyword:");

        searchInput.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        searchInput.setText("");
        searchInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchInputActionPerformed(evt);
            }
        });
        searchInput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                searchInputPressedEnter(evt);
            }
        });

        btnSearch.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        listWord.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        listWord.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        listWord.setInheritsPopupMenu(true);
        listWord.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                listWordMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(listWord);

        translateField.setEditable(false);
        translateField.setColumns(20);
        translateField.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        translateField.setLineWrap(true);
        translateField.setRows(5);
        translateField.setWrapStyleWord(true);
        translateField.setInheritsPopupMenu(true);
        jScrollPane2.setViewportView(translateField);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(searchTitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchInput, javax.swing.GroupLayout.PREFERRED_SIZE, 724, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(btnSearch)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(searchTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(searchInput, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                    .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
                    .addComponent(jScrollPane2)))
        );

        btnDelete.setBackground(new java.awt.Color(204, 0, 51));
        btnDelete.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnDeleteMousePressed(evt);
            }
        });

        btnEdit.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnEdit.setText("Edit");

        btnAdd.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnAdd.setText("Add");
        btnAdd.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnReset.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnReset.setText("Reset");
        btnReset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnResetMousePressed(evt);
            }
        });
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(btnAdd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnReset)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEdit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDelete)
                .addGap(45, 45, 45))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnReset, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(49, 49, 49))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void reloadJframe() {
        listModel.removeAllElements();
        showWord();
        translateField.setText("");
        searchInput.setText("");
    }

    /**
     * Ham show toan bo tu ra list
     */
    private void showWord() {
        wordList = DictionaryManagement.getAll();
        wordList.forEach(dictionary -> {
            listModel.addElement(dictionary.getWord());
        });

        listWord.setModel(listModel);
    }

    /**
     * Set padding cho translate field
     */
    private void setPaddingTextArea() {
        translateField.setBorder(BorderFactory.createCompoundBorder(
                translateField.getBorder(),
                BorderFactory.createEmptyBorder(5, 5, 5, 5)));
    }

    /**
     * Xu ly tim kiem sau khi nhap keyword va bam search
     */
    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {
        listModel.removeAllElements();
        translateField.setText("");

        String searchKey = searchInput.getText();
        wordList = DictionaryManagement.search(searchKey);

        wordList.forEach(dictionary -> {
            String word = dictionary.getWord();
            if (word.contains(searchKey)) {
                listModel.addElement(dictionary.getWord());
            }
        });

        listWord.setModel(listModel);
    }

    private void searchInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchInputActionPerformed

    /**
     * Xu ly dich nghia tung tu duoc click
     */
    private void listWordMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listWordMousePressed
        translateField.setText("");

        selectId = listWord.getSelectedIndex();
        String translate = "";
        String example = "";
        String exampleTranslate = "";

        if (selectId >= 0) {
            Dictionary word = wordList.get(selectId);
            translate = word.getTranslate();
            example = word.getExample();
            exampleTranslate = word.getExampleTranslate();
        }

        /**
         * Hien thi phan dich nghia ra text field
         */
        translateField.setText(translateField.getText() + "Dịch nghĩa:"
                + "\r\n" + "   => " + translate + "\r\n" + "\r\n"
                + "Ví dụ:" + "\r\n" + "   " + example + "\r\n"
                + "   => " + exampleTranslate);
    }//GEN-LAST:event_listWordMousePressed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnResetActionPerformed

    /**
     * Xu ly su kien khi bam nut reset
     */
    private void btnResetMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnResetMousePressed
        reloadJframe();
    }//GEN-LAST:event_btnResetMousePressed

    /**
     * Xu ly tim kiem sau khi nhap keyword va bam enter
     */
    private void searchInputPressedEnter(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchInputPressedEnter
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            listModel.removeAllElements();
            translateField.setText("");

            String searchKey = searchInput.getText();
            wordList = DictionaryManagement.search(searchKey);

            wordList.forEach(dictionary -> {
                String word = dictionary.getWord();
                if (word.contains(searchKey)) {
                    listModel.addElement(dictionary.getWord());
                }
            });

            listWord.setModel(listModel);
        }
    }//GEN-LAST:event_searchInputPressedEnter

    /**
     * Mo form nhap tu moi khi bam nut add
     */
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        AddNewWordJFrame addFormJframe = new AddNewWordJFrame();
        addFormJframe.setLocationRelativeTo(null);
        addFormJframe.setVisible(true);
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {
        selectId = listWord.getSelectedIndex();
            
        if(selectId >= 0) {
            Dictionary word = wordList.get(selectId);
            idEdit = word.getId();
            wordEdit = word.getWord();
            translateEdit = word.getTranslate();
            exampleEdit = word.getExample();
            exampleTranslateEdit = word.getExampleTranslate();

            EditJFrame editFormJFrame = new EditJFrame(idEdit);
            editFormJFrame.setLocationRelativeTo(null);
            editFormJFrame.setVisible(true);
        }
    }

    /**
     * Xu ly xoa tu
     */
    private void btnDeleteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMousePressed
        selectId = listWord.getSelectedIndex();

        if (selectId >= 0) {
            Dictionary word = wordList.get(selectId);
            int wordId = word.getId();
            int option = JOptionPane.showConfirmDialog(this, "Do you want to delete this item ?");

            if (option == 0) {
                DictionaryManagement.delete(wordId);
                reloadJframe();
            }
        }
    }//GEN-LAST:event_btnDeleteMousePressed

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
            java.util.logging.Logger.getLogger(DictionaryJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DictionaryJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DictionaryJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DictionaryJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DictionaryJFrame dictionaryJFrame = new DictionaryJFrame();
                dictionaryJFrame.setDefaultCloseOperation(dictionaryJFrame.EXIT_ON_CLOSE);
                dictionaryJFrame.setLocationRelativeTo(null);
                dictionaryJFrame.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSearch;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> listWord;
    private javax.swing.JTextField searchInput;
    private javax.swing.JLabel searchTitle;
    private javax.swing.JTextArea translateField;
    // End of variables declaration//GEN-END:variables
}
