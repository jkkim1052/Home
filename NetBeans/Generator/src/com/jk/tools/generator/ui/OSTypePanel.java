/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jk.tools.generator.ui;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
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
public class OSTypePanel extends JPanel {
    
    private OnOSTypeSelect listener;
    
    public enum OSType {
        EXCEL("Excel", ""),
        ANDROID("Android", "res/drawable/btn_android.png"), 
        IOS("iOS", "res/drawable/btn_ios.pna"), 
        JSON("Json", "res/drawable/btn_json.png");
        
        public String name;
        public String image;
        OSType(String name, String image) {
            this.name = name;
            this.image = image;
        }
    }
    
    private JButton os;
    
    public OSTypePanel(OnOSTypeSelect l) {
        super();
        
        FlowLayout layout = new FlowLayout();
        this.setLayout(layout);
        this.setBackground(colors.OSTypeBG);
        
        for (OSType type : OSType.values()) {
            os = new JButton(type.name);
            os.setIcon(new ImageIcon(type.image));
            os.addActionListener(onClick);
            os.setActionCommand(type.name());
            
            os.setPreferredSize(dimens.btnOSType);
            os.setForeground(colors.OSButtonText);
            os.setBackground(colors.OSButtonBG);
            os.setBorderPainted(false);
            os.setOpaque(true);
            this.add(os);
        }
        
        this.setOpaque(true);
        this.listener = l;
    }
    
    private ActionListener onClick = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            String name = e.getActionCommand();
            OSType type = null;
            
            if (OSType.EXCEL.name.equals(name)) {
                
            } else if (OSType.ANDROID.name.equals(name)) {
                
            } else if (OSType.IOS.name.equals(name)) {
                
            } else if (OSType.JSON.name.equals(name)) {
                
            }
            
            for (OSType t:OSType.values()) {
                if(t.name.equals(name))
                    type = t;
            }
            if (type == null) type = OSType.EXCEL;
            
            JOptionPane.showMessageDialog(os, name);
            listener.selectType(type);
        }
    };
    
    public interface OnOSTypeSelect {
        public void selectType(OSType type);
    }
}
