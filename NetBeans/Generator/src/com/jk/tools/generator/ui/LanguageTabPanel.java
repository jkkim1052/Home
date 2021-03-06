/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jk.tools.generator.ui;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import res.values.colors;
import res.values.dimens;

/**
 *
 * @author jonggwonkim
 */
public class LanguageTabPanel extends JPanel {
    
    private JButton btn;
    private String[] langs = null;
    
    public LanguageTabPanel() {
        super();
        
        String[] langs = new String[4];
        langs[0] = "All";
        langs[1] = "Ko";
        langs[2] = "En";
        setLanguage(langs);
    }
    
    public void setLanguage(String[] langs) {
        this.langs = langs;
        
        FlowLayout layout = new FlowLayout();
        this.setLayout(layout);
        this.setBackground(colors.LanguageBG);
        
        for (String lang : langs) {
            btn = new JButton(lang);
            btn.addActionListener(onClick);
            btn.setActionCommand(lang);
            
            btn.setPreferredSize(dimens.btnLanguage);
            btn.setBackground(colors.LangSelect);
            btn.setOpaque(true);
            this.add(btn);
        }
        
        this.setOpaque(true);
    }
    
    ActionListener onClick = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            
            String name = e.getActionCommand();
            
            JOptionPane.showMessageDialog(btn, name);
        }
    };
}
