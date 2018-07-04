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
public class StringUtil {
    private static StringUtil instance = new StringUtil();
    private StringUtil() {}
    
    public static StringUtil getInstance() {
        return instance;
    }
}
