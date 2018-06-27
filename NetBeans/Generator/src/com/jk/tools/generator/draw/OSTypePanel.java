/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jk.tools.generator.draw;

import com.jk.tools.generator.values.dimens;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author jonggwonkim
 */
public class OSTypePanel extends JPanel {
    
    private enum BTN {
        ANDROID, IOS, JSON
    }
    
    private Button os;
    
    public OSTypePanel() {
        super();
        
//        BoxLayout layout = new BoxLayout(this, 1);
        FlowLayout layout = new FlowLayout();
        this.setLayout(layout);
        
        for (BTN btn : BTN.values()) {
            os = new Button();
            os.setName(btn.name());
            os.addActionListener(onClick);
            os.setActionCommand(btn.name());
            os.setPreferredSize(dimens.btnOSType);
            this.add(os);
        }
        
        this.setOpaque(false);
    }
    
    private ActionListener onClick = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            String name = e.getActionCommand();
            
            if (BTN.ANDROID.name().equals(name)) {
                
            } else if (BTN.IOS.name().equals(name)) {
                
            } else if (BTN.JSON.name().equals(name)) {
                
            }
            
            
            JOptionPane.showMessageDialog(os, name);
        }
    };
}
