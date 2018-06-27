/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jk.tools.generator;

import com.jk.tools.generator.draw.FileOpenPanel;
import com.jk.tools.generator.draw.LanguagePanel;
import com.jk.tools.generator.draw.OSTypePanel;
import com.jk.tools.generator.util.DrawUI;
import com.jk.tools.generator.values.dimens;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.filechooser.FileNameExtensionFilter;


/**
 *
 * @author jonggwonkim
 */
public class Generator extends JFrame {
    
    private DrawUI drawUI = new DrawUI();
    
    private FileOpenPanel fileopenPanel;
    private OSTypePanel ostypePanel;
    private LanguagePanel languagePanel;
    
    
    
    
    
    
    
    private JPanel p1;
    private JPanel p2;
    private JPanel p3;
    private JPanel p4;
    
    /**
     * Creates new form Generator
     */
    public Generator() {
        initComponents();

        this.setMinimumSize(dimens.mainPanel);
        this.setLayout(new BorderLayout());
        
//        p1 = new JPanel();
//        p1.setBackground(Color.red);
//        p1.setPreferredSize(dimens.ostypePanel);
//        p2 = new JPanel();
//        p2.setBackground(Color.blue);
//        p2.setPreferredSize(dimens.langPanel);
//        p3 = new JPanel();
//        p3.setBackground(Color.green);
//        p3.setPreferredSize(dimens.emptyPanel);
//        p4 = new JPanel();
//        p4.setBackground(Color.cyan);
//        p4.setPreferredSize(dimens.fileopenPanel);
        
//        this.add(p4, BorderLayout.PAGE_START);
//        this.add(p1, BorderLayout.LINE_START);
//        this.add(p2, BorderLayout.CENTER);
//        this.add(p3, BorderLayout.LINE_END);
       
        fileopenPanel = new FileOpenPanel();
        fileopenPanel.setPreferredSize(dimens.fileopenPanel);
        this.add(fileopenPanel, BorderLayout.PAGE_START);
       
//        p4.setLayout(new GridBagLayout());
//        GridBagConstraints panel = new GridBagConstraints();
//        panel.gridx = 0;
//        panel.gridy = 0;
//        panel.weightx = 1;
//        panel.weighty = 1;
//        panel.fill = GridBagConstraints.BOTH;
//        p4.add(fileopenPanel, panel);
        
        ostypePanel = new OSTypePanel();
        ostypePanel.setPreferredSize(dimens.ostypePanel);
        this.add(ostypePanel, BorderLayout.LINE_START);
//        p1.setLayout(new GridBagLayout());
//        p1.add(ostypePanel, panel);
        
        languagePanel = new LanguagePanel();
        languagePanel.setPreferredSize(dimens.langPanel);
        this.add(languagePanel, BorderLayout.CENTER);
//        p2.setLayout(new GridBagLayout());
//        p2.add(languagePanel, panel);
        ArrayList<String> sample = new ArrayList<>();
        sample.add("all");
        sample.add("ko");
        sample.add("en");
        String[] sample2 = new String[9];
        sample2[0] = "all";
        sample2[1] = "ko";
        sample2[2] = "en";
        sample2[3] = "all";
        sample2[4] = "ko";
        sample2[5] = "en";
        sample2[6] = "all";
        sample2[7] = "ko";
        sample2[8] = "en";
        languagePanel.setListItem(sample2);
        


        // GridBagLayout 작업 중 그리드 배치완료 / 사이즈 맞지 않음
//        this.setLayout(new GridBagLayout());
//        GridBagConstraints grid = new GridBagConstraints();
//        
//        p1 = new JPanel();
//        p1.setBackground(Color.red);
//        p2 = new JPanel();
//        p2.setBackground(Color.blue);
//        p3 = new JPanel();
//        p3.setBackground(Color.green);
//        p4 = new JPanel();
//        p4.setBackground(Color.cyan);
//        p4.setSize(new Dimension(1, 100));
//        
//        grid.fill = GridBagConstraints.BOTH;
//        grid.gridwidth = 3;
//        grid.weightx = 1;
//        grid.weighty = 1;
////        grid.insets = new Insets(10, 10, 10, 10);
//        grid.gridx = 0;
//        grid.gridy = 0;
//        this.add(p4, grid);
//        
//        grid.weightx = 1;
//        grid.gridwidth = 1;
//        grid.gridx = 0;
//        grid.gridy = 1;
//        this.add(p1, grid);
//        
//        grid.gridx = 1;
//        grid.gridy = 1;
//        this.add(p2, grid);
//        
//        grid.gridx = 2;
//        grid.gridy = 1;
//        this.add(p3, grid);
//        
//        
//        
//        fileopenPanel = new FileOpenPanel();
//        p4.setLayout(new GridBagLayout());
//        GridBagConstraints panel = new GridBagConstraints();
//        panel.gridx = 0;
//        panel.gridy = 0;
//        panel.weightx = 1;
//        panel.weighty = 1;
//        panel.fill = GridBagConstraints.BOTH;
//        p4.add(fileopenPanel, panel);
//        
//        languagePanel = new LanguagePanel();
//        p2.setLayout(new GridBagLayout());
//        p2.add(languagePanel, panel);
//        ArrayList<String> sample = new ArrayList<>();
//        sample.add("all");
//        sample.add("ko");
//        sample.add("en");
//        String[] sample2 = new String[3];
//        sample2[0] = "all";
//        sample2[1] = "ko";
//        sample2[2] = "en";
//        languagePanel.setListItem(sample2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 408, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Generator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Generator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Generator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Generator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Generator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
