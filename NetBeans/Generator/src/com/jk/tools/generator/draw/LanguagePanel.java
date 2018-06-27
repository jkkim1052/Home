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
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.filechooser.FileNameExtensionFilter;
import res.values.colors;

/**
 *
 * @author jonggwonkim
 */
public class LanguagePanel extends JPanel {
    
    private JList<String> list;
    private JScrollPane scrollPane;
    
    private static final int CONTENT_MARGIN = 10;

    public LanguagePanel() {
        super();
        
        SpringLayout layout = new SpringLayout();
        this.setLayout(layout);
        this.setBackground(colors.LanguageBG);
        
        list = new JList<>();
        scrollPane = new JScrollPane(list);
        
        layout.putConstraint(SpringLayout.EAST, scrollPane, -CONTENT_MARGIN, SpringLayout.EAST, this);
        layout.putConstraint(SpringLayout.NORTH, scrollPane, CONTENT_MARGIN, SpringLayout.NORTH, this);
        layout.putConstraint(SpringLayout.WEST, scrollPane, CONTENT_MARGIN, SpringLayout.WEST, this);
        layout.putConstraint(SpringLayout.SOUTH, scrollPane, -CONTENT_MARGIN, SpringLayout.SOUTH, this);
        this.add(scrollPane);
        
        this.setOpaque(true);
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
