/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jk.tools.generator.util;

/**
 *
 * @author jonggwonkim
 */
public class CSVParser {
    
    private static CSVParser instance = new CSVParser();
    private CSVParser() {}
    
    public static CSVParser getInstance() {
        return instance;
    }
}
