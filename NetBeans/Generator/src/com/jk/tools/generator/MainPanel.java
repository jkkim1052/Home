/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jk.tools.generator;

import com.jk.tools.generator.ui.ExcelDataPanel;
import com.jk.tools.generator.ui.FileOpenPanel;
import com.jk.tools.generator.ui.LanguagePanel;
import com.jk.tools.generator.ui.OSTypePanel;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import res.values.dimens;

/**
 *
 * @author jonggwonkim
 */
public class MainPanel extends JPanel {
    
    private FileOpenPanel fileopenPanel;
    private OSTypePanel ostypePanel;
    private LanguagePanel languagePanel;
    private ExcelDataPanel excelDataPanel;
    
    private boolean isShowExcelPanel = true;
    
    public MainPanel() {
        super();
        
        this.setLayout(new BorderLayout());
        
        fileopenPanel = new FileOpenPanel();
        fileopenPanel.setPreferredSize(dimens.fileopenPanel);
        this.add(fileopenPanel, BorderLayout.PAGE_START);
       
        ostypePanel = new OSTypePanel(onOSTypeSelect);
        ostypePanel.setPreferredSize(dimens.ostypePanel);
        this.add(ostypePanel, BorderLayout.LINE_START);
        
        excelDataPanel = new ExcelDataPanel();
        excelDataPanel.setPreferredSize(dimens.langPanel);
        this.add(excelDataPanel, BorderLayout.CENTER);
        
        languagePanel = new LanguagePanel();
        languagePanel.setPreferredSize(dimens.langPanel);
//        this.add(languagePanel, BorderLayout.CENTER);
    }
    
    public void changeCenterPanel(boolean isShowExcelPanel) {
        if (isShowExcelPanel) {
            this.remove(languagePanel);
            this.add(excelDataPanel, BorderLayout.CENTER);
        } else {
            this.remove(excelDataPanel);
            this.add(languagePanel, BorderLayout.CENTER);
        }
    }
    
    OSTypePanel.OnOSTypeSelect onOSTypeSelect = new OSTypePanel.OnOSTypeSelect() {
        @Override
        public void selectType(OSTypePanel.OSType type) {
            
            String name = type.name;
            
            if (OSTypePanel.OSType.EXCEL.name.equals(name)) {
                if(!isShowExcelPanel) {
                    isShowExcelPanel = true;
                    changeCenterPanel(isShowExcelPanel);
                }
            } else if (OSTypePanel.OSType.ANDROID.name.equals(name)) {
                if(isShowExcelPanel) {
                    isShowExcelPanel = false;
                    changeCenterPanel(isShowExcelPanel);
                }
            } else if (OSTypePanel.OSType.IOS.name.equals(name)) {
                if(isShowExcelPanel) {
                    isShowExcelPanel = false;
                    changeCenterPanel(isShowExcelPanel);
                }
            } else if (OSTypePanel.OSType.JSON.name.equals(name)) {
                if(isShowExcelPanel) {
                    isShowExcelPanel = false;
                    changeCenterPanel(isShowExcelPanel);
                }
            }
        }
    };
}
