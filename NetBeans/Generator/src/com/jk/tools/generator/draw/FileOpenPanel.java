/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jk.tools.generator.draw;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.SwingConstants;
import javax.swing.filechooser.FileNameExtensionFilter;
import res.values.colors;
import res.values.dimens;
import res.values.string;

/**
 *
 * @author jonggwonkim
 */
public class FileOpenPanel extends JPanel{
    
    private JFileChooser fileChooser;
    
    private JLabel textAppName;
    private JTextField textFileLocation;
    private JButton btnFileOpen;
    private JButton btnStartParsing;

    public FileOpenPanel() {
        super();
        
        SpringLayout layout = new SpringLayout();
        Container contatner = new Container();
        this.setLayout(layout);
        this.setBackground(colors.TitleColor);
        
        textAppName = new JLabel(string.appname, SwingConstants.CENTER);
        textAppName.setBackground(colors.AppNameBG);
        textAppName.setPreferredSize(dimens.appName);
        textAppName.setForeground(colors.AppName);
        textAppName.setFont(new Font(textAppName.getFont().getName(), Font.BOLD, dimens.titleAppName));
        textAppName.setOpaque(true);
        layout.putConstraint(SpringLayout.WEST, textAppName, 0, SpringLayout.WEST, this);
        layout.putConstraint(SpringLayout.NORTH, textAppName, 0, SpringLayout.NORTH, this);
        this.add(textAppName);
        
        
        btnStartParsing = new JButton("Parsing");
        btnStartParsing.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                
            }
        });
        layout.putConstraint(SpringLayout.EAST, btnStartParsing, -5, SpringLayout.EAST, this);
        layout.putConstraint(SpringLayout.NORTH, btnStartParsing, 5, SpringLayout.NORTH, this);
        layout.putConstraint(SpringLayout.VERTICAL_CENTER, btnStartParsing, 0, SpringLayout.VERTICAL_CENTER, this);
        this.add(btnStartParsing);
      
        
        btnFileOpen = new JButton("Open");
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
        layout.putConstraint(SpringLayout.EAST, btnFileOpen, -5, SpringLayout.WEST, btnStartParsing);
        layout.putConstraint(SpringLayout.NORTH, btnFileOpen, 5, SpringLayout.NORTH, this);
        layout.putConstraint(SpringLayout.VERTICAL_CENTER, btnFileOpen, 0, SpringLayout.VERTICAL_CENTER, this);
        this.add(btnFileOpen);
        
        textFileLocation = new JTextField("Location", 1);
        textFileLocation.setPreferredSize(new Dimension(250, 30));
        layout.putConstraint(SpringLayout.WEST, textFileLocation, 5, SpringLayout.EAST, textAppName);
        layout.putConstraint(SpringLayout.EAST, textFileLocation, -5, SpringLayout.WEST, btnFileOpen);
        layout.putConstraint(SpringLayout.VERTICAL_CENTER, textFileLocation, 0, SpringLayout.VERTICAL_CENTER, this);
        this.add(textFileLocation);
        
        this.setOpaque(true); // TRUE is doing painted color use set background color
    }
    
    public String getPath() {
        return btnFileOpen.getText();
    }
}
