/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jk.tools.generator.draw;

import com.jk.tools.generator.values.colors;
import com.jk.tools.generator.values.dimens;
import com.jk.tools.generator.values.string;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author jonggwonkim
 */
public class FileOpenPanel extends JPanel{
    
    private JFileChooser fileChooser;
    
    private Label textAppName;
    private JTextField textFileLocation;
    private JButton btnFileOpen;

    public FileOpenPanel() {
        super();
        
        SpringLayout layout = new SpringLayout();
        Container contatner = new Container();
        this.setLayout(layout);
        
        textAppName = new Label(string.appname);
        textAppName.setPreferredSize(dimens.appName);
        textAppName.setBackground(colors.ORANGE);
        layout.putConstraint(SpringLayout.WEST, textAppName, 0, SpringLayout.WEST, this);
        layout.putConstraint(SpringLayout.NORTH, textAppName, 0, SpringLayout.NORTH, this);
        this.add(textAppName);
        
        btnFileOpen = new JButton("Open");
        btnFileOpen.setMaximumSize(new Dimension(50, 50));
        btnFileOpen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                fileChooser = new JFileChooser();
                FileNameExtensionFilter filter = new FileNameExtensionFilter("Select CSV File", "csv");
                fileChooser.setFileFilter(filter);
                int returnCode = fileChooser.showOpenDialog(null);
                if (returnCode == JFileChooser.APPROVE_OPTION) {
                    textFileLocation.setText(fileChooser.getSelectedFile().getPath());
                }
            }
        });
        layout.putConstraint(SpringLayout.EAST, btnFileOpen, -5, SpringLayout.EAST, this);
        layout.putConstraint(SpringLayout.NORTH, btnFileOpen, 5, SpringLayout.NORTH, this);
        this.add(btnFileOpen);
        
        textFileLocation = new JTextField("Location", 15);
        layout.putConstraint(SpringLayout.WEST, textFileLocation, 5, SpringLayout.EAST, textAppName);
        layout.putConstraint(SpringLayout.EAST, textFileLocation, -5, SpringLayout.WEST, btnFileOpen);
        layout.putConstraint(SpringLayout.NORTH, textFileLocation, 5, SpringLayout.NORTH, this);
        layout.putConstraint(SpringLayout.SOUTH, textFileLocation, -5, SpringLayout.SOUTH, this);
        this.add(textFileLocation);
        
        this.setOpaque(false);
    }
    
    public String getPath() {
        return btnFileOpen.getText();
    }
}
