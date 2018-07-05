/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jk.tools.generator.ui;

import com.jk.tools.generator.util.Log;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.ArrayList;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SpringLayout;

/**
 *
 * @author jonggwonkim
 */
public class ExcelDataPanel extends JPanel {
    
    private JList<String> list;
    private JScrollPane scrollPane;
    
    public ExcelDataPanel() {
        super();
        
        list = new JList<String>();
        scrollPane = new JScrollPane(list);
        
        this.setLayout(new GridBagLayout());
        GridBagConstraints layout = new GridBagConstraints();
        layout.gridx = 0;
        layout.gridy = 0;
        layout.weightx = 1;
        layout.weighty = 1;
        layout.insets = new Insets(10,10,10,10);
        this.add(scrollPane, layout);
        
        this.setOpaque(true);
        
        dummyTest();
    }
    
    public void dummyTest() {
        ArrayList<String> items = new ArrayList<String>();
        for (int i = 0 ; i < 10 ; i++) {
            items.add("Test");
        }
        
        String[] arr = new String[items.size()]; 
        arr = items.toArray(arr);
        
        list.setListData(arr);
    }
}
