/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jk.tools.generator.draw;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author jonggwonkim
 */
public class LanguagePanel extends JPanel {
    
    private JList<String> list;

    public LanguagePanel() {
        super();
        
        SpringLayout layout = new SpringLayout();
        this.setLayout(layout);
        
        list = new JList<>();
        
        layout.putConstraint(SpringLayout.EAST, list, -5, SpringLayout.EAST, this);
        layout.putConstraint(SpringLayout.NORTH, list, 5, SpringLayout.NORTH, this);
        layout.putConstraint(SpringLayout.WEST, list, 5, SpringLayout.WEST, this);
        layout.putConstraint(SpringLayout.SOUTH, list, -5, SpringLayout.SOUTH, this);
        this.add(list);
        
        this.setOpaque(false);
    }
    
    public void setListItem(String[] items) {
        list.setListData(items);
        list.updateUI();
    }
    
    public void setListItem(ArrayList<String> items) {
        if (items.toArray() instanceof String[]) {
            setListItem((String[])items.toArray());
        }
    }
}
